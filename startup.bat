@echo off

docker-compose build
docker-compose up -d telemetry_pg vehicle_pg people_pg data_pg
rem waiting for database creation
timeout /t 10
docker-compose up -d telemetry vehicle people data