package comsci.kamonlphop.animalforfun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String nameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ปุ่มstart
        final EditText name = (EditText) findViewById(R.id.txtname);
        Button btnstartgame = (Button) findViewById(R.id.btnstart);
        btnstartgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.length()==0){//ถ้า eddittext ว่าง คือไม่ใส่ชื่อ
                    Toast.makeText(getApplicationContext(),"กรุณาใส่ชื่อ",Toast.LENGTH_SHORT).show();
                }
                else {
                    nameString = name.getText().toString().trim();
                    Toast.makeText(getApplicationContext(), "Welcome "+nameString, Toast.LENGTH_SHORT).show();
                    Intent clickingameintent = new Intent(MainActivity.this, Game.class);
                    startActivity(clickingameintent);
                }
            }
        });//end oncreate
    }//endmain


}
