# Homebanking REST  
### TP Final - Java Avanzado - CaC 2023 

####  Tecnologias utilizadas  :wrench:
- Spring Boot 3
- h2database
- Idea 2023
- Java 17
- Muchas ganas :nerd_face:


#### [Recurso Tecnico y/o Documentacion :books:](https://github.com/admred/homebanking/discussions/3#discussion-5733830) 


####  Alunas pruebas con Curl :hammer:

##### Crear un registro
```
curl -X POST "http://localhost:8080/api/user/create"  -H "content-type: application/json" -d '{"email":"test@example.com","fullname":"Usuario Test","password":"1234"}'
```

##### Listar todo
```
curl "http://localhost:8080/api/user/list" -H "accept: application/json"

[{"id":0,"email":"argento333@example.com","fullname":"Pepe Argento"},{"id":1,"email":"liome32@exmaple.com","fullname":"Lionel Messi"},{"id":2,"email":"apple123@example.com","fullname":"Steve Jobs"},{"id":3,"email":"sanmartin69@example.com","fullname":"San Martin"},{"id":4,"email":"test@example.com","fullname":"Usuario Test"}]
```

##### Obtener un usuario en particular
```
curl "http://localhost:8080/api/user/get/1"   -H "accept: application/json"

{"id":1,"email":"liome32@exmaple.com","fullname":"Lionel Messi"}

```
##### Tambien en Postman pero no lo tengo instalado :joy:
