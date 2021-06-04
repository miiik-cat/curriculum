
/**
 * Task1_1: 課題内容
 *
 * 本課題では、データ型・文字列の使い方を学んでいきましょう。
 * 問①から問⑧まであります。
 * 指定された型・値・変数名を守って記述してください。
 * 問③,⑦については、コメントを入れてください。
 *
 */
public class Task1_1 {

    public static void main(String[] args) {

        // ①int型の hogeInt という名前の変数を宣言し、値「50」で初期化

        int hogeint = 50;

        System.out.println("int型 = 整数 = " + hogeint);

        // ②Stringクラスの hogeString という名前の変数を宣言、値「テスト」で初期化


        String hogeString = "テスト";

        System.out.print(hogeString);

        hogeString = "テスト";


        // ③下記の処理について、何をしているのかコメントを記入してください
        // [double型のhogeDoubleという名前の変数を宣言し、値「0.2」で初期化の変数の宣言をしている]
        double hogeDouble = 0.2;

        // ④変数 hogeInt を値「100」で上書き

        hogeInt = 0;
        System.out.println("hogeInt = "+ hogeInt);

        hogeInt = 100;
        System.out.println("hogeInt = "+ hogeInt);

        // ⑤変数 hogeString を値「合格」で上書き

        hogeString = "合格";
        System.out.println("hogeString = "+ hogeString);

        // ⑥変数 hogeInt の値を表示

        System.out.println(hogeInt);

        // ⑦下記の処理について、何をしているのかコメントを記入してください
        // [変数 hogeStringの値を表示]
        System.out.println(hogeString);

        // ⑧変数 hogeDouble の値を表示

        System.out.println(hogeDouble);


    }
}