package OOP_2;


/**
 * Реализовать класс Market и все методы, которые он обязан реализовывать.
 * Методы из интерфейса QueueBehaviour, имитируют работу очереди,
 * MarketBehaviour – помещает и удаляет человека из очереди,
 * метод update – обновляет состояние магазина (принимает и отдаёт заказы)
 *
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("<".repeat(15)+"METRO"+">".repeat(15));
        Market metro = new Market();

        Actor client1 = new Human("PAVEL");
        Actor client2 = new Human("RADIK");
        Actor client3 = new Human("ANTON");
        Actor client4 = new Human("LEV");

        metro.acceptToMarket(client1);
//        metro.acceptToMarket(client2);
//        metro.acceptToMarket(client3);
//        metro.acceptToMarket(client4);

        metro.update();
        System.out.println("<".repeat(15)+"METRO"+">".repeat(15));
    }
}
