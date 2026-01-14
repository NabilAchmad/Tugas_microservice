# 📚 Modern Library Microservices

[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)](https://spring.io/projects/spring-boot)
[![Kubernetes](https://img.shields.io/badge/Orchestration-Kubernetes-blue)](https://kubernetes.io/)
[![Architecture](https://img.shields.io/badge/Architecture-CQRS%20%26%20Event--Driven-orange)](#)

Implementasi sistem manajemen perpustakaan berbasis **Microservices** dengan fokus pada skalabilitas tinggi menggunakan pola **CQRS Hybrid**, **Event-Driven Architecture**, dan **Cloud-Native Deployment**.

---

## 🚀 Fitur Utama

- **Hybrid CQRS Pattern**: Pemisahan jalur Read (MongoDB) dan Write (MySQL) untuk performa kueri maksimal.
- **Event-Driven Sync**: Sinkronisasi data antar-layanan secara asinkron menggunakan RabbitMQ.
- **Service Governance**: Discovery service dengan Eureka dan API Gateway sebagai single entry point.
- **Cloud-Native**: Siap dideploy ke kluster Kubernetes dengan konfigurasi resource yang dioptimalkan.
- **Full Observability**: Monitoring real-time dengan ELK Stack (Logging) dan Prometheus/Grafana (Metrics).

---

## 🏗️ Arsitektur Sistem

Sistem ini terdiri dari beberapa komponen utama:

* **Write Side**: Menangani transaksi (Peminjaman, Pengembalian) menggunakan MySQL.
* **Read Side**: Menangani pencarian dan tampilan data menggunakan MongoDB.
* **Message Broker**: RabbitMQ sebagai jembatan komunikasi antar-layanan (Pub/Sub).
* **API Gateway**: Routing permintaan dari klien ke layanan yang tepat.

---

## 🛠️ Stack Teknologi

| Layer | Teknologi |
| :--- | :--- |
| **Backend** | Java 17, Spring Boot 3.x, Spring Cloud |
| **Databases** | MySQL 8.0 (Write), MongoDB (Read) |
| **Messaging** | RabbitMQ |
| **DevOps** | Docker, Kubernetes, Jenkins |
| **Monitoring** | Prometheus, Grafana |
| **Logging** | ELK Stack (Elasticsearch, Logstash, Kibana) |

---

## ⚙️ Optimasi Resource (RAM Tuning)

Dikonfigurasi khusus untuk berjalan pada lingkungan dengan resource terbatas:
- **JVM Heap**: `-Xms128M -Xmx256M`
- **K8s Memory Limit**: `384Mi` per Pod.

---

## 🚦 Akses Dashboard

Setelah sistem berjalan, Anda dapat mengakses dashboard manajemen berikut:

| Service | Port | URL |
| :--- | :--- | :--- |
| **API Gateway** | `30000` | [http://localhost:30000](http://localhost:30000) |
| **Eureka Server** | `8761` | [http://localhost:8761](http://localhost:8761) |
| **Kibana** | `5601` | [http://localhost:5601](http://localhost:5601) |
| **Grafana** | `3000` | [http://localhost:3000](http://localhost:3000) |
| **RabbitMQ** | `15672` | [http://localhost:15672](http://localhost:15672) |

---

## 📦 Cara Instalasi

### Prasyarat
- Docker & Kubernetes (Minikube/Docker Desktop)
- Maven 3.8+
- Java 17

### Langkah-langkah
1. **Clone Repository**
   ```
   git clone [https://github.com/username/library-microservices.git](https://github.com/username/library-microservices.git)
   cd library-microservices
   ```

2. **Build Application**

```
mvn clean package -DskipTests
```

3. **Deploy Infrastructure (Database & Broker)**

```
docker-compose up -d
```

4. **Deploy to Kubernetes**

```

kubectl apply -f k8s/
```
👤 Author
Nabil Achmad Khoir - TRPL 3D - Arsitektur Berbasis Layanan
