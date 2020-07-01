package ru.kovrov4anin.top10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import ru.kovrov4anin.top10.provider.DataProvider;
import ru.kovrov4anin.top10.receivers.DataStore;
import ru.kovrov4anin.top10.receivers.DataVisual;

public class MainActivity extends AppCompatActivity {
    private EditText edit_text1;
    private ImageButton image_button1;
    private LinearLayout linear_layout3;
    private DataProvider data_provider;
    private DataStore data_store;
    private DataVisual data_visual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text1 = (EditText) findViewById(R.id.editText1);
        image_button1 = (ImageButton) findViewById(R.id.imageButton1);
        linear_layout3 = (LinearLayout) findViewById(R.id.LinearLayout3);
        data_provider = new DataProvider(getApplicationContext());
        data_store = new DataStore(getApplicationContext());
        data_visual = new DataVisual(getApplicationContext(), linear_layout3);
        data_provider.AddReceiver(data_store);
        data_provider.AddReceiver(data_visual);
        image_button1.setOnClickListener(click_listener);
    }


    private View.OnClickListener click_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                String request = edit_text1.getText().toString();
                if ( !request.isEmpty() ) {
                    data_visual.Clear();
                    data_provider.Request(request);
                }
            } catch (Exception e) {}
        }
    };

}
