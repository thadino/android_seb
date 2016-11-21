package com.ebookfrenzy.fragmenter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kaspe on 2016-11-20.
 */

public class Frag2 extends Fragment
{

    public Frag2()
    {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.frag_2, container, false);
        return view;
    }

    public static Frag2 newInstance()
    {
        Bundle args = new Bundle();
        Frag2 fragment = new Frag2();
        fragment.setArguments(args);
        return fragment;
    }
}
