package com.example.user.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class IntentPage extends AppCompatActivity {

    public void camclick(View view){
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }
     public void callclick(View view)
     {
         Intent intent =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:91-000-000-0000"));
         startActivity(intent);
     }
     public void msgclick(View view)
     {

         Intent sendIntent = new Intent(Intent.ACTION_VIEW);
         sendIntent.putExtra("sms_body", "default content");
         sendIntent.setType("vnd.android-dir/mms-sms");
         startActivity(sendIntent);

     }
     public void webclick(View view){
         Uri uriUrl = Uri.parse("http://androidbook.blogspot.com/");
         Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
         startActivity(launchBrowser);
         Toast.makeText(IntentPage.this, "Login Successfull", Toast.LENGTH_SHORT).show();


     }
     public void backclick(View view)
     {
         Intent ob=new Intent(IntentPage.this,MainActivity.class);
         startActivity(ob);
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_page);

    }
}
