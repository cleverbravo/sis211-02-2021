package com.example.programa25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEjecutar=(Button)this.findViewById(R.id.btnEjecutar);
        EditText txtA=findViewById(R.id.txtA);
        EditText txtB=findViewById(R.id.txtB);
        EditText txtResult=findViewById(R.id.txtResult);
        btnEjecutar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int a=Integer.parseInt(txtA.getText().toString());
                int b=Integer.parseInt(txtB.getText().toString());
                int c=a+b;
                txtResult.setText(""+c);
                Toast.makeText(getApplicationContext(),"hola mundo",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
