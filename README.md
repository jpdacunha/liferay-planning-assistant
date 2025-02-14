# liferay-planning-assistant
## Introduction
AI-assisted planning tool for planning and organizing collection routes (For example waste collection).

## Features
List the key features of the project.

- Liferay site initializer setup
- API builder for interacting with Liferay calendar
- AI integration in N8N for vehicle command association

## Getting started

### 1. Prerequites

1. JDK 11 installed
2. Zip command installed in your unix environment
3. Dos2Unix command installed in your unix environment

### 2. Environment configuration

Copy .env-template file to customize installation regarding your environment

1. Copy template
```bash
cd ./liferay-planning-assistant
cp -f ./.env-template ./.env
```

2. Edit variables

> Path to project home (to customize according to your env)
PROJECT_HOME_PATH=<UPDATE_WITH_YOUR_PATH>>

### 3. Usefull commands

### Install

```bash
sudo apt-get update
sudo apt install zip openjdk-11-jdk
```

### Start

```bash
./start-environment.sh
```

### Build

```bash
./build.sh
```

### Deploy

```bash
./deploy.sh
```

Liferay runs on http://localhost:8080/, a developper activation key is needed to run liferay drop it in `/runtime/liferay/deploy`

## Credentials

| Service | URL | user | password | 
|----------|:-------------:|:------:|:------:|
| Liferay| http://localhost:8080/ | test | admin |
| n8n| http://localhost:5678/ | demo@inetum.com | Inetum2024 |

## To-Do List
List the tasks that still need to be completed.

- [ ] AI Integration in N8N:
Successfully use tools with AI to associate commands with vehicles based on distance and available volume without errors.
Ensure the AI accurately matches commands to the appropriate vehicles.
Test and validate the AI integration to ensure reliability and accuracy.

> There are several workflows in n8n, the current one is: "AI: Conversational agent with personalized tool for optimized planning"
- [ ] Look at the warshall algorithm


