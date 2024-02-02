package com.example.fragmendiklat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class simpleFragment extends Fragment {
    private static final String CHOICE = "choice";
    private int mChoice;
    public simpleFragment() {
        // Required empty public constructor
    }
    public static simpleFragment newInstance(int choice) {
        simpleFragment fragment = new simpleFragment();
        Bundle args = new Bundle();
        args.putInt(CHOICE, choice);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple, container, false);
    }
}