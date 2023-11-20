import jp.ac.uryukyu.ie.e235738.*;

public class Main {
    public static void main(String[] args){
        LivingThing hero = new LivingThing("勇者", 10, 5);
        LivingThing enemy = new LivingThing("スライム", 6, 3);
        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}