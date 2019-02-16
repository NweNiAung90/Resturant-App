package com.padcmyanmar.padc7.nna.resturant.app.activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.padcmyanmar.padc7.nna.resturant.app.R;
import com.padcmyanmar.padc7.nna.resturant.app.fragments.DetailsFragment;
import com.padcmyanmar.padc7.nna.resturant.app.fragments.MenuFragment;
import com.padcmyanmar.padc7.nna.resturant.app.fragments.ReviewsFragment;
import com.padcmyanmar.padc7.nna.resturant.app.views.adapters.TabAdapter;

public class MenuDetailsActivity extends AppCompatActivity {

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, MenuDetailsActivity.class);
        return intent;
    }

    TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_details);
        adapter = new TabAdapter(getSupportFragmentManager());
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        adapter.addFragment(new DetailsFragment(), "DETAILS");
        adapter.addFragment(new MenuFragment(), "MENU");
        adapter.addFragment(new ReviewsFragment(), "REVIEWS");

        TextView tv1 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(0)).getChildAt(1));
        tv1.setScaleY(-1);
        TextView tv2 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(1)).getChildAt(1));
        tv2.setScaleY(-1);
        TextView tv3 = (TextView)(((LinearLayout)((LinearLayout)tabLayout.getChildAt(0)).getChildAt(2)).getChildAt(1));
        tv3.setScaleY(-1);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

