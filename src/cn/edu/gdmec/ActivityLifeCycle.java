package cn.edu.gdmec;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ActivityLifeCycle extends Activity {
	/** Called when the activity is first created. */

	private static final String TAG = "LIFECYCLE";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_life_cycle);
		Log.d(TAG, "this is a test string ");
	}

	protected void onStart() {
		super.onStart();
		Log.i(TAG, "The activity state---->onStart");
	}

	protected void onRestart() {
		super.onRestart();
		Log.i(TAG, "The activity state---->onReatart");
	}

	protected void onResume() {
		super.onResume();
		Log.i(TAG, "The activity state---->onResume");
	}

	protected void onPause() {
		super.onPause();
		Log.i(TAG, "The activity state---->onPause");
	}

	protected void onStop() {
		super.onStop();
		Log.i(TAG, "The activity state---->onStop");
	}

	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "The activity state---->onDestroy");
	}
}
