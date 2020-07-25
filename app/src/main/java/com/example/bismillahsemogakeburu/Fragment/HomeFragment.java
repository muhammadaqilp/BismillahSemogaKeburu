package com.example.bismillahsemogakeburu.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.example.bismillahsemogakeburu.Adapter.SliderAdapter;
import com.example.bismillahsemogakeburu.AkunActivity;
import com.example.bismillahsemogakeburu.BantuanActivity;
import com.example.bismillahsemogakeburu.BelanjaankuActivity;
import com.example.bismillahsemogakeburu.Model.SliderItem;
import com.example.bismillahsemogakeburu.R;
import com.example.bismillahsemogakeburu.SaranActivity;
import com.google.android.material.navigation.NavigationView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class HomeFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    private Toolbar toolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

//        TextView hello = view.findViewById(R.id.hello);
        drawerLayout = view.findViewById(R.id.drawer_layout);
        navigationView = view.findViewById(R.id.nav_view);
        toolbar = view.findViewById(R.id.toolbar);

        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
//        getActivity().setTitle("Hydrolite");

//        Menu menu = navigationView.getMenu();
//        menu.findItem(R.id.nav_akun).setVisible(false);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(HomeFragment.this);
        navigationView.setCheckedItem(R.id.nav_home_slide);

        final SliderView sliderView = view.findViewById(R.id.imageSlider);

        SliderAdapter adapter = new SliderAdapter(getContext());
        adapter.addItem(new SliderItem("Promo 1", "https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        adapter.addItem(new SliderItem("Promo 2", "https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));
        adapter.addItem(new SliderItem("Promo 3", "https://images.pexels.com/photos/929778/pexels-photo-929778.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"));
        adapter.addItem(new SliderItem("Promo 4", "https://images.pexels.com/photos/747964/pexels-photo-747964.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"));

        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.THIN_WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();

//        hello.setText("Hydrolite");

        sliderView.setOnIndicatorClickListener(new DrawController.ClickListener() {
            @Override
            public void onIndicatorClicked(int position) {
                sliderView.setCurrentPagePosition(position);
            }
        });

        return view;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home_slide:
                break;

            case R.id.nav_akun:
                Intent profil = new Intent(getActivity().getApplication(), AkunActivity.class);
                startActivity(profil);
                break;

            case R.id.nav_history:
                Intent shop = new Intent(getActivity().getApplication(), BelanjaankuActivity.class);
                startActivity(shop);
                break;

            case R.id.nav_wishlist:
                Intent wish = new Intent(getActivity().getApplication(), BelanjaankuActivity.class);
                startActivity(wish);
                break;

            case R.id.nav_bantuan:
                Intent bantuan = new Intent(getActivity().getApplication(), BantuanActivity.class);
                startActivity(bantuan);
                break;

            case R.id.nav_saran:
                Intent saran = new Intent(getActivity().getApplication(), SaranActivity.class);
                startActivity(saran);
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
