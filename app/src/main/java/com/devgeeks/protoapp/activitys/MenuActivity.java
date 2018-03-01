package com.devgeeks.protoapp.activitys;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.devgeeks.protoapp.R;
import com.devgeeks.protoapp.fragments.ConfigFragment;
import com.devgeeks.protoapp.fragments.ConoceFragment;
import com.devgeeks.protoapp.fragments.DepartFragment;
import com.devgeeks.protoapp.fragments.ForoFragment;
import com.devgeeks.protoapp.fragments.InicioFragment;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, InicioFragment.OnFragmentInteractionListener,
        ConoceFragment.OnFragmentInteractionListener, DepartFragment.OnFragmentInteractionListener,
        ForoFragment.OnFragmentInteractionListener, ConfigFragment.OnFragmentInteractionListener {

    @SuppressLint("CommitTransaction")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Instancia del fragment que contiene las card
        Fragment mifragment = new InicioFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frg_contenedor, mifragment)
                .commit();




        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frg_contenedor, new InicioFragment()).commit();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_Inicio) {

            InicioFragment inicio = new InicioFragment();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frg_contenedor,inicio);
            transaction.commit();

        } else if (id == R.id.nav_conoce) {

            ConoceFragment conoce = new ConoceFragment();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frg_contenedor,conoce);
            transaction.commit();

        } else if (id == R.id.nav_departamento) {

            DepartFragment depart = new DepartFragment();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frg_contenedor, depart);
            transaction.commit();

        } else if (id == R.id.nav_foro) {

            ForoFragment foro = new ForoFragment();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frg_contenedor, foro);
            transaction.commit();

        } else if (id == R.id.nav_config) {

            ConfigFragment config = new ConfigFragment();

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frg_contenedor, config);
            transaction.commit();

        } else if (id == R.id.nav_comparte) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "Conoce MeetGuate devgeeks.000webhostapp.com/");
            startActivity(Intent.createChooser(intent,"Compartir con: "));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}