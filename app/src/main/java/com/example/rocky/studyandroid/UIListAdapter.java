package com.example.rocky.studyandroid;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rocky.studyandroid.model.UIListData;

import java.util.List;

/**
 * Created by rocky on 18/1/11.
 */

public class UIListAdapter extends BaseAdapter {

    private Context context;
    private List<UIListData> data;

    public UIListAdapter(@NonNull Context context, List<UIListData> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.ui_list, parent, false);
        UIListData uiListData = data.get(position);

        ((TextView) view.findViewById(R.id.ui_list_name)).setText(uiListData.listName);
        ((TextView) view.findViewById(R.id.ui_list_time)).setText(uiListData.listTime);
        ((TextView) view.findViewById(R.id.ui_list_expectprice)).setText(uiListData.ExpectPrice.toString());
        ((TextView) view.findViewById(R.id.ui_list_aveprice)).setText(uiListData.avePrice.toString());
        ((TextView) view.findViewById(R.id.ui_list_finalprice)).setText(uiListData.finalPrice.toString());
        ((TextView) view.findViewById(R.id.ui_list_number)).setText(uiListData.number.toString());
        ((TextView) view.findViewById(R.id.ui_list_status)).setText(uiListData.listStatus);
        ((TextView) view.findViewById(R.id.ui_list_inout)).setText(uiListData.listInout);
        ((TextView) view.findViewById(R.id.ui_list_orderstatus)).setText(uiListData.orderStatus);

        return view;
    }
}
