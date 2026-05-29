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

## 📌 現在の状態
React フロントエンドから Spring Boot REST API に通信し、
PostgreSQL に保存された本データの CRUD
（登録・一覧表示・更新・削除）機能を実装済みです。

また、React の useState を利用した状態管理を行い、
削除モード・更新モードの切替UIを実装しています。

更新モードではカード選択による編集機能を実装し、
React → Spring Boot → PostgreSQL のデータ更新処理を確認済みです。

一覧画面はカード型レイアウトで構成し、
CSSによるUI調整を継続しています。

## 🎯 作成目的
- Java / Web開発の学習
- バックエンド～フロントエンドまでの実装経験
- 実務を意識したCRUDアプリ開発
- API連携やDB設計の学習
---

## ✨ 実装済み機能

### バックエンド
- CRUD API
- Service層分離
- DTO対応
- Validation
- GlobalExceptionHandler
- カスタム例外対応
- PostgreSQL連携

### フロントエンド
- React + Vite 環境構築
- Spring Boot API連携
- 一覧表示（GET）
- 本登録（POST）
- 本更新（PUT）
- 本削除（DELETE）
- 削除確認ダイアログ
- モード切替UI
  - 削除モード
  - 更新モード
- カード型レイアウトUI
- カード選択による編集機能
- fetch API通信
- useStateによる状態管理
---

## 🚀 今後実装予定
### フロントエンド強化
- 検索機能
- 表紙画像対応
- UI改善

### 機能追加
- 積読管理機能
- 未読率表示
- シリーズ管理機能
- グラフ表示

### 外部連携
- バーコード読み取り
- 書籍API連携
- 最新刊との差分表示
- 巻数抜けチェック
---

## 🛠 使用技術
### バックエンド
- Java
- Spring Boot

### フロントエンド
- React
- Vite
- JavaScript

### DB
- PostgreSQL
- Supabase（予定）

### その他
- Git / GitHub
- REST API
---

## ドキュメント

- [学習ログ](docs/study-log.md)
- [開発ログ](docs/development-log.md)
- [DB設計](docs/db-design.md)
- [API設計](docs/api-design.md)

## 📷 画面イメージ
画面イメージはフロントエンドリポジトリに掲載しています。
- [book-app-frontend]
   (https://github.com/ryo-mantani/book-app-frontend/docs/images)
---

## ディレクトリ構成
book-app
├─ src
├─ docs
└─ README.md

## 📷 将来的に実装したい機能

- スマホカメラでのバーコード読み取り
- グラフ表示
- レスポンシブ対応
- ログイン機能
- クラウド公開
---

## 🚀 開発予定

### Phase 1 ✅
- CRUD機能
- DB接続
- 一覧画面作成

### Phase 2 ✅
- React化
- API連携
- React CRUD対応

### Phase 3
- UI改善
- 検索機能
- 表紙画像対応
- デプロイ
---

## 💡 工夫したいポイント

- 「積読管理」に特化した設計
- シリーズ単位での管理
- 可視化による読書状況分析
- 実用性を意識したUI設計
