package org.ms.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigation;

public class MyFragment extends Fragment {


    public static MyFragment newInstance() {

        Bundle args = new Bundle();

        MyFragment fragment = new MyFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private View view;

    private Button buttonShort;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=View.inflate(getContext(),R.layout.fragment_my,null);
        buttonShort=view.findViewById(R.id.buttonShort);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        buttonShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Navigation.findNavController(view).navigate(R.id.action_myFragment2_to_shortFragment);


            }
        });

    }
}
