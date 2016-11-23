package com.ebookfrenzy.fragmenter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by kaspe on 2016-11-20.
 */

public class Frag1 extends Fragment
{

    View View;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.frag_1, container, false);
        View = view;
        addListenerOnButton();
        return view;
    }


    public void addListenerOnButton() {

        Button button = (Button) View.findViewById(R.id.selectedShopback);


        button.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {


                getFragmentManager().popBackStack();


            }
        });
    }

    public static Frag1 newInstance()
    {
        Bundle args = new Bundle();
        Frag1 fragment = new Frag1();
        fragment.setArguments(args);
        return fragment;
    }




    }
