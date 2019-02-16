package com.padcmyanmar.padc7.nna.resturant.app.views.holders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.padcmyanmar.padc7.nna.resturant.app.delegates.MenuItemDelegate;

public class MenuViewHolder extends RecyclerView.ViewHolder {

    private MenuItemDelegate mDelegate;
    public MenuViewHolder(@NonNull View itemView, @NonNull MenuItemDelegate menuItemDelegate) {
        super(itemView);
        mDelegate = menuItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mDelegate.onTapMenuItem();
            }
        });

    }
}