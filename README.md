# Jenkins Shared Library

This repository contains a Jenkins Shared Library used to store reusable pipeline functions, steps, and utilities for Jenkins Pipelines.

## 📁 Structure

```
.
├── vars/          # Global pipeline functions
├── src/           # Groovy classes & helpers
├── resources/     # Templates / configs
└── README.md
```

## ⚙️ Usage

Add this library in:

**Manage Jenkins → Configure System → Global Pipeline Libraries**

```
Name: my-shared-lib
Default Version: main
Repo URL: https://github.com/vikastiwari8090/<repo-name>.git
```

## 🧪 Example Jenkinsfile

```groovy
@Library('my-shared-lib') _

pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                exampleStep()
            }
        }
    }
}
```

## 📌 var Function Example

`vars/exampleStep.groovy`

```groovy
def call() {
    echo "Running example shared library step!"
}
```

---

## 📄 License

MIT License.
