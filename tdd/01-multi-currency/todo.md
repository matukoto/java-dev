## TODO リスト
* [ ] $5 + 10 CHF = $10 (レートが2：1の場合)
* [x] $5 * 2 = $10
- [x] 5 CHF * 2 = 10 CHF
- [ ] Dollar と Franc の重複
- [ ] equals の一般化
- [ ] times の一般化
* [x] コンパイルエラーを解消する
* [x] amountをprivateにする
* [x] Dollarの副作用をどうする？
  * [x] Dollarオブジェクトの状態が変化してしまう -> times メソッドで Dollar オブジェクトを生成する
* [ ] Moneyの丸め処理をどうする？
- [x] equals()
- [ ] hashCode()
- [ ] nullとの等価性比較
- [ ] 他のオブジェクトとの等価性比較
- [x] Franc と Dollar を比較する

## メモ
まずはTODOリストを作成する。
次にテストを書く。
どちらのテストが書きやすいか？
シンプルな掛け算のほうだろう。
