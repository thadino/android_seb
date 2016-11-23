package com.ebookfrenzy.fragmenter;

import android.app.Activity;
import android.app.WallpaperManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

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

View View;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        final View view = inflater.inflate(R.layout.selectedshop, container, false);
  View = view;
        Bundle bundle = getArguments();

        Integer val = bundle.getInt("shopIDs");

        Integer example = R.drawable.example1;

        Toast.makeText(getContext(), "ID _ " + val, Toast.LENGTH_SHORT).show();

        if(val == 1)
            example = R.drawable.example1;
        if(val == 2)
            example = R.drawable.example2;
        if(val == 3)
            example = R.drawable.example3;
        if(val == 4)
            example = R.drawable.example4;



        ImageView shopPic = (ImageView) view.findViewById(R.id.ShopPicture);
        TextView shopPicOverlay = (TextView) view.findViewById(R.id.ShopPictureOverlay);
        TextView InfoBox = (TextView) view.findViewById(R.id.InfoBox);

//        Drawable image  = getResources().getDrawable(WallPaperoneFragment.imagefield.get(position));

        shopPic.setImageDrawable(getContext().getDrawable(val));

        shopPicOverlay.setText("Måske bare fjern tekst?. " + val);
        shopPicOverlay.setTextColor(Color.parseColor("#400D12"));

        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, 500);

        shopPic.setLayoutParams(lp);

        InfoBox.setTextColor(Color.parseColor("#CDFFFF"));



        /// DO LOGIC FOR GETTING DATA FROM HTTP

        // USE IT TO POPULATE InfoBox
// Below is an example of how it should look!
        InfoBox.setText("Sådan finder du os\n" +
                "\n" +
                "Baresso Coffee A/S\n" +
                "Vimmelskaftet 43, 4. sal\n" +
                "DK-1161 København K\n" +
                "\n" +
                "CVR: 10 01 16 63\n" +
                "\n" +
                "Telefon: +45 33 93 98 28\n" +
                "\n" +
                "info@baresso.com (for generel info/kontakt)\n" +
                "coffeeclub@baresso.com (for alle henvendelser \n" +
                "vedrørende Baresso Coffee Club)");

        addListenerOnButton();
        return view;
    }

    public void addListenerOnButton() {

        Button button = (Button) View.findViewById(R.id.selectedShopback);


        button.setOnClickListener( new View.OnClickListener() {


            public void onClick(View v) {



                getFragmentManager().popBackStack();




            }
        });

    }


    public static Selectedshop newInstance(Integer shopID)
    {
        Bundle args = new Bundle();
        args.putInt("shopIDs", shopID);
        Selectedshop fragment = new Selectedshop();
        fragment.setArguments(args);
        return fragment;
    }






}
