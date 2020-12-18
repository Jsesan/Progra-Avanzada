<!doctype html>
<html lang="en" class="h-100">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>%%NOMBRECOMPLETO%%, %%INSTANCIA%%</title>

  <!-- Bootstrap core CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

  <style>
    body {
      margin-top: 2em;
    }
    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      -ms-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }
  </style>
</head>
<body class="d-flex flex-column h-100">
<!-- Begin page content -->
<main role="main" class="flex-shrink-0">
  <div class="container">
    
    <h1>%%INSTANCIA%%</h1>
    <h2>%%FECHA%%</h2>
    <p>Estudiante: %%NOMBRECOMPLETO%% (%%DOCUMENTO%%)</p>
    <p>Fecha de entrega: %%TIMESTAMP%%</p>

    <h3>Ejercicio 1</h3>
    <p>Se entrega en forma de código</p>
    <p><strong>Complejidad: </strong> %%EJ1CC%%</p>
    
    <img src="src/unlam/progava/oia/diagrama-de-clases.png"/>

    <h3>Ejercicio 2</h3>
    <pre>
%%EJ2%%
    </pre>
    
    <p><strong>Complejidad: </strong> %%EJ2CC%%</p>

    <h3>Ejercicio 3</h3>
    <ol>
      <li>
        <p>%%EJ3A%%</p>
      </li>
      <li>
        <p>%%EJ3B%%</p>
      </li>
      <li>
        <p>%%EJ3C%%</p>
      </li>
    </ol>
    
    <h3>Ejercicio 4</h3>
    <ol>
      <li>
        <p>%%EJ4A%%</p>
        <blockquote class="blockquote">%%EJ4AJ%%</blockquote>
      </li>
      <li>
        <p>%%EJ4B%%</p>
        <blockquote class="blockquote">%%EJ4BJ%%</blockquote>
      </li>
      <li>
        <p>%%EJ4C%%</p>
        <blockquote class="blockquote">%%EJ4CJ%%</blockquote>
      </li>
    </ol>

    <p><strong>Firma: </strong> %%FIRMA%%</p>
  </div>
  
</main>

<footer class="footer mt-auto py-3">
  <div class="container">
    <span class="text-muted">Evaluación manejada con <span style="color: #a83f39">❤</span> por <a href="https://loom.wecode.io">Loom</a></span>
  </div>
</footer>
<!--
%%INFO%%
-->
</body>
</html>