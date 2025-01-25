# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.spring-ai.Spring AI Ollama Demo' is invalid and this project uses 'com.example.spring_ai.Spring.AI.Ollama.Demo' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.2/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.2/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.2/reference/web/servlet.html)
* [Ollama](https://docs.spring.io/spring-ai/reference/api/chat/ollama-chat.html)

## Run Locally

### Build and start the Docker containers

```bash
  ./docker-compose up --build -d
```

### verify if the model exists
```bash
  docker exec -it ollama ollama list
```

### Alternatively can download llama2 model using comamnd
```bash
  docker exec -it ollama ollama pull llama2
```

### Show running containers
```bash
  ./docker ps
```

## prompt message

#### Endpoints
`POST` http://localhost:9292/api/llama/v1/generate

#### Request body

```json
{
  "prompt": "Who is the current Prime Minister of India?"
}
```

#### Response

```json
{
  "response": "Once upon a time, AI revolutionized the world..."
}
```
