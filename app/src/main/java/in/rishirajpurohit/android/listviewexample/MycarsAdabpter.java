package in.rishirajpurohit.android.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by rishi on 07-12-2017.
 */

public class MycarsAdabpter extends BaseAdapter {

    String[] cars = {"toyota", "mustang"};
    String[] carsprice = {"Rs. 200", "RS. 250"};

    private static LayoutInflater inflater = null;

    public MycarsAdabpter(Activity activity){
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return cars.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 1;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {



        View v = inflater.inflate(R.layout.simple_row_item,null);

        TextView carname = (TextView) v.findViewById(R.id.carname);
        TextView carprice = (TextView) v.findViewById(R.id.carprice);

        carname.setText(cars[i]);
        carprice.setText(carsprice[i]);

        return v;

    }
}
