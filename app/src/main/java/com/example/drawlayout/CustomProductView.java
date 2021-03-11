package com.example.drawlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;

import com.example.drawlayout.databinding.ItemProductBinding;

public class CustomProductView extends ConstraintLayout {
    ItemProductBinding mBinding;


    public CustomProductView(Context context) {
        super(context);

        init(context, null);
    }

    public CustomProductView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }



    public CustomProductView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public CustomProductView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        View view = inflate(context, R.layout.item_products_simple, this);
        ButterKnife.bind(view);



    }

    public void fillData(){

    }
}
