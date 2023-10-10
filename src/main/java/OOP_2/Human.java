package OOP_2;


public class Human  extends Actor {

//    @Override
//    public void setMakeOrder() {
//        isMakeOrder = true;
//    }
//
//    @Override
//    public void setTakeOrder() {
//        isTakeOrder = true;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("Заказ принят: " + isMakeOrder + "\nЗаказ выдан: " + isTakeOrder);
//    }

    public Human(String name) {
        super(name);
    }
    @Override
    String getName() {
        return name;
    }


    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }


    @Override
    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }
    public Actor getActor()
    {
        return this;
    }


    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }


    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }


}

