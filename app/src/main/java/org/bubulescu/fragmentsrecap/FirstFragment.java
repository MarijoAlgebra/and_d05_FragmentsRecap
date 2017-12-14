package org.bubulescu.fragmentsrecap;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private EditText etUpis;
    private TextView tvIspis;
    private Button bOk;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View firstFragment = inflater.inflate(R.layout.fragment_first, container, false);

        etUpis = firstFragment.findViewById(R.id.etUpis);
        tvIspis = firstFragment.findViewById(R.id.tvIspis);
        bOk = firstFragment.findViewById(R.id.bOk);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = etUpis.getText().toString();
                etUpis.setText("");
                tvIspis.setText(inputText);
            }
        });

        return firstFragment;
    }

}
