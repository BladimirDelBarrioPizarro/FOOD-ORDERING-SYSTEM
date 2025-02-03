package com.food.ordering.system.kafka.config.data;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "kafka-producer-config")
public class KafkaProducerConfigData {
    private String keySerializerClass; // Serializador para la clave del mensaje.
    private String valueSerializerClass; // Serializador para el valor del mensaje.
    private String compressionType; // Tipo de compresión (none, gzip, snappy, lz4).
    private String acks; // Nivel de confirmación de recepción (0, 1, all).
    private Integer batchSize; // Tamaño de batch antes de enviar mensajes.
    private Integer batchSizeBoostFactor; // Factor de ajuste dinámico del batch.
    private Integer lingerMs; // Tiempo de espera antes de enviar mensajes (mejora eficiencia).
    private Integer requestTimeoutMs; // Tiempo antes de considerar fallido un envío.
    private Integer retryCount; // Número de reintentos si un mensaje falla al enviarse.
}
