package com.app.marketssecret;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SliderPagerAdapter extends FragmentPagerAdapter {
  public SliderPagerAdapter(@NonNull FragmentManager fm, int behavior) {
    super(fm, behavior);
  }

  @NonNull @Override public Fragment getItem(int position) {
    return com.app.marketssecret.SliderItemFragment.newInstance(position);
  }

  @Override public int getCount() {
    return 4;
  }
}