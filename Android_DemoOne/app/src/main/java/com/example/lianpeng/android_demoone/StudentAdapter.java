package com.example.lianpeng.android_demoone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lianpeng on 2017/4/5.
 */

public class StudentAdapter extends ArrayAdapter<Student> {

    private int studentId;
    public StudentAdapter(Context context, int objectId,List<Student> objects){
        super(context,objectId,objects);
        studentId = objectId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        super.getView(position, convertView, parent);
        Student student = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(studentId,null);

        TextView nameTV = (TextView)view.findViewById(R.id.studentName);
        TextView introTV = (TextView)view.findViewById(R.id.studentIntroduction);

        nameTV.setText(student.getName());
        introTV.setText(student.getIntroduction());
        return view;

    }
}
