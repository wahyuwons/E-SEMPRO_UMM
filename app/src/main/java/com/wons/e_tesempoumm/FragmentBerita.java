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
import android.widget.RelativeLayout;


public class FragmentBerita extends Fragment {


    public FragmentBerita() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_berita, container, false);
        Button btnBerita1 = (Button) rootview.findViewById(R.id.btnBerita1);
        Button btnBerita2 = (Button) rootview.findViewById(R.id.btnBerita2);
        Button btnBerita3 = (Button) rootview.findViewById(R.id.btnBerita3);
        btnBerita1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                gotoURL("https://docs.google.com/document/d/1KMg1xaBX7TqAUd1spf3Q_KjiLRi00W_X/edit?usp=sharing&ouid=105192401887348741744&rtpof=true&sd=true");
            }

            private void gotoURL(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        btnBerita2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                gotoURL("https://forms.gle/f3zums394rWwYbnQ7");
            }

            private void gotoURL(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        btnBerita3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                gotoURL("https://forms.gle/f3zums394rWwYbnQ7");
            }

            private void gotoURL(String s) {
                Uri uri = Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        return rootview;
    }
}