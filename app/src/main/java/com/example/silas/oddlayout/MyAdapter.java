package com.example.silas.oddlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Silas on 2016/9/23.
 */
public class MyAdapter extends BaseAdapter {
    private List<DingTestBean> mListData;
    private Context mContext;
    private LayoutInflater mInflater;
    private String mFormat;

    public MyAdapter(Context context, List<DingTestBean> listData) {
        this.mContext = context;
        this.mListData = listData;
        this.mInflater = LayoutInflater.from(mContext);
        this.mFormat = mContext.getResources().getString(R.string.bracket_people);
    }

    @Override
    public int getCount() {
        return mListData == null ? 0 : mListData.size();
    }

    @Override
    public DingTestBean getItem(int position) {
        return mListData == null ? null : mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(mContext, R.layout.lst_item, null);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.number = (TextView) convertView.findViewById(R.id.number);
            viewHolder.time = (TextView) convertView.findViewById(R.id.time);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.name.setText(getItem(position).getName());
        viewHolder.number.setText("(" + mListData.get(position).getNumber() + "人)");
        viewHolder.time.setText(mListData.get(position).getTime());
        return convertView;
    }
    class ViewHolder {
        TextView name;
        TextView number;
        TextView time;
    }
}
