package com.oceansoftwares.divineaaura;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeActivity()).commit();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Log.i("MainActivity", "nothing on backstack, calling super");
            super.onBackPressed();
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {

            case R.id.dashboard:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Dashboard()).addToBackStack(null).commit();
                break;

            case R.id.topuprequest:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new TopupRequest()).addToBackStack(null).commit();
                break;

            case R.id.topuprequeststatus:
                Toast.makeText(MainActivity.this, "You Clicked topup", Toast.LENGTH_SHORT).show();
                break;

            case R.id.topupledger:
                Toast.makeText(MainActivity.this, "Top up Ledger", Toast.LENGTH_SHORT).show();
                break;

            case R.id.walletrequest:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new WalletRequest()).addToBackStack(null).commit();
                break;

            case R.id.walletrequeststatus:
                Toast.makeText(MainActivity.this, "Wallet Request Status", Toast.LENGTH_SHORT).show();
                break;

            case R.id.walletledger:
                Toast.makeText(MainActivity.this, "Wallet Ledger", Toast.LENGTH_SHORT).show();
                break;

            case R.id.complaint:
                Toast.makeText(MainActivity.this, "Complaint", Toast.LENGTH_SHORT).show();

                break;

            case R.id.Loginsignup:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new LoginActivity()).addToBackStack(null).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
