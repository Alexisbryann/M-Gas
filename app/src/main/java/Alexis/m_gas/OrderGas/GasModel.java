package Alexis.m_gas.OrderGas;

import android.media.Image;

public class GasModel {
    private String gasName;
    private String gasQuantity;
    private Image gasImage;
    private String gasCost;

    public GasModel() {
    }

    public String getGasName() {
        return gasName;
    }

    public void setGasName(String gasName) {
        this.gasName = gasName;
    }

    public String getGasQuantity() {
        return gasQuantity;
    }

    public void setGasQuantity(String gasQuantity) {
        this.gasQuantity = gasQuantity;
    }

    public Image getGasImage() {
        return gasImage;
    }

    public void setGasImage(Image gasImage) {
        this.gasImage = gasImage;
    }

    public String getGasCost() {
        return gasCost;
    }

    public void setGasCost(String gasCost) {
        this.gasCost = gasCost;
    }
}
