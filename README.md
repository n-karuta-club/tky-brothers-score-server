# tky-brothers-score-server

## 使用技術
- Java8
- Gradle
- Spring Boot

## jarの作成
```
gradle build
```

## データベースについて
PostreSQLとH2のどちらかを選択してお使いいただけます。
初期設定ではH2を利用するようにしています。
PostgreSQLに切り替えたい場合は、`src/main/resources/application.properties`にて設定を変更してください。

## エンドポイント

|エンドポイント|役割|
|----------|---|
|GET: /|スコアボードの表示|
|GET: /api/score|スコアの提供|
|POST: /api/score|スコアの登録|
