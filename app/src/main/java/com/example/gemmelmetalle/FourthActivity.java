package com.example.gemmelmetalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import static com.example.gemmelmetalle.R.string.all_kanalschachtabdeckung;
import static com.example.gemmelmetalle.R.string.broject_key;
import static com.example.gemmelmetalle.R.string.hut_profil;

public class FourthActivity extends AppCompatActivity {


    // Variable Declaration
    ImageView objectImageView ;
    ValeibleForObject valeibleForObject;
    String titletext;
    String type;
    // layout
    EditText frist_masuer;
    EditText secand_masuer;
    EditText theerth_masuer;

    EditText d_m;
    Switch switch_1;
    Switch switch_2;
    Switch switch_3;

    Button calculator;
    TextView firstMasuer_text;
    TextView secandMauer_text;
    TextView threethMasuer_text;

    // Variable for Calculator
    int first_side;
    int secand_side;
    int therth_side;

    int d_m_in_number;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);


        //massuer Variable  Assigning
        frist_masuer=findViewById(R.id.first_measure);
        secand_masuer=findViewById(R.id.secand_measure);
        theerth_masuer=findViewById(R.id.threeth_measure);

        d_m=findViewById(R.id.measure_matreial);
        switch_1=findViewById(R.id.switch1);
        switch_2=findViewById(R.id.switch2);
        switch_3=findViewById(R.id.switch3);

        calculator = findViewById(R.id.button);
        firstMasuer_text=findViewById(R.id.textView);
        secandMauer_text=findViewById(R.id.textView3);
        threethMasuer_text=findViewById(R.id.textView4);


        //Assigning
        valeibleForObject = (ValeibleForObject) getIntent().getSerializableExtra(getString(broject_key));

        titletext = valeibleForObject.getShapName().toString();
        type=getIntent().getStringExtra("message");

        objectImageView = findViewById(R.id.imageView_InSecandActivity);
          imgeeAnsLayoutset(type);

        //titletext=findViewById(R.id.textView_titletext_22);
        //  objectImageView.setImageResource(valeibleForObject.getShapImage());   // for image set
        //  titletext.setText(valeibleForObject.getShapName());                    for title set

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Number from EditText to Integer change and give a Int Vareibles Valu
                first_side =Integer.parseInt(frist_masuer.getText().toString());
                secand_side =Integer.parseInt(secand_masuer.getText().toString());
                therth_side =Integer.parseInt(theerth_masuer.getText().toString());
                d_m_in_number =Integer.parseInt(d_m.getText().toString());

                // Swith and da contant to make all Masuer autsiede Masuer
                if(switch_1.isChecked()){
                    first_side += d_m_in_number;
                }else {
                }
                if(switch_2.isChecked()){
                    if(type.equals(getString(R.string.mauerwerkabdeckung))){
                        secand_side = secand_side +(d_m_in_number*2);

                }else{
                }
                if(switch_3.isChecked()){
                        therth_side +=d_m_in_number;
                    }else {

                    }

                }else{
                }


                help_type(type.toString());

                CalutorProjects calutorProjects = new CalutorProjects(first_side,secand_side,therth_side,d_m_in_number,help_type(type));
                String result_text;
                result_text = calutorProjects.project_result() ;

                // Intent
                Intent intent=new Intent(FourthActivity.this,FinalActivity.class);
                intent.putExtra("message",type);
                intent.putExtra("result",result_text);
                startActivity(intent);

            }
        });






    }// end of onCreat Method

    // Imagr and Layout Text set Mathod


    public void imgeeAnsLayoutset(String type_object){

      if(type_object.equals(getString(R.string.u_profil__c_profil))){
            objectImageView.setImageResource(R.drawable.secand_c_u_profil);
            firstMasuer_text.setText("H1");
            secandMauer_text.setText("L1");
            threethMasuer_text.setText("H2");

        }else if(type_object.equals(getString(R.string.z_profil))){
          objectImageView.setImageResource(R.drawable.secand_z_profil);
          firstMasuer_text.setText("L1");
          secandMauer_text.setText("H1");
          threethMasuer_text.setText("L2");
      }

        else {
            //objectImageView.setImageResource(R.drawable.wanne3_seitig);
        }
    }
    public String help_type(String str){
        String help;
        if (str.contentEquals(getString(R.string.u_profil__c_profil))){
            help="U-PROFIL / C-PROFIL";
        }else{
            help="Z-PROFIL";
        }
        return str;
    }



}