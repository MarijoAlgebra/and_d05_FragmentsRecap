package org.bubulescu.fragmentsrecap;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button bFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bFragment = findViewById(R.id.bFragment);
        bFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();

                if (fragmentManager.findFragmentById(R.id.flContainer)==null) {
                    fragmentManager
                            .beginTransaction()
                            .add(R.id.flContainer, new FirstFragment())
                            .commit();

                } else {
                    fragmentManager
                            .beginTransaction()
                            .remove(fragmentManager.findFragmentById(R.id.flContainer))
                            .commit();
                }

            }
        });
    }
}
