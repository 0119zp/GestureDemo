package zp.com.gesturedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;


/**
 * Created by Administrator
 * data on 2017/12/2 0002.
 */
public class ZpGestureActivity extends Activity{

    private GestureLockView gestureLockView;
    private TextView errText;
    private boolean isShow;
    private TranslateAnimation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);

        Intent intent = getIntent();
        isShow = intent.getBooleanExtra("isshow", false);

        gestureLockView = (GestureLockView) findViewById(R.id.login_gestureLockView);
        errText = (TextView) findViewById(R.id.lock_login_errornum_tv);

        setGesture();
    }

    public void setGesture(){
        gestureLockView.setLimitNum(5);
        gestureLockView.setIsGone(isShow);

        // 错误提示动画
        animation = new TranslateAnimation(-30, 30, 0, 0);
        animation.setDuration(50);
        animation.setRepeatCount(3);
        animation.setRepeatMode(Animation.REVERSE);

        gestureLockView.setOnGestureFinishListener(new GestureLockView.OnGestureFinishListener() {
            @Override
            public void OnGestureFinish(boolean success, String key, String adapterNum) {
                if (key.length() >= gestureLockView.getLimitNum()) {

                    Log.e("zpan","=success= " +success + "=key= " + key + "=adapterNum= " + adapterNum);
                    errText.setText("=success= " + key);
                    verificaCancleBack();
                } else {

                    verificaCancleBack();
                    errText.setText("需大于4个点 = " + key);
                    errText.startAnimation(animation);
                }
            }
        });
    }

    protected void verificaCancleBack() {
        //清除绘制图案
        if(null!=gestureLockView){
            gestureLockView.drawPath(true);
            gestureLockView.setPsw();
        }
    }

}
