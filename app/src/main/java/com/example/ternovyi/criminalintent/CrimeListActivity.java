package com.example.ternovyi.criminalintent;

import android.support.v4.app.Fragment;
import android.view.Menu;

/**
 * Created by vova on 21.09.15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

