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

import java.lang.reflect.Array;
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

        String[] from = {"WONS","Real","Dolar","Libra","Peso Argentino","Euro"};
        ArrayAdapter ad = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"WONS","Real","Dolar","Libra","Peso Argentino","Euro"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1 = findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double wons;
                Double real;
                Double dolar;
                Double libra;
                Double pesoAgentino;
                Double euro;

                Double wonsConvertido = Double.parseDouble(ed1.getText().toString());
                Double realConvertido = Double.parseDouble(ed1.getText().toString());
                Double dolarConvertido = Double.parseDouble(ed1.getText().toString());
                Double libraConvertido = Double.parseDouble(ed1.getText().toString());
                Double pesoArgentinoConvertido = Double.parseDouble(ed1.getText().toString());
                Double euroConvertido = Double.parseDouble(ed1.getText().toString());

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



                if(sp1.getSelectedItem().toString() == "Real" && sp2.getSelectedItem().toString() == "WONS")
                {
                    real = realConvertido * 209.10;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",real),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Real" && sp2.getSelectedItem().toString() == "Dolar")
                {
                    real = realConvertido * 0.18;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",real),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Real" && sp2.getSelectedItem().toString() == "Libra")
                {
                    real = realConvertido * 0.13;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",real),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "Real" && sp2.getSelectedItem().toString() == "Peso Argentino")
                {
                    real = realConvertido * 17.95;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",real),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Real" && sp2.getSelectedItem().toString() == "Euro")
                {
                    real = realConvertido * 0.16;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",real),Toast.LENGTH_LONG).show();
                }


                if(sp1.getSelectedItem().toString() == "Dolar" && sp2.getSelectedItem().toString() == "WONS")
                {
                    dolar = dolarConvertido * 1184.80;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",dolar),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dolar" && sp2.getSelectedItem().toString() == "Real")
                {
                    dolar = dolarConvertido * 5.67;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",dolar),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dolar" && sp2.getSelectedItem().toString() == "Libra")
                {
                    dolar = dolarConvertido * 0.76;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",dolar),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "Dolar" && sp2.getSelectedItem().toString() == "Peso Argentino")
                {
                    dolar = dolarConvertido * 101.70;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",dolar),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Dolar" && sp2.getSelectedItem().toString() == "Euro")
                {
                    dolar = dolarConvertido * 0.89;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",dolar),Toast.LENGTH_LONG).show();
                }


                if(sp1.getSelectedItem().toString() == "Libra" && sp2.getSelectedItem().toString() == "WONS")
                {
                    libra = libraConvertido * 1565.26;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",libra),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Libra" && sp2.getSelectedItem().toString() == "Real")
                {
                    libra = libraConvertido * 7.48;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",libra),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Libra" && sp2.getSelectedItem().toString() == "Dolar")
                {
                    libra = libraConvertido * 1.32;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",libra),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "Libra" && sp2.getSelectedItem().toString() == "Peso Argentino")
                {
                    libra = libraConvertido * 134.39;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",libra),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Libra" && sp2.getSelectedItem().toString() == "Euro")
                {
                    libra = libraConvertido * 1.17;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",libra),Toast.LENGTH_LONG).show();
                }


                if(sp1.getSelectedItem().toString() == "Peso Argentino" && sp2.getSelectedItem().toString() == "WONS")
                {
                    pesoAgentino = pesoArgentinoConvertido * 11.65;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",pesoAgentino),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Peso Argentino" && sp2.getSelectedItem().toString() == "Real")
                {
                    pesoAgentino = pesoArgentinoConvertido * 0.056;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",pesoAgentino),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Peso Argentino" && sp2.getSelectedItem().toString() == "Dolar")
                {
                    pesoAgentino = pesoArgentinoConvertido * 0.0098;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",pesoAgentino),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "Peso Argentino" && sp2.getSelectedItem().toString() == "Libra")
                {
                    pesoAgentino = pesoArgentinoConvertido * 0.0074;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",pesoAgentino),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Peso Argentino" && sp2.getSelectedItem().toString() == "Euro")
                {
                    pesoAgentino = pesoArgentinoConvertido * 0.0087;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",pesoAgentino),Toast.LENGTH_LONG).show();
                }

                if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "WONS")
                {
                    euro = euroConvertido * 1338.70;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",euro),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Real")
                {
                    euro = euroConvertido * 6.40;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",euro),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Dolar")
                {
                    euro = euroConvertido * 1.13;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",euro),Toast.LENGTH_LONG).show();

                }
                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Libra")
                {
                    euro = euroConvertido * 0.85;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",euro),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Peso Argentino")
                {
                    euro = euroConvertido * 114.92;
                    Toast.makeText(getApplicationContext(),String.format("%.2f",euro),Toast.LENGTH_LONG).show();
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