package com.Joystick.applayer.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class GamepadButton extends AppCompatButton {
    private GamepadPressListener gamepadPressListener;

    public GamepadButton(Context context) {
        super(context);
    }

    public GamepadButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GamepadButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action == MotionEvent.ACTION_DOWN) {
            setPressed(true);
            if (gamepadPressListener != null) {
                gamepadPressListener.onButtonAction(this, true);
            }
        } else if (action == MotionEvent.ACTION_UP ||
                action == MotionEvent.ACTION_CANCEL) {
            setPressed(false);
            if (gamepadPressListener != null) {
                gamepadPressListener.onButtonAction(this, false);
            }
        }
        return true;
    }

    @Deprecated
    @Override
    public void setOnClickListener(OnClickListener l) {
        super.setOnClickListener(l);
    }

    @Deprecated
    @Override
    public void setOnTouchListener(OnTouchListener l) {
        super.setOnTouchListener(l);
    }

    public void setGamepadPressListener(GamepadPressListener listener) {
        this.gamepadPressListener = listener;
    }

    public interface GamepadPressListener {
        void onButtonAction(View v, boolean isPressed);
    }
}
