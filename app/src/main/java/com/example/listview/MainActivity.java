package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    List<String> studentList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list_view);
        studentList.add("student1");
        studentList.add("student2");
        studentList.add("student3");
        studentList.add("student4");
        studentList.add("student5");
        studentList.add("student6");
        studentList.add("student7");
        studentList.add("student8");
        studentList.add("student9");
        studentList.add("student10");
        studentList.add("student11");
        studentList.add("student12");
        studentList.add("student13");
        studentList.add("student14");
        studentList.add("student15");
        studentList.add("student16");
        studentList.add("student17");
        studentList.add("student18");
        studentList.add("student19");
        studentList.add("student20");

        studentList.add("student21");
        studentList.add("student22");
        studentList.add("student23");
        studentList.add("student24");
        studentList.add("student25");
        studentList.add("student26");
        studentList.add("student27");
        studentList.add("student28");
        studentList.add("student29");
        studentList.add("student30");
        studentList.add("student31");
        studentList.add("student32");
        ArrayAdapter<String> adpt=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,studentList);
        listView.setAdapter(adpt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"you Selected "+studentList.get(position),Toast.LENGTH_SHORT).show();
            }
        });


    }
}