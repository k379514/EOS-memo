package com.example.eosadvanced.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.eosadvanced.adapter.MemoAdapter;
import com.example.eosadvanced.data.Memo;
import com.example.eosadvanced.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Memo> memoList = new ArrayList<>();
    private MemoAdapter memoAdapter=new MemoAdapter(memoList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        addMemo(1, "첫 메모", "안녕", "2020. 05. 18");
        addMemo(1, "두번째 메모", "하이", "2020. 05. 18");
        addMemo(1, "333", "굿", "2020. 05. 18");
    }

    private void setUI(){
        Toolbar toolbar=findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        RecyclerView recyclerView=findViewById(R.id.main_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        recyclerView.setAdapter(memoAdapter);
    }

    private void addMemo(int id, String title, String text, String date){
        Memo newMemo=new Memo(id, title,text,date);
        memoList.add(newMemo);

        memoAdapter.notifyDataSetChanged();
    }
}
