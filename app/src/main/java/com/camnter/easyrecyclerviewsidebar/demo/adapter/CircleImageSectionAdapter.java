package com.camnter.easyrecyclerviewsidebar.demo.adapter;

import android.widget.TextView;
import com.camnter.easyrecyclerview.holder.EasyRecyclerViewHolder;
import com.camnter.easyrecyclerviewsidebar.demo.base.SectionAdapter;
import com.camnter.easyrecyclerviewsidebar.demo.bean.Contacts;
import com.camnter.easyrecyclerviewsidebar.sections.EasyImageSection;

/**
 * Description：CircleImageSectionAdapter
 * Created by：CaMnter
 * Time：2016-04-11 23:57
 */
public class CircleImageSectionAdapter extends SectionAdapter {
    @Override public int getEasyImageSection() {
        return EasyImageSection.CIRCLE;
    }


    /**
     * Set header logic
     *
     * @param contacts contacts
     * @param headerTv headerTv
     * @param viewHolder viewHolder
     * @param position position
     */
    @Override
    public void setHeaderLogic(Contacts contacts, TextView headerTv, EasyRecyclerViewHolder viewHolder, int position) {
        if (position != 0 && !contacts.top) {
            Contacts pre = this.getItem(position - 1);
            if (pre.top || !contacts.getHeader().equals(pre.getHeader())) {
                this.setHeader(true, headerTv, contacts.getHeader());
            } else {
                this.setHeader(false, headerTv, null);
            }
        } else {
            this.setHeader(false, headerTv, null);
        }
    }
}
