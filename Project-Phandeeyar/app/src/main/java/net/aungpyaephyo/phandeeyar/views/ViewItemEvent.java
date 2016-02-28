package net.aungpyaephyo.phandeeyar.views;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.aungpyaephyo.phandeeyar.R;
import net.aungpyaephyo.phandeeyar.data.vos.EventVO;

/**
 * Created by aung on 2/25/16.
 */
public class ViewItemEvent extends CardView {

    private TextView tvEventTitle;
    private ImageView ivStockPhoto;
    private TextView tvEventDesc;
    private TextView tvEventTime;

    public ViewItemEvent(Context context) {
        super(context);
    }

    public ViewItemEvent(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewItemEvent(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        tvEventTitle = (TextView) findViewById(R.id.tv_event_title);
        ivStockPhoto = (ImageView) findViewById(R.id.iv_stock_photo);
        tvEventDesc = (TextView) findViewById(R.id.tv_event_desc);
        tvEventTime = (TextView) findViewById(R.id.tv_event_time);
    }

    public void setData(EventVO event) {
        tvEventTitle.setText(event.getEventTitle());
        tvEventDesc.setText(event.getEventDesc());
        tvEventTime.setText(event.getEventTime()); //Friday, Feb 26, 1:00pm - 5:00pm

        Glide.with(getContext())
                .load(event.getStockPhoto())
                .centerCrop()
                .placeholder(R.drawable.stock_photo_placeholder)
                .into(ivStockPhoto);
    }
}
