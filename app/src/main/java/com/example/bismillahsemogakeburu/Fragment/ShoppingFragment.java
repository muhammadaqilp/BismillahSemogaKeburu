package com.example.bismillahsemogakeburu.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.bismillahsemogakeburu.DaftarActivity;
import com.example.bismillahsemogakeburu.LoginActivity;
import com.example.bismillahsemogakeburu.R;

public class ShoppingFragment extends Fragment {

    Button btn_daftar, btn_login;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shopping, container, false);

        btn_daftar = view.findViewById(R.id.btn_daftar);
        btn_login = view.findViewById(R.id.btn_login);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar = new Intent(getActivity().getApplication(), DaftarActivity.class);
                startActivity(daftar);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(getActivity().getApplication(), LoginActivity.class);
                startActivity(login);
            }
        });


     return view;
    }
}
