package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    Button mylay;
    RelativeLayout rel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mylay =(Button)findViewById(R.id.motile);
        rel =(RelativeLayout)findViewById(R.id.rlay);
        mylay.setOnTouchListener(
                new Button.OnTouchListener(){
                    public boolean onTouch(View v, MotionEvent e)
                    {
                        moveButton();
                        return true;
                    }
                }
        );
    }
    public void moveButton()
    {
        TransitionManager.beginDelayedTransition(rel);
        View butt = (View)findViewById(R.id.motile);
        RelativeLayout.LayoutParams prules = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        prules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        butt.setLayoutParams(prules);
        ViewGroup.LayoutParams size = butt.getLayoutParams();
                size.width = 300;
                size.height = 150;
                butt.setLayoutParams(size);
    }
}
