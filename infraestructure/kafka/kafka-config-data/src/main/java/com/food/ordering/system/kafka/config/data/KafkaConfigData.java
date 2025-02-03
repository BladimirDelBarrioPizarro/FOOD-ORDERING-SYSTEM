package com.food.ordering.system.kafka.config.data;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka-config")
public class KafkaConfigData {
    private String bootstrapServers; // Lista de brokers de Kafka a los que conectarse
    private String schemaRegistryUrlKey; // Clave del Schema Registry en la configuración.
    private String schemaRegistryUrl; // URL del Schema Registry para manejar mensajes en Avro.
    private Integer numOfPartitions; // Número de particiones al crear nuevos topics.
    private Short replicationFactor; // Nivel de replicación para los topics en Kafka
}
