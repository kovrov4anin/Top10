package ru.kovrov4anin.top10.receivers;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;

import ru.kovrov4anin.top10.R;


public class DataVisual implements DataReceiver {
    private Context context;
    private LinearLayout layout;

    public DataVisual(Context context, LinearLayout layout) {
        this.context = context;
        this.layout = layout;
    }


    @Override
    public void PutItem(String title, String link, String description) {
        try {
            View view = LayoutInflater.from(context).inflate(
                    context.getResources().getLayout(R.layout.result_view),
                    layout,
                    false);
            TextView text_view1 = (TextView) view.findViewById(R.id.textView1);
            text_view1.setText(title);
            text_view1.setOnClickListener(new ClickListener(link, context));
            TextView text_view2 = (TextView) view.findViewById(R.id.textView2);
            text_view2.setText(link);
            TextView text_view3 = (TextView) view.findViewById(R.id.textView3);
            text_view3.setText(description);
            layout.addView(view);
        } catch (Exception e) {}
    }


    public void Clear() {
        layout.removeAllViews();
    }


    private View.OnClickListener click_listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


    private static class ClickListener implements View.OnClickListener {
        private String link;
        private Context context;
        public ClickListener(String link, Context context) {
            this.link = link;
            this.context = context;
        }
        @Override
        public void onClick(View v) {
            try {
                if ( !link.isEmpty() ) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
                    context.startActivity(intent);
                }
            } catch (Exception e) {}
        }
    }

}
