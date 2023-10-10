package OOP_2;


import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour{
    List <Actor> orders = new LinkedList<>();
    Queue <Actor> que = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getActor().getName() + " Покупатель зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        this.que.add(actor);
        System.out.println(actor.getActor().getName() + " Покупатель встал в очередь");
    }

    @Override
    public void takeOrder() {
        for (Actor actor : que) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " Покупатель заказал товары");

            }
        }
    }

    @Override
    public void giveOrder() {

        for (Actor actor : que) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " Покупатель получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor : que) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " Покупатель вышел из очереди");
            }
        }
        releaseFromMarket(releaseActors);
    }


    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " Покупатель покинул магазин");
            que.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }
}

