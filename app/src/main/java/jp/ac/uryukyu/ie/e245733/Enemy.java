package jp.ac.uryukyu.ie.e245733;

/**
 * Enemyクラス。
 * 敵キャラクターとしての情報を管理し、攻撃やダメージ処理を行うクラス。
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。敵の名前、HP、攻撃力を指定してインスタンスを生成する。
     * @param name 敵の名前
     * @param hitPoint 敵のHP
     * @param attack 敵の攻撃力
     */
    public Enemy(String name, int hitPoint, int attack) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
    }

    /**
     * 敵が勇者を攻撃するメソッド。
     * 勇者にランダムなダメージを与える。
     * @param h 攻撃対象の勇者
     */
    public void attack(Hero h) {
        if (!this.dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, h.getName(), damage);
            h.wounded(damage);
        }
    }

    /**
     * 敵がダメージを受けた際の処理。
     * ダメージをHPから引き、HPが0以下になった場合は死亡状態にする。
     * @param damage 受けたダメージ量
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    // アクセサとミューテータ（ゲッターとセッター）

    /**
     * 敵の名前を取得する。
     * @return 敵の名前
     */
    public String getName() {
        return name;
    }

    /**
     * 敵の名前を設定する。
     * @param name 設定する名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 敵のHPを取得する。
     * @return 敵のHP
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * 敵のHPを設定する。
     * @param hitPoint 設定するHP
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * 敵の攻撃力を取得する。
     * @return 敵の攻撃力
     */
    public int getAttack() {
        return attack;
    }

    /**
     * 敵の攻撃力を設定する。
     * @param attack 設定する攻撃力
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * 敵の死亡状態を取得する。
     * @return 敵が死亡している場合はtrue、そうでない場合はfalse
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * 敵の死亡状態を設定する。
     * @param dead 死亡状態（trueで死亡、falseで生存）
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
