package com.padcmyanmar.padc7.nna.resturant.app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.padcmyanmar.padc7.nna.resturant.app.R;
import com.padcmyanmar.padc7.nna.resturant.app.delegates.MenuItemDelegate;
import com.padcmyanmar.padc7.nna.resturant.app.views.adapters.MenuDetailsAdapter;

public class MainActivity extends AppCompatActivity implements MenuItemDelegate {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvMenu = findViewById(R.id.rv_menu);
        rvMenu.setLayoutManager(new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL,
                false));
        MenuDetailsAdapter menuDetailsAdapter = new MenuDetailsAdapter(this);
        rvMenu.setAdapter(menuDetailsAdapter);
    }


    @Override
    public void onTapMenuItem() {
        Intent intent = MenuDetailsActivity.newIntent(getApplicationContext());
        startActivity(intent);
    }
}
