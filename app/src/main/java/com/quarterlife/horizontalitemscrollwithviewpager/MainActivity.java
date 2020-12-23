package com.quarterlife.horizontalitemscrollwithviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<ItemIconModel> iconList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initial view
        viewPager = findViewById(R.id.viewPager);

        loadIcon();
    }

    private void loadIcon() {
        // add data
        iconList.add(new ItemIconModel(R.drawable.item_1,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_2,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_3,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_4,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_5,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_6,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_7,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_1,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_2,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_3,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_4,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_5,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_6,"item"));
        iconList.add(new ItemIconModel(R.drawable.item_7,"item"));
        // set Adapter
        ItemIconAdapter bannerAdapter = new ItemIconAdapter(iconList,MainActivity.this);
        viewPager.setAdapter(bannerAdapter);
        // set padding
        viewPager.setPadding(40,0,40,0);
        // set page margin
        viewPager.setPageMargin(40);
    }
}