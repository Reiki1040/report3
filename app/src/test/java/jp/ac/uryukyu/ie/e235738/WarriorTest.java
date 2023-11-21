package jp.ac.uryukyu.ie.e235738;
import org.checkerframework.checker.units.qual.s;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
        Enemy slime1 = new Enemy("スライム", 150, 0);
        Enemy slime2 = new Enemy("すらいむ", 150, 0);
        Enemy slime3 = new Enemy("slime", 150, 0);

        ArrayList<Enemy> slimes = new ArrayList<>();
        slimes.add(slime1);
        slimes.add(slime2);
        slimes.add(slime3);

        for(Enemy e:slimes){
            demoWarrior.attackWithWeponSkill(e);
            int nowSlimeHitpoint = e.getHitpoint();
            assertEquals(0, nowSlimeHitpoint);
        }
    }
}
