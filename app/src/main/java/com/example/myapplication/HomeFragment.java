package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.myapplication.Taskmaster.Taskmaster;

public class HomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View RootView = inflater.inflate(R.layout.frag_home,container, false);
        Button nav_overview = (Button)RootView.findViewById(R.id.nav_overview);
        ImageButton nav_chatbot = RootView.findViewById(R.id.chatButton);

        nav_overview.setOnClickListener(v -> {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(this);
            Intent intent = new Intent(getActivity(), OverviewFragment.class);
            getActivity().startActivity(intent);
        });

        nav_chatbot.setOnClickListener(v -> {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.remove(this);
            Intent intent = new Intent(getActivity(), Taskmaster.class);
            getActivity().startActivity(intent);
        });
        return RootView;
    }
}
