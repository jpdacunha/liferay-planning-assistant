#!/bin/sh
echo "Starting import ..."

n8n import:workflow --separate --input=workflows/

echo "Import DONE"
