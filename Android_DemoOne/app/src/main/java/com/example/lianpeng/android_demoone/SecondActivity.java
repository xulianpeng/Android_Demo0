package com.example.lianpeng.android_demoone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.graphics.Color;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    Button bt;
    Button layoutBt;//布局的练习Demo入口按钮
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题 不好使啊  没用 .

        setContentView(R.layout.activity_second);


        //效果: 按钮添加一个点击事件
        bt = (Button)findViewById(R.id.button1);
        bt.setBackgroundColor(Color.GREEN);
        //有点类似ios给 block添加点击事件 使用 block实现.
        bt.setOnClickListener(new OnClickListener() {
            @Override
         public  void onClick(View v){
                Log.i("匿名内部类", "点击事件");

                bt.setBackgroundColor(Color.GRAY);
                bt.setScaleY(1.5f);
                bt.setTextIsSelectable(true);
                bt.setTextColor(Color.CYAN);
                //跳转
                /*这是显示跳转,直接指明:启动activity 和 目的activity*/
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                String data = "我来自第一个活动";
                intent.putExtra("firstStr",data);

//                List<String> arr = new ArrayList<String>();
//                arr.add("mm123");
//                arr.add("mm456");
//                arr.add("mm789");
//
//                Bundle myBundle = new Bundle();
//                myBundle.putParcelableArrayList("twoArr", (ArrayList<!--? extends Parcelable-->) String);
//                intent.putExtra(myBundle);
                startActivity(intent);


                /*隐式跳转*/
                /*在AndriodManitest.xml注册目的activity处添加 action category*/
//                Intent intent2 = new Intent("com.example.mainActivity.ACTION_START");
//                startActivity(intent2);

                /*加载web页面,调用系统浏览器*/
//                Intent intent3 = new Intent(Intent.ACTION_VIEW);
//                intent3.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent3);

/*打电话 */
//                Intent intent4 = new Intent(Intent.ACTION_DIAL);
//                intent4.setData(Uri.parse("tel:10086"));
//                startActivity(intent4);

                Toast.makeText(SecondActivity.this,"andriod 你好啊!!!",Toast.LENGTH_SHORT).show();
            }
        });


        layoutBt = (Button)findViewById(R.id.button4);
        layoutBt.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SecondActivity.this,LayoutTestActivity.class);
                startActivity(intent);
            }
        });

        Button listViewBt = (Button)findViewById(R.id.button6);
        listViewBt.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {

                //Intent intent = new Intent(SecondActivity.this,ListViewActivity.class);
                //startActivity(intent);
            }
        });



    }

}
