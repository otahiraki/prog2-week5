package jp.ac.uryukyu.ie.e245733;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test
   public void testAttackWithWeponSkill() {
       int attack = 10;
       int defaultEnemyHp = 45;
       Warrior warrior = new Warrior("戦士", 100, attack);
       Enemy slime = new Enemy("スライム", defaultEnemyHp, 1);


       int expectedDamage = (int)(attack * 1.5);
       int EnemyHp;
       for(int i = 0; i < 3; i++){
           EnemyHp = slime.getHitPoint();
           warrior.attackWithWeponSkill(slime);
           assertEquals(expectedDamage, EnemyHp - slime.getHitPoint());
       }
   }
}
