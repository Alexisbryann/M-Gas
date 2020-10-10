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
import java.util.List;

import Alexis.m_gas.R;

public class GasAdapter extends RecyclerView.Adapter<GasAdapter.ViewHolder> {

    public List<GasModel> mGasModelList = new ArrayList<>() ;
    private Context mContext = null;

    public GasAdapter(Context context, List<GasModel> mGasModelList) {

//        super(options);
        this.mContext= context;
        this.mGasModelList = mGasModelList;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        GasModel gasModel = mGasModelList.get(position);
        ImageView image = gasModel.getImage();
        holder.mGasName.setText(gasModel.getName());
        holder.mGasQuantity.setText(gasModel.getQuantity());
        holder.mGasCost.setText(gasModel.getCost());
        Glide.with(holder.itemView.getContext()).load(image).into(holder.mGasImage);

    }

    @NonNull
    @Override
    public GasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_gas_item_view,parent,false);
        return new GasAdapter.ViewHolder(view);
    }

    @Override
    public int getItemCount()
    {
        return mGasModelList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mGasName;
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
