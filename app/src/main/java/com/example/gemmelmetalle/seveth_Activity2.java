package com.example.gemmelmetalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import static com.example.gemmelmetalle.R.string.broject_key;

public class seveth_Activity2 extends AppCompatActivity {

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
    EditText d_m;

    Button calculator;

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
        setContentView(R.layout.activity_seveth_2);



            //massuer Variable  Assigning
            frist_masuer=findViewById(R.id.first_measure);
            secand_masuer=findViewById(R.id.secand_measure);
            theerth_masuer=findViewById(R.id.threeth_measure);
            fourth_masuer=findViewById(R.id.fourth_measure);
            fiveth_mauser=findViewById(R.id.fiveth_measure);
            d_m=findViewById(R.id.measure_matreial);

            calculator = findViewById(R.id.button);


            //Assigning
            valeibleForObject = (ValeibleForObject) getIntent().getSerializableExtra(getString(broject_key));

            titletext = valeibleForObject.getShapName().toString();
            type=getIntent().getStringExtra("message");

            objectImageView = findViewById(R.id.imageView_InSecandActivity);
            objectImageView.setImageResource(R.drawable.secand_wanne_3seitig);

            calculator.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    first_side =Integer.parseInt(frist_masuer.getText().toString());
                    secand_side =Integer.parseInt(secand_masuer.getText().toString());
                    therth_side =Integer.parseInt(theerth_masuer.getText().toString());
                    fourth_side =Integer.parseInt(fourth_masuer.getText().toString());
                    fiveth_side =Integer.parseInt(fiveth_mauser.getText().toString());
                    d_m_in_number =Integer.parseInt(d_m.getText().toString());

                    String help_type="WANNE 3-SEITIG";


                    CalutorProjects calutorProjects = new CalutorProjects(first_side,secand_side,therth_side,fourth_side,fiveth_side,d_m_in_number,help_type);
                    String result_text;
                    result_text = calutorProjects.project_result() ;

                    // Intent
                    Intent intent= new Intent(seveth_Activity2.this,FinalActivity.class);
                    intent.putExtra("message",type);
                    intent.putExtra("result",result_text);
                    startActivity(intent);





                }
            });







        }





    }




