# Homebanking REST

## Java Avanzado - CaC 2023

### Recursos

#### Documentacion

- [Spring-Boot](https://spring.io/guides/gs/spring-boot/)
- [Persistence](https://spring.io/guides/gs/accessing-data-jpa/)

#### Videos



#### Ejemplos

- [Greeting(https://github.com/mechero/spring-boot-restcontroller)
- [Foro](https://github.com/admred/challenge-one-foro-alura)
- [Hotel](https://github.com/khoubyari/spring-boot-rest-example)


### Alunas pruebas con Curl

#### Crear un registro
```
curl -X POST "http://localhost:8080/api/user/create"  -H "content-type: application/json" -d '{"email":"test@example.com","fullname":"Usuario Test","password":"1234"}'
```

### Listar todo
```
curl "http://localhost:8080/api/user/list" -H "accept: application/json"

[{"id":0,"email":"argento333@example.com","fullname":"Pepe Argento"},{"id":1,"email":"liome32@exmaple.com","fullname":"Lionel Messi"},{"id":2,"email":"apple123@example.com","fullname":"Steve Jobs"},{"id":3,"email":"sanmartin69@example.com","fullname":"San Martin"},{"id":4,"email":"test@example.com","fullname":"Usuario Test"}]
```

### Obtener un usuario en particular
```
curl "http://localhost:8080/api/user/get/1"   -H "accept: application/json"

{"id":1,"email":"liome32@exmaple.com","fullname":"Lionel Messi"}

```
