## 📝 開発ログ

### 2026/05/20 作業時間：2.0h
- 実装内容
  - BookController 改修
    - ResponseEntity を利用したレスポンス対応
    - HTTPステータスコード返却対応
    - findById() による1件取得処理追加
    - RequestBody を利用したPOST/PUT処理対応
    - PathVariable を利用したID取得対応
  - CRUD API 改修
    - GET、POST、PUT、DELETE のREST形式整理
  - Postman によるAPI動作確認
    - 200 / 400 / 404 レスポンス確認
  - README / docs 構成整理
---

### 2026/05/19 作業時間：3.5h
- 実装内容
  - BookRepository 改修
    - 一覧取得の降順対応
    - タイトル・著者検索機能追加
  - BookController 改修
    - CRUD処理
      - save() による本データ登録
      - findAll() による一覧取得
      - deleteById() による削除処理追加
      - 更新処理追加
    - @PathVariable を利用した検索分岐処理追加
  - PostgreSQL とのデータ連携確認
  - Postman による動作確認
    - POST、GET、PUT、DELETE 対応
---

### 2026/05/18_2 作業時間：0.5h
- 実装内容
  - Book Entityクラスのカプセル化対応
    - private 化
    - getter / setter 作成
  - BookController 改修
    - getter / setter 使用
---

### 2026/05/18_1 作業時間：1.5h
- 実装内容
  - BookController 改修
    - CRUD処理
      - save() による本データ登録確認
      - findAll() による一覧取得確認
  - PostgreSQL へのデータ保存確認
  - ブラウザでAPI動作確認
  - GitHub 更新
---

### 2026/05/17（後半） 作業時間：1.0h
- 実装内容
  - Book Entity 作成
  - BookRepository 作成
  - PostgreSQL テーブル自動生成確認
  - pgAdmin4 で books テーブル確認
  - Spring Boot 起動確認
  - DB接続エラー確認・修正
---

### 2026/05/17（前半） 作業時間：2.5h
- 実装内容
  - PostgreSQL 17 インストール
  - pgAdmin 接続確認
  - bookapp DB作成
  - Spring Boot と PostgreSQL接続
  - application.properties設定
---

### 2026/05/16（後半） 作業時間：2.0h
- 実装内容
  - Bookクラス作成
  - JSON形式で本一覧を返却するAPIを実装
  - localhost:8080/books でJSON表示確認
---

### 2026/05/16（前半） 作業時間：2.0h
- 実装内容
  - Spring Bootプロジェクト作成
  - Spring Web / Spring Data JPA / PostgreSQL Driver追加
  - HelloController作成
  - ブラウザ表示確認
---

### 2026/05/15 作業時間：1.5h
- 実装内容
  - README作成
  - GitHub環境構築
---















