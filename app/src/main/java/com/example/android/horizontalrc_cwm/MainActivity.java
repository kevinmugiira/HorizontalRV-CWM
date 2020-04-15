package com.example.android.horizontalrc_cwm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //variables
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getImages();
    }


    private void getImages() {
        //Log.d(TAG, "initBitMaps: preparing bitmaps");
        
        
        mImageUrls.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/great-ocean-road-174028267-1494616481.jpg?crop=1.00xw:1.00xh;0,0&resize=768:*");
        mName.add("Tentree");

        mImageUrls.add("drawable/image2.jpeg");
        mName.add("Elite Readers");

        mImageUrls.add("drawable/image3.jpg");
        mName.add("Forbes hehe");

        mImageUrls.add("drawable/image4.JPG");
        mName.add("Jetsetter");

        mImageUrls.add("drawable/image5.jpg");
        mName.add("TravelNine");

        mImageUrls.add("drawable/image6.jpg");
        mName.add("Polkado");

        mImageUrls.add("drawable/image7.jpg");
        mName.add("CNtraveler");

        mImageUrls.add("drawable/image8.jpg");
        mName.add("Wetworld");

        initRecyclerView();
    }

    private void initRecyclerView(){
        //Log.d(TAG, "initRecyclerView: initializing recyc");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        RecyclerView recyclerView = findViewById(R.id.myRecyc);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapterr = new RecyclerViewAdapter( mName, mImageUrls, this);
        recyclerView.setAdapter(adapterr);


    }

}
