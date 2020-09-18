package Alexis.m_gas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderGasActivity extends AppCompatActivity {

    private ImageView mGasCylinder;
    private TextView mGasBrand;
    private TextView mGasQuantity;
    private TextView mGasCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_gas);

        mGasCylinder = findViewById(R.id.image_view_cooking_gas);
        mGasBrand = findViewById(R.id.text_view_cooking_gas_brand);
        mGasQuantity = findViewById(R.id.text_view_quantity);
        mGasCost = findViewById(R.id.text_view_cost);
    }
}