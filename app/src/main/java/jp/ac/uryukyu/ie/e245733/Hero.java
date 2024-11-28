package jp.ac.uryukyu.ie.e245733;
public class Hero extends LivingThing {
    // コンストラクタ
    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack); // 親クラスのコンストラクタを呼び出す
    }

    // woundedメソッドを上書き
    @Override
    public void wounded(int damage) {
        super.wounded(damage); // 親クラスのダメージ処理
        if (isDead()) {
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
