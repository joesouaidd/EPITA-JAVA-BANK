package fr.epita.bank.datamodel;

public class StockOrder {
    private int quantity;
    private float unitPrice;
    private float commission;
    private Stock stock;

    public StockOrder(Stock name ,int quantity, float unitPrice, float commission) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.commission = commission;
        this.stock = name;
    }

    public String toString(){
        return this.stock.getName() + " " + String.valueOf(this.quantity) +" " + String.valueOf(this.unitPrice) +" " + String.valueOf(this.commission);
    }

}
