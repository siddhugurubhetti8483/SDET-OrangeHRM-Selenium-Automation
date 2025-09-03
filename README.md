# OrangeHRM Selenium Automation Project

## Project Goal

This project demonstrates manual and automated testing of the OrangeHRM demo application .

Automation is implemented using Selenium WebDriver with Java, TestNG, and Page Object Model (POM).
The project covers functional, regression, and data-driven testing scenarios for HR modules such as
Login, Employee Management (PIM), Leave, and Admin.

---

- **OrangeHRM Demo URL:** [https://opensource-demo.orangehrmlive.com](https://opensource-demo.orangehrmlive.com/web/index.php/auth/login)

---

## Technology Stack

- **Language:** Java
- **UI Automation:** Selenium WebDriver
- **Test Framework:** TestNG
- **Reporting:** Extent Reports / Allure Reports
- **Dependency Management & Build:** Maven
- **Browser Management:** WebDriverManager
- **CI/CD:** Jenkins (optional)
- **Version Control:** Git & GitHub

---

## Project Structure

```
OrangeHRM-Selenium-Automation/
│
├── src/main/java/
│   ├── pages/          # Page classes (LoginPage, DashboardPage, etc.)
│   ├── utils/          # Utility files (ExcelReader, ConfigReader, etc.)
│
├── src/test/java/
│   ├── tests/          # Test classes (LoginTest, PIMTest, LeaveTest, etc.)
│
├── testdata/           # Test data files (Excel/CSV)
├── reports/            # Extent/Allure reports
├── screenshots/        # Screenshots on test failure
├── pom.xml             # Maven dependencies
└── README.md

```

---

## Pre-requisites

- Install Java JDK 17
- Install [Eclipse/IntelliJ IDEA/VS Code]
- Install [TestNG plugin]
- Maven installed
- Browser (Chrome/Firefox/Edge)
- Git

---

## Configuration

All configurable values are present in:
`src/test/resources/config.properties`

```properties
base.url=https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
admin.username=Admin
admin.password=admin123
timeout=10
browser=chrome
```

## Key Features

- **Login Module →** Valid, Invalid, Empty credentials.
- **Dashboard Module →** Widgets, navigation, logout.
- **PIM Module →** Add/Search/Edit/Delete employee.
- **Leave Module →** Apply leave, validate balance, reject past dates.
- **Admin Module →** Add/Edit/Delete users, role assignment.
- **Reporting:** Detailed HTML reports + screenshots on failure
- **Thread-safe TestContext:** For sharing data across tests

---

## Installation & Setup

```
# Clone repository
git clone: https://github.com/siddhugurubhetti8483/SDET-OrangeHRM-Selenium-Automation.git

# Go to project folder
cd OrangeHRM-Selenium

# Install dependencies
mvn clean install
```

## How to Run Tests

### Run all tests using Maven:

```
mvn test
```

### Run specific test class

```
mvn -Dtest=LoginTest test
```

### Run with TestNG suite file

```
mvn clean test -DsuiteXmlFile=testng.xml
```

## Test Reports

- **ExtentReports (HTML):** `target/extent-report.html`
- **Cucumber (Console & Summary):** printed in console

- Screenshots of test failures are stored in: `target/screenshots/<testMethodName>.png`

---

- CI/CD pipeline integration with Jenkins
- Docker & Selenium Grid for distributed testing
- Integration with Allure Reports
- API testing integration (RestAssured)
