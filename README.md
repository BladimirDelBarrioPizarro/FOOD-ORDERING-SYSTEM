# Documentación para Levantar un Clúster de Kafka con Docker Compose

## Requisitos Previos

- Docker y Docker Compose instalados en el sistema.
- Acceso a los archivos de configuración `common.yml`, `zookeeper.yml`, `kafka_cluster.yml` e `init_kafka.yml`.

## Pasos para Iniciar el Clúster de Kafka

### 1. Levantar Zookeeper

Ejecutar el siguiente comando para iniciar Zookeeper:

```sh
docker-compose -f common.yml -f zookeeper.yml up
```

Para verificar que Zookeeper está corriendo, ejecutar:

```sh
echo ruok | nc localhost 2181
```

Si Zookeeper está funcionando correctamente, debería responder con `imok`.

### 2. Levantar el Clúster de Kafka

Ejecutar el siguiente comando para iniciar el clúster de Kafka:

```sh
docker-compose -f common.yml -f kafka_cluster.yml up
```

### 3. Inicializar Kafka

Ejecutar el siguiente comando para inicializar Kafka:

```sh
docker-compose -f common.yml -f init_kafka.yml up
```

### 4. Acceder al Administrador de Kafka

Una vez que el clúster está en funcionamiento, se puede acceder a la interfaz de administración de Kafka en:

[http://localhost:9000/](http://localhost:9000/)

## Notas Adicionales

- Para detener los servicios, se puede utilizar `docker-compose down` en cada paso correspondiente.
- Se recomienda revisar los logs de los contenedores para verificar que todo está funcionando correctamente.

---
**Autor:** Bladimir del Barrio Pizarro
**Fecha:** 02/02/2025




------------------------------------------------------------
