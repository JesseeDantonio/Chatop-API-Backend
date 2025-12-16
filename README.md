# 🚀 ChaTop API – Back-end (Spring Boot)

Back-end Java Spring Boot de l’application de location immobilière développée pour le **projet n°3 OpenClassrooms**.  
Cette API REST expose toutes les fonctionnalités métier nécessaires au front-end Angular : gestion des utilisateurs, des logements et des échanges entre locataires et propriétaires.

---

## ✨ Fonctionnalités clés

- **Authentification & gestion des utilisateurs** (inscription, connexion, consultation du profil).
- **CRUD logements** : création, listing, consultation détaillée.
- **Messagerie** : envoi de messages aux propriétaires depuis une fiche logement.
- **Connexion sécurisée** avec le front-end (JWT/headers, CORS, etc.).
- **Documentation OpenAPI / Swagger** pour tester rapidement les endpoints.

---

## 🧱 Stack technique

| Couche     | Outils / Frameworks                     |
|------------|-----------------------------------------|
| Langage    | Java 21                                 |
| Framework  | Spring Boot (Web, Data JPA, Validation) |
| Base de données | H2 (dev) / MySQL (prod)                 |
| Packaging  | Gradle / Docker                         |
| Documentation | Springdoc OpenAPI / Swagger UI          |

---

## 📦 Prérequis

- **Java 21** + **Gradle**
- **Docker & Docker Compose** (pour lancer les services auxiliaires)
- **IDE** : IntelliJ IDEA (recommandé) ou VS Code
- **Postman / HTTPie** pour tester l’API
- **PhpMyAdmin** (optionnel) pour l’inspection MySQL

---

## 🚀 Installation & lancement

### 1. Cloner le dépôt back-end

```bash
git clone https://github.com/JesseeDantonio/Chatop-API-Backend
cd Chatop-API-Backend
```

### 2. Lancer le fichier docker compose

```bash
cd Developpez-le-back-end-en-utilisant-Java-et-Spring

# ⚠️ Attention : 
# Les identifiants de connexion fournis dans ce projet sont exclusivement réservés à un usage local, pour l'essai et la validation du projet.  
# Ils ne doivent en aucun cas être utilisés en production ou pour des données sensibles.

docker compose up
```

### 3. Importer la structure de la base de données
```bash
# Importer le script SQL nommé ChaTop dans PhpMyAdmin
# Les identifiants sont dans le fichier docker compose
```
