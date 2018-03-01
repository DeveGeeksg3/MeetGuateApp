package com.devgeeks.protoapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devgeeks.protoapp.R;
import com.devgeeks.protoapp.adapters.AdapterInicio;
import com.devgeeks.protoapp.entidad.InicioLugares;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link InicioFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link InicioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InicioFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    private ArrayList<InicioLugares> inicioLugares = null;

    public InicioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InicioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InicioFragment newInstance(String param1, String param2) {
        InicioFragment fragment = new InicioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = null;

        view = inflater.inflate(R.layout.fragment_inicio, container, false);

        cargarDatosRecycler(view);

        //////////////////////////
        return view;

    }

    private void cargarDatosRecycler(View view) {
        inicioLugares = new ArrayList<>();


        inicioLugares.add(new InicioLugares(R.drawable.tikal,"Ciudad Maya (Tikal)","Es la principal ciudad de todo el mundo maya","Flores, Petén, Guatemala"));
        inicioLugares.add(new InicioLugares(R.drawable.photo,"Lago Atitlán","Uno de los mas bellos lagos del mundo","Panajache, Sololá, Guatemala"));
        inicioLugares.add(new InicioLugares(R.drawable.castillo,"Castillo San Felipe de Lara","Ubicado en las costas de Izabal","Rio Dulce, Izabal, Guatemala"));
        inicioLugares.add(new InicioLugares(R.drawable.tikal,"Ciudad Maya (Tikal)","Es la principal ciudad de todo el mundo maya","Flores, Petén, Guatemala"));
        inicioLugares.add(new InicioLugares(R.drawable.photo,"Lago Atitlán","Uno de los mas bellos lagos del mundo","Panajache, Sololá, Guatemala"));
        inicioLugares.add(new InicioLugares(R.drawable.castillo,"Castillo San Felipe de Lara","Ubicado en las costas de Izabal","Rio Dulce, Izabal, Guatemala"));
        inicioLugares.add(new InicioLugares(R.drawable.tikal,"Ciudad Maya (Tikal)","Es la principal ciudad de todo el mundo maya","Flores, Petén, Guatemala"));
        inicioLugares.add(new InicioLugares(R.drawable.photo,"Lago Atitlán","Uno de los mas bellos lagos del mundo","Panajache, Sololá, Guatemala"));
        inicioLugares.add(new InicioLugares(R.drawable.castillo,"Castillo San Felipe de Lara","Ubicado en las costas de Izabal","Rio Dulce, Izabal, Guatemala"));




        initRecyclerView(view);

    }

    private void initRecyclerView(View view) {

        RecyclerView mRecyclerView = view.findViewById(R.id.my_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setHasFixedSize(true);
        AdapterInicio adapter = new AdapterInicio(getContext(),inicioLugares);
        mRecyclerView.setAdapter(adapter);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
