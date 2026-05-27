## 📝 開発ログ

### 2026/05/27 作業時間：2.0h
- 実装内容(フロント)
  - 本一覧のカードUI調整
  - CSSによるレイアウト調整
    - タイトル・著者・削除ボタンの配置調整
    - カード幅調整
    - 横並びレイアウト調整（flex-wrap）
  ---

### 2026/05/26 作業時間：1.0h
- 実装内容(フロント)
  - React + Vite 構成
  ---

### 2026/05/26 作業時間：2.0h
- 実装内容
  - React 環境構築
    - Node.js / npm 動作確認
    - Vite による React プロジェクト作成
    - book-app-frontend 作成
  - React アプリ起動確認
    - localhost:5173 表示確認
    - App.jsx 編集
  - Spring Boot API連携
    - fetch() による GET API 呼び出し
    - useEffect() を利用した初期通信処理追加
    - useState() を利用した状態管理追加
    - books.map() による一覧表示実装
  - CORS接続確認
    - Spring Boot API と React 間通信確認
  - PostgreSQL → Spring Boot → React 表示確認
  - ブラウザ上で一覧表示確認
  ---

### 2026/05/25 作業時間：3.0h
- 実装内容
  - BookService 改修
    - deleteBook() の null返却を throw形式へ変更
    - updateBook() の null返却を throw形式へ変更
    - BookNotFoundException を利用した例外送出へ統一
  - BookController 改修
    - delete / update の nullチェック削除
    - Service層例外処理へ責務統一
  - CORS設定追加
    - WebConfig 作成
    - WebMvcConfigurer 実装
    - addCorsMappings() による許可設定追加
  - Postman によるAPI動作確認
    - delete / update の例外レスポンス確認
    - CORS設定後の接続確認
     ---

### 2026/05/24 作業時間：3.0h
- 実装内容
  - APIエラーレスポンス統一対応
    - Map.of("messages", List.of()) 形式へ統一
    - Validation / Controller エラーJSON形式整理
  - BookNotFoundException 作成
    - RuntimeException 継承
    - super(message) によるメッセージ管理対応
  - BookService 改修
    - getBook() の null返却を throw形式へ変更
    - BookNotFoundException を利用した例外送出対応
  - GlobalExceptionHandler 改修
    - @ExceptionHandler(BookNotFoundException.class) 追加
    - exception.getMessage() を利用したJSONレスポンス返却対応
  - Postman による動作確認
    - 404 Not Found レスポンス確認
    - ValidationエラーJSON形式確認
    - 例外発生時のJSON返却確認
 ---

### 2026/05/23 作業時間：4.0h
- 実装内容
  - Validation導入
    - spring-boot-starter-validation 追加
    - BookRequestDto に Validation設定追加
      - @NotBlank
      - @Size
    - POST / PUT API に @Valid 追加
  - GlobalExceptionHandler 作成
    - @ControllerAdvice による例外処理追加
    - MethodArgumentNotValidException 対応
    - Validationエラーメッセージ返却対応
    - Map.of() によるJSON形式レスポンス対応
    - List<String> を利用した複数Validationエラー返却対応
  - Validationエラー処理改修
    - getFieldErrors() を利用した複数メッセージ取得処理追加
    - ArrayList によるエラーメッセージ蓄積処理追加
  - Postman による動作確認
    - Validationエラー確認
    - 400 Bad Request レスポンス確認
    - 複数Validationエラー返却確認
---

### 2026/05/22 作業時間：2.0h
- 実装内容
  - DTO拡張
    - BookResponseDto 作成
    - GET API の返却形式を DTO化
    - Entity → DTO 変換処理追加
    - List<Book> → List<BookResponseDto> 変換処理追加
  - BookService 改修
    - DTO変換処理を Service層へ実装
    - for-each による DTOリスト生成処理追加
  - Postman によるAPI動作確認
    - DTO形式でのJSON返却確認
    - id / title / author 表示確認
---

### 2026/05/21 作業時間：5.5h
- 実装内容
  - Service層導入
    - BookService 作成
    - BookRepository の処理を Service層へ分離
  - BookController 改修
    - Service 呼び出し形式へ変更
    - CRUD処理の責務整理
  - DTO導入
    - BookRequestDto 作成
    - RequestBody 受け取り処理を DTO形式へ変更
    - Entity と API受け渡しデータの分離対応
  - Postman によるAPI動作確認（責務整理後）
    - GET、POST、PUT、DELETE 再確認
---

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















