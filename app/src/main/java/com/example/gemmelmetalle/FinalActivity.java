package com.example.gemmelmetalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class FinalActivity extends AppCompatActivity {

    ImageView imageView;
    TextView titleTextView;
    TextView final_resutl_textview;
    Button send_button;
    Button go_back_button;
    Button go_to_main;
    String type;
    String result_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        imageView = findViewById(R.id.final_imageView);
        titleTextView = findViewById(R.id.final_titletext_textView8);
        final_resutl_textview = findViewById(R.id.final_result_textView);
        send_button = findViewById(R.id.send_button);
        go_back_button = findViewById(R.id.back_button);
        go_to_main = findViewById(R.id.go_to_strat_button);




        type=getIntent().getStringExtra("message");
        result_text = getIntent().getStringExtra("result");
        imgeeAnsLayoutset(type);
        final_resutl_textview.setText(result_text);

        // Share Button
        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent=new Intent();
                shareIntent.setAction(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, (Serializable) imageView);
                shareIntent.putExtra(Intent.EXTRA_TEXT,titleTextView.toString());
                shareIntent.putExtra(Intent.EXTRA_TEXT,final_resutl_textview.toString());
                startActivity(Intent.createChooser(shareIntent,getString(R.string.app_name)));

            }
        });

        //new start button
        go_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go_to_main_intetn = new Intent(FinalActivity.this,MainActivity.class);
                startActivity(go_to_main_intetn);
            }
        });

        // go back button
        go_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack_method(type);
            }
        });




    }//End of onCreate Method

    public void  imgeeAnsLayoutset(String type_object){
        if (type_object.equals(getString(R.string.all_kanalschachtabdeckung))){
            imageView.setImageResource(R.drawable.secand_all_kanalschachtabdeckung_object);
            titleTextView.setText(R.string.all_kanalschachtabdeckung);
        }
        else if(type_object.equals(getString(R.string.hut_profil))){
            imageView.setImageResource(R.drawable.secand_hut_profil_object);
            titleTextView.setText(R.string.hut_profil);
        }
        else if(type_object.equals(getString(R.string.mauerwerkabdeckung))){
            imageView.setImageResource(R.drawable.secand_mauerwerkandackung);
            titleTextView.setText(R.string.mauerwerkabdeckung);
        }
        else  if(type_object.equals(getString(R.string.fensterbank_tropfbleche))){
            imageView.setImageResource(R.drawable.secand_fensterbank_tropfbleche_object);
            titleTextView.setText(getString(R.string.fensterbank_tropfbleche));
        }
        else if(type_object.equals(getString(R.string.seitenabdeckung))){
            imageView.setImageResource(R.drawable.secand_seitenabdeckung);
            titleTextView.setText(getString(R.string.seitenabdeckung));
        }
        else if(type_object.equals(getString(R.string.u_profil))){
            imageView.setImageResource(R.drawable.secand_u_profil);
            titleTextView.setText(getString(R.string.u_profil__c_profil));
        }
        else if(type_object.equals(getString(R.string.u_profil__c_profil))){
            imageView.setImageResource(R.drawable.secand_c_u_profil);
            titleTextView.setText(getString(R.string.u_profil__c_profil));

        }else if(type_object.equals(getString(R.string.z_profil))){
            imageView.setImageResource(R.drawable.secand_z_profil);
            titleTextView.setText(R.string.z_profil);
        }       // All wanee objects
        else if(type_object.equals(getString(R.string.winkel))){
            imageView.setImageResource(R.drawable.secand_winkle);
            titleTextView.setText(R.string.winkel);
        }else if(type_object.equals(getString(R.string.wanne))){
            imageView.setImageResource(R.drawable.secand_all_wanne_objects_1_2);
            titleTextView.setText(R.string.wanne);
        }else if(type_object.equals(getString(R.string.wanne2_2g))){
            imageView.setImageResource(R.drawable.secand_all_wanne_objects_1_2);
            titleTextView.setText(R.string.wanne2_2g);
        }else if(type_object.equals(getString(R.string.wanne2_2n))){
            imageView.setImageResource(R.drawable.secand_all_wanne_objects_1_2);
            titleTextView.setText(R.string.wanne2_2n);
        }else if(type_object.equals(getString(R.string.wanne3_1))){
            imageView.setImageResource(R.drawable.secand_all_wanne_objects_1_2);
            titleTextView.setText(R.string.wanne3_1);
        }else if(type_object.equals(getString(R.string.wanne3_seitig))){
            imageView.setImageResource(R.drawable.secand_result_wanne_3_seitig);
            titleTextView.setText(R.string.wanne3_seitig);
        }

        else {

        }
    }


    // go back method
    public void goBack_method(String method_type){
        // Intent intent new Intent(MainActivity.this,SecandActivity.class);
        Intent intent ;
        //all objects with 5 profil
        if (method_type.equals(getString(R.string.all_kanalschachtabdeckung)) || method_type.equals(getString(R.string.hut_profil)) || method_type.equals(getString(R.string.mauerwerkabdeckung))){
            intent = new Intent(FinalActivity.this,SecandActivity.class);
        }
        // all opjects with 4 profil
        else if (method_type.equals(getString(R.string.fensterbank_tropfbleche)) || method_type.equals(getString(R.string.seitenabdeckung)) || method_type.equals(getString(R.string.u_profil))){
            intent = new Intent(FinalActivity.this,TherthActivity.class);
        }
        // all object with 3 profil (c_u_profil_object and z_profil)
        else if (method_type.equals(getString(R.string.u_profil__c_profil)) || method_type.equals(getString(R.string.z_profil))) {
            intent=new Intent(FinalActivity.this,FourthActivity.class);
        }
        // object with 2 profil  , only einkle_object
        else if(method_type.equals(getString(R.string.winkel))){
            intent=new Intent(FinalActivity.this,FivethActivity.class);
        }
        else if(method_type.equals(getString(R.string.wanne3_seitig))){
            intent=new Intent(FinalActivity.this,seveth_Activity2.class);
        }else{
            intent=new Intent(FinalActivity.this,SixthActivity.class);
        }

        startActivity(intent);
    }


}