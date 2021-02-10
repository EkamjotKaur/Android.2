package com.example.welcometoamritsar;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    private int dcolorId;
  public ItemAdapter(Activity context, ArrayList<Item> items,int colorId)
  {
      super(context,0,items);
      dcolorId=colorId;
  }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView =convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Item currentItem = getItem(position);
        TextView nameItemView = (TextView) listItemView.findViewById(R.id.name);
        nameItemView.setText(currentItem.getName());

        TextView descriptionItemView = (TextView) listItemView.findViewById(R.id.description);
        descriptionItemView.setText(currentItem.getDescription());

        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.img);
        itemImageView.setImageResource(currentItem.getImageResourceId());

        RelativeLayout backColor = (RelativeLayout)listItemView.findViewById(R.id.textRelativeLayout);
        int color= ContextCompat.getColor(getContext(),dcolorId);
        backColor.setBackgroundColor(color);

        ImageView gpsview = (ImageView)listItemView.findViewById(R.id.gps);

        if(currentItem.isHasGPS()==false)
        {
               gpsview.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
