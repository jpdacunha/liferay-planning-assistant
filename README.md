# liferay-planning-assistant
AI-assisted planning tool for planning and organizing collection routes (For example waste collection).

## Getting started

## 1. Prerequites

1. JDK 11 installed
2. Zip command installed in your unix environment
3. Dos2Unix command installed in your unix environment

## 2. Environment configuration

Copy .env-template file to customize installation regarding your environment

1. Copy template
```bash
cd ./liferay-planning-assistant
cp -f ./.env-template ./.env
```

2. Edit variables

# Path to project home (to customize according to your env)
PROJECT_HOME_PATH=<UPDATE_WITH_YOUR_PATH>>

## 3. Usefull commands

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
1. Liferay
> username : `test`
> password : `admin`
