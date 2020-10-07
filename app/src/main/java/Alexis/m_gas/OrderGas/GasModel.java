package Alexis.m_gas.OrderGas;

import android.widget.ImageView;

public class GasModel {
    private static String gasName;
    private static String gasQuantity;
    private static ImageView gasImage;
    private static String gasCost;

    public GasModel() {
    }

    public static String getGasName() {
        return gasName;
    }

    public void setGasName(String gasName) {
        GasModel.gasName = gasName;
    }

    public static String getGasQuantity() {
        return gasQuantity;
    }

    public void setGasQuantity(String gasQuantity) {
        GasModel.gasQuantity = gasQuantity;
    }

    public static ImageView getGasImage() {
        return gasImage;
    }

    public void setGasImage(ImageView gasImage) {
        GasModel.gasImage = gasImage;
    }

    public static String getGasCost() {
        return gasCost;
    }

    public void setGasCost(String gasCost) {
        GasModel.gasCost = gasCost;
    }
}
