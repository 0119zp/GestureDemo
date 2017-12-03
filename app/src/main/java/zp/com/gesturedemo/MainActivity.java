package zp.com.gesturedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private boolean isShow = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setGes(View view){
        Intent intent = new Intent(MainActivity.this, ZpGestureActivity.class);
        intent.putExtra("isshow",isShow);
        startActivity(intent);
    }

    public void setShow(View view){
        isShow = true;
    }

    public void setHind(View view){
        isShow = false;
    }


}
