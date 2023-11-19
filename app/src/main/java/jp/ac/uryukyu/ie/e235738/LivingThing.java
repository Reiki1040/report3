package jp.ac.uryukyu.ie.e235738;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public  LivingThing (String name,int hitPoint,int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead(){
        return this.dead;
    }

    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        System.out.println(name + "の攻撃！" );

    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if(this.hitPoint <= 0){
            dead = true;
            System.out.println(name + "は倒れた。");
        }
    }

    
    }