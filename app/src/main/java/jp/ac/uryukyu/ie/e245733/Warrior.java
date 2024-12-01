package jp.ac.uryukyu.ie.e245733;

public class Warrior extends Hero {
    public Warrior(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (opponent.isDead()) {
            return; // 対象がすでに死亡している場合は攻撃しない
        }

        int damage = (int) (getAttack() * 1.5); // 150%固定ダメージ
        opponent.wounded(damage);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
    }
}
