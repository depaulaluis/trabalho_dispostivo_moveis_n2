package rijo.leticia.converter;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import rijo.leticia.converter.databinding.ActivitySaibaMaisBinding;

public class SaibaMais extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySaibaMaisBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saiba_mais);

    }
}

