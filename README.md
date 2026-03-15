# AI Financial Risk & Compliance Management System

An enterprise-style backend system built with **Spring Boot** that monitors financial transactions, detects potential fraud, performs risk analysis, and supports compliance reporting.

## Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA / Hibernate
* MySQL
* REST APIs
* Python (AI Risk Analysis Module)
* Postman (API Testing)

## Core Features

* Customer Risk Profile Management
* Transaction Monitoring
* Fraud Detection Engine
* AI-Based Risk Analysis
* Suspicious Activity Alerts
* Compliance Reporting
* Financial Audit Logging

## System Architecture

Controller → Service → Repository → Database
AI Module → Risk Analysis → Fraud Detection → Compliance Reporting

## API Examples

Create Customer

```
POST /customers
```

Create Transaction

```
POST /transactions
```

Get Fraud Alerts

```
GET /fraud/alerts
```

Run Risk Analysis

```
GET /risk/analyze/{amount}
```

## Project Structure

```
controller/
service/
repository/
entity/
ai/
config/
```

## Purpose

This project demonstrates **enterprise backend architecture for financial monitoring systems**, including transaction analysis, fraud detection logic, and compliance reporting workflows.
