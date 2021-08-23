# PruebaTecnicaDevco
Este proyecto es la solución de la prueba técnica propuesta por la empresa Devco

## Comenzando
Estas instrucciones te permitirán clonar el proyecto y realizar la configuración adecuada para que tengas el proyecto en funcionamiento en tu máquina local para propósitos de desarrollo y pruebas.

### Pre-Requisitos
Como pre-requisitos deberás tener instalados las siguientes herramientas:
  1. Git
  2. Java
  3. Gradle 6.8.3
  4. Intellij o el IDE que prefieras
  5. Tener instalado el plugin de cucumber en el IDE
  6. la version del chrome driver es  92.0.4515.159
  
## Instalación
  1. Abre una ventana de comandos
  2. Ejecuta el comando java -version
  3. Ejecuta el comando gradle -version
  4. Verifica las versiones
 ![image](https://user-images.githubusercontent.com/79065617/113531447-6c4fdd00-958e-11eb-90d6-e5c80d955b06.png)
  5. Clona el respositorio
    Git:
       - git clone https://github.com/yorman67/PruebaTecnicaDevco.git
       - cd PruebaTecnicaDevco
  6. Espera que todas las dependencias necesarias se descarguen
  7. Crear dos variables de entorno (para ejecutar el escenario de login)
  ![image](https://user-images.githubusercontent.com/79065617/130492652-168d8b03-5a94-49e6-a761-bd4a5e26dd99.png)
  ![image](https://user-images.githubusercontent.com/79065617/130492675-a752c078-e72d-4998-9a08-663f7c12d27f.png)

## Ejecución de pruebas
  En la carpeta  runners encontrarás el runner especifico de cada uno de los escenarios.
  
   ### Ejecucion con JUnit
      Si quieres ejecutar las pruebas con JUnit, sigue estos pasos
  ![image](https://user-images.githubusercontent.com/79065617/130493314-9b1a3091-f328-4f0c-af73-c1e6100fc053.png)
  
   ### Ejecucion con Gradle
      Podrás ejecutar las pruebas con gradle para generar los resportes de serenity solo ejecutando el siguiente comando
        
      - gradle clean test --tests nombreRunner aggregate
      
   ### Evidencia
    La evidencia la podras encontrar en la carpeta extras, esta carpeta se encuentra en la raiz del proyecto, dentro de esta carperta tambien podras encontrar el plan de pruebas donde encontraras escenario entre otars cosas.
    
   ### Construido con 
  Este proyecto fue construido con:
  
    * serenity Bdd 
    * patrón Screenplay 
    * gradle
    * java
    * cucumber
    
   ### Autor
  - Yorman Paúl Martínez Acevedo

### Agradecimiento
  Quiero dar las gracias a Devco por permitirme participar en su proceso de selección, con este ejercicio tuve la oportunidad de practicar y mejorar mis habilidades y espero poder tener una retroalimentación por parte de esta gran compañía, nuevamente muchas gracias.
