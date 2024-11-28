package jp.ac.uryukyu.ie.e245733;
public class Enemy extends LivingThing {
    // コンストラクタ
    public Enemy(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack); // 親クラスのコンストラクタを呼び出す
    }

    // woundedメソッドを上書き
    @Override
    public void wounded(int damage) {
        super.wounded(damage); // 親クラスのダメージ処理
        if (isDead()) {
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
