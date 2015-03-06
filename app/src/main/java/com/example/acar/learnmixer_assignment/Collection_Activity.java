package com.example.acar.learnmixer_assignment;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;


public class Collection_Activity extends ActionBarActivity {

    public ImageView imageview;
    private Drawable drawable;

    VideoView vv;

    Button btn;
    Button stp_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection_);

        imageview.setImageDrawable(drawable);
            drawable =  getResources().getDrawable(R.drawable.greeks);

        imageview=(ImageView) findViewById(R.id.imageView);

        btn = (Button)findViewById(R.id.start_btn);
        stp_btn =(Button)findViewById(R.id.stop_btn);
        vv=(VideoView)findViewById(R.id.videoView);
        Uri uri= Uri.parse("android.resource://"+getPackageName()+"+/"+R.raw.video);
        vv.setVideoURI(uri);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv.start();
            }
        });

        stp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vv.pause();
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_collection_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
