package com.example.admin.viewpaperfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.admin.viewpaperfragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment {

   ViewPager viewPager;
    public TabFragment1() {
        // Required empty public constructor
    }
   /* @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab_fragment1, container, false);
    }
*/
  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_tab_fragment1, container, false);
      LinearLayout btnTab2 = (LinearLayout) view.findViewById(R.id.btn_tab_2);
      viewPager = (ViewPager) getActivity().findViewById(R.id.pager);
      btnTab2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              viewPager.setCurrentItem(1);
          }
      });
      LinearLayout btnTab3 = (LinearLayout) view.findViewById(R.id.btn_tab_3);
      btnTab3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              viewPager.setCurrentItem(2);
          }
      });
      return view;
  }
}
