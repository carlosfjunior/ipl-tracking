#!/bin/bash

docker-compose build
docker-compose up -d telemetry_pg vehicle_pg people_pg data_pg
# waiting for database creation
sleep 10
docker-compose up -d telemetry vehicle people data