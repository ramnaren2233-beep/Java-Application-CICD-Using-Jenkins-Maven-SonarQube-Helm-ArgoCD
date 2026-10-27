# Java Application CI/CD Using Jenkins, Maven, SonarQube, Docker, Helm & Argo CD

## 1. Project Overview

This project demonstrates a production-oriented CI/CD workflow for a Java application using Jenkins for Continuous Integration, SonarQube for code quality, Docker for containerization, Helm for Kubernetes packaging, and Argo CD for GitOps-based Continuous Deployment.

The project is completed in **13 tasks**. Each task has its own documentation file and screenshot folder, linked below.

## 2. Architecture

```text
GitHub
   |
   v
Jenkins Pipeline
   |
   v
Maven Build and Test
   |
   v
SonarQube Analysis
   |
   v
Docker Image Build
   |
   v
Docker Hub (Versioned Image)
   |
   v
Update Helm Chart values.yaml
   |
   v
Git Commit and Push
   |
   v
Argo CD (Synced and Healthy)
   |
   v
Kubernetes Deployment
   |
   v
Running Java Application
```

> Jenkins handles Continuous Integration. Argo CD handles Continuous Deployment. Jenkins does not deploy directly using `kubectl`.

## 3. Submission Requirements and URLs

| S.No | Requirement | URL |
|---:|---|---|
| 1 | GitHub Repository | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD.git |
| 2 | Java Application | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-04/src/main/java/com/example/App.java |
| 3 | Maven pom.xml | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-02/pom.xml |
| 4 | Dockerfile | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-04/Dockerfile |
| 5 | Jenkinsfile | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-09/Task-09/Jenkinsfile |
| 6 | Helm Chart | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-10/Chart.yaml |
| 7 | Argo CD Configuration | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-08/Task-08/argocd-application.yaml |
| 8 | Kubernetes Configuration | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-10/deployment.yaml |
| 9 | Container Registry | https://hub.docker.com/r/naren2026aws/task10-java-app/tags |
| 10 | SonarQube / CI Job Reference | http://54.173.142.117:8080/job/Task9-Java-CI-Pipeline/ |
| 11 | README.md | https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/README.md |
| 12 | Application URL | http://98.81.154.45:8080/ |

## 4. Task Documentation and Screenshots

Click a task name to open its documentation. Click **Screenshots** to open its evidence folder.

| S.No | Task | Documentation | Screenshots | Status |
|---:|---|---|---|---|
| 1 | Java Application | [README](Task-01/README.md) | [Screenshots](Task-01/screenshots) | ✅ Completed |
| 2 | Maven Build & Test | [README](Task-02/README.md) | [Screenshots](Task-02/screenshots) | ✅ Completed |
| 3 | SonarQube | [README](Task-03/README.md) | [Screenshots](Task-03/screenshots) | ✅ Completed |
| 4 | Docker | [README](Task-04/README.md) | [Screenshots](Task-04/screenshots) | ✅ Completed |
| 5 | Container Registry | [README](Task-05/README.md) | [Screenshots](Task-05/screenshots) | ✅ Completed |
| 6 | Helm | [README](Task-06/README.md) | [Screenshots](Task-06/screenshots) | ✅ Completed |
| 7 | Kubernetes | [README](Task-07/README.md) | [Screenshots](Task-07/screenshots) | ✅ Completed |
| 8 | Argo CD | [README](Task-08/README.md) | [Screenshots](Task-08/screenshots) | ✅ Completed |
| 9 | Jenkins CI Pipeline | [README](Task-09/README.md) | [Screenshots](Task-09/screenshots) | ✅ Completed |
| 10 | Jenkins → Argo CD GitOps | [README](Task-10/README.md) | [Screenshots](Task-10/screenshots) | ✅ Completed |
| 11 | Secrets & Security | [README](Task-11/README.md) | [Screenshots](Task-11/screenshots) | ✅ Completed |
| 12 | Deployment & Rollback | [README](Task-12/README.md) | [Screenshots](Task-12/screenshots) | ✅ Completed |
| 13 | Monitoring & Logging | [README](Task-13/README.md) | [Screenshots](Task-13/screenshots) | ✅ Completed |

## 5. Project Tree (Click to Open)

