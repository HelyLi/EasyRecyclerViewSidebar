package com.camnter.easyrecyclerviewsidebar.demo;

import com.camnter.easyrecyclerviewsidebar.demo.adapter.RoundImageSectionAdapter;
import com.camnter.easyrecyclerviewsidebar.demo.base.SectionActivity;
import com.camnter.easyrecyclerviewsidebar.demo.bean.Contacts;
import com.camnter.easyrecyclerviewsidebar.demo.constant.Constant;
import java.util.List;

/**
 * Description：RoundImageSectionActivity
 * Created by：CaMnter
 * Time：2016-04-12 00:02
 */
public class RoundImageSectionActivity extends SectionActivity {
    @Override public void setActivityTitle() {
        this.setTitle("RoundImageSectionActivity");
    }


    @Override public void initAdapter() {
        this.adapter = new RoundImageSectionAdapter();
    }


    @Override public List<Contacts> getData() {
        return Constant.roundImageSectionList;
    }
}
