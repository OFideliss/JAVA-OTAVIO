<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="produto.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link
        href="https://fonts.googleapis.com/css2?family=Montserrat&family=Montserrat+Alternates:ital,wght@1,600&display=swap"
        rel="stylesheet">
    <title>Produtos</title>
</head>

<body>
    <header>
        <div class="cima">
            <img class="foto1" src="images/MegaPet Mart.png" alt="">
            <div id="divBusca">
                <div class="inputBox_container">
                    <svg class="search_icon" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 48 48" alt="search icon">
                        <path
                            d="M46.599 46.599a4.498 4.498 0 0 1-6.363 0l-7.941-7.941C29.028 40.749 25.167 42 21 42 9.402 42 0 32.598 0 21S9.402 0 21 0s21 9.402 21 21c0 4.167-1.251 8.028-3.342 11.295l7.941 7.941a4.498 4.498 0 0 1 0 6.363zM21 6C12.717 6 6 12.714 6 21s6.717 15 15 15c8.286 0 15-6.714 15-15S29.286 6 21 6z">
                        </path>
                    </svg>
                    <input class="inputBox" id="inputBox" type="text" placeholder="Pesquise Produtos">
                </div>
            </div>
            <div class="pedidos">
                <a href=""><img src="images/dropbox.png" alt=""></a>
                <a href="">Meus Pedidos</a>
            </div>
            <div class="carrinho">
                <a href="">
                    <button data-quantity="0" class="btn-cart">
                        <svg class="icon-cart" viewBox="0 0 24.38 30.52" height="30.52" width="24.38"
                            xmlns="http://www.w3.org/2000/svg">
                            <title>icon-cart</title>
                            <path transform="translate(-3.62 -0.85)"
                                d="M28,27.3,26.24,7.51a.75.75,0,0,0-.76-.69h-3.7a6,6,0,0,0-12,0H6.13a.76.76,0,0,0-.76.69L3.62,27.3v.07a4.29,4.29,0,0,0,4.52,4H23.48a4.29,4.29,0,0,0,4.52-4ZM15.81,2.37a4.47,4.47,0,0,1,4.46,4.45H11.35a4.47,4.47,0,0,1,4.46-4.45Zm7.67,27.48H8.13a2.79,2.79,0,0,1-3-2.45L6.83,8.34h3V11a.76.76,0,0,0,1.52,0V8.34h8.92V11a.76.76,0,0,0,1.52,0V8.34h3L26.48,27.4a2.79,2.79,0,0,1-3,2.44Zm0,0">
                            </path>
                        </svg>
                        <span class="quantity"></span>
                    </button>
                </a>
            </div>
            <div class="login">
                <a href="login.html"><button class="entrar_cadastro">
                        <span>Entrar</span>
                    </button></a>
                <a href="cadastro.html"><button class="entrar_cadastro">
                        <span>Cadastrar</span>
                    </button></a>
            </div>

        </div>
    </header>

    <div class="banner">
        <h1>QUEM SOMOS</h1>
        <h1>PRODUTOS </h1>
        <h1>SERVIÇOS</h1>
    </div>
    <section class="prod">
        <div class="filtro">
            <h1>Filtrar Por:</h1>
            <h2>Tipo de animal:</h2>


            <div class="radio-input-wrapper">
                <label class="label">
                    <input value="value-2" name="value-radio" id="animal-2" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Cavalo</div>
                </label>
                <label class="label">
                    <input value="value-3" name="value-radio" id="animal-3" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Vaca </div>
                </label>
                <label class="label">
                    <input value="value-4" name="value-radio" id="animal-4" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Boi</div>
                </label>
                <label class="label">
                    <input value="value-4" name="value-radio" id="animal-5" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Outros</div>
                </label>
            </div>

            <h2>Tipo de produto</h2>

            <div class="radio-input-wrapper">
                <label class="label">
                    <input value="value-2" name="value-radio" id="produto-2" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Alimentos </div>
                </label>
                <label class="label">
                    <input value="value-3" name="value-radio" id="produto-3" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Medicamentos</div>
                </label>
                <label class="label">
                    <input value="value-4" name="value-radio" id="produto-4" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Vitaminas</div>
                </label>
                <label class="label">
                    <input value="value-4" name="value-radio" id="produto-5" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Acessórios</div>
                </label>
                <label class="label">
                    <input value="value-4" name="value-radio" id="produto-6" class="radio-input" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Higiene e Limpeza </div>
                </label>
            </div>


            <h2>Marca</h2>

            <div class="radio-input-wrapper">
                <label class="label">
                    <input value="value-2" name="value-radio" id="marca-2" class="radio-input marca" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Sweet Friend(4)</div>
                </label>
                <label class="label">
                    <input value="value-3" name="value-radio" id="marca-3" class="radio-input marca" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">royal horse</div>
                </label>
                <label class="label">
                    <input value="value-4" name="value-radio" id="marca-4" class="radio-input marca" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">Nuxcell PLUS</div>
                </label>
                <label class="label">
                    <input value="value-5" name="value-radio" id="marca-5" class="radio-input marca" type="radio">
                    <div class="radio-design"></div>
                    <div class="label-text">VETNIL</div>
                </label>
            </div>




            <h2>Preço</h2>
            <div class="preco">


                <p>R$0</p>
                <p>R$10000</p>
            </div>

            <input id="myRange" class="slider" value="50" max="100" min="0" type="range">

            <div class="mudarPreco">
                <p id="precoProd">R$0</p>
            </div>



            <button type="button" class="btn btn-link" id="aplicar" onclick="aplicar()">Aplicar</button>
        </div>

        <?php
        $host = "localhost";
        $username = "root";
        $password = "";
        $DB = "loja";

        $conn = mysqli_connect($host, $username, $password) or die("Impossível conectar ao banco.");
        @mysqli_select_db($conn, $DB) or die("Impossível conectar ao banco");

        $query = "SELECT * FROM produto";
        $result = mysqli_query($conn, $query) or die("Impossível executar a query");
        ?>

        <div class="cardProdutos">
            <div class="row row-cols-1 row-cols-md-3 g-4 ">
                <?php while ($row = mysqli_fetch_object($result)) { ?>
                    <div class="col">
                        <div class="card">
                        <img src='data:image/jpeg;base64,<?php echo base64_encode($row->prod_img); ?>'
                            class="card-img-top imagembd " alt="imagem 1">
                            <div class="card-body">
                                <h5 class="card-title ">
                                    <?php echo $row->descricao; ?>
                                </h5>
                                <p class="card-text">
                                   R$ <?php echo $row->valor; ?>
                                </p>
                                <button>Comprar</button>
                                <input type="number" class="quant" placeholder="1">
                            </div>
                        </div>
                    </div>

                <?php } ?>
            </div>
        </div>


        <section class="prodPg">
            <div class="mydict">
                <div>
                    <label>
                        <input type="radio" name="radio" checked="">
                        <span>1</span>
                    </label>
                    <label>
                        <input type="radio" name="radio">
                        <span>2</span>
                    </label>
                    <label>
                        <input type="radio" name="radio">
                        <span>3</span>
                    </label>
                    <label>
                        <input type="radio" name="radio">
                        <span>></span>
                    </label>

                </div>
            </div>
        </section>
        </div>
    </section>

    <footer>
        <div class="footer">
            <div class="ladoEsqFooter">
                <img src="images/MegaPet Mart.png" class="logoFooter" alt="">
                <p>(19) 3442-1234 <br>
                    vendas@megapetmart.com.br <br>
                    Av. Rua das Ruas <br>
                    Limeira, São Paulo</p>
            </div>
            <div class="redeSocial">
                <h1>Onde Estamos</h1>
                <a href=""><img class="imgRede" src="images/facebook.png" alt="Facebook">Facebook</a>
                <a href=""><img class="imgRede" src="images/instagram.png" alt="Instagram">Instagram<br></a>
                <a href=""><img class="imgRede" src="images/whatsapp.png" alt="Whatsapp">Whatsapp</a>
                <a href=""><img class="imgRede" src="images/linkedin.png" alt="LinkedIn">LinkedIn</a>
            </div>
            <div class="meioFooter">
                <p>Como podemos ajudar você?
                    Conheça mais sobre nossa empresa, políticas e tenha o melhor atendimento do mercado pet 😍</p>
            </div>
            <div class="politica1">
                <h1>Atendimento</h1>
                <a href="">Central de Atendimento</a><br>
                <a href="">Assessoria de imprensa</a>
            </div>
            <div class="politica2">
                <h1>Políticas</h1>
                <a href="">Aviso de Privacidade</a><br>
                <a href="">Política de Cookies</a><br>
                <a href="">Política de entrega e devolução</a><br>
                <a href="">Política de compra</a><br>
                <a href="">Política de white hat</a>
            </div>
            <div class="politica3">
                <h1>Institucional</h1>
                <a href="">Sustentabilidade</a><br>
                <a href="">Empresa</a><br>
                <a href="">Termos e condições de uso</a><br>
                <a href="">Canal de ética e conduta</a><br>
                <a href="">Trabalhe conosco</a>
            </div>
        </div>
    </footer>
</body>
<!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
    crossorigin="anonymous"></script> -->
<script src="script.js"></script>

</html>