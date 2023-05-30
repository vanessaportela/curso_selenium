# Qazando Web Test Automation

Projeto de automação de testes web com selenium + java do curso https://www.udemy.com/course/automacao-de-testes-com-selenium-webdriver-e-java/

## 🚀 Começando

- git clone https://github.com/vanessaportela/seleniumTest.git

### 📋 Pré-requisitos

- JDK 8 (Java Development Kit)
- IntelliJ IDEA CE (Community Edition)


## ⚙️ Executando os testes

comando:
```
mvn test -Dtest=**/*RunCucumberTest cluecumber-report:reporting
```
executar somente um cenário:

```
 mvn test -Dtest=RunCucumberTest -D"cucumber.options=--tags @teste-falha" cluecumber-report:reporting
```

## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* Selenium WebDriver - O framework usado
* [Maven](https://maven.apache.org/) - Gerente de Dependência


