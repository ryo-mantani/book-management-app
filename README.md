# 本管理アプリ

## 📌 概要
漫画・書籍を管理するためのWebアプリです。

積読管理や未読率の可視化、シリーズ管理などを通して、  
「買ったのに読んでいない本」を管理できることを目的としています。

以下の点を意識して作成しました。
- Java / Web開発の学習
- バックエンド～フロントエンドまでの実装経験
- 実務を意識したCRUDアプリ開発
- API連携やDB設計の学習
---

## 現在の状態
React フロントエンドから Spring Boot REST API に通信し、  
PostgreSQL に保存された本データの CRUD（登録・一覧表示・更新・削除）機能を実装済みです。

また、React の useState・useEffect を利用した状態管理を行い、  
削除モード・更新モード・検索モードの切替UIを実装しています。

更新モードではカード選択による編集機能を実装し、  
選択状態の可視化やモード変更時の状態リセット処理にも対応しています。

検索機能ではタイトル・著者による部分一致検索を実装し、  
Spring Boot REST API と連携した検索結果表示を行っています。

一覧画面はカード型レイアウトで構成し、  
CSSによるUI改善およびユーザビリティ向上を継続しています。

## 💡 工夫したポイント
- Controller / Service / Repository の責務分離
- DTOによるAPI入出力とEntityの分離
- Validationによる入力チェック
- GlobalExceptionHandlerによるエラーレスポンス統一
- ReactフロントエンドとのREST API連携（CORS設定を含む）

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
- タイトル・著者による部分一致検索
- モード切替UI
  - 削除モード
  - 更新モード
  - 検索モード
- カード型レイアウトUI
- カード選択による編集機能
- fetch API通信
- useState・useEffectによる状態管理

---

## 🚀 今後実装予定
- 表紙画像対応
- 積読管理
- 未読率表示
- シリーズ管理
- バーコード読み取り
- 書籍API連携
- 最新刊との差分表示
- 巻数抜けチェック
- グラフ表示
- レスポンシブ対応
- ログイン機能

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
- [book-app-frontend](https://github.com/ryo-mantani/book-app-frontend)
---


