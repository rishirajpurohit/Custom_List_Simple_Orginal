package in.rishirajpurohit.android.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mycarslv = (ListView) findViewById(R.id.mycars);

        MycarsAdabpter adapter = new MycarsAdabpter(this);

        mycarslv.setAdapter(adapter);



    }
}
