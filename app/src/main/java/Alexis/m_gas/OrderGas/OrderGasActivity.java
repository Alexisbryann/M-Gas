package Alexis.m_gas.OrderGas;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseListOptions;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import Alexis.m_gas.R;

public class OrderGasActivity extends AppCompatActivity {


    private DatabaseReference mReference;
    private RecyclerView mRecyclerView;
    private GasAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_gas);

//        Instance of the database and its reference
        mReference = FirebaseDatabase.getInstance().getReference();
        mRecyclerView = findViewById(R.id.recycler);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // A class provided by the FirebaseUI to make a query in the database to fetch appropriate data
        FirebaseRecyclerOptions<GasModel> options = new FirebaseRecyclerOptions
                .Builder<GasModel>()
                .setQuery(mReference,GasModel.class)
                .build();

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