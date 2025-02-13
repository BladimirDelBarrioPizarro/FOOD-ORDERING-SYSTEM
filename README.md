## Documentation to Set Up a Kafka Cluster with Docker Compose

## Prerequisites

- Docker and Docker Compose installed on the system.
- Access to the configuration files `common.yml`, `zookeeper.yml`, `kafka_cluster.yml`, and `init_kafka.yml`.

## Steps to Start the Kafka Cluster

### 1. Start Zookeeper

Run the following command to start Zookeeper:

```
docker-compose -f common.yml -f zookeeper.yml up
```

To verify that Zookeeper is running, execute:

```
echo ruok | nc localhost 2181
```

If Zookeeper is functioning correctly, it should respond with imok.

2. Start the Kafka Cluster Run the following command to start the Kafka cluster:

```
docker-compose -f common.yml -f kafka_cluster.yml up
```

3. Initialize Kafka Run the following command to initialize Kafka:

```
docker-compose -f common.yml -f init_kafka.yml up
```

4. Access the Kafka Manager Once the cluster is up and running, you can access the Kafka management interface at:

http://localhost:9000/

Additional Notes To stop the services, you can use docker-compose down for each corresponding step.

It is recommended to check the container logs to ensure everything is running correctly.