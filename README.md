# 本管理アプリ

## 📌 概要
漫画・書籍を管理するためのWebアプリです。

積読管理や未読率の可視化、
シリーズ管理などを通して、
「買ったのに読んでいない本」を
管理できることを目的としています。

将来的には外部APIと連携し、
最新刊チェックや巻数不足確認にも
対応予定です。

---

## 🎯 作成目的

- Java / Web開発の学習
- バックエンド～フロントエンドまでの実装経験
- 実務を意識したCRUDアプリ開発
- API連携やDB設計の学習

---

## ✨ 実装予定機能

### 基本機能
- 本の登録
- 編集 / 削除
- 一覧表示
- 検索機能

### 管理機能
- 未読 / 読了管理
- 積読日数表示
- 読了ページ数管理
- シリーズ別管理

### 分析機能
- 未読率表示
- シリーズ別読了率
- 全体統計表示

### API連携（予定）
- バーコード読み取り
- 書籍情報自動取得
- 最新刊との差分表示
- 巻数抜けチェック

## 🧱 想定データ構造

### Author(作者)
- id
- name

### Series（シリーズ）
- id
- title
- authorId

### Book（本詳細）
- id
- title
- seriesId
- volumeNumber
- isbn
- status
- purchaseDate
- registeredDate
- currentPage
- totalPages

---

## 🛠 使用予定技術

### バックエンド
- Java
- Spring Boot

### フロントエンド
- React
- JavaScript

### DB
- PostgreSQL
- Supabase（予定）

### その他
- Git / GitHub
- REST API

---

## 📷 将来的に実装したい機能

- スマホカメラでのバーコード読み取り
- グラフ表示
- レスポンシブ対応
- ログイン機能
- クラウド公開

---

## 🚀 開発予定

### Phase 1
- CRUD機能
- DB接続
- 一覧画面作成

### Phase 2
- React化
- API連携

### Phase 3
- UI改善
- グラフ化
- デプロイ

---

## 💡 工夫したいポイント

- 「積読管理」に特化した設計
- シリーズ単位での管理
- 可視化による読書状況分析
- 実用性を意識したUI設計


## 📝 開発ログ

### 2026/05/15 作業時間：1.5h
- 実装内容
  - README作成
  - GitHub環境構築
- 学習内容
  - 要件整理
---

### 2026/05/16（前半） 作業時間：2.0h
- 実装内容
  - Spring Bootプロジェクト作成
  - Spring Web / Spring Data JPA / PostgreSQL Driver追加
  - HelloController作成
  - ブラウザ表示確認
- 学習内容
  - Spring Bootプロジェクト構成の理解
  - Controllerの役割を学習
  - @RestController / @GetMapping の基本理解
---

### 2026/05/16（後半） 作業時間：2.0h
- 実装内容
  - Bookクラス作成
  - JSON形式で本一覧を返却するAPIを実装
  - localhost:8080/books でJSON表示確認
- 学習内容
  - List<Book> と ArrayList を使用した複数データ管理を学習
  - class とインスタンス生成(new)の理解
  - add() によるListへのデータ追加を学習
  - JSONの基本構造を学習
  - APIによるフロント・バックエンド連携の基本を理解
---

### 2026/05/17（前半） 作業時間：2.5h
- 実装内容
  - PostgreSQL 17 インストール
  - pgAdmin 接続確認
  - bookapp DB作成
  - Spring Boot と PostgreSQL接続
  - application.properties設定
- 学習内容
  - PostgreSQLの基本理解
  - ポート番号の役割
  - Spring Data JPA のDB連携概要
  - datasource設定の理解
---

### 2026/05/17（後半） 作業時間：1.0h
- 実装内容
  - Book Entity 作成
  - BookRepository 作成
  - PostgreSQL テーブル自動生成確認
  - pgAdmin4 で books テーブル確認
  - Spring Boot 起動確認
  - DB接続エラー確認・修正
- 学習内容
  - Entity の役割
  - Repository の役割
  - JpaRepository の基本理解
  - 主キー（id）の考え方
  - JPAによるテーブル自動生成の仕組み
  - pgAdmin4 の基本操作

### 2026/05/18 作業時間：1.5h
- 実装内容
  - BookController 改修
    - save() による本データ登録確認
    - findAll() による一覧取得確認
  - PostgreSQL へのデータ保存確認
  - ブラウザでAPI動作確認
  - GitHub 更新

- 学習内容
  - Controller の役割理解
  - save() の基本動作
  - findAll() の基本動作
  - Spring Boot のリクエスト処理の流れ
  - public フィールドとカプセル化の考え方
  - インスタンスの基本理解




