package com.example.tapesh.photosdcard1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Bitmap bitmapToDiaplay;
    Button button;
    ImageView imageView;
    String direc="valuess";
    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button=(Button)findViewById(R.id.button);
        imageView=(ImageView)findViewById(R.id.imageView);

       // File file=context.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS,direc);


        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View view)
    {

       try {
         //  File file[] = context.getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
           File f[]=  ContextCompat.getExternalFilesDirs(this,Environment.DIRECTORY_DOWNLOADS);
           String p1 = "image10.png";

           File file9 = new File(f[0], p1);

           if (file9.exists()) {
               bitmapToDiaplay = BitmapFactory.decodeFile(file9.toString());
               Log.i("exists","file");
           }else
           {
               Log.i("not exist","file");
           }

           imageView.setImageBitmap(bitmapToDiaplay);
       }catch (Exception e)
       {
           Log.i("error",e.toString());
       }


       }

}
