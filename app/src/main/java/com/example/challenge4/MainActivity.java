package com.example.challenge4;

import android.net.ipsec.ike.SaProposal;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SportAdapter adapter;
    List<Sport> sportList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sportList = new ArrayList<>();
        sportList.add(new Sport("Basketball", R.drawable.basketball));
        sportList.add(new Sport("VolleyBall", R.drawable.volleyball));
        sportList.add(new Sport("Badminton", R.drawable.badminton));
        sportList.add(new Sport("Soccer", R.drawable.soccer));
        sportList.add(new Sport("PickleBall", R.drawable.pickleball));

        adapter = new SportAdapter(this, sportList);
        recyclerView.setAdapter(adapter);
    }
}
