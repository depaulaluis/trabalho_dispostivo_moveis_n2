package rijo.leticia.converter;

import android.app.Dialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);
        ed1 = findViewById(R.id.txtuname);

        String[] from = {"WONS"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"Real","Dolar","Libra","Peso Argentino","Euro"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1 = findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double wons;

                Double wonsConvertido = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "WONS" && sp2.getSelectedItem().toString() == "Real")
                {
                    wons = wonsConvertido * 0.0047;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",wons),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "WONS" && sp2.getSelectedItem().toString() == "Dolar")
                {
                    wons = wonsConvertido * 0.00085;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",wons),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "WONS" && sp2.getSelectedItem().toString() == "Libra")
                {
                    wons = wonsConvertido * 0.00064;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",wons),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "WONS" && sp2.getSelectedItem().toString() == "Peso Argentino")
                {
                    wons = wonsConvertido * 0.086;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",wons),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "WONS" && sp2.getSelectedItem().toString() == "Euro")
                {
                    wons = wonsConvertido * 0.00075;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",wons),Toast.LENGTH_LONG).show();
                }
            }
        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.menuSaibaMais) {
            setContentView(R.layout.activity_saiba_mais);

            return true;
        }

        if (id == R.id.menuCuriosidades){
            setContentView(R.layout.activity_curiosidades);
        }

        return super.onOptionsItemSelected(item);
    }

}