import java.util.ArrayList;

public class MultiThreading {
    public static void main(String[] args)
    {
        ArrayList<Goods> list = new ArrayList<Goods>();
        Storage s = new Storage();

//        list.add(new Goods("Деревина", 100));
//        list.add(new Goods("Залізна руда", 80));
//        list.add(new Goods("Золота руда", 40));
//        list.add(new Goods("Мідна руда", 80));
//
//        s.setGoodsInvoice(list);
//        s.createProcess("РудаЮкрейн", "РудаПольша");

//        list.add(new Goods("Двері", 20));
//        list.add(new Goods("Вікна", 25));
//        list.add(new Goods("Стільці", 25));
//        list.add(new Goods("Столи", 10));
//        list.add(new Goods("Шафи", 12));
//
//        s.setGoodsInvoice(list);
//        s.createProcess("МебліЮкрейн", "МебліПольша");

//        list.add(new Goods("Телевізори", 18));
//        list.add(new Goods("Проектори", 70));
//        list.add(new Goods("Програвачі", 55));
//
//        s.setGoodsInvoice(list);
//        s.createProcess("ТехнікаЮкрейн", "ТехнікаПольша");

//        list.add(new Goods("Ковбаса", 500));
//        list.add(new Goods("Сири", 700));
//        list.add(new Goods("Вино", 220));
//
//        s.setGoodsInvoice(list);
//        s.createProcess("Продукти Київ", "Продукти Біла Церква");

        list.add(new Goods("Кільця", 112));
        list.add(new Goods("Медальйони", 227));
        list.add(new Goods("Браслети", 79));
        list.add(new Goods("Намисто", 140));

        s.setGoodsInvoice(list);
        s.createProcess("Коштовності Ужгород", "Коштовності Київ");
    }
} 