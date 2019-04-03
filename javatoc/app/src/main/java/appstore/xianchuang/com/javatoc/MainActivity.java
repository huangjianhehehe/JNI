package appstore.xianchuang.com.javatoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        Toast.makeText(MainActivity.this,"答案是:"+result+"",Toast.LENGTH_SHORT).show();
    }
    public void passString(View v){
        String result=jni.sayHelloInC("abcdef");
        Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
    }
    public void passIntArray(View v){
        int [] arr = {1,2,3,4,5};
       int [] result= jni.arrElementsIncrease(arr);
       for(int i : arr){
           //System.out.println("i="+i);
           Log.d("chuandi", String.valueOf(i));
       }
    }


}


