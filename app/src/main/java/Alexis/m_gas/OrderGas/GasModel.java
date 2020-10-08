package Alexis.m_gas.OrderGas;

import android.widget.ImageView;

public class GasModel {
    public static String Name;
    public static String Quantity;
    public static ImageView Image;
    public static String Cost;
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
        return Quantity;
    }

    public void setGasQuantity(String gasQuantity) {
        GasModel.Quantity = gasQuantity;
    }

    public static ImageView getImage() {
        return Image;
    }

    public void setGasImage(ImageView gasImage) {
        GasModel.Image = gasImage;
    }

    public static String getCost() {
        return Cost;
    }

    public void setGasCost(String gasCost) {
        GasModel.Cost = gasCost;
    }

    public GasModel(String name, String cost, String quantity, ImageView image) {
        Name = name;
        Quantity = quantity;
        Image = image;
        Cost = cost;
    }

}
