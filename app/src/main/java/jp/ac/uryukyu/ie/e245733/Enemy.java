package jp.ac.uryukyu.ie.e245733;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy {
    public String name; // 敵の名前
    public int hitPoint; // 敵のHP
    public int attack; // 敵の攻撃力
    public boolean dead; // 敵の生死状態。true=死亡。

    /**
     * コンストラクタ。名前、HP、攻撃力を設定。
     * @param name 敵の名前
     * @param hitPoint 敵のHP
     * @param attack 敵の攻撃力
     */
    public Enemy(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false; // 初期状態は生存
    }

    /**
     * 攻撃を受けた際にHPを減らし、死亡判定を行うメソッド。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("%sは死亡した。\n", name);
        }
    }
}
