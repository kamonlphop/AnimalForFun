package comsci.kamonlphop.animalforfun;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Game extends AppCompatActivity {
    //ประกาศตัวแปร
    Button btn1,btn2,btn3,btn4;
    ImageView questionImageView;
    MediaPlayer mediaPlayer;
    ImageButton volumnImageButton;
    int questionCount=1;//กำหนดจำนวนข้อ
    ArrayList<Integer>qID = new ArrayList<Integer>();//qid ใช้ วน array
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        //ผูกตัวแปร
         btn1 = (Button) findViewById(R.id.btn1);
         btn2 = (Button) findViewById(R.id.btn2);
         btn3 = (Button) findViewById(R.id.btn3);
         btn4 = (Button) findViewById(R.id.btn4);
         questionImageView = (ImageView) findViewById(R.id.imvOuestion);
         volumnImageButton = (ImageButton) findViewById(R.id.imbVolumn);

        for (int i=1;i<=questionCount;i++) {
            qID.add(i);//จองพื้นที่หน่วยความจำของจำนวนข้อ
        }
        //ramdomข้อคำถาม
        Collections.shuffle(qID);
        setQuestion(qID.remove(0));
    }//endmain

    private void setQuestion(Integer qID) {//เเสดงผลคำถาม
        if (qID == 1) {
            answer="นก";
            questionImageView.setImageResource(R.drawable.bird_02);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();
            choice.add("นก");
            choice.add("ช้าง");
            choice.add("สิงโต");
            choice.add("หมู");
            Collections.shuffle(choice);

            btn1.setText(choice.remove(0));//show ข้อความ
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }

    }//end setquestion
    public void playSound(){

        mediaPlayer.start();

    }//end playsound
}//end class
