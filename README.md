# tky-brothers-score-server

## jarの作成
```
gradle build
```

## データベースについて
PostreSQLとH2のどちらかを選択してお使いいただけます。
初期設定ではH2を利用するようにしています。
PostgreSQLに切り替えたい場合は、`src/main/resources/application.properties`にて設定を変更してください。
