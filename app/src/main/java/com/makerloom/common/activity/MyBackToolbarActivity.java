package com.makerloom.common.activity;

import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.LayoutRes;

/**
 * Created by michael on 2/28/18.
 */

public class MyBackToolbarActivity extends MyAppCompatActivity {
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        setupToolbar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }
}
