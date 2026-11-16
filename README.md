# Everest Airlines

A full-stack airline management and flight booking app: a Spring Boot REST API backed by PostgreSQL, with an Angular front end.

![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0-6DB33F?logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?logo=postgresql&logoColor=white)
![Angular](https://img.shields.io/badge/Angular-20-DD0031?logo=angular&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-5.9-3178C6?logo=typescript&logoColor=white)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5.3-7952B3?logo=bootstrap&logoColor=white)

## Overview

Everest Airlines models the data an airline runs on: flights, planes, airports, seats, bookings, payments, users, and the people who keep the fleet flying (pilots, flight crew, technicians, maintenance records, and admin logs). The backend exposes each of these as a REST resource stored in PostgreSQL through Spring Data JPA. The Angular front end gives the airline a branded site with a flight search and booking form.

The project is still in progress. The backend API is complete for basic CRUD. The front end has the landing page and search form, and a booking service is written, but the pages are not yet wired to the API.

## Key features

- **REST API for 12 resources.** Each resource supports list, get by ID, create, update, and delete.
- **Booking timestamps.** New bookings get their booking date from the server when they are created.
- **Schema managed by JPA.** Hibernate creates and updates the PostgreSQL tables from the entity classes (`ddl-auto=update`).
- **Angular front end.** A responsive navbar, a hero section, and a "Book the Flights" form with origin, destination, dates, passengers, promo code, and trip type (one-way, round-trip, multi-city), styled with Bootstrap.
- **CORS set up for local work.** The API accepts requests from the Angular dev server at `http://localhost:4200`.

## Architecture

```
Angular app (localhost:4200)  --HTTP/JSON-->  Spring Boot API (localhost:8081)  --JPA-->  PostgreSQL
```

The backend uses the standard Spring layering:

- `model/`: JPA entities (`Flight`, `Booking`, `Seat`, `Payment`, `User`, `Pilot`, and so on). Entities refer to each other by ID fields, such as `flightId` and `bookingId`.
- `repository/`: Spring Data `JpaRepository` interfaces, one per entity.
- `controller/`: `@RestController` classes, one per resource.

### API endpoints

Every resource below supports `GET /`, `GET /{id}`, `POST /`, `PUT /{id}` and `DELETE /{id}`.

| Resource | Base path |
| --- | --- |
| Flights | `/api/flights` |
| Bookings | `/api/bookings` |
| Seats | `/api/seats` |
| Payments | `/api/payments` |
| Users | `/api/users` |
| Airports | `/api/airports` |
| Planes | `/api/planes` |
| Pilots | `/api/pilots` |
| Flight crews | `/api/flightcrews` |
| Technicians | `/api/technicians` |
| Maintenance | `/api/maintenances` |
| Admin logs | `/api/adminlogs` |

## Tech stack

| Layer | Technology |
| --- | --- |
| Backend | Java 17, Spring Boot 4.0 (snapshot), Spring Web, Spring Data JPA / Hibernate |
| Database | PostgreSQL. H2 is also on the runtime classpath |
| Frontend | Angular 20 (standalone components), TypeScript, RxJS, Bootstrap 5 |
| Build | Maven (wrapper included), Angular CLI |
| Testing | JUnit (Spring Boot test), Jasmine and Karma |

## Project structure

```
Everest-Airlines/
├── Airlines_Backend/          Spring Boot REST API
│   ├── pom.xml
│   └── src/main/
│       ├── java/GroupProject/Everest_Airlines/
│       │   ├── controller/    REST controllers
│       │   ├── model/         JPA entities
│       │   └── repository/    Spring Data repositories
│       └── resources/application.properties
└── Airlines_Frontend/         Angular app
    └── src/
        ├── app/components/    navbar, footer
        ├── app/pages/         home, booking, about, contact
        └── services/          booking.service.ts
```

## Getting started

### Prerequisites

- JDK 17 or later
- PostgreSQL
- Node.js and npm

### 1. Database

Create a PostgreSQL database named `Everest_Airlines`. The backend connects to `jdbc:postgresql://localhost:5432/Everest_Airlines` by default.

### 2. Backend

Give the backend your own database username and password. You can edit `Airlines_Backend/src/main/resources/application.properties`, or set environment variables, which Spring Boot reads in place of the file values:

```bash
export SPRING_DATASOURCE_USERNAME=postgres
export SPRING_DATASOURCE_PASSWORD=your_password
```

Then start the API:

```bash
cd Airlines_Backend
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

The API runs at `http://localhost:8081`. Try `GET http://localhost:8081/api/flights`.

> The project uses a Spring Boot 4.0.0 snapshot, so Maven pulls it from the Spring snapshot repository listed in `pom.xml`.

### 3. Frontend

```bash
cd Airlines_Frontend
npm install
npm start                     # runs ng serve
```

Open `http://localhost:4200`.

## Roadmap

- Wire the booking page to `BookingService` and register `provideHttpClient()` in `app.config.ts`.
- Fill in the About, Booking and Contact pages.
- Add JPA relationships between entities, plus validation and authentication.

## Author

**Riyaj Chaulagain**, Computer Science student at Southeastern Louisiana University

- GitHub: [riyajclgn123](https://github.com/riyajclgn123)
- Portfolio: [riyajchaulagain.com.np](https://riyajchaulagain.com.np)
