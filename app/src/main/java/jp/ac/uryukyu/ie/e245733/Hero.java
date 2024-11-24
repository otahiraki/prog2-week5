package jp.ac.uryukyu.ie.e245733;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
/**
     * 勇者の名前を取得する。
     * @return 勇者の名前
     */
    public String getName() {
        return name;
    }

    /**
     * 勇者の名前を設定する。
     * @param name 設定する名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 勇者のHPを取得する。
     * @return 勇者のHP
     */
    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * 勇者のHPを設定する。
     * @param hitPoint 設定するHP
     */
    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * 勇者の攻撃力を取得する。
     * @return 勇者の攻撃力
     */
    public int getAttack() {
        return attack;
    }

    /**
     * 勇者の攻撃力を設定する。
     * @param attack 設定する攻撃力
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * 勇者の死亡状態を取得する。
     * @return 勇者が死亡している場合はtrue、そうでない場合はfalse
     */
    public boolean isDead() {
        return dead;
    }

    /**
     * 勇者の死亡状態を設定する。
     * @param dead 死亡状態（trueで死亡、falseで生存）
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     */
    public void attack(Enemy e){
        if (this.dead == false) {
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }
}

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
