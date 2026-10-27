# Task 10: Jenkins → Argo CD GitOps

## Objective
To implement a GitOps-based CI/CD workflow using Jenkins, Maven, Docker, Docker Hub, GitHub, Helm, Argo CD, and Kubernetes, where Jenkins handles Continuous Integration and Argo CD handles Continuous Deployment.

## Architecture

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
Docker Hub
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
Running Application Pod
```

## Implementation Summary

| S.No | What I Did | Status |
|---:|---|---|
| 1 | Checked out source code from GitHub | ✅ Completed |
| 2 | Located the Java project in the repository | ✅ Completed |
| 3 | Built and tested the Java application using Maven | ✅ Completed |
| 4 | Integrated SonarQube code analysis | ✅ Completed |
| 5 | Built the Docker image | ✅ Completed |
| 6 | Pushed the Docker image to Docker Hub | ✅ Completed |
| 7 | Configured the Helm chart for the Kubernetes deployment | ✅ Completed |
| 8 | Updated the Task 10 Helm chart `values.yaml` image tag | ✅ Completed |
| 9 | Committed and pushed the GitOps configuration change to GitHub | ✅ Completed |
| 10 | Configured Argo CD to monitor the Git repository | ✅ Completed |
| 11 | Verified Argo CD application status as Synced and Healthy | ✅ Completed |
| 12 | Verified the Kubernetes deployment and running pod | ✅ Completed |

## Screenshot

| S.No | Screenshot File Name | Status |
|---:|---|---|
| 1 | `Task10-01-Jenkins-Pipeline-Success.png` | ✅ Completed |
| 2 | `Task10-02-Maven-Build-Test.png` | ✅ Completed |
| 3 | `Task10-03-SonarQube-Analysis.png` | ✅ Completed |
| 4 | `Task10-04-Docker-Image-Build.png` | ✅ Completed |
| 5 | `Task10-05-DockerHub-Push.png` | ✅ Completed |
| 6 | `Task10-06-GitOps-Commit-Push.png` | ✅ Completed |
| 7 | `Task10-07-GitHub-Helm-Values.png` | ✅ Completed |
| 8 | `Task10-08-ArgoCD-Synced-Healthy.png` | ✅ Completed |
| 9 | `Task10-09-Kubernetes-Deployment.png` | ✅ Completed |
| 10 | `Task10-10-Kubernetes-Pod-Running.png` | ✅ Completed |
| 11 | `Task10-11-Application-Logs.png` | ✅ Completed |

## Final Result

| S.No | Result | Status |
|---:|---|---|
| 1 | Jenkins CI pipeline built and tested the Java application | ✅ Completed |
| 2 | SonarQube code analysis completed | ✅ Completed |
| 3 | Docker image built and pushed to Docker Hub | ✅ Completed |
| 4 | Helm chart configured and image tag updated in `values.yaml` | ✅ Completed |
| 5 | GitOps deployment configuration pushed to GitHub | ✅ Completed |
| 6 | Argo CD application Sync Status: **Synced** | ✅ Completed |
| 7 | Argo CD application Health Status: **Healthy** | ✅ Completed |
| 8 | Kubernetes deployment running with 1/1 ready pod | ✅ Completed |

**Task 10 Completed Successfully!** ✅
