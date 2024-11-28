package jp.ac.uryukyu.ie.e245733;

public class Enemy extends LivingThing {
    public Enemy(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack); // 親クラスのコンストラクタを呼び出し
    }

    @Override
    public void wounded(int damage) {
        super.wounded(damage); // 親クラスのwoundedメソッドを呼び出し
        if (isDead()) {
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
