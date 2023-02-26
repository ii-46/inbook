package com.inthava.hotelapp.presentationLayer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.inthava.hotelapp.R;
import com.inthava.hotelapp.dataLayer.writerAndReader;
import com.inthava.hotelapp.logicLayer.Customer;
import com.inthava.hotelapp.logicLayer.Hotel;
import com.inthava.hotelapp.logicLayer.Room;
import com.inthava.hotelapp.logicLayer.Vendor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Main_Screen extends AppCompatActivity {


    RelativeLayout customer;
    RelativeLayout vendor;
    String Page;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        customer = findViewById(R.id.rl_customer_button);
        vendor = findViewById(R.id.rl_vendor_button);

        customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Page= "Customer";
                Intent intent=new Intent(Main_Screen.this,Login_Screen.class);
                intent.putExtra("Page",Page);
                startActivity(intent);
            }
        });
        vendor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Page= "Vendor";
                Intent intent=new Intent(Main_Screen.this,Login_Screen.class);
                intent.putExtra("Page",Page);
                startActivity(intent);
            }
        });
    }
}