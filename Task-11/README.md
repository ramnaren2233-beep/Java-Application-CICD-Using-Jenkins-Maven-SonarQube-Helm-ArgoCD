# Task 11: Secrets & Security

## Objective
Implement basic security practices for the Java Application CI/CD project using Jenkins, Docker, Kubernetes Secrets, and Helm.

## Implementation Summary

| S.No | What I Did | Status |
|---:|---|---|
| 1 | Stored Jenkins credentials securely using Jenkins Credentials | ✅ Completed |
| 2 | Used Jenkins `withCredentials` to access stored credentials without hardcoding passwords or tokens | ✅ Completed |
| 3 | Reviewed Helm `values.yaml` for hardcoded credentials | ✅ Completed |
| 4 | Created Kubernetes Secret `task11-app-secrets` in the `task10` namespace | ✅ Completed |
| 5 | Verified that the application container runs as a non-root user (`appuser`, UID 100) | ✅ Completed |
| 6 | Disabled automatic mounting of the Kubernetes ServiceAccount token | ✅ Completed |
| 7 | Created ServiceAccount `task11-app-sa` | ✅ Completed |
| 8 | Checked application deployment status | ✅ Completed |
| 9 | Captured security configuration and application evidence screenshots | ✅ Completed |

## Screenshot

| S.No | Screenshot File Name | Status |
|---:|---|---|
| 1 | `Task11-01-Kubernetes-Secret.png` | ✅ Completed |
| 2 | `Task11-02-ServiceAccount.png` | ✅ Completed |
| 3 | `Task11-03-NonRoot-Container.png` | ✅ Completed |
| 4 | `Task11-04-Jenkins-Credentials.png` | ✅ Completed |
| 5 | `Task11-05-GitHub-Security.png` | ✅ Completed |
| 6 | `Task11-06-App-Running.png` | ✅ Completed |

## Final Status

| S.No | Result | Status |
|---:|---|---|
| 1 | Jenkins credentials stored and accessed securely | ✅ Completed |
| 2 | Helm `values.yaml` reviewed with no hardcoded credentials | ✅ Completed |
| 3 | Kubernetes Secret and ServiceAccount created | ✅ Completed |
| 4 | Application container running as a non-root user | ✅ Completed |
| 5 | ServiceAccount token auto-mounting disabled | ✅ Completed |
| 6 | Application deployment running with 1/1 Ready | ✅ Completed |

**Task 11 Completed Successfully!** ✅
