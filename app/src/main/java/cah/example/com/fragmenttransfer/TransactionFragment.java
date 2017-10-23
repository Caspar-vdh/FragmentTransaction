package cah.example.com.fragmenttransfer;

import android.support.v4.app.Fragment;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import cah.example.com.fragmenttransfer.test.TestListener;

public abstract class TransactionFragment extends Fragment {
    @Override
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {

        Animation anim = null;
        if (nextAnim == R.anim.fade_in) {
            anim = AnimationUtils.loadAnimation(getActivity(), nextAnim);

            anim.setAnimationListener(new Animation.AnimationListener() {

                @Override
                public void onAnimationStart(Animation animation) {
                }

                @Override
                public void onAnimationEnd(Animation animation) {
                    TestListener.INSTANCE.onFragmentFadedIn(TransactionFragment.this);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {
                }
            });
        }

        return anim;
    }
}
