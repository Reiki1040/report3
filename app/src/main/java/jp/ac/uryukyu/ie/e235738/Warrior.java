package jp.ac.uryukyu.ie.e235738;

public class Warrior extends LivingThing{
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    public Warrior(String name,int maximumHP,int attack){
        super(name, maximumHP, attack);
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing e){
        int damage = 15 * attack / 10;
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！",name,e.getName(),damage);
        e.wounded(damage);
    }
}
