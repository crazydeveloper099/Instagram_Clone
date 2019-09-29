package com.anubhav.Instagram_Clone.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import com.anubhav.Instagram_Clone.materialcamera.internal.BaseCaptureActivity;
import com.anubhav.Instagram_Clone.materialcamera.internal.Camera2Fragment;


public class CaptureActivity2 extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return Camera2Fragment.newInstance();
  }
}
