package com.example.project_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

public class SEARCH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }

    public void search(View view) {
        final SearchView searchView =(SearchView)findViewById(R.id.search);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchView.onActionViewExpanded();
                int searchid = searchView.getContext().getResources().getIdentifier("android:id/search_badge",null,null);
                View search = null;
                search.setBackgroundResource(R.drawable.ex1);
            }
        });
    }
}
