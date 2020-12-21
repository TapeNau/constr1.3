import java.lang.Thread;

class Producer extends Thread {
    private Invoice invoice;
    private String name;

    public Producer(Invoice c, String name) {
        invoice = c;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < invoice.getGoodsList().size(); i++) {
            Goods temp = invoice.getGoodsList().get(i);
            invoice.put(temp);
            System.out.println(invoice.getDate().toString() + " --- Поставщик " + this.name + " привіз товар: " + temp.getName() + " в кількості: " + temp.getAmount());
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) { }
        }
    }
}