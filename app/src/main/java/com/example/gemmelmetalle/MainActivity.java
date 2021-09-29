package com.example.gemmelmetalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

import static com.example.gemmelmetalle.R.array.*;
import static com.example.gemmelmetalle.R.array.type;

public class MainActivity extends AppCompatActivity {

    // Valiable Declaration

   //ListView objectListView;
    GridView objectLis_Grid_tView;

    // Adapter Valiable Declaration und Assigning
    ArrayList<ValeibleForObject>list;
    FirstAdapterbetweenMainAndListView adapterbetweenMainAndListView;
    ValeibleForObject all_kanalschachtabdeckung_object;
    ValeibleForObject fensterbank_tropfbleche_object;
    ValeibleForObject hut_profil_object;
    ValeibleForObject mauerwerkandackung_object;
    ValeibleForObject seitenabdeckung_object;
    ValeibleForObject u_profil_object;
    ValeibleForObject c_u_profil_object;        //u_profil__c_profil
    ValeibleForObject wanne_object;
    ValeibleForObject wanne2_2g_object;
    ValeibleForObject wanne2n_object;           //wanne2_2n
    ValeibleForObject wanne3_1_object;
    ValeibleForObject wanne3seitig_object;
    ValeibleForObject winkle_object;
    ValeibleForObject z_profil_object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Valiable Assigning
        objectLis_Grid_tView = findViewById(R.id.object_ListView);
        list=new ArrayList<>();
        adapterbetweenMainAndListView = new FirstAdapterbetweenMainAndListView(list,this);

        // object and view
        all_kanalschachtabdeckung_object = new ValeibleForObject(getString(R.string.all_kanalschachtabdeckung),R.drawable.all_kanalschachtabdeckung);
        fensterbank_tropfbleche_object = new ValeibleForObject(getString(R.string.fensterbank_tropfbleche),R.drawable.fensterbank_tropfbleche);
        hut_profil_object = new ValeibleForObject(getString(R.string.hut_profil),R.drawable.hut_profil);
        mauerwerkandackung_object = new ValeibleForObject(getString(R.string.mauerwerkabdeckung),R.drawable.mauerwerkabdeckung);
        seitenabdeckung_object = new ValeibleForObject(getString(R.string.seitenabdeckung),R.drawable.seitenabdeckung);
        u_profil_object = new ValeibleForObject(getString(R.string.u_profil),R.drawable.u_profil);
        c_u_profil_object = new ValeibleForObject(getString(R.string.u_profil__c_profil),R.drawable.u_profil__c_profil);
        wanne_object = new ValeibleForObject(getString(R.string.wanne),R.drawable.wanne);
        wanne2_2g_object = new ValeibleForObject(getString(R.string.wanne2_2g),R.drawable.wanne2_2g);
        wanne2n_object = new ValeibleForObject(getString(R.string.wanne2_2n),R.drawable.wanne2_2n);
        wanne3_1_object = new ValeibleForObject(getString(R.string.wanne3_1),R.drawable.wanne3_1);
        wanne3seitig_object = new ValeibleForObject(getString(R.string.wanne3_seitig),R.drawable.wanne3_seitig);
        winkle_object = new ValeibleForObject(getString(R.string.winkel),R.drawable.winkel);
        z_profil_object = new ValeibleForObject(getString(R.string.z_profil),R.drawable.z_profil);


        //Add to Arraylist
        list.add(all_kanalschachtabdeckung_object);
        list.add(fensterbank_tropfbleche_object);
        list.add(hut_profil_object);
        list.add(mauerwerkandackung_object);
        list.add(seitenabdeckung_object);
        list.add(u_profil_object);
        list.add(c_u_profil_object);
        list.add(winkle_object);
        list.add(z_profil_object);
        list.add(wanne3seitig_object);
        list.add(wanne_object);
        list.add(wanne2_2g_object);
        list.add(wanne2n_object);
        list.add(wanne3_1_object);

        //Add all to ListView

        objectLis_Grid_tView.setAdapter(adapterbetweenMainAndListView);

        //on Click
        objectLis_Grid_tView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listTypt;
                listTypt=getResources().getStringArray(type)[position];
                beViwListOnClick(list.get(position),getResources().getStringArray(type)[position]);

            }
        });






    }// end onCreate Method

    // onItamClickLeistener Method

    public void beViwListOnClick(ValeibleForObject valeibleForObject ,String type){
       // Intent intent new Intent(MainActivity.this,SecandActivity.class);
        Intent intent ;
                //all objects with 5 profil
        if (valeibleForObject.equals(all_kanalschachtabdeckung_object) || valeibleForObject.equals(hut_profil_object) || valeibleForObject.equals(mauerwerkandackung_object)){
            intent = new Intent(MainActivity.this,SecandActivity.class);
        }
                // all opjects with 4 profil
        else if (valeibleForObject.equals(fensterbank_tropfbleche_object) || valeibleForObject.equals(seitenabdeckung_object) || valeibleForObject.equals(u_profil_object)){
            intent = new Intent(MainActivity.this,TherthActivity.class);
        }
                // all object with 3 profil (c_u_profil_object and z_profil)
        else if (valeibleForObject.equals(c_u_profil_object) || valeibleForObject.equals(z_profil_object)) {
            intent=new Intent(MainActivity.this,FourthActivity.class);
        }
                // object with 2 profil  , only einkle_object
        else if(valeibleForObject.equals(winkle_object)){
            intent=new Intent(MainActivity.this,FivethActivity.class);
        }
        else{
            intent=new Intent(MainActivity.this,SixthActivity.class);
        }

        intent.putExtra(getString(R.string.broject_key),valeibleForObject);
        intent.putExtra("message",type);
        startActivity(intent);
    }











}  // end MainActivity method  (End Porgramm)


// Gesamt Langer zuschneider



























