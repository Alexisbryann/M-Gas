package Alexis.m_gas.OrderGas;

public class GasModel {
    private String name;
    private String quantity;
    private String image;
    private String cost;
    private int pid;

    public GasModel(String name, String quantity, String image, String cost) {
        this.name = name;
        this.quantity = quantity;
        this.image = image;
        this.cost = cost;
    }

    public GasModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
