package org.ms.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class ShortFragment extends Fragment {


    private View view;


    private Button buttonMy;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=View.inflate(getContext(),R.layout.fragment_short,null);


        buttonMy=view.findViewById(R.id.buttonMy);

        buttonMy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_shortFragment_to_myFragment2);

            }
        });

        return view;
    }
}
