package Alexis.m_gas.OrderGas;

import android.widget.ImageView;

public class GasModel {
    public static String Name;
    public static String Quantity;
    public static ImageView Image;
    public static String Cost;
    private static int pid;

    public GasModel() {
    }
    public int getPosition() {
        return pid;
    }

    public void setPosition(int position) {
        GasModel.pid = position;
    }
    public static String getName() {
        return Name;
    }

    public static void setName(String gasName) {
        GasModel.Name = gasName;
    }

    public static String getQuantity() {
        return Quantity;
    }

    public static void setQuantity(String Quantity) {
        GasModel.Quantity = Quantity;
    }

    public static ImageView getImage() {
        return Image;
    }

    public void setImage(ImageView gasImage) {
        GasModel.Image = gasImage;
    }

    public static String getCost() {
        return Cost;
    }

    public void setCost(String gasCost) {
        GasModel.Cost = gasCost;
    }

    public GasModel(String name, String cost, String quantity, ImageView image) {
        Name = name;
        Quantity = quantity;
        Image = image;
        Cost = cost;
    }

}
