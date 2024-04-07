# pollo-twgcb-web

* 當最新前版本: develop 開發規劃中

## 轉體開發週期規劃

* 版本規格: [featureVersion].[bugFixVersion]
    * featureVersion: 每次功能異動增加，則版本號加一
    * bugFixVersion: 每修復一個錯誤，則版本號加一

### branch 規劃

* Develop: 功能開發
  * 定義及開發，確定之後 featureVersion 加一
* Alpha: 功能確定，進行 白箱測試、黑箱測試 
* Beta: 僅修復bug
  * 修復 發布後的 bug, 修復完成後 bugFixVersion 加一
* master: 當前主要版本
* version: 發布定案

## 開發規則
 
### git commit message

git commit 敘述樣式

```
Header: <type>(<scope>): <subject>
Body
```

* **Header**
- type: 代表 commit 的類別：feat, fix, docs, style, refactor, test, chore，必要欄位。
- scope 代表 commit 影響的範圍，例如資料庫、控制層、模板層等等，為可選欄位。
- subject 代表此 commit 的簡短描述，不要超過 50 個字元，結尾不要加句號，為必要欄位。

* **Body**
- 詳細文字敘述

### style

* 小駝峰式命名

## 軟體框架

基於下列環境下進行開發

* 框架: Grails 6.1
* Java version: 17
* DB: postgresql 14
* OS: Debian 12

### Grails 框架說明文件

#### Grails 6.1.2 Documentation

- [User Guide](https://docs.grails.org/6.1.2/guide/index.html)
- [API Reference](https://docs.grails.org/6.1.2/api/index.html)
- [Grails Guides](https://guides.grails.org/index.html)
---

#### Feature scaffolding documentation

- [Grails Scaffolding Plugin documentation](https://grails.github.io/scaffolding/latest/groovydoc/)

- [https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html](https://grails-fields-plugin.github.io/grails-fields/latest/guide/index.html)

#### Feature asset-pipeline-grails documentation

- [Grails Asset Pipeline Core documentation](https://www.asset-pipeline.com/manual/)

