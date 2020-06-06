package com.example.splash_screen;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    TextView next;
    ViewPager viewPager;
    TextView back;
    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        viewPager = getActivity().findViewById(R.id.viewpager);
        next = view.findViewById(R.id.slide2next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });
    back = view.findViewById(R.id.back2next);
    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            viewPager.setCurrentItem(0);
        }
    });

        return  view;
    }
}

