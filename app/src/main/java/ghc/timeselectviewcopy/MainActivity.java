package ghc.timeselectviewcopy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popu_timeselector);

        textView = (TextView) findViewById(R.id.textview);


        TimeSelectorView timeSelectorView = (TimeSelectorView) findViewById(R.id.timeselector);
        timeSelectorView.setListener(new TimeSelectorView.TimeChangeListener() {
            @Override
            public void scrollFinish(String time) {
                textView.setText(time);
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancle() {

            }
        });


//        JustListView listView = (JustListView) findViewById(R.id.listview);
//        listView.setAdapter(new SelectorAdapter(this, SelectorContanst.getMonths()));
//        listView.setSelection(Integer.MAX_VALUE/2+1);

//        SelectView selectView = (SelectView) findViewById(R.id.select_view);
//        selectView.setData(null);
    }
}
