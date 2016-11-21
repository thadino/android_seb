package com.ebookfrenzy.fragmenter;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kaspe on 2016-11-20.
 */

public class Selectedshop extends Fragment
{

    public Selectedshop()
    {

    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        final View view = inflater.inflate(R.layout.selectedshop, container, false);

        Bundle bundle = getArguments();

        Integer val = bundle.getInt("shopID");

        Integer example = R.drawable.example1;



        if(val == 1)
            example = R.drawable.example1;
        if(val == 2)
            example = R.drawable.example2;
        if(val == 3)
            example = R.drawable.example3;
        if(val == 4)
            example = R.drawable.example4;

        LinearLayout rl = (LinearLayout) view.findViewById(R.id.LinearLayout_selectedshop);
        ImageButton iv = new ImageButton(getContext());
        iv.setImageDrawable(getContext().getDrawable(example));
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, 500);
        lp.setMargins(0, 30, 0, 0);

        iv.setLayoutParams(lp);



        Toast.makeText(getContext(), "" + bundle.getInt("shopID"), Toast.LENGTH_SHORT).show();

        rl.addView(iv);

        return view;
    }



    public static Selectedshop newInstance(Integer shopID)
    {


        Bundle args = new Bundle();
        args.putInt("shopID", shopID);
        Selectedshop fragment = new Selectedshop();
        fragment.setArguments(args);
        return fragment;
    }




}
