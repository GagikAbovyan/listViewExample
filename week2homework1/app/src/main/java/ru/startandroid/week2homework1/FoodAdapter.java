package ru.startandroid.week2homework1;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FoodAdapter extends ArrayAdapter<Food> {

    private final Context context;
    private final int resource;
    private final List<Food> list;

    public FoodAdapter(@NonNull Context context, int resource, @NonNull List<Food> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.list = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;
        if (view == null){
            view = LayoutInflater.from(context).inflate(resource, parent, false);
        }
        final Food food = list.get(position);
        final ImageView image = view.findViewById(R.id.image);
        Picasso.get().load(food.getUriPhoto()).into(image);
        final TextView title = view.findViewById(R.id.titleText);
        title.setText(food.getTitle());
        final TextView info = view.findViewById(R.id.infoText);
        info.setText(food.getInfo());
        final TextView star = view.findViewById(R.id.starText);
        star.setText(food.getStar());
        return view;
    }
}
