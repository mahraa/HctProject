package om.gov.ita.hctproject;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import om.gov.ita.hctproject.student_info.StudentAdapter;
import om.gov.ita.hctproject.student_info.Student_Info;

public class MainActivity extends AppCompatActivity {
String[] studentName;
TypedArray studentImage;
RecyclerView recycler;
ArrayList<Student_Info>studentInfoArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentInfoArrayList=new ArrayList<>();

        recycler=(RecyclerView) findViewById(R.id.recycleview);
        studentName=getResources().getStringArray(R.array.student_name);
        studentImage=getResources().obtainTypedArray(R.array.imagerandom);
        createStudentList();
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recycler.setLayoutManager(layoutManager);
        StudentAdapter adapter=new StudentAdapter(this,studentInfoArrayList);
        recycler.setAdapter(adapter);

    }

    private void createStudentList() {
        for (int i=0;i<studentName.length;i++){
            Student_Info st=new Student_Info();
            st.setName(studentName[i]);
            st.setStudent_image(studentImage.getResourceId(i,-1));
            studentInfoArrayList.add(st);

        }
    }
}
