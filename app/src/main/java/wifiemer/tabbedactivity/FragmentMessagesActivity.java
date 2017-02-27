package wifiemer.tabbedactivity;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Atul on 2/26/2017.
 */
public class FragmentMessagesActivity extends Fragment {


    public static FragmentMessagesActivity newInstance() {
        FragmentMessagesActivity fragment = new FragmentMessagesActivity();
        // Heightened Engineering

        // Heightened Science
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab1messages, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.textView1);

        textView.setText("This is the section for the Messages");

        return rootView;
    }

}


