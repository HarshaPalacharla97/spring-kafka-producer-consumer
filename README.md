# spring-kafka-producer-consumer
This repository demonstrates the basic producer-consumer implementation model built using kafka and Spring Boot.

# Producer Application
- The producer applications uses the KafkaTemplate<K, V> wrapper class inorder to send the events/message to the kafka broker and topics of the the kafka broker. Using the instance variable of the private KafkaTemplate <K,V> variable .send() method publishes an event/message to a Kafka topic, produced by the Prodcuser application and the produced message is published to a Kafka topic and Kafka stores it in one of the partitions in Kafka topic within the Kafka Server/Broker.
- .send() defined with topic-name, partition-name, data.
- application.properties file of Producer app, is defined with configurational details to serialize String and Java Objects into JSON Objects.
  # Eg: kafkaTemplate.send("aircraft-topic", "aircraft-partition", aircraft);

# Consumer Application
- The Consumer application is defined with @KafkaListener on the method level which accepts arguments like topics, groupId, ....
- When a message arrives on the subscribed topic, Spring Kafka deserializes the payload and passes it as a method argument to the @KafkaListener method.
- application.properties file is defined with various configurations limited to the Consumer application, defining custom port number, search configurations incase of OFFSET, Deserialize the serialized object, limiting the deserialization objects to the entities of specific class. 
# Eg: @KafkaListener(topics="aircraft-topic", groupId="aircraft-consumer-group")
  #   public void consumeMessgeFromKafka(Aircraft aircraft){
  #        // some business
  #    }
  