- 📁 **Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD**
  - 📁 [Task-01 — Java Application](Task-01)
    - 📄 [README.md](Task-01/README.md)
    - 🖼️ [screenshots](Task-01/screenshots)
  - 📁 [Task-02 — Maven Build & Test](Task-02)
    - 📄 [README.md](Task-02/README.md)
    - 📄 [pom.xml](Task-02/pom.xml)
    - 🖼️ [screenshots](Task-02/screenshots)
  - 📁 [Task-03 — SonarQube](Task-03)
    - 📄 [README.md](Task-03/README.md)
    - 🖼️ [screenshots](Task-03/screenshots)
  - 📁 [Task-04 — Docker](Task-04)
    - 📄 [README.md](Task-04/README.md)
    - 📄 [Dockerfile](Task-04/Dockerfile)
    - ☕ [App.java](Task-04/src/main/java/com/example/App.java)
    - 🖼️ [screenshots](Task-04/screenshots)
  - 📁 [Task-05 — Container Registry](Task-05)
    - 📄 [README.md](Task-05/README.md)
    - 🖼️ [screenshots](Task-05/screenshots)
  - 📁 [Task-06 — Helm](Task-06)
    - 📄 [README.md](Task-06/README.md)
    - 🖼️ [screenshots](Task-06/screenshots)
  - 📁 [Task-07 — Kubernetes](Task-07)
    - 📄 [README.md](Task-07/README.md)
    - 🖼️ [screenshots](Task-07/screenshots)
  - 📁 [Task-08 — Argo CD](Task-08)
    - 📄 [README.md](Task-08/README.md)
    - 📄 [argocd-application.yaml](Task-08/Task-08/argocd-application.yaml)
    - 🖼️ [screenshots](Task-08/screenshots)
  - 📁 [Task-09 — Jenkins CI Pipeline](Task-09)
    - 📄 [README.md](Task-09/README.md)
    - 📄 [Jenkinsfile](Task-09/Task-09/Jenkinsfile)
    - 🖼️ [screenshots](Task-09/screenshots)
  - 📁 [Task-10 — Jenkins → Argo CD GitOps](Task-10)
    - 📄 [README.md](Task-10/README.md)
    - 📄 [Chart.yaml](Task-10/Chart.yaml)
    - 📄 [deployment.yaml](Task-10/deployment.yaml)
    - 🖼️ [screenshots](Task-10/screenshots)
  - 📁 [Task-11 — Secrets & Security](Task-11)
    - 📄 [README.md](Task-11/README.md)
    - 🖼️ [screenshots](Task-11/screenshots)
  - 📁 [Task-12 — Deployment & Rollback](Task-12)
    - 📄 [README.md](Task-12/README.md)
    - 🖼️ [screenshots](Task-12/screenshots)
  - 📁 [Task-13 — Monitoring & Logging](Task-13)
    - 📄 [README.md](Task-13/README.md)
    - 🖼️ [screenshots](Task-13/screenshots)
  - 📄 [README.md](README.md)

## 6. Technologies Used

| S.No | Technology | Purpose | Status |
|---:|---|---|---|
| 1 | Java 21 | Application implementation | ✅ Completed |
| 2 | Maven | Build and dependency management | ✅ Completed |
| 3 | Jenkins | CI pipeline automation | ✅ Completed |
| 4 | SonarQube | Static code analysis | ✅ Completed |
| 5 | Docker | Application containerization | ✅ Completed |
| 6 | Docker Hub | Container image registry | ✅ Completed |
| 7 | Helm | Kubernetes package management | ✅ Completed |
| 8 | Kubernetes | Container orchestration | ✅ Completed |
| 9 | Argo CD | GitOps-based deployment synchronization | ✅ Completed |
| 10 | GitHub | Source code and configuration version control | ✅ Completed |

## 7. Final Checklist

| S.No | Task | Status |
|---:|---|---|
| 1 | Task 01: Java Application | ✅ Completed |
| 2 | Task 02: Maven Build & Test | ✅ Completed |
| 3 | Task 03: SonarQube | ✅ Completed |
| 4 | Task 04: Docker | ✅ Completed |
| 5 | Task 05: Container Registry | ✅ Completed |
| 6 | Task 06: Helm | ✅ Completed |
| 7 | Task 07: Kubernetes | ✅ Completed |
| 8 | Task 08: Argo CD | ✅ Completed |
| 9 | Task 09: Jenkins CI Pipeline | ✅ Completed |
| 10 | Task 10: Jenkins → Argo CD GitOps | ✅ Completed |
| 11 | Task 11: Secrets & Security | ✅ Completed |
| 12 | Task 12: Deployment & Rollback | ✅ Completed |
| 13 | Task 13: Monitoring & Logging | ✅ Completed |

**Java Application CI/CD Project — All 13 Tasks Completed Successfully!** ✅
