#!/bin/bash

sudo docker compose exec -it pa-n8n n8n import:workflow --separate --input=/usr/src/app/workflows/
