package cah.example.com.fragmenttransfer.test;

import android.support.v4.app.Fragment;

public interface TestListener {
    TestListener INSTANCE = new EmptyTestListener();

    void onFragmentFadedIn(Fragment fragment);

    void reset();
}
