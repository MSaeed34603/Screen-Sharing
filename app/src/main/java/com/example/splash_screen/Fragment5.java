package com.example.splash_screen;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

 class Fragment5 extends Fragment {
    TextView done;
    ViewPager viewPager;
    TextView back;

    public Fragment5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_5, container, false);
        viewPager = getActivity().findViewById(R.id.viewpager);
        done = view.findViewById(R.id.slide5next);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "DONE", Toast.LENGTH_LONG).show();
            }
        });
        back = view.findViewById(R.id.back5next);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3);
            }
        });

        return  view;
    }
}
