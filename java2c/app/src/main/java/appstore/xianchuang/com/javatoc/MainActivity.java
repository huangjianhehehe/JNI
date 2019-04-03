package appstore.xianchuang.com.javatoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private JNI jni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jni = new JNI();
    }
    public void passInt(View v) {
        int result=jni.add(4,5);
        Toast.makeText(MainActivity.this,result+"",Toast.LENGTH_SHORT).show();
    }
    public void passString(View v){

    }
    public void passIntArray(View v){

    }


}


