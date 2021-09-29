package com.example.gemmelmetalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;


import static com.example.gemmelmetalle.R.string.*;

public class SecandActivity extends AppCompatActivity {

    public static final String TAG= SecandActivity.class.getSimpleName();

    // Variable Declaration
    ImageView objectImageView ;
    ValeibleForObject valeibleForObject;
    String titletext;
    String type;
    // layout
    EditText frist_masuer;
    EditText secand_masuer;
    EditText theerth_masuer;
    EditText fourth_masuer;
    EditText fiveth_mauser;
    EditText d_m;
    Switch switch_1;
    Switch switch_2;
    Switch switch_3;
    Switch switch_4;
    Switch switch_5;
    Button calculator;
    TextView firstMasuer_text;
    TextView secandMauer_text;
    TextView threethMasuer_text;
    TextView fourthMauser_text;
    TextView fivethMauser_text;
    // Variable for Calculator
    int first_side;
    int secand_side;
    int therth_side;
    int fourth_side;
    int fiveth_side;
    int d_m_in_number;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secand);

        //massuer Variable  Assigning
        frist_masuer=findViewById(R.id.first_measure);
        secand_masuer=findViewById(R.id.secand_measure);
        theerth_masuer=findViewById(R.id.threeth_measure);
        fourth_masuer=findViewById(R.id.fourth_measure);
        fiveth_mauser=findViewById(R.id.fiveth_measure);
        d_m=findViewById(R.id.measure_matreial);
        switch_1=findViewById(R.id.switch1);
        switch_2=findViewById(R.id.switch2);
        switch_3=findViewById(R.id.switch3);
        switch_4=findViewById(R.id.switch4);
        switch_5=findViewById(R.id.switch5);
        calculator = findViewById(R.id.button);
        firstMasuer_text=findViewById(R.id.textView);
        secandMauer_text=findViewById(R.id.textView3);
        threethMasuer_text=findViewById(R.id.textView4);
        fourthMauser_text=findViewById(R.id.textView5);
        fivethMauser_text=findViewById(R.id.textView6);

        //Assigning
        valeibleForObject = (ValeibleForObject) getIntent().getSerializableExtra(getString(broject_key));

        titletext = valeibleForObject.getShapName().toString();
        type=getIntent().getStringExtra("message");

        objectImageView = findViewById(R.id.imageView_InSecandActivity);
        imgeeAnsLayoutset(type);

        //titletext=findViewById(R.id.textView_titletext_22);
     //  objectImageView.setImageResource(valeibleForObject.getShapImage());    for image set
     //  titletext.setText(valeibleForObject.getShapName());                    for title set


        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Number from EditText to Integer change and give a Int Vareibles Valu
                first_side =Integer.parseInt(frist_masuer.getText().toString());
                secand_side =Integer.parseInt(secand_masuer.getText().toString());
                therth_side =Integer.parseInt(theerth_masuer.getText().toString());
                fourth_side =Integer.parseInt(fourth_masuer.getText().toString());
                fiveth_side =Integer.parseInt(fiveth_mauser.getText().toString());
                d_m_in_number =Integer.parseInt(d_m.getText().toString());

                // Swith and da contant to make all Masuer autsiede Masuer
                if(switch_1.isChecked()){
                    first_side += d_m_in_number;
                }else {
                }
                if(switch_2.isChecked()){
                     if(type.equals(getString(R.string.mauerwerkabdeckung))){
                        secand_side+=d_m_in_number;
                    } else{
                        secand_side = secand_side +(d_m_in_number*2);
                    }
                }else{
                }
                if(switch_3.isChecked()){
                    if (type.equals(getString(R.string.all_kanalschachtabdeckung))){
                        therth_side +=d_m_in_number;
                    }else if ( type.equals(getString(R.string.hut_profil))) {
                            therth_side +=d_m_in_number;
                    }else {
                            therth_side +=(d_m_in_number * 2);
                        }

                }else{
                }
                if(switch_4.isChecked()){
                    if(type.equals(getString(R.string.all_kanalschachtabdeckung))){
                        fourth_side+=d_m_in_number;
                    }else{
                        fourth_side+=(d_m_in_number *2);
                    }
                }else{

                }
                if(switch_5.isChecked()){
                    fiveth_side+=(d_m_in_number*2);
                }

                help_type(type.toString());

                CalutorProjects calutorProjects = new CalutorProjects(first_side,secand_side,therth_side,fourth_side,fiveth_side,d_m_in_number,help_type(type));
                String result_text;
                result_text = calutorProjects.project_result() ;

                // Intent 
                Intent intent= new Intent(SecandActivity.this,FinalActivity.class);
                intent.putExtra("message",type);
                intent.putExtra("result",result_text);
                startActivity(intent);


                // broject exsamin
                Log.d(TAG,"tis is the resul object"+calutorProjects.project_result());
                Log.d(TAG,"This is the String "+result_text);
               // Log.d(TAG,"this is l1"+str_1);
                Log.d(TAG,"this is type : "+type);

                //System.out.println(calutorProjects.project_result(type));
                //System.out.println(result_text);
            }
        });







       Log.d(TAG,"this is type : "+type);
       Log.d(TAG,"this is titleText : "+titletext);










    }// end of onCreat Method

        // Imagr and Layout Text set Mathod
    public void  imgeeAnsLayoutset(String type_object){
        if (type_object.equals(getString(R.string.all_kanalschachtabdeckung))){
            objectImageView.setImageResource(R.drawable.secand_all_kanalschachtabdeckung_object);

        }
        else if(type_object.equals(getString(R.string.hut_profil))){
            objectImageView.setImageResource(R.drawable.secand_hut_profil_object);
        }
        else if(type_object.equals(getString(R.string.mauerwerkabdeckung))){
            objectImageView.setImageResource(R.drawable.secand_mauerwerkandackung);
        }

        else {

        }
    }

    public String help_type(String str){
        String help;
        if (str.contentEquals(getString(all_kanalschachtabdeckung))){
            help="ALLGEMEINE KANALSCHACHTABDECKUNG";
        }else if(str.contentEquals(getString(hut_profil))){
            help="HUT-PROFIL";
        }else{
            help="MAUERWERKABDECKUNG";
        }
        return str;
    }




}


