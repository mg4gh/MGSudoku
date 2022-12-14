package sudoku.mg4gh.de;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Collection;
import java.util.List;

public class TextDetails {

    Context context;
    float pxWidth, pxHeight;

    public TextDetails(Context context, float width, float height){
        this.context = context;
        this.pxWidth = width;
        this.pxHeight = height;
    }

    float widthPercentToPx(float percent){
        return (pxWidth)*percent/100;
    }
    float heightPercentToPx(float percent){
        return (pxHeight - pxWidth)*percent/100;
    }

    Button createButton(ViewGroup parent, float x, float y, float dx, float dy, String text, float ty){
        Button button = new Button(context);
        button.setTextSize(TypedValue.COMPLEX_UNIT_PX, heightPercentToPx(ty));
        button.setX(widthPercentToPx(x));
        button.setY(heightPercentToPx(y));
        button.setMinimumWidth((int)widthPercentToPx(dx));
        button.setWidth((int)widthPercentToPx(dx));
        button.setMinimumHeight((int)heightPercentToPx(dy));
        button.setHeight((int)heightPercentToPx(dy));
        button.setText(text);
        button.setPadding(0,0,0,0);
        button.setTextColor( context.getResources().getColor(R.color.sd_tv_text, context.getTheme()) );
        parent.addView(button);
        modifyBgColor(button, R.color.sd_tv_unsel);
        return button;
    }

    TextView createTextView(ViewGroup parent, int x, int y, int dx, int dy, String text, float ty){
        TextView textView = new TextView(context);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, heightPercentToPx(ty));
        textView.setX(widthPercentToPx(x));
        textView.setY(heightPercentToPx(y));
        textView.setMinimumWidth((int)widthPercentToPx(dx));
        textView.setWidth((int)widthPercentToPx(dx));
        textView.setMinimumHeight((int)heightPercentToPx(dy));
        textView.setHeight((int)heightPercentToPx(dy));
        textView.setText(text);
        textView.setPadding(0,0,0,0);
        textView.setTextColor( context.getResources().getColor(R.color.sd_tv_text, context.getTheme()) );
        parent.addView(textView);
        return textView;
    }

    //    TextView createTextView(Context context, int x, int y, int dx, int dy, String text, int ts){
//        TextView textView = new TextView(context);
//        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, ts);
//        textView.setX(x*width/100);
//        textView.setY(y*height/100);
//        textView.setMinimumWidth((int)(dx*width/100));
//        textView.setWidth((int)(dx*width/100));
//        textView.setMinimumHeight((int)(dy*height/100));
//        textView.setHeight((int)(dy*height/100));
//        textView.setText(text);
//        textView.setPadding(0,0,0,0);
//        textView.setTextColor( getResources().getColor(R.color.sd_tv_text, context.getTheme()) );
//        this.addView(textView);
//        return textView;
//    }


    void refreshSelected(View view1, Collection<? extends View> views){
        for (View view : views){
            modifyBgColor(view, R.color.sd_tv_unsel);
        }
        modifyBgColor(view1, R.color.sd_tv_sel);
    }
    void modifyBgColor(View view, int colorId){
        int color = context.getResources().getColor(colorId, context.getTheme());
        view.getBackground().mutate().setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC));
    }



}
