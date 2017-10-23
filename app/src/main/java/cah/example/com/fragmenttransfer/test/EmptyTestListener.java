package cah.example.com.fragmenttransfer.test;

import android.support.v4.app.Fragment;
import android.widget.Toast;

/*
 * Copyright (C) 2017. TomTom International BV. All rights reserved.
 */
public class EmptyTestListener implements TestListener {
    @Override
    public void onFragmentFadedIn(Fragment fragment) {
//        Toast.makeText(fragment.getActivity(), "Does it work?", Toast.LENGTH_LONG).show();
    }

    @Override
    public void reset() {
    }
}
