package com.ranzan.recyclerviewwe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecyclerView();
    }

    private void setRecyclerView() {
        StudentAdapter studentAdapter = new StudentAdapter(studentList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }

    private void buildStudentList() {
        studentList = new ArrayList<>();
        Student student1 = new Student("Prakash", 22, "296");
        studentList.add(student1);
        Student student2 = new Student("Ranjan", 23, "69");
        studentList.add(student2);
        for (int i = 0; i < 13; i++) {
            Student student = new Student("XYZ", 21 + i, "296-" + i);
            studentList.add(student);
        }
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
    }
}