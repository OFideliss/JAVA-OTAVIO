<!DOCTYPE html>
<html lang="pt-br">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Meus Pedidos</title>
  <link rel="stylesheet" href="pedidos.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>

<body>
  <nav class="nav">
    <a href="index.html"><img src="images/MegaPet Mart.png" id="logo" alt="" "></a>
          <form class=" d-flex" role="search">
      <input class="form-control me-2" type="search" placeholder="Pesquise Aqui" aria-label="Search">
      </form>
      <div class="pedidos">
        <!-- falta colocar o escrito "Meus Pedidos" -->
        <a href="pedidos.html"><img id="imgNav" src="images/dropbox.png"></a>
      </div>
    </a>
    <div class="carrinho">
      <a href="carrinho.html"><img id="imgNav" src="images/shopping-cart.png"></a>
    </div>
    <div class="textoNav">
      <a href="login.html">Entrar</a> |
      <a href="cadastro.html">Cadastrar</a>
    </div>
  </nav>
  <Section>
    <div class="tituloPedidos">
      <h1>MEUS PEDIDOS</h1>
      <form class=" d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Buscar Pedido" aria-label="Search">
      </form>
    </div>
    <div class="botoesPedidos">
      <button type="submit" class="btn-primary  bg-blue " value="Todos" onclick="Todos()">Todos</button>
      <button type="submit" class="btn-primary  bg-blue " value="Concluidos" onclick="Concluidos()">Concluidos</button>
      <button type="submit" class="btn-primary  bg-blue " value="Abertos" onclick="Abertos()">Abertos</button>
      <button type="submit" class="btn-primary  bg-blue " value="Cancelados" onclick="Cancelados()">Cancelados</button>
    </div>


    <?php
        $host = "localhost";
        $username = "root";
        $password = "";
        $DB = "loja";

        $conn = mysqli_connect($host, $username, $password) or die("Impossível conectar ao banco.");
        @mysqli_select_db($conn, $DB) or die("Impossível conectar ao banco");

        $query = "SELECT * FROM pedidos";
        $result = mysqli_query($conn, $query) or die("Impossível executar a query");
        ?>


    <div class="Pedido">

    <?php
            while ($row = mysqli_fetch_assoc($result)) {
                // Aqui você pode exibir os detalhes do pedido usando os dados do $row
                echo "<div class='infoPedido'>";
                echo "<h3 class='texto'>REALIZADO EM</h3>";
                echo "<br>";
                echo "<p>" . $row['data'] . "</p>";
                // Exibir outros detalhes do pedido...
                echo "</div>";

                // Exemplo de exibição dos itens do pedido (faça os ajustes necessários)
                echo "<div class='itensPedido'>";
                echo "<div class='fundoItens'>";
                echo "<div class='imgItem'>";
                echo "<img src='images/" . $row['img'] . "' alt='Imagem do produto'>";
                echo "</div>";
                echo "<div class='descricao'>";
                echo "<h5>" . $row['descricao'] . "</h5>";
                echo "<h6>R$" . $row['valor'] . "</h6>";
                echo "</div>";
                echo "<div class='comprNov'>";
                echo "<button type='submit' class='btn-primary  bg-blue ' value='Todos' onclick='CompNov()'>COMPRAR NOVAMENTE</button>";
                echo "</div>";
                echo "</div>";
                echo "</div>";
            }
            ?>
    
      <div class="infoPedido">


        <div class="container-fluid">

          <div class="row">
            <div class="col-3">
              <h3 class="texto">REALIZADO EM</h3>
              <br>
              <p>
                24 de outubro de 2023
              </p>
            </div>
            <div class="col-3">
              <h3>TOTAL</h3>
              <br>
              <p>
                R$842,90
              </p>
            </div>
            <div class="col-3">
              <h3>ENVIAR PARA</h3>
              <br>
              <p>
                Rua Um, Jd. Villa Nova, Limeira/SP
              </p>
            </div>
            <div class="col-3">
              <h3>N° PEDIDO</h3>
              <br>
              <p>
                999999
              </p>
            </div>
          </div>
        </div>

      </div>

      <div class="itensPedido">
        <div class="fundoItens">
          <div class="imgItem">
            <img src="images/RacaoPedidos.jpg" alt="...">
          </div>
          <div class="descricao">
            <h5 >Lorem ipsum dolor sit amet consectetur, adipisicing elit .</h5>
            <h6 >R$842,90</h6>
          </div>
          <div class="comprNov"> <!-- Comprar novamente -->
            <button type="submit" class="btn-primary  bg-blue " value="Todos" onclick="CompNov()">COMPRAR
              NOVAMENTE</button>
          </div>
        </div>
        <div class="fundoItens">
          <div class="imgItem">
            <img src="images/RacaoPedidos.jpg" alt="...">
          </div>
          <div class="descricao">
            <h5 >Lorem ipsum dolor sit amet consectetur, adipisicing elit .</h5>
            <h6 >R$842,90</h6>
          </div>
          <div class="comprNov"> <!-- Comprar novamente -->
            <button type="submit" class="btn-primary  bg-blue " value="Todos" onclick="CompNov()">COMPRAR
              NOVAMENTE</button>
          </div>
        </div>
      </div>

    </div>

    <div class="Pedido">
      <div class="infoPedido">


        <div class="container-fluid">

          <div class="row">
            <div class="col-3">
              <h3 class="texto">REALIZADO EM</h3>
              <br>
              <p>
                24 de outubro de 2023
              </p>
            </div>
            <div class="col-3">
              <h3>TOTAL</h3>
              <br>
              <p>
                R$842,90
              </p>
            </div>
            <div class="col-3">
              <h3>ENVIAR PARA</h3>
              <br>
              <p>
                Rua Um, Jd. Villa Nova, Limeira/SP
              </p>
            </div>
            <div class="col-3">
              <h3>N° PEDIDO</h3>
              <br>
              <p>
                999999
              </p>
            </div>
          </div>
        </div>

      </div>

      <div class="itensPedido">
        <div class="fundoItens">
          <div class="imgItem">
            <img src="images/RacaoPedidos.jpg" alt="...">
          </div>
          <div class="descricao">
            <h5 >Lorem ipsum dolor sit amet consectetur, adipisicing elit .</h5>
            <h6 >R$842,90</h6>
          </div>
          <div class="comprNov"> <!-- Comprar novamente -->
            <button type="submit" class="btn-primary  bg-blue " value="Todos" onclick="CompNov()">COMPRAR
              NOVAMENTE</button>
          </div>
        </div>
        <div class="fundoItens">
          <div class="imgItem">
            <img src="images/RacaoPedidos.jpg" alt="...">
          </div>
          <div class="descricao">
            <h5 >Lorem ipsum dolor sit amet consectetur, adipisicing elit .</h5>
            <h6 >R$842,90</h6>
          </div>
          <div class="comprNov"> <!-- Comprar novamente -->
            <button type="submit" class="btn-primary  bg-blue " value="Todos" onclick="CompNov()">COMPRAR
              NOVAMENTE</button>
          </div>
        </div>
        
      </div>
      <div class="itensPedido">
        <div class="fundoItens">
          <div class="imgItem">
            <img src="images/RacaoPedidos.jpg" alt="...">
          </div>
          <div class="descricao">
            <h5 >Lorem ipsum dolor sit amet consectetur, adipisicing elit .</h5>
            <h6 >R$842,90</h6>
          </div>
          <div class="comprNov"> <!-- Comprar novamente -->
            <button type="submit" class="btn-primary  bg-blue " value="Todos" onclick="CompNov()">COMPRAR
              NOVAMENTE</button>
          </div>
        </div>
        <div class="fundoItens">
          <div class="imgItem">
            <img src="images/RacaoPedidos.jpg" alt="...">
          </div>
          <div class="descricao">
            <h5 >Lorem ipsum dolor sit amet consectetur, adipisicing elit .</h5>
            <h6 >R$842,90</h6>
          </div>
          <div class="comprNov"> <!-- Comprar novamente -->
            <button type="submit" class="btn-primary  bg-blue " value="Todos" onclick="CompNov()">COMPRAR
              NOVAMENTE</button>
          </div>
        </div>
        
      </div>
    </div>
    </div>
  </Section>

</body>

</html>