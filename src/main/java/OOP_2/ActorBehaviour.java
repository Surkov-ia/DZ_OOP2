package OOP_2;


public interface ActorBehaviour {
    void setMakeOrder(boolean make);
    void setTakeOrder(boolean take);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();

}
