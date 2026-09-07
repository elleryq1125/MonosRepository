# 在庫管理システム「monos」

## 1. ポートフォリオについて
本ポートフォリオは、業務でマネジメント・プロジェクト推進を担当する中でも、継続して技術力を身に付けることを目的として個人開発した在庫管理システムです。

Java/Spring BootによるWebアプリケーション開発に加え、AWSへのデプロイ、Dockerによるコンテナ化、GitHub ActionsによるCI/CDなど、アプリ開発からインフラ・運用まで一通り実践しました。

## 2. デモ
🌐 **デモサイト**

https://monos-app.com

※1 デモ環境では、あらかじめサンプルデータを登録しています。

※2 デモ環境のため、ログインユーザーの新規登録・追加機能は停止しています。

## 3. システム概要
商品・倉庫の登録、在庫管理・入出庫予定・実績などを管理する在庫管理システムです。

実際の業務システムを想定し、単純なCRUDだけではなく、在庫数量の整合性や入出庫に伴う状態変更などを考慮して設計しています。

## 4. 主な機能
- ユーザー認証
- 商品管理
- 倉庫管理
- 入庫予定・実績管理
- 出庫予定・実績管理
- 在庫管理
  
## 5. 画面イメージ
<img width="480" height="255" alt="image" src="https://github.com/user-attachments/assets/1e631d07-280c-43cb-95c4-d62a765708fe" />
<br>
<img width="480" height="255" alt="image" src="https://github.com/user-attachments/assets/0fe4aeca-69c1-49bc-869a-3f0cef4dcb77" />
<img width="480" height="255" alt="image" src="https://github.com/user-attachments/assets/5d536e40-ae14-4dab-b467-ea1055004217" />
<br>
<img width="480" height="255" alt="image" src="https://github.com/user-attachments/assets/1ca092e5-6e02-4bf8-89de-c26a8fc44b28" />
<img width="480" height="255" alt="image" src="https://github.com/user-attachments/assets/42a92e39-207c-4801-ab1f-0a7e0e6a2310" />
<br>
<img width="480" height="255" alt="image" src="https://github.com/user-attachments/assets/4a11a839-3db9-49ca-9ac8-8e82458d2005" />
<img width="480" height="255" alt="image" src="https://github.com/user-attachments/assets/ef769adc-4e5d-4d6c-aa1f-1b76303db792" />
<br>
<img width="480" height="255" alt="image" src="https://github.com/user-attachments/assets/9e35aa9f-1963-4eec-88e6-dfff0891ad02" />

## 6. システム構成
<img width="1536" height="1024" alt="ChatGPT Image 2026年9月7日 23_08_11" src="https://github.com/user-attachments/assets/1c1a2a6a-727c-43b8-a578-89d405ccf4b4" />

## 7. 技術スタック
| 分類 | 技術 |
|---|---|
| Backend | Java / Spring Boot |
| Frontend | Thymeleaf / JavaScript |
| Database | PostgreSQL |
| ORM / SQL | MyBatis |
| Migration | Flyway |
| Build | Gradle |
| Test | JUnit 5 / Mockito |
| Container | Docker |
| Infrastructure | AWS |
| CI/CD | GitHub Actions |
| Repository | GitHub |

## 8. 技術的な取り組み
### ①未経験技術を活用した開発
実務では利用経験のなかったSpring Boot、JUnit 5、Mockito、H2、Flywayなどを採用し、技術調査から設計・実装まで一通り実施。
Spring BootによるWebアプリケーション開発に加え、JUnit 5・Mockitoによる単体テスト、H2を利用したDBテスト、FlywayによるDBマイグレーション管理まで実践した。

### ②AWSの環境構築・公開
AWS上にアプリケーションの実行環境を構築し、VPC、ALB、ECS/Fargate、RDSなどを利用して、Webアプリケーションを実際に公開。
ECS・RDSのPrivate Subnet配置やSecrets Managerによる認証情報管理など、セキュリティを考慮した構成とした。

### ③CI/CD
GitHub Actionsを利用し、ビルド・テスト・Dockerイメージの作成・ECRへのPushまでを自動化。
AWSへの認証にはOIDCを利用し、GitHub ActionsからAWSリソースへ安全にアクセスできる構成とした。

## 9. 今後の改善
- 権限管理の高度化
- 操作ログ・監査ログの充実
- テストカバレッジの向上
- インフラ構成のコード化
- 在庫予測などの機能追加
