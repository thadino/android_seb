package com.ebookfrenzy.fragmenter;

import android.app.ActionBar;

import android.app.FragmentManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null)
        {
            getSupportFragmentManager().beginTransaction().add(R.id.fragment, Index.newInstance()).commit();
        }



    }



    public void menu1(View view)
    {
        Log.d("menu1" , "er trykket");
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Frag1.newInstance()).addToBackStack("A_B_TAG").commit();

//        getSupportFragmentManager().beginTransaction()
//                .add(Frag1.newInstance(), "menu1")
//                // Add this transaction to the back stack
//                .addToBackStack("menu1")
//                .commit();
    }

    public void menu2(View view) {
        Log.d("menu2", "er trykket");
    getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Frag2.newInstance()).addToBackStack("A_B_TAG").commit();

//        getSupportFragmentManager().beginTransaction()
//                .add(Frag1.newInstance(), "menu2")
//                // Add this transaction to the back stack
//                .addToBackStack("menu2").replace(R.id.fragment, Frag2.newInstance())
//                .commit();

    }

    public void Index(View view)
    {
        Log.d("Start Side" , "er trykket");

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, Index.newInstance()).addToBackStack("A_B_TAG").commit();

//        getSupportFragmentManager().beginTransaction()
//                .add(Frag2.newInstance(), "menu2")
//                // Add this transaction to the back stack
//                .addToBackStack("menu2")
//                .commit();

    }







    @Override
    public void onBackPressed() {
//        if (getSupportFragmentManager().findFragmentByTag("FragmentC") != null) {
//            // I'm viewing Fragment C
//            getSupportFragmentManager().popBackStack("A_B_TAG",
//                    FragmentManager.POP_BACK_STACK_INCLUSIVE);
//        } else {
//            super.onBackPressed();
//        }

        getSupportFragmentManager().popBackStackImmediate();

    }



}
