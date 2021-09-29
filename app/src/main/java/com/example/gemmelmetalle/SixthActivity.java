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

public class SixthActivity extends AppCompatActivity {



    // Variable Declaration
    ImageView objectImageView ;
    ValeibleForObject valeibleForObject;
    String  titletext;
    String type;
    // layout
    EditText frist_masuer;
    EditText secand_masuer;
    EditText theerth_masuer;
    EditText fourth_masuer;
    EditText fiveth_mauser;
    EditText sixthe_mauser;
    EditText d_m;

    Button calculator;

    // Variable for Calculator
    int first_side;
    int secand_side;
    int therth_side;
    int fourth_side;
    int fiveth_side;
    int sixth_side;
    int d_m_in_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);



        //massuer Variable  Assigning
        frist_masuer=findViewById(R.id.first_measure);
        secand_masuer=findViewById(R.id.secand_measure);
        theerth_masuer=findViewById(R.id.threeth_measure);
        fourth_masuer=findViewById(R.id.fourth_measure);
        fiveth_mauser=findViewById(R.id.fiveth_measure);
        sixthe_mauser=findViewById(R.id.sixth_mesure);
        d_m=findViewById(R.id.measure_matreial);

        calculator = findViewById(R.id.button);


        //Assigning
        valeibleForObject = (ValeibleForObject) getIntent().getSerializableExtra(getString(broject_key));

        titletext = valeibleForObject.getShapName().toString();
        type=getIntent().getStringExtra("message");

        objectImageView = findViewById(R.id.imageView_InSecandActivity);
        //imgeeAnsLayoutset(type);
        //titletext=findViewById(R.id.textView_titletext_22);
        //  objectImageView.setImageResource(valeibleForObject.getShapImage());    for image set
        //  titletext.setText(valeibleForObject.getShapName());                    for title set
        objectImageView.setImageResource(R.drawable.secand_wanne_object_);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                first_side =Integer.parseInt(frist_masuer.getText().toString());
                secand_side =Integer.parseInt(secand_masuer.getText().toString());
                therth_side =Integer.parseInt(theerth_masuer.getText().toString());
                fourth_side =Integer.parseInt(fourth_masuer.getText().toString());
                fiveth_side =Integer.parseInt(fiveth_mauser.getText().toString());
                sixth_side = Integer.parseInt(sixthe_mauser.getText().toString());
                d_m_in_number =Integer.parseInt(d_m.getText().toString());


                help_type(type.toString());

                CalutorProjects calutorProjects = new CalutorProjects(first_side,secand_side,therth_side,fourth_side,fiveth_side,sixth_side,d_m_in_number,help_type(type));
                String result_text;
                result_text = calutorProjects.project_result() ;

                // Intent
                Intent intent= new Intent(SixthActivity.this,FinalActivity.class);
                intent.putExtra("message",type);
                intent.putExtra("result",result_text);
                startActivity(intent);





            }
        });







    }

    public String help_type(String str){
        String help;
        if (str.contentEquals(getString(R.string.wanne))){
            help="WANNE";
        }else if(str.contentEquals(getString(R.string.wanne2_2g))){
            help="WANNE 2/2G";
        }else if(str.contentEquals(getString(R.string.wanne2_2n))) {
            help="WANNE 2/2N";
        }else{
            help="WANNE 3/1";
        }
        return str;
    }


    // end of onCreat Method

    // Imagr and Layout Text set Mathod
   // public void imgeeAnsLayoutset(String type_object){

   // objectImageView.setImageResource(R.drawable.secand_all_wanne_objects);


    }

        /*
        if (type_object.equals(getString(R.string.all_kanalschachtabdeckung))){
            objectImageView.setImageResource(R.drawable.secand_all_kanalschachtabdeckung_object);

        }
        else if(type_object.equals(getString(R.string.fensterbank_tropfbleche))){
            objectImageView.setImageResource(R.drawable.secand_fensterbank_tropfbleche_object);
            firstMasuer_text.setText("H1");
            secandMauer_text.setText("L1");
            threethMasuer_text.setText("H2");
            fourthMauser_text.setText("L2");
            fivethMauser_text.setText("      ");
            fiveth_mauser.getText().clear();
            fiveth_mauser.setHint("     ");

        }
        else if(type_object.equals(getString(R.string.hut_profil))){
            objectImageView.setImageResource(R.drawable.secand_hut_profil_object);
        }
        else if(type_object.equals(getString(R.string.mauerwerkabdeckung))){
            objectImageView.setImageResource(R.drawable.secand_mauerwerkandackung);
        }
        else if(type_object.equals(getString(R.string.seitenabdeckung))){
            objectImageView.setImageResource(R.drawable.secand_seitenabdeckung);
            firstMasuer_text.setText("H1");
            secandMauer_text.setText("L1");
            threethMasuer_text.setText("L2");
            fourthMauser_text.setText("H2");
            fivethMauser_text.setText("      ");
            fiveth_mauser.getText().clear();
            fiveth_mauser.setHint("     ");
        }
        else if(type_object.equals(getString(R.string.u_profil))){
            objectImageView.setImageResource(R.drawable.secand_u_profil);
            firstMasuer_text.setText("H1");
            secandMauer_text.setText("L1");
            threethMasuer_text.setText("H2");
            fourthMauser_text.setText("L2");
            fivethMauser_text.setText("      ");
            fiveth_mauser.getText().clear();
            fiveth_mauser.setHint("     ");
        }
        else if(type_object.equals(getString(R.string.u_profil__c_profil))){
            objectImageView.setImageResource(R.drawable.secand_c_u_profil);
            firstMasuer_text.setText("H1");
            secandMauer_text.setText("L1");
            threethMasuer_text.setText("H2");
            fourthMauser_text.setText("   ");
            fourth_masuer.getText().clear();
            fourth_masuer.setHint("     ");
            fivethMauser_text.setText("      ");
            fiveth_mauser.getText().clear();
            fiveth_mauser.setHint("     ");
        }
        else if(type_object.equals(getString(R.string.winkel))){
            objectImageView.setImageResource(R.drawable.secand_winkle);
            firstMasuer_text.setText("H1");
            secandMauer_text.setText("L1");
            threethMasuer_text.setText("  ");
            theerth_masuer.getText().clear();
            theerth_masuer.setHint("    ");
            fourthMauser_text.setText("   ");
            fourth_masuer.getText().clear();
            fourth_masuer.setHint("     ");
            fivethMauser_text.setText("      ");
            fiveth_mauser.getText().clear();
            fiveth_mauser.setHint("     ");
        }
        else if(type_object.equals(getString(R.string.z_profil))){
            objectImageView.setImageResource(R.drawable.secand_z_profil);
            firstMasuer_text.setText("L1");
            secandMauer_text.setText("H1");
            threethMasuer_text.setText("L2 ");
            fourthMauser_text.setText("   ");
            fourth_masuer.getText().clear();
            fourth_masuer.setHint("     ");
            fivethMauser_text.setText("      ");
            fiveth_mauser.getText().clear();
            fiveth_mauser.setHint("     ");
        }
        else if(type_object.equals(getString(R.string.wanne))){
            objectImageView.setImageResource(R.drawable.wanne);
        }
        else if(type_object.equals(getString(R.string.wanne2_2g))){
            objectImageView.setImageResource(R.drawable.wanne2_2g);
        }
        else if(type_object.equals(getString(R.string.wanne2_2n))){
            objectImageView.setImageResource(R.drawable.wanne2_2n);
        }
        else if(type_object.equals(getString(R.string.wanne3_1))){
            objectImageView.setImageResource(R.drawable.wanne3_1);
        }
        else {
            objectImageView.setImageResource(R.drawable.wanne3_seitig);
        }
    }


         */

