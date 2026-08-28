\# Proyecto de Automatización de Pruebas



\## Objetivo

Implementar un flujo básico de automatización de pruebas en Java usando Git, Maven, JUnit, Cucumber y GitHub Actions.



\## Estructura

\- `src/main/java`: código principal.

\- `src/test/java`: pruebas unitarias y steps de Cucumber.

\- `src/test/resources/features`: escenarios BDD.

\- `pom.xml`: dependencias del proyecto.

\- `.gitignore`: excluye archivos temporales.

\- `.github/workflows/ci.yml`: pipeline de integración continua.

\- `performance/login-test.js`: prueba de performance con k6.



\## Pruebas unitarias

Se implementaron dos pruebas independientes:

\- SumaTest

\- RestaTest



Ejecución:



```bash

mvn test

