package jp.ac.uryukyu.ie.e235738;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int defaultWarriorHp = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", defaultWarriorHp, 100);
        Enemy slime = new Enemy("スライム", 1000, 5);
        demoWarrior.attackWithWeponSkill(slime);
        assertEquals(850, slime.getHitpoint());
        demoWarrior.attackWithWeponSkill(slime);
        assertEquals(700, slime.getHitpoint());
        demoWarrior.attackWithWeponSkill(slime);
        assertEquals(550, slime.getHitpoint());
}
}
