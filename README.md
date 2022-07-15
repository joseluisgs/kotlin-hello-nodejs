# Kotlin Hello Node.js 
Este es un ejemplo de como usar Kotlin en un proyecto Node.js, una api rest en Node.js con Express

[![Kotlin](https://img.shields.io/badge/Code-Kotlin-blueviolet)](https://kotlinlang.org/)
[![Node.js](https://img.shields.io/badge/Code-NodeJS-green)](https://nodejs.org/es/)
[![LICENSE](https://img.shields.io/badge/Lisence-CC-%23e64545)](https://joseluisgs.github.io/docs/license/)
![GitHub](https://img.shields.io/github/last-commit/joseluisgs/kotlin-hello-nodejs)

<p align="center">
  <a href="https://joseluisgs.github.io/" target="_blank"><img src="https://i.blogs.es/9bfabc/kotlin-js/1366_2000.webp" 
  width='600px' borderRadius='1rem' boxShadow = '0 5px 18px rgba(0,0,0,0.3)'></a>
</p>

- [Kotlin Hello Node.js](#kotlin-hello-nodejs)
  - [Acerca de](#acerca-de)
  - [Uso](#uso)
    - [Compilación y ejecución](#compilación-y-ejecución)
    - [Acceso al endpoint](#acceso-al-endpoint)
  - [Autor](#autor)
    - [Contacto](#contacto)
  - [Licencia de uso](#licencia-de-uso)

## Acerca de
Este proyecto muestra cómo hacer una sencilla api rest en Node.js con Kotlin usando librerías como Express.

El principal objetivo con este proyecto es: 
- Usar Kotlin como lenguaje de tipado para ser transpilado a JavaScript para Node.js
- Integrar librerías desde NPM como Express para crear una api rest
- Aplicar librerías de Kotlin Multiplataforma para dotar de funcionalidad.

<p align="center">
  <a href="https://joseluisgs.github.io/" target="_blank"><img src="https://dev-to-uploads.s3.amazonaws.com/uploads/articles/3i7mye7d68q1f3dgygup.png" 
  width='600px' borderRadius='1rem' boxShadow = '0 5px 18px rgba(0,0,0,0.3)'></a>
</p>


## Uso
Puedes llamar a la app usando el script de Gradle run o build
Compile Kotlin to JS using gradle

### Compilación y ejecución
Windows
$ gradlew.bat build

Linux / Mac
$ ./gradlew build

Run Node Server
$ ./gradlew run

### Acceso al endpoint
El servidor escucha en el puerto 3000: http://localhost:3000/persons

La salida será una lista de personas
```json 
[
  {
    "uuid": "bea124df-6722-4318-bdcd-2adada75ba72",
    "name": "Person 1",
    "age": 11,
    "type": "CHILD",
    "createdAt": "2022-07-15T19:16:40.054"
  },
  {
    "uuid": "23342b5d-1efb-4c89-9f87-a478da20432c",
    "name": "Person 2",
    "age": 59,
    "type": "ADULT",
    "createdAt": "2022-07-15T19:16:40.054"
  },
]
```

## Autor

Codificado con :sparkling_heart: por [José Luis González Sánchez](https://twitter.com/joseluisgonsan)

[![Twitter](https://img.shields.io/twitter/follow/joseluisgonsan?style=social)](https://twitter.com/joseluisgonsan)
[![GitHub](https://img.shields.io/github/followers/joseluisgs?style=social)](https://github.com/joseluisgs)

### Contacto
<p>
  Cualquier cosa que necesites házmelo saber por si puedo ayudarte 💬.
</p>
<p>
 <a href="https://joseluisgs.github.io/" target="_blank">
        <img src="https://joseluisgs.github.io/img/favicon.png" 
    height="30">
    </a>  &nbsp;&nbsp;
    <a href="https://github.com/joseluisgs" target="_blank">
        <img src="https://distreau.com/github.svg" 
    height="30">
    </a> &nbsp;&nbsp;
        <a href="https://twitter.com/joseluisgonsan" target="_blank">
        <img src="https://i.imgur.com/U4Uiaef.png" 
    height="30">
    </a> &nbsp;&nbsp;
    <a href="https://www.linkedin.com/in/joseluisgonsan" target="_blank">
        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/LinkedIn_logo_initials.png/768px-LinkedIn_logo_initials.png" 
    height="30">
    </a>  &nbsp;&nbsp;
    <a href="https://discordapp.com/users/joseluisgs#3560" target="_blank">
        <img src="https://logodownload.org/wp-content/uploads/2017/11/discord-logo-4-1.png" 
    height="30">
    </a> &nbsp;&nbsp;
    <a href="https://g.dev/joseluisgs" target="_blank">
        <img loading="lazy" src="https://googlediscovery.com/wp-content/uploads/google-developers.png" 
    height="30">
    </a>    
</p>

## Licencia de uso

Este repositorio y todo su contenido está licenciado bajo licencia **Creative Commons**, si desea saber más, vea la [LICENSE](https://joseluisgs.github.io/docs/license/). Por favor si compartes, usas o modificas este proyecto cita a su autor, y usa las mismas condiciones para su uso docente, formativo o educativo y no comercial.

<a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/"><img alt="Licencia de Creative Commons" style="border-width:0" src="https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png" /></a><br /><span xmlns:dct="http://purl.org/dc/terms/" property="dct:title">JoseLuisGS</span> by <a xmlns:cc="http://creativecommons.org/ns#" href="https://joseluisgs.github.io/" property="cc:attributionName" rel="cc:attributionURL">José Luis González Sánchez</a> is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-sa/4.0/">Creative Commons Reconocimiento-NoComercial-CompartirIgual 4.0 Internacional License</a>.<br />Creado a partir de la obra en <a xmlns:dct="http://purl.org/dc/terms/" href="https://github.com/joseluisgs" rel="dct:source">https://github.com/joseluisgs</a>.