package com.example.silas.oddlayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silas on 2016/9/23.
 */
public class MainActivity extends Activity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listview);
        mListView.setAdapter(new MyAdapter(this, getTestData()));
    }

    private List<DingTestBean> getTestData() {
        List<DingTestBean> list = new ArrayList<>();
        list.add(new DingTestBean("赵云", 1, "09-27 09:11"));
        list.add(new DingTestBean("赵云、隔壁老王、小王、典韦、貂蝉、林芳、曹操、刘备、关羽、黄忠、张飞、诸葛孔明", 10, "09-27 09:11"));
        list.add(new DingTestBean("黄忠、孙权、大乔", 50, "09-27 09:11"));
        list.add(new DingTestBean("大乔、小乔、貂蝉、孙尚香", 300, "09-27 09:11"));
        return list;
    }
}
