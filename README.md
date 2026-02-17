# 💸 Expense API - Gestion de dépenses

API REST robuste pour la gestion de finances personnelles, construite avec **Spring Boot 3**, **Docker** et **PostgreSQL**.

## 🚀 Démo Live
- **API URL :** [https://expense-mhsg.onrender.com/api/expenses](https://expense-mhsg.onrender.com/api/expenses)
- **Base de données :** PostgreSQL (Hébergé sur Neon.tech)

## 🛠 Stack Technique
- **Backend :** Java 17, Spring Boot 3, Spring Data JPA
- **Base de données :** PostgreSQL
- **DevOps :** Docker, GitHub Actions (CI/CD), Render
- **Architecture :** RESTful API, Déploiement conteneurisé

## 📦 Installation & Docker
Si vous avez Docker, vous pouvez lancer le projet localement en une ligne :
```bash
docker build -t expense-api .
docker run -p 9080:9080 expense-api