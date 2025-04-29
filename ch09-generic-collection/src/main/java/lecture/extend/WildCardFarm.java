package main.java.lecture.extend;

public class WildCardFarm {
    //토끼가 어떤 토끼든 상관 X
    //(Rabbit, Bunny, DrunkenBunny)
    public void anyType(RabbitFarm<?> farm) {
        farm.getAminal().cry();
    }

    //토끼 중 Bunny와 Bunny 하위만 가능
    //(Bunny, DrunkenBunny)
    public void extendsType(RabbitFarm<? extends Bunny> farm) {
        farm.getAminal().cry();
    }

    //토끼 중 Bunny와 Bunny 상위만 가능
    //(Bunny, DrunkenBunny)
    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getAminal().cry();
    }
}
