package com.ahmad.bassstudio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);

    TextView title = new TextView(this);
    title.setText("BASS STUDIO\nMusic & Bass");
    title.setTextSize(28);
    title.setGravity(Gravity.CENTER);

    setContentView(title);
}

}
