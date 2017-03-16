package com.example.singlefragement;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        LM_Fragement lm_fragment = null;
        PM_Fragement pm_fragment = null;

        /**
         * Check the device orientation and act accordingly
         */

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            /**
             * Landscape mode of the device
             */
            if (lm_fragment == null) {
                lm_fragment = new LM_Fragement();
            }
            fragmentTransaction.replace(android.R.id.content, lm_fragment);
        } else {
            /**
             * Portrait mode of the device
             */
            if (pm_fragment == null) {
                pm_fragment = new PM_Fragement();
            }
            fragmentTransaction.replace(android.R.id.content, pm_fragment);
        }
        fragmentTransaction.commit();
    }
}
