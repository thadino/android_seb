package com.ebookfrenzy.fragmenter;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

        Integer val = 1;
        for(int x = 0; x<5; x++) {
//
//            Random rand = new Random();
//            Integer val = rand.nextInt(4)+1;
            Integer example = R.drawable.example1;



            if(val == 1)
                example = R.drawable.example1;
            if(val == 2)
                example = R.drawable.example2;
            if(val == 3)
                example = R.drawable.example3;
            if(val == 4)
                example = R.drawable.example4;

            LinearLayout rl = (LinearLayout) view.findViewById(R.id.LinearLayout_Index);
            ImageButton iv = new ImageButton(getContext());
            iv.setImageDrawable(getContext().getDrawable(example));
            LayoutParams lp = new LayoutParams(LayoutParams.WRAP_CONTENT, 500);
            lp.setMargins(0, 30, 0, 0);
            iv.setLayoutParams(lp);

            final Integer value = val;

            iv.setOnClickListener( new View.OnClickListener() {


                public void onClick(View v) {

                    String name;
                    getFragmentManager().beginTransaction().replace(R.id.fragment, Selectedshop.newInstance(value)).commit();


                }
            });

        if(++val == 5)
            val = 1;

            rl.addView(iv);
        }





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
