package com.padcmyanmar.padc7.nna.resturant.app.views.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.padc7.nna.resturant.app.R;
import com.padcmyanmar.padc7.nna.resturant.app.delegates.MenuItemDelegate;
import com.padcmyanmar.padc7.nna.resturant.app.views.holders.MenuViewHolder;

public class MenuDetailsAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    private MenuItemDelegate mMenuItemDelegate;

    public  MenuDetailsAdapter(MenuItemDelegate menuItemDelegate){
        mMenuItemDelegate = menuItemDelegate;
    }
    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = layoutInflater.inflate(R.layout.view_item_menu,viewGroup,false);
        return  new MenuViewHolder(itemView, mMenuItemDelegate);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder newsViewHolder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }
}
