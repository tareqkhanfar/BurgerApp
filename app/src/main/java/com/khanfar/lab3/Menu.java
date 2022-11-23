package com.khanfar.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.List;

import Model.FoodItem;
import Model.IItemData;
import Model.ItemData;

public class Menu extends AppCompatActivity {
private Spinner spnCat ;
private Button show ;
private ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setUpComponent() ;

        IItemData data = new ItemData() ;
        List<String> cats = data.getCategories() ;

        ArrayAdapter<String> adapterCat = new ArrayAdapter<>(this , android.R.layout.simple_spinner_item ,cats);
        spnCat.setAdapter(adapterCat);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String selectedValue =   spnCat.getSelectedItem().toString() ;

                List<FoodItem> myItemsByCat = data.getItemsByCat(selectedValue) ;
                ArrayAdapter<FoodItem> adapter = new ArrayAdapter<>(Menu.this  , android.R.layout.simple_list_item_1 , myItemsByCat) ;
       listView.setAdapter(adapter);
            }
        });
    }

    private void setUpComponent() {
        spnCat = findViewById(R.id.spnCategories) ;
        show = findViewById(R.id.show) ;
        listView = findViewById(R.id.listCategories) ;
    }
}