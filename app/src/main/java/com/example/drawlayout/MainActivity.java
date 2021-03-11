package com.example.drawlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.Html;
import android.text.Layout;
import android.transition.Slide;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init() {
        setHorizontalText();
        setImageBanner();
        setCategory();
        setKeyWords();
        setLoadMoreItems();
    }

    private void setLoadMoreItems() {


        List<LoadMoreItem> itemList = new ArrayList<>();
        int index = 5;
        while (index-- != 0) {
            LoadMoreItem item = new LoadMoreItem(
                    R.drawable.product0,
                    273000d,
                    "Việt Nam",
                    123,
                    "Bộ bát đĩa sứ Bát Tràng");
            itemList.add(item);
        }
        LoadMoreItem item2 = new LoadMoreItem(
                R.drawable.product1,
                273000d,
                true,
                "Nhật Bản",
                343,
                "Bộ bát đĩa",
                30f);
        itemList.add(item2);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        RecyclerView rcv_loadMore = findViewById(R.id.rcv_load_more);
        rcv_loadMore.setLayoutManager(gridLayoutManager);
        rcv_loadMore.setAdapter(new LoadMoreAdapter(itemList, this));

    }

    private void setKeyWords() {
        List<String> keyWords = new ArrayList<>();
        keyWords.add("Rau hữu cơ");
        keyWords.add("Cá ướp lạnh");
        keyWords.add("Thời trang nam");
        keyWords.add("Điện thoại");
        keyWords.add("Đồ chơi");
        keyWords.add("Nồi cơm điện");
        keyWords.add("Bàn phím");
        keyWords.add("Dụng cụ làm vườn");
        RecyclerView rcvKeyWords = findViewById(R.id.rcv_keywords);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        rcvKeyWords.setLayoutManager(flexboxLayoutManager);
        rcvKeyWords.setAdapter(new KeyWordAdapter(keyWords, this));

    }

    private void setCategory() {


        List<CategoryItem> categoryItems = new ArrayList<>();
        categoryItems.add(new CategoryItem(R.drawable.ic_th_i_trang, getResources().getString(R.string.category_fashion)));
        categoryItems.add(new CategoryItem(R.drawable.ic_m__v__b_, getResources().getString(R.string.category_mom_and_son)));
        categoryItems.add(new CategoryItem(R.drawable.ic_th_c_ph_m, getResources().getString(R.string.category_food)));
        categoryItems.add(new CategoryItem(R.drawable.ic__i_n_t__v__c_ng_ngh_, getResources().getString(R.string.category_electrics)));
        categoryItems.add(new CategoryItem(R.drawable.ic_book, getResources().getString(R.string.category_books)));
        categoryItems.add(new CategoryItem(R.drawable.ic_l_m___p___s_c_kh_e, getResources().getString(R.string.category_beauty)));
        categoryItems.add(new CategoryItem(R.drawable.ic_accesssory, getResources().getString(R.string.category_accessory)));
        categoryItems.add(new CategoryItem(R.drawable.ic_house_devices, getResources().getString(R.string.category_house_device)));
        categoryItems.add(new CategoryItem(R.drawable.ic_nh__c_a, getResources().getString(R.string.category_home)));
        categoryItems.add(new CategoryItem(R.drawable.ic_games, getResources().getString(R.string.category_games)));
        categoryItems.add(new CategoryItem(R.drawable.ic_other, getResources().getString(R.string.category_other)));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView recyclerView = findViewById(R.id.rcv_category);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new CategoryAdapter(categoryItems, this));

    }

    private void setImageBanner() {
        List<SlideModel> imageBanner = new ArrayList<>();
        imageBanner.add(new SlideModel(R.drawable.banner1));
        imageBanner.add(new SlideModel(R.drawable.banner2));
        imageBanner.add(new SlideModel(R.drawable.banner3));
        imageBanner.add(new SlideModel(R.drawable.banner4));

        ImageSlider ims = findViewById(R.id.ims_banner);
        ims.setImageList(imageBanner, true);

    }

    private void setHorizontalText() {
        TextView tv = (TextView) findViewById(R.id.tv_sale_price);
        tv.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        TextView tv2 = (TextView) findViewById(R.id.tv_sale_price2);
        tv2.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        TextView tv3 = (TextView) findViewById(R.id.tv_sale_price3);
        tv3.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        TextView tv4 = (TextView) findViewById(R.id.tv_sale_price4);
        tv4.setPaintFlags(tv.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
    }

}