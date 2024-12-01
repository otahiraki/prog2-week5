package jp.ac.uryukyu.ie.e245733;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    // コンストラクタ
    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
    }

    // isDeadメソッド
    public boolean isDead() {
        return dead;
    }

    // getNameメソッド
    public String getName() {
        return name;
    }

    // getHitPointメソッド
    public int getHitPoint() {
        return hitPoint;
    }

    public int getAttack() {
        return attack;
    }

    // 攻撃メソッド
    public void attack(LivingThing opponent) {
        if (!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    // 被ダメージメソッド（仮実装）
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
