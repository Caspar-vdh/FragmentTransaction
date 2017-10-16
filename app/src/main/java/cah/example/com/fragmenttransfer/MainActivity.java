package cah.example.com.fragmenttransfer;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Class activeFragmentType = Fragment1.class;
    FragmentManager fragmentManager;
    Fragment1 fragment1 = new Fragment1();
    Fragment2 fragment2 = new Fragment2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, fragment1, Fragment1.TAG);
        fragmentTransaction.add(R.id.fragment_container, fragment2, Fragment2.TAG);
        fragmentTransaction.show(fragment1);
        fragmentTransaction.hide(fragment2);
        fragmentTransaction.commit();
        fragmentManager.executePendingTransactions();
    }

    public void switchFragment(View view) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        if (activeFragmentType.equals(Fragment1.class)) {
            activeFragmentType = Fragment2.class;
            fragmentTransaction.show(fragment2);
            fragmentTransaction.hide(fragment1);
        } else {
            activeFragmentType = Fragment1.class;
            fragmentTransaction.show(fragment1);
            fragmentTransaction.hide(fragment2);
        }
        fragmentTransaction.commit();
        fragmentManager.executePendingTransactions();
    }
}
