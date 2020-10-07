package Alexis.m_gas.OrderGas;

import android.widget.ImageView;

public class GasModel {
    public static String Name;
    public static String quantity;
    public static ImageView image;
    public static String cost;
    private String pid;

    public GasModel() {
    }
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
    public static String getName() {
        return Name;
    }

    public void setGasName(String gasName) {
        GasModel.Name = gasName;
    }

    public static String getQuantity() {
        return quantity;
    }

    public void setGasQuantity(String gasQuantity) {
        GasModel.quantity = gasQuantity;
    }

    public static ImageView getImage() {
        return image;
    }

    public void setGasImage(ImageView gasImage) {
        GasModel.image = gasImage;
    }

    public static String getCost() {
        return cost;
    }

    public void setGasCost(String gasCost) {
        GasModel.cost = gasCost;
    }

    public GasModel(String name, String cost, String quantity, ImageView image) {
        Name = name;
    }

}
