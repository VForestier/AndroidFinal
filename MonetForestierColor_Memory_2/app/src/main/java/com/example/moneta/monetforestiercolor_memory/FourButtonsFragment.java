package com.example.moneta.monetforestiercolor_memory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class FourButtonsFragment extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_buttons);
    }

    /*A voir, BaseBlocks tout ça*/
    public List<Button> getAllButtons(){
        /*View view = getView();*/
        List<Button> result = new ArrayList<Button>();

        result.add( (Button) findViewById(R.id.buttonBleu));
        result.add( (Button) findViewById(R.id.buttonRouge));
        result.add( (Button) findViewById(R.id.buttonVert));
        result.add( (Button) findViewById(R.id.buttonJaune));

        return result;
    }

}
