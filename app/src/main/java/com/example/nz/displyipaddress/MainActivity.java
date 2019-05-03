package com.example.nz.displyipaddress;

import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        WifiManager wifiManager = (WifiManager) getSystemService(WIFI_SERVICE);
        String string = Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
        textView.setText("IP address : "+ string);
     }
}
