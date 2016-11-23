package com.ebookfrenzy.fragmenter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by kaspe on 2016-11-20.
 */

public class Index extends Fragment
{

    public Index()
    {

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {



        final View view = inflater.inflate(R.layout.index, container, false);
        ArrayList<Integer> s = new ArrayList<>();
        Integer val = 1;
        String[] keys = this.getResources().getStringArray(R.array.StoreImage_keys);
        String[] values = this.getResources().getStringArray(R.array.StoreImage_values);
        LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
        for (int i = 0; i < Math.min(keys.length, values.length); ++i) {
            map.put(keys[i], values[i]);
        }
        for(int x = 1; x<5; x++) {
//
//            Random rand = new Random();
//            Integer val = rand.nextInt(4)+1;
            Integer example = R.drawable.example1;




//            String strinsg = getString(R.string.hello_blank_fragment);
//
//            Toast.makeText(getContext(), strinsg, Toast.LENGTH_SHORT).show();








//            if(x == 1)
//                example = R.drawable.example1;
//            if(x == 2)
//                example = R.drawable.example2;
//            if(x == 3)
//                example = R.drawable.example3;
//            if(x == 4)
//                example = R.drawable.example4;

            LinearLayout rl = (LinearLayout) view.findViewById(R.id.LinearLayout_Index);



            ImageButton iv = new ImageButton(getContext());

            iv.setImageDrawable(getContext().getDrawable(example));


            LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT, 500);

            lp.alignWithParent = true;

//            lp.setMargins(0, 30, 0, 0);
            iv.setLayoutParams(lp);

            final Integer value = example;
            s.add(example);

            iv.setOnClickListener( new View.OnClickListener() {


                public void onClick(View v) {

                    String name;



                    getFragmentManager().beginTransaction().replace(R.id.fragment, Selectedshop.newInstance(value)).addToBackStack("A_B_TAG").commit();




                }
            });

        if(++val == 5)
            val = 1;


            iv.setScaleType(ImageView.ScaleType.FIT_XY);

            rl.addView(iv);


        }

        Log.d("I am here!" + s, "--");
        Log.d("ssaa", "yooolo");


        return view;
    }

    public static Index newInstance()
    {
        Bundle args = new Bundle();
        Index fragment = new Index();
        fragment.setArguments(args);
        return fragment;
    }







}
