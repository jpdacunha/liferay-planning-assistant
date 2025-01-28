#!/bin/bash

# Path to the .env file
ENV_FILE="../.env"

# Check if the .env file exists
if [ ! -f "$ENV_FILE" ]; then
    echo "Error: The file $ENV_FILE was not found. Please check its existence."
    exit 1
fi

# Load environment variables from the .env file
echo "Loading environment variables from $ENV_FILE..."
export $(grep -v '^#' "$ENV_FILE" | xargs)

echo "Environment variables loaded successfully."
