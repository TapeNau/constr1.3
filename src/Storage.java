import java.util.ArrayList;

public class Storage {
    private final Invoice invoice;

    public ArrayList<Goods> getGoodsInvoice(){
        return this.invoice.getGoodsList();
    }

    public void setGoodsInvoice(ArrayList<Goods> list) {
        this.invoice.setGoodsList(list);
    }

    public Storage() {
        this.invoice = new Invoice();
    }

    public void createProcess(String p1name, String c1name) {
        Producer p1 = new Producer(invoice, p1name);
        Consumer c1 = new Consumer(invoice, c1name);
        p1.start();
        c1.start();
    }
}
