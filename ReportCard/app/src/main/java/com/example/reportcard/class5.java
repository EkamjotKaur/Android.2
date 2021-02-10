package com.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class class5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class5);

        ArrayList<ReportCard> class1_list = new ArrayList<ReportCard>();
        class1_list.add(new ReportCard("Byer"));
        class1_list.add(new ReportCard("Caroline"));
        class1_list.add(new ReportCard("Christine"));
        class1_list.add(new ReportCard("Darcy"));
        class1_list.add(new ReportCard("David"));
        // set English marks
        for(int i=0;i<class1_list.size();i++)
        {
            Random r = new Random();
            int low = 50;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            class1_list.get(i).setEnglishMarks(result);
        }
        // set Punjabi marks
        for(int i=0;i<class1_list.size();i++)
        {
            Random r = new Random();
            int low = 50;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            class1_list.get(i).setPunjabiMarks(result);
        }
        // set Maths Marks
        for(int i=0;i<class1_list.size();i++)
        {
            Random r = new Random();
            int low = 50;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            class1_list.get(i).setMathsMarks(result);
        }
        // set Science marks
        for(int i=0;i<class1_list.size();i++)
        {
            Random r = new Random();
            int low = 50;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            class1_list.get(i).setScienceMarks(result);
        }
        // set social science marks
        for(int i=0;i<class1_list.size();i++)
        {
            Random r = new Random();
            int low = 50;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            class1_list.get(i).setSocialScienceMarks(result);
        }
        //set Hindi Marks
        for(int i=0;i<class1_list.size();i++)
        {
            Random r = new Random();
            int low = 50;
            int high = 100;
            int result = r.nextInt(high-low) + low;
            class1_list.get(i).setHindiMarks(result);
        }
        // set Grades
        for(int i=0;i<class1_list.size();i++)
        {
            int marks_eng=class1_list.get(i).getEnglishMarks();
            int marks_hin=class1_list.get(i).getHindiMarks();
            int marks_sci=class1_list.get(i).getScienceMarks();
            int marks_soc=class1_list.get(i).getSocialScienceMarks();
            int marks_math=class1_list.get(i).getMathsMarks();
            int marks_pun=class1_list.get(i).getPunjabiMarks();
            class1_list.get(i).setEnglishGrade(setGrades(marks_eng));
            class1_list.get(i).setHindiGrade(setGrades(marks_hin));
            class1_list.get(i).setScienceGrade(setGrades(marks_sci));
            class1_list.get(i).setSocialScienceGrade(setGrades(marks_soc));
            class1_list.get(i).setMathsGrade(setGrades(marks_math));
            class1_list.get(i).setPunjabiGrade(setGrades(marks_pun));
        }
        ReportCardAdapter reportCardAdapter = new ReportCardAdapter(this,class1_list);
        ListView listview = (ListView )findViewById(R.id.list);
        listview.setAdapter(reportCardAdapter);
    }
    private String setGrades(int marks){
        if(marks>=95 && marks<=100)
            return "A+";
        if(marks>=90 && marks<95)
            return "A-";
        if(marks>=85 && marks <90)
            return "B+";
        if(marks>=80 && marks<85)
            return "B-";
        if(marks>=75 && marks<80)
            return "C+";
        if(marks>=70 && marks<75)
            return "C-";
        if(marks>=65 && marks<70)
            return "D+";
        if(marks>=60 && marks<65)
            return "D-";
        return "E";
    }
}