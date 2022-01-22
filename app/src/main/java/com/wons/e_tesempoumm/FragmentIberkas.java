package com.wons.e_tesempoumm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentIberkas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentIberkas extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentIberkas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentIberkas.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentIberkas newInstance(String param1, String param2) {
        FragmentIberkas fragment = new FragmentIberkas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_iberkas, container, false);
        Button btnBerkas1 = (Button) rootview.findViewById(R.id.btnBerkas1);
        Button btnBerkas2 = (Button) rootview.findViewById(R.id.btnBerkas2);
        btnBerkas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                gotoURL("https://docs.google.com/forms/d/1dDQrWTg0NCCb3Q9N7uOy1HJv_Zy3nUXYl0SqWNZx20M/edit?usp=sharing");
            }

            private void gotoURL(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        btnBerkas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                gotoURL("https://docs.google.com/document/d/1vCm5k3QfmpPL7vw_pRTBY0PUmvonqxXD/edit?usp=sharing&ouid=105192401887348741744&rtpof=true&sd=true");
            }

            private void gotoURL(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        return rootview;
    }
}