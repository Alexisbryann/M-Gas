package Alexis.m_gas.OrderGas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;

import Alexis.m_gas.R;

public class GasAdapter extends FirebaseRecyclerAdapter<GasModel,GasAdapter.ViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */

    public GasAdapter(FirebaseRecyclerOptions<GasModel> options) {
            super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull GasAdapter.ViewHolder holder, int position, @NonNull GasModel model) {

        ImageView image = GasModel.getImage();
        holder.mGasName.setText(GasModel.getName());
        holder.mGasQuantity.setText(GasModel.getQuantity());
        holder.mGasCost.setText(GasModel.getCost());
        Glide.with(holder.itemView.getContext()).load(image).into(holder.mGasImage);
    }

    @NonNull
    @Override
    public GasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_gas_item_view,parent,false);
        return new GasAdapter.ViewHolder(view);
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView mGasName;
        private final TextView mGasQuantity;
        private final TextView mGasCost;
        private final ImageView mGasImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mGasName = itemView.findViewById(R.id.text_view_cooking_gas_brand);
            mGasQuantity = itemView.findViewById(R.id.text_view_quantity);
            mGasCost = itemView.findViewById(R.id.text_view_cost);
            mGasImage = itemView.findViewById(R.id.image_view_cooking_gas);
        }
    }
}
