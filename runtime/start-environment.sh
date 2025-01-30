#!/bin/sh 
echo starting liferay docker planning assistance env
sudo docker compose up -d --build
sudo docker compose logs -t --follow pa-liferay