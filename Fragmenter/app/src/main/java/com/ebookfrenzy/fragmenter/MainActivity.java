package com.ebookfrenzy.fragmenter;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment, Frag1.newInstance()).commit();
        }



    }


    public void menu1(View view)
    {
        Log.d("menu1" , "er trykket");
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Frag1.newInstance()).commit();
    }

    public void menu2(View view)
{
    Log.d("menu2" , "er trykket");
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Frag2.newInstance()).commit();
}
    public void Index(View view)
    {
        Log.d("Start Side" , "er trykket");







        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Index.newInstance()).commit();
    }
//    public void SelectedShop(View view)
//    {
//        Log.d("Start Side" , "er trykket");
//        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Selectedshop.newInstance("yolo")).commit();
//    }


    @Override
    public void onBackPressed() {

//        getSupportFragmentManager().getBackStackEntryAt(getSupportFragmentManager().getBackStackEntryCount()-1);

        // Logic to go back here...

    }
}
