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
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", getName(), getHitpoint(), attack);
    }

    public boolean isDead(){
        return this.dead;
    }

    public String getName(){
        return this.name;
    }

    public int getHitpoint(){
        return this.hitPoint;
    }

    public void attack(LivingThing opponent){
        if(dead != true){
        int damage = (int)(Math.random() * attack);
        System.out.println(getName() + "の攻撃！" + opponent.name +  'に' + damage + "のダメージを与えた！！") ;
        opponent.wounded(damage);
    }else{
        System.out.println(name + "は死亡しているため、攻撃不可");
    }

    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if(this.hitPoint <= 0){
            dead = true;
            System.out.println(name + "は倒れた。");
        }
    }

    
    }