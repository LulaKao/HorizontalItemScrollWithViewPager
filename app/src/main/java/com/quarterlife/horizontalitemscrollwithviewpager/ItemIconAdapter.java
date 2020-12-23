package com.quarterlife.horizontalitemscrollwithviewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import java.util.List;

public class ItemIconAdapter extends PagerAdapter {
    private List<ItemIconModel> list;
    private Context context;

    public ItemIconAdapter(List<ItemIconModel> models, Context context) {
        this.list = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object); // return view == object;
    }

    @Override
    public float getPageWidth(int position) {
        return (float) 0.1; // the proportion of a single item can only account for 10% of the screen
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_icon,container,false);

        // set image
        ImageView imageView = view.findViewById(R.id.iconImage);
        imageView.setImageResource(list.get(position).getImage());

        // set title
        TextView bannerTitle = view.findViewById(R.id.iconTitle);
        bannerTitle.setText(list.get(position).getTitle());

        container.addView(view,0);

        // set OnClickListener
        view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
//                Toast.makeText(context, "555", Toast.LENGTH_SHORT).show();
//                System.out.println("=== position = " + position);
                Toast.makeText(context, "click : " + position, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}
