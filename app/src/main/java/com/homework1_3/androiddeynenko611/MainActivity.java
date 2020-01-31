package com.homework1_3.androiddeynenko611;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_LIFE_ACTIVITY = "LifeCycle";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textExample);
        Log.d(LOG_LIFE_ACTIVITY, "onCreate");
        textView.append("\n" + "onCreate");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(LOG_LIFE_ACTIVITY, "onPostCreate");
        textView.append("\n" + "onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LOG_LIFE_ACTIVITY, "onPostResume");
        textView.append("\n" + "onPostResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_LIFE_ACTIVITY, "onStart");
        textView.append("\n" + "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_LIFE_ACTIVITY, "onStop");
        textView.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_LIFE_ACTIVITY, "onDestroy");
        textView.append("\n" + "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_LIFE_ACTIVITY, "onPause");
        textView.append("\n" + "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_LIFE_ACTIVITY, "onResume");
        textView.append("\n" + "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_LIFE_ACTIVITY, "onRestart");
        textView.append("\n" + "onRestart");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(LOG_LIFE_ACTIVITY, "onBackPressed");
        textView.append("\n" + "onBackPressed");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(LOG_LIFE_ACTIVITY, "onKeyDown");
        textView.append("\n" + "onKeyDown");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(LOG_LIFE_ACTIVITY, "onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }
}
