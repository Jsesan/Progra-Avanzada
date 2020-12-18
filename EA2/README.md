# Evaluación de Aprendizajes 2

## Cómo resolver

Se proporciona un proyecto que favorecerá la correcta adopción de formatos al momento de responder la evaluación. Para ello, deberás seguir los siguientes pasos:

1. Descargarte el proyecto localmente, e importarlo en Eclipse. Click derecho en la zona de proyectos, import, existing project into workspace, seleccionamos la carpeta, siguiente.
2. **No deberás cambiar la interfaz pública de ningún ejercicio, ni nombres de clases, ni paquetes**. Esto es importante, ya que si no es posible compilar y ejecutar el ejercicio, no podremos corregirlo.
3. Completar en cada sitio donde encuentres una `RuntimeExcepcion`, con el código indicado o la respuesta correcta. Puntualmente: `DatosDelAlumno`, `Ejercicio2`, `Ejercicio3`, `Ejercicio4`, `EjercicioOIA`.

Respecto a esto, a veces necesitarás utilizar enumerados para la respuesta. Si quisieras contestar que la complejidad de un ejercicio es lineal, deberás usar el enumerado `Complejidad.LINEAL` para ello, por ejemplo. Todos los enumerados han sido proporcionados, no debérás crear ninguno nuevo.

Antes de entregar, ejecutá el main principal que encontrarás en la clase `App`. Esto dejará un archivo con tus respuestas disponible en la raiz del proyecto (`[DNI]-[APELLIDOS, nombres].html`). **Este archivo deberás convertirlo a PDF entregarlo como solución a la evaluación**. Revisalo para ver cómo quedó, y subilo como respuesta a la Evaluación.  
Para convertirlo a PDF podrías utilizar una herramienta como esta: https://html2pdf.com/es/  
También podés "imprimirlo como PDF".

Adicionalmente, el proyecto completo (con todo lo que tiene adentro, incluso entrega.html y el pdf) deberás comprimirlo y entregarlo como resolución de práctica.

## Cuestiones particulares

### Datos del alumno

Tus datos también debés completarlos como métodos dentro de la clase `DatosDelAlumno`.

### Ejercicio 1: OIA

* Deberás resolverlo dentro del paquete `unlam.progava.oia`, agregando las clases necesarias.
* También deberás agregar los casos de prueba (in y out, obtenidos y esperados). Se proporcionan los casos del enunciado, a modo de ejemplo.
* Adicionalmente, deberás reemplazar el `diagrama-de-clases.png`, con tu propia versión.
* Para asegurarte de que todo funciona correctamente, ejecutá el main provisto en `EjercicioOIA.java`.

### Ejercicios 2 al 4

Deberás rersolverlos en la clase correspondiente. Si deseas agregar métodos privados auxiliares, podés hacerlo. Pero recordá que la respuesta se tomará del método provisto, así que la ejecución inicia y termina allí.

Para asegurarte de que el examen funciona correctamente, cuando ejecutes el `main` de la `App`, no deberá resultar en ninguna excepción. Podrás encontrarlo en el default package.

## Anexos

Toda información adicional que quieras remitir junto a la evaluación, colocala en la carpeta de "anexos".

## Consultas

Ante cualquier inconveniente, por favor utilzá el foro público creado para esta evaluación. Revisá si alguien tuvo la misma pregunta.
