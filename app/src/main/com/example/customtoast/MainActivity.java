package com.example.customtoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
        Button btn=findViewById(R.id.activitymainButton1);
		btn.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View p1) {
					View customtoast=getLayoutInflater().inflate(
						R.layout.custom_toast,(ViewGroup)
						findViewById(R.id.custom_toastRelativeLayout));
					((TextView)customtoast.findViewById(
					R.id.custom_toastTextView)).setText("This is a custom toast");
					((ImageView)customtoast.findViewById(R.id.custom_toastImageView))
					.setImageResource(R.mipmap.ic_launcher);
					Toast toast=new Toast(getApplicationContext());
					toast.setView(customtoast);
					toast.setDuration(Toast.LENGTH_LONG);
					toast.show();
				}
				
			
		});
    }
    
}
/*don't forget to subscribe my YouTube channel for more Tutorial and mod*/
/*
https://youtube.com/channel/UC_lCMHEhEOFYgJL6fg1ZzQA */
