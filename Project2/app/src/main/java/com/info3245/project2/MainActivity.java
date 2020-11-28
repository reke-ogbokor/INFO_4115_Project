package com.info3245.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Room> firstRoom;
    TextView all_rooms;
    Date date = new Date();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstRoom = new ArrayList<>();
        firstRoom.add(new Room("Bathroom", R.drawable.bathroom));
        firstRoom.add(new Room("Washing Room", R.drawable.washing_room));
        firstRoom.add(new Room("Library", R.drawable.library));
        firstRoom.add(new Room("Living Room", R.drawable.television));
        firstRoom.add(new Room("Kitchen", R.drawable.kitchen));
        firstRoom.add(new Room("Bedroom", R.drawable.bedroom));

        all_rooms = (TextView) findViewById(R.id.all_rooms);
        String dateStringFormat = DateFormat.getDateInstance().format(date);
        all_rooms.setText(dateStringFormat);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, firstRoom);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(myAdapter);
    }


}