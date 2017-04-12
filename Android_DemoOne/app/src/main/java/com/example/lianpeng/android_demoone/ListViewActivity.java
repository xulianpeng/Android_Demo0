package com.example.lianpeng.android_demoone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private String[] dataArr = {"MyAndroid1","MyAndroid2","MyAndroid3","MyAndroid4","MyAndroid5","MyAndroid6","MyAndroid7"};

    private List<Student> studentList = new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        //系统的子布局 简单的listView 数据源为 dataArr
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this,android.R.layout.simple_list_item_1,dataArr);
//        final ListView myListView = (ListView)findViewById(R.id.list_view);
//        myListView.setAdapter(adapter);

        //自定义的子布局 数据源为 对象数组 类比ios 数据模型model

        initStudents();

        StudentAdapter adapter = new StudentAdapter(ListViewActivity.this,R.layout.listview_item,studentList);
        final ListView myListView = (ListView)findViewById(R.id.list_view);
        myListView.setAdapter(adapter);

        /*ListView的点击事件*/
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String str = dataArr[position];
                Toast.makeText(ListViewActivity.this,str,Toast.LENGTH_SHORT).show();


            }
        });
    }

    void initStudents(){

        Student student1 = new Student("张三","男",18,"传说中的伟岸男子");
        Student student2 = new Student("李四","男",18,"传说中的伟岸男子的邻居");

        Student student3 = new Student("王麻子","男",18,"传说中的伟岸男子的堂弟");

        Student student4 = new Student("小花","女",28,"传说中的伟岸男子的妹妹");

        Student student5 = new Student("小美","女",16,"传说中的伟岸男子的相好");

        Student student6 = new Student("小丽","女",15,"传说中的伟岸男子的同桌");

        Student student7 = new Student("铁心兰","女",18,"传说中的伟岸男子的未婚妻");

        Student student8 = new Student("花无缺","女",18,"传说中的伟岸男子的情敌");

        Student student9 = new Student("张三风","男",18,"传说中的伟岸男子的表哥");

        Student student10 = new Student("赵四","男",18,"传说中的伟岸男子的三叔");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
    }
}
