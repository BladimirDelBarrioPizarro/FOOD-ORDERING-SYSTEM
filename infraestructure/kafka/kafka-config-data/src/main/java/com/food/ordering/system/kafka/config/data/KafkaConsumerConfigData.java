package com.food.ordering.system.kafka.config.data;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka-consumer-config")
public class KafkaConsumerConfigData {
    private String keyDeserializer; // Clase para deserializar las claves de los mensajes.
    private String valueDeserializer; // Clase para deserializar los valores de los mensajes.
    private String autoOffsetReset; // Define el comportamiento cuando un consumidor se une por primera vez (earliest o latest).
    private String specificAvroReaderKey; // Si se usa Avro para la clave.
    private String specificAvroReader; // Si se usa Avro para el valor.
    private Boolean batchListener; // Si el consumidor procesa mensajes en batch.
    private Boolean autoStartup; // Si el consumidor debe iniciar automáticamente.
    private Integer concurrencyLevel; // Número de hilos concurrentes procesando mensajes.
    private Integer sessionTimeoutMs; // Tiempo máximo sin comunicación antes de que un consumidor se considere desconectado.
    private Integer heartbeatIntervalMs; // Intervalo entre heartbeats para detectar consumidores activos.
    private Integer maxPollIntervalMs; // Máximo tiempo entre poll() antes de que el consumidor sea removido.
    private Long pollTimeoutMs; // Tiempo de espera antes de verificar nuevos mensajes.
    private Integer maxPollRecords; // Número máximo de mensajes por poll().
    private Integer maxPartitionFetchBytesDefault; // Tamaño máximo de datos obtenidos por partición.
    private Integer maxPartitionFetchBytesBoostFactor; // Factor de ajuste dinámico para la recuperación de datos.
}
