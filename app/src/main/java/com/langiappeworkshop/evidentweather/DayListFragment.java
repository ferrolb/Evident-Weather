package com.langiappeworkshop.evidentweather;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 *  This class {@link DayListFragment} is our main fragment and does most of the work of
 *  our app, including loading and displaying the data.
 */
public class DayListFragment extends Fragment {

    // Our daily weather is loaded into a RecyclerView
    private RecyclerView mDayRecyclerView;

    // local copy of our daily weather data
    private List<Day> mDayList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // retain instance in case we rotate in the middle of a download.
        setRetainInstance(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_day_list, container, false);

        // intialize our RecyclerView
        mDayRecyclerView = (RecyclerView) rootView.findViewById(R.id.day_list);
        assert mDayRecyclerView != null;
        mDayRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        if (!mDayList.isEmpty()) {
            setupRecyclerView();
        } else {
            // start our data download task, if our list is empty
            new DownloadDaysTask().execute();
        }

        return rootView;
    }

    private void setupRecyclerView() {
        // check if fragment has been added to Activity before we setup the RecyclerView
        if (isAdded()) {
            RVAdapter rvAdapter = new RVAdapter(getActivity(), mDayList);
            mDayRecyclerView.setAdapter(rvAdapter);
        }
    }

    /**
     *  Our Recycler Adapter class
     */
    private class RVAdapter extends RecyclerView.Adapter<RVAdapter.DayViewHolder> {
        private Context mContext;

        // reference to our weather data
        List<Day> dayList;

        private RVAdapter(Context mContext, List<Day> dayList) {
            this.mContext = mContext;
            this.dayList = dayList;
        }

        @SuppressLint("InflateParams")
        @Override
        public DayViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(mContext).inflate(R.layout.day_list_content, null);
            return new DayViewHolder(view);
        }

        @Override
        public void onBindViewHolder(DayViewHolder holder, int i) {

            final Day day = dayList.get(i);
            if (!TextUtils.isEmpty(day.imageURL)) {

                // we are using Picasso library to load individual images because
                // that's what it's made for!
                Picasso.with(getActivity())
                        .load(day.imageURL)
                        .placeholder(day.imageResourceId)
                        .into(holder.ivIcon);
            } else {
                // if we get an empty image URL, just default to Andy
                holder.ivIcon.setImageResource(dayList.get(i).imageResourceId);
            }

            holder.tvSummary.setText(day.summary);
            holder.tvDate.setText(day.date);
            holder.tvPrecip.setText(day.precip);
            holder.tvLo.setText(day.lo);
            holder.tvHi.setText(day.hi);
            holder.tvHumid.setText(day.humid);
            holder.tvWind.setText(day.wind);
        }

        @Override
        public int getItemCount() {
            return dayList.size();
        }

        /**
         *  Our ViewHolder for view items associated with our 10 days of weather.
         */
        class DayViewHolder extends RecyclerView.ViewHolder {
            private ImageView ivIcon;
            private TextView tvDate;
            private TextView tvSummary;
            private TextView tvPrecip;
            private TextView tvLo;
            private TextView tvHi;
            private TextView tvHumid;
            private TextView tvWind;

            DayViewHolder(View dayView) {
                super(dayView);
                ivIcon = (ImageView) dayView.findViewById(R.id.ivIcon);
                tvDate = (TextView) dayView.findViewById(R.id.tvDate);
                tvSummary = (TextView) dayView.findViewById(R.id.tvSummary);
                tvPrecip = (TextView) dayView.findViewById(R.id.tvPrecip);
                tvLo = (TextView) dayView.findViewById(R.id.tvLo);
                tvHi = (TextView) dayView.findViewById(R.id.tvHi);
                tvHumid = (TextView) dayView.findViewById(R.id.tvHumid);
                tvWind = (TextView) dayView.findViewById(R.id.tvWind);
            }
        }
    }


    /**
     *  This class {@link DownloadDaysTask} takes our networking work off the main thread.
     *  It returns a list of daily weather conditions {@link Day} and sets up the RecyclerView on completion.
     */
    private class DownloadDaysTask extends AsyncTask<Void, Void, List<Day>> {

        @Override
        protected List<Day> doInBackground(Void... voids) {
            return new Downloader().fetchDays();
        }

        @Override
        protected void onPostExecute(List<Day> days) {
            mDayList = days;
            setupRecyclerView();
        }
    }

}
