# IPL Tracking - Microservice API

The IPL Tracking is the final project for Base Technologies course of Post-Graduation in Business Culture and Technology.

## Overview

To simulate a productive environment where each service has its own database instance, I created a structure to run the project in Docker.

The microservices were developed following the 12 factor patterns seen in class.

1. Codebase based on a repository: A code repository is being used to ensure version control and ease of deployment for all microservices.
2. Explicit Dependencies: All dependencies of each microservice are explicitly, ensuring a consistent runtime environment.
3. Environment Configuration: The configuration of each microservice is in environment variables, allowing easy changes across different environments.
4. Service connections: The connections between microservices are treated as external services, ensuring flexibility when connecting new microservices.
5. Build, Release, Run: The process of building and running each microservice are automated, ensuring consistency and ease of deployment.
6. Stateless Processes: Each microservice is designed to be stateless, allowing them to be horizontally scaled and easily replaced.
7. Declarative Port Binding: Each microservice is exposed on a declarative port, allowing them to be run in different environments without conflicts.
8. Concurrency: All microservices were designed to handle concurrency, allowing easy scalability.
9. Disposability: Each microservice was designed to be disposable, allowing them to be easily replaced or removed without affecting the rest of the system.
10. Dev/Prod Parity: I ensured that the development environment is as similar as possible to the production environment to ensure the quality and consistency of the system.
11. Logs: All microservices log and store logs for diagnostic and troubleshooting purposes.
12. Process Administration: All microservices are available for administration, allowing control and monitoring of the system as a whole.

## Prerequisites

Before running the application, ensure that the following dependencies are correctly installed:

Java 17 
Maven 3.8.1
Docker 20.10.22

## Install

This repository contains 4 projects
- xpto-tracking-data-ms (Python)
- xpto-tracking-people-ms (Python)
- xpto-tracking-telemetry-ms (Java)
- xpto-tracking-vehicle-ms (Java)

To install, download or clone the repo, then:

Build Java projects inside their root folder

`mvn clean install`

After that return to ipl-tracking folder and for Mac or Linux make startup.sh executable with the command 

`chmod +x startup.sh`

and execute 

`./startup.sh`

for Windows execute

`startup.bat`

## Tests

There are Postman collections for testing in the collections folder

## Problems and improvements identified

- There is a problem with Python projects running on Docker, when they are restarted they stop working with an error with alembic related to not finding the revision.

- A point of improvement that I identified but without enough time to change, was in the creation of the telemetry data, I could have added a validation if the type of sensor sent in the request is in the telemetry_profile record associated with the vehicle. 


