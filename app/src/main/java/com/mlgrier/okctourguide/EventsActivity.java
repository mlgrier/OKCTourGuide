package com.mlgrier.okctourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_list);

        //Creating a ArrayList: Using String for words
        final ArrayList<Details> detail = new ArrayList<Details>();
        //Elements below should be added to the array list

        //numberWords.add("one"); detail.add(new Details("one", "lutti", R.drawable.number_one, R.raw.number_one));
        detail.add(new Details("Greek Festival", "Sep 23-25"));
        detail.add(new Details("two", "otiiko"));
        detail.add(new Details("three", "tolookosu"));
        detail.add(new Details("four", "oyyisa"));
        detail.add(new Details("five", "massokka"));
        detail.add(new Details("six", "temmokka"));
        detail.add(new Details("seven", "kenekaku"));
        detail.add(new Details("eight", "kawinta"));
        detail.add(new Details("nine", "wo'e"));
        detail.add(new Details("ten", "na'aacha"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        // This code with a few changes can be used for a GridView also
        DetailsAdapter adapter = new DetailsAdapter(this, detail, R.color.categoryEvents);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // details_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Details details = detail.get(position);


                }


        });


}


}
