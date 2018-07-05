package ru.startandroid.week2homework1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Food tolma = new Food(Constants.TOLMA_URI_PHOTO, Constants.TOLMA_TITLE,
                Constants.TOLMA_INFO, Constants.TOLMA_STAR, Constants.TOLMA_WIKI);
        final Food barbecue = new Food(Constants.BARBECUE_URI_PHOTO, Constants.BARBECUE_TITLE,
                Constants.BARBECUE_INFO, Constants.BARBECUE_STAR, Constants.BARBECUE_WIKI);
        final Food pelmeni = new Food(Constants.PELMENI_URI_PHOTO, Constants.PELMENI_TITLE,
                Constants.PELMENI_INFO, Constants.PELMENI_STAR, Constants.PELMENI_WIKI);
        final Food xinkali = new Food(Constants.XINKALI_URI_PHOTO, Constants.XINKALI_TITLE,
                Constants.XINKALI_INFO, Constants.XINKALI_STAR, Constants.XINKALI_WIKI);
        final List<Food> list = new ArrayList<>();
        list.add(tolma);
        list.add(barbecue);
        list.add(pelmeni);
        list.add(xinkali);
        final FoodAdapter foodAdapter = new FoodAdapter(this, R.layout.layout_item, list);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(foodAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse(list.get(position).getWiki()));
                startActivity(browserIntent);
            }
        });
    }
}
