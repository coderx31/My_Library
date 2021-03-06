package com.coderx.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {
    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "1Q84","Haruki Murakami",1350,"http://jasonlefkowitz.net/wp-content/uploads/2015/06/1q84-660x1024.jpg",
                "A work of maddeling brilliance","Long Description"));

        books.add(new Book(2,"Hello Android","Someone",480,"http://jasonlefkowitz.net/wp-content/uploads/2015/06/1q84-660x1024.jpg",
                "How to work with Android", "Long Description"));
        adapter.setBooks(books);
    }
}
