package com.andrei.stop.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A placeholder fragment containing a simple view.
 */
public class LinesFragment extends Fragment {

    public LinesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] lines = {
                "35 - 1 min",
                "46B - 3 min",
                "25 - 4 min",
                "33 - 8 min",
                "8 - 16 min"
        };

        ArrayList<String> linesList = new ArrayList<String>(Arrays.asList(lines));
        ArrayAdapter<String> linesAdapter = new ArrayAdapter<String>(
                //The current context
                getActivity(),
                //ID of list item layout (the xml file containing the layout for this item)
                R.layout.list_item_line,
                //ID of the textview to populate (the actual android:id of the textview located inside the xml file)
                R.id.list_item_line_textview,
                //lines data
                linesList);

        ListView linesListView = (ListView)rootView.findViewById(R.id.list_view_lines);
        linesListView.setAdapter(linesAdapter);

        return rootView;
    }
}
