#!/usr/bin/env bash

set -e

eval $(docker-machine env default)

mvn clean package -U -Dmaven.test.skip=true

echo "Starting kafka request reply application"
docker-compose -f docker-compose.yml down
docker-compose -f docker-compose.yml up -d --build
docker ps -a
