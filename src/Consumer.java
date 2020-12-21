import java.io.*;

class Consumer extends Thread {
    private Invoice invoice;
    private String name;

    public Consumer(Invoice c, String name) {
        invoice = c;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < invoice.getGoodsList().size(); i++) {
            Goods value = invoice.get();
            String text = invoice.getDate().toString() + " --- Покупець " + this.name + " забрав товар: " + value.getName() + " в кількості: " + value.getAmount();
            this.Serialize(text);
            System.out.println(text);
        }
        this.Serialize("---");
    }

    public void Serialize (String text) {
        try(FileWriter fw = new FileWriter("myfile.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
                out.println(text);
        } catch (IOException e) { }
    }
}

