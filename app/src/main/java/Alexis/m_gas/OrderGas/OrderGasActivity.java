package Alexis.m_gas.OrderGas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import Alexis.m_gas.R;

public class OrderGasActivity extends AppCompatActivity {


    private DatabaseReference mReference;
    private RecyclerView mRecyclerView;
    private GasAdapter mAdapter;
//    private List<GasModel> gasModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_gas);

//        Instance of the database and its reference
        mReference = FirebaseDatabase.getInstance().getReference().child("gas_type");
        mRecyclerView = findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        gasModelList = new ArrayList<>();

        loadGasDetail();
    }

    private void loadGasDetail() {
        // A class provided by the FirebaseUI to make a query in the database to fetch appropriate data
        FirebaseRecyclerOptions<GasModel> options = new FirebaseRecyclerOptions
                .Builder<GasModel>()
                .setQuery(mReference,GasModel.class)
                .build();

//        mAdapter = new GasAdapter(options, gasModelList);
        mAdapter = new GasAdapter(options);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAdapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAdapter.stopListening();
    }
}