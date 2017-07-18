package com.example.lynnik.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;

public class BeatBox {

  private static final String TAG = "BeatBox";
  private static final String SOUNDS_FOLDER = "sample_sounds";

  private AssetManager mAssetManager;

  public BeatBox(Context context) {
    mAssetManager = context.getAssets();
    loadSounds();
  }

  private void loadSounds() {
    String[] soundNames;
    try {
      soundNames = mAssetManager.list(SOUNDS_FOLDER);
      Log.i(TAG, "Found " + soundNames.length + " sounds.");
    } catch (IOException ioe) {
      Log.e(TAG, "Could not list assets.", ioe);
      return;
    }
  }
}