import java.util.ArrayList;
import java.util.Date;

public class Invoice {
    private ArrayList <Goods> list;
    private Goods contents;
    private boolean available = false;
    private final Date date = new Date();

    public Date getDate() { return date; }

    public ArrayList <Goods> getGoodsList(){
        return list;
    }

    public void setGoodsList(ArrayList <Goods> list) {
        this.list = list;
    }

    public synchronized void put(Goods value) {
        while (available) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        contents = value;
        available = true;

        //затримка для корректної синхронізації
        try {
            Thread.sleep(50);
        }catch (InterruptedException e) {}

        notifyAll();
    }

    public synchronized Goods get() {
        while (!available) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        available = false;
        //затримка для корректної синхронізації
        try {
            Thread.sleep(50);
        }catch (InterruptedException e) {}

        notifyAll();
        return contents;
    }
}
