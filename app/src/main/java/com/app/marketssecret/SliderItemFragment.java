package com.app.marketssecret;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

public class SliderItemFragment extends Fragment {

  private static final String ARG_POSITION = "slider-position";
  @StringRes
  private static final int[] PAGE_TITLES =
      new int[] { R.string.one, R.string.two, R.string.three, R.string.four};

  @StringRes
  private static final int[] PAGE_TEXT =
      new int[] {
          R.string.one_text, R.string.two_text, R.string.three_text, R.string.four_text
      };
  @StringRes
  private static final int[] PAGE_IMAGE =
      new int[] {
          R.drawable.pageone, R.drawable.pagetwo, R.drawable.pagethree, R.drawable.logo
      };

  @StringRes
  private static final int[] BG_IMAGE = new int[] {
      R.drawable.ic_bg_white, R.drawable.ic_bg_white, R.drawable.ic_bg_white,
      R.drawable.ic_bg_white
  };

  private int position;

  public SliderItemFragment() {
  }

  public static SliderItemFragment newInstance(int position) {
    SliderItemFragment fragment = new SliderItemFragment();
    Bundle args = new Bundle();
    args.putInt(ARG_POSITION, position);
    fragment.setArguments(args);
    return fragment;
  }


  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments() != null) {
      position = getArguments().getInt(ARG_POSITION);
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_slider_item, container, false);
  }

  @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP) @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    // set page background
    view.setBackground(requireActivity().getDrawable(BG_IMAGE[position]));

    TextView title = view.findViewById(R.id.textView);
    TextView titleText = view.findViewById(R.id.textView2);
    ImageView imageView = view.findViewById(R.id.imageView);


    title.setText(PAGE_TITLES[position]);

    titleText.setText(PAGE_TEXT[position]);

    imageView.setImageResource(PAGE_IMAGE[position]);
  }
}
