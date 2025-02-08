# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.2/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.2/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.2/reference/web/servlet.html)
* [Ollama](https://docs.spring.io/spring-ai/reference/api/chat/ollama-chat.html)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/3.4.2/reference/data/nosql.html#data.nosql.mongodb)
* [Docker Compose Support](https://docs.spring.io/spring-boot/3.4.2/reference/features/dev-services.html#features.dev-services.docker-compose)
* [OpenAI](https://docs.spring.io/spring-ai/reference/api/chat/openai-chat.html)

### Docker Compose support

This project contains a Docker Compose file named `compose.yaml`.
In this file, the following services have been defined:

* mongodb: [`mongo:latest`](https://hub.docker.com/_/mongo)
* ollama: [`ollama/ollama:latest`](https://hub.docker.com/r/ollama/ollama)

Please review the tags of the used images and set them to the same as you're running in production.

### Local setup

```bash
  export SPRING_AI_OPENAI_API_KEY=<INSERT KEY HERE>
```



