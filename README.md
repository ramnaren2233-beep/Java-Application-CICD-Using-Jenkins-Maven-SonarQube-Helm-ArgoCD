# Java-Application-CI/CD-Using-Jenkins-Maven-SonarQube-Docker-Helm & Argo-CD

## 1. Project Overview

A production-oriented Java Application CI/CD workflow using Jenkins, Maven, SonarQube, Docker, Docker Hub, Helm, Kubernetes and Argo CD (GitOps).

| Field | Details |
|---|---|
| Project Name | Java Application CI/CD Using Jenkins, Maven, SonarQube, Helm & Argo CD |
| Tools Used | Java 21, Maven, Jenkins, SonarQube, Docker, Docker Hub, Helm, Kubernetes, Argo CD, GitHub |
| Application Architecture | Java Application → Docker Image → Helm Chart → Kubernetes |
| CI/CD Pipeline | GitHub → Jenkins → Maven Build & Test → SonarQube → Docker Build → Docker Hub → Helm values update → Argo CD → Kubernetes |
| GitHub Repository | [Open Project Repository](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD) |
| Application URL | [Open Java Application](http://98.81.154.45:8080/) |
| Final Submission | Task README, Screenshots and Execution Evidence |

> Jenkins handles Continuous Integration. Argo CD handles Continuous Deployment. Jenkins does not deploy directly using `kubectl`.

## 2. Project Tree Flow (Task 01–13)

```text
📦 Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD
│
├── 📄 README.md
│
├── 🏗️ PHASE 1: Application & Build
│   ├── 📂 Task-01 - Java Application
│   ├── 📂 Task-02 - Maven Build & Test
│   └── 📂 Task-03 - SonarQube
│
├── 🐳 PHASE 2: Containerization & Registry
│   ├── 📂 Task-04 - Docker
│   └── 📂 Task-05 - Container Registry
│
├── ☸️ PHASE 3: Kubernetes & GitOps
│   ├── 📂 Task-06 - Helm
│   ├── 📂 Task-07 - Kubernetes
│   └── 📂 Task-08 - Argo CD
│
├── 🚀 PHASE 4: CI/CD Automation
│   ├── 📂 Task-09 - Jenkins CI Pipeline
│   └── 📂 Task-10 - Jenkins → Argo CD GitOps
│
└── 🔐 PHASE 5: Security & Operations
    ├── 📂 Task-11 - Secrets & Security
    ├── 📂 Task-12 - Deployment & Rollback
    └── 📂 Task-13 - Monitoring & Logging
```

## 3. Task README & Screenshots

| S.No | Task Topic | README Link | Screenshot Link |
|---:|---|---|---|
| 01 | Java Application | [Task 01 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-01/README.md) | [Task 01 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-01/Screenshots) |
| 02 | Maven Build & Test | [Task 02 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-02/README.md) | [Task 02 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-02/Screenshots) |
| 03 | SonarQube | [Task 03 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-03/README.md) | [Task 03 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-03/Screenshots) |
| 04 | Docker | [Task 04 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-04/README.md) | [Task 04 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-04/Screenshots) |
| 05 | Container Registry | [Task 05 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-05/README.md) | [Task 05 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-05/Screenshots) |
| 06 | Helm | [Task 06 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-06/README.md) | [Task 06 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-06/Screenshots) |
| 07 | Kubernetes | [Task 07 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-07/README.md) | [Task 07 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-07/Screenshots) |
| 08 | Argo CD | [Task 08 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-08/README.md) | [Task 08 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-08/Screenshots) |
| 09 | Jenkins CI Pipeline | [Task 09 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-09/README.md) | [Task 09 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-09/Screenshots) |
| 10 | Jenkins → Argo CD GitOps | [Task 10 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-10/README.md) | [Task 10 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-10/Screenshots) |
| 11 | Secrets & Security | [Task 11 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-11/README.md) | [Task 11 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-11/Screenshots) |
| 12 | Deployment & Rollback | [Task 12 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-12/README.md) | [Task 12 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-12/Screenshots) |
| 13 | Monitoring & Logging | [Task 13 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-13/README.md) | [Task 13 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-13/Screenshots) |

## 4. Key Project Files

| S.No | Requirement | File Link |
|---:|---|---|
| 01 | Java Application | [App.java](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-04/src/main/java/com/example/App.java) |
| 02 | Maven Build File | [pom.xml](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-02/pom.xml) |
| 03 | Dockerfile | [Dockerfile](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-04/Dockerfile) |
| 04 | Jenkins Pipeline | [Jenkinsfile](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-09/Task-09/Jenkinsfile) |
| 05 | Helm Chart | [Chart.yaml](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-10/Chart.yaml) |
| 06 | Kubernetes Deployment | [deployment.yaml](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-10/deployment.yaml) |
| 07 | Argo CD Application | [argocd-application.yaml](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-08/Task-08/argocd-application.yaml) |
| 08 | Container Registry | [Docker Hub Image Tags](https://hub.docker.com/r/naren2026aws/task10-java-app/tags) |
| 09 | Jenkins CI Job | [Open Jenkins Job](http://54.173.142.117:8080/job/Task9-Java-CI-Pipeline/) |

## 5. CI/CD Pipeline Flow

```text
Developer Pushes Code to GitHub
             │
             ▼
       Jenkins Pipeline
             │
             ▼
     Maven Build & Test
             │
             ▼
      SonarQube Analysis
             │
             ▼
        Docker Build
             │
             ▼
 Docker Hub (Versioned Image)
             │
             ▼
  Update Helm values.yaml
             │
             ▼
    Git Commit and Push
             │
             ▼
 Argo CD (Synced and Healthy)
             │
             ▼
  Kubernetes Deployment
             │
             ▼
  Running Java Application
```

## 6. Security (Important)

Security evidence is documented in [Task 11 README](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/blob/main/Task-11/README.md) and [Task 11 Screenshots](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD/tree/main/Task-11/Screenshots).

| S.No | Security Area | Practice |
|---:|---|---|
| 01 | Credentials | Docker Hub, GitHub and SonarQube tokens are stored in Jenkins Credentials, never in code or Jenkinsfile |
| 02 | Secrets | No passwords, tokens or keys are committed to the GitHub repository |
| 03 | Kubernetes Secrets | Sensitive values are kept in Kubernetes Secrets, not in plain values.yaml |
| 04 | Deployment Control | Jenkins does not deploy with `kubectl`; only Argo CD deploys from Git |
| 05 | Image Versioning | Every image is pushed with a unique version tag, not only `latest` |
| 06 | Code Quality | SonarQube analysis runs on every pipeline execution |
| 07 | Evidence Safety | Passwords, tokens and secrets are masked in all screenshots |

## 7. Application URL

| Item | Link / Details |
|---|---|
| Live Application | [Open Java Application](http://98.81.154.45:8080/) |
| Project Repository | [Open GitHub Repository](https://github.com/ramnaren2233-beep/Java-Application-CICD-Using-Jenkins-Maven-SonarQube-Helm-ArgoCD) |

The live endpoint depends on the AWS infrastructure remaining active. Keep screenshots of the application from the time it was running.

## 8. Technologies Used

| S.No | Technology | Purpose | Status |
|---:|---|---|---|
| 01 | Java 21 | Application implementation | ✅ Completed |
| 02 | Maven | Build and dependency management | ✅ Completed |
| 03 | Jenkins | CI pipeline automation | ✅ Completed |
| 04 | SonarQube | Static code analysis | ✅ Completed |
| 05 | Docker | Application containerization | ✅ Completed |
| 06 | Docker Hub | Container image registry | ✅ Completed |
| 07 | Helm | Kubernetes package management | ✅ Completed |
| 08 | Kubernetes | Container orchestration | ✅ Completed |
| 09 | Argo CD | GitOps-based deployment synchronization | ✅ Completed |
| 10 | GitHub | Source code and configuration version control | ✅ Completed |

## 9. Final Submission Checklist

| S.No | Requirement | Evidence | Status |
|---:|---|---|---|
| 01 | Java Application | Application source and output screenshot | ✅ Completed |
| 02 | Maven Build & Test | Build and test results | ✅ Completed |
| 03 | SonarQube | Analysis and Quality Gate evidence | ✅ Completed |
| 04 | Docker | Image build and container run evidence | ✅ Completed |
| 05 | Container Registry | Versioned image in Docker Hub | ✅ Completed |
| 06 | Helm | Chart and values evidence | ✅ Completed |
| 07 | Kubernetes | Deployment, pods and service evidence | ✅ Completed |
| 08 | Argo CD | Synced and Healthy application evidence | ✅ Completed |
| 09 | Jenkins CI Pipeline | Pipeline execution evidence | ✅ Completed |
| 10 | Jenkins → Argo CD GitOps | values.yaml update and auto-sync evidence | ✅ Completed |
| 11 | Secrets & Security | Credentials and secret handling evidence | ✅ Completed |
| 12 | Deployment & Rollback | Rollout and rollback evidence | ✅ Completed |
| 13 | Monitoring & Logging | Metrics and application logs | ✅ Completed |

**Project: Java Application CI/CD Using Jenkins, Maven, SonarQube, Docker, Helm & Argo CD — All 13 Tasks Completed**
