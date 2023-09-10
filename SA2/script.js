
//===========================================================Resultado Pedra Papel Tesoura=============================================================
//
//
//
//
// Quando a página é carregada, recupere a escolha do usuário e defina a imagem inicial
window.onload = function () {
    // Recuperar a escolha do usuário do armazenamento local
    const opcaoSelecionada = localStorage.getItem('opcaoSelecionada');

    // Pega a imagem no primeiro card
    const minhaImagem = document.getElementById('imagem1');

    // Define o caminho da imagem inicial com base na escolha do usuário recuperada
    minhaImagem.src = imagensSelecao[opcaoSelecionada]; // Substitua pelo caminho da imagem desejada

    // Restante do seu código para a troca de imagens
    // ...
};

// Função para sortear a imagem do segundo card aleatoriamente
function sortearImagem() {
    const imagens = ["img/PedraSemFundo.png", "img/PapelSemFundo.png", "img/TesouraSemFundo.png"];
    // Gera um número aleatório entre 0 e 2 (a multiplicação pelo comprimento do vetor imagens quer dizer que ira sortear um número entre 0 e 2)
    //Math.random() sorteia um numero ente 0 e 1
    //Math.floor() arrendonda um número para inteiro
    const numeroAleatorio = Math.floor(Math.random() * imagens.length);

    // Pega a imagem no segundo card
    const minhaImagemSegundoCard = document.getElementById('imagem2');

    // Define o caminho da imagem com base no número aleatório gerado
    minhaImagemSegundoCard.src = imagens[numeroAleatorio];
}



// Chame a função para sortear a imagem aleatória quando necessário
sortearImagem();

// Chame a função para mostrar o vencedor
vencedor(numeroAleatorio);



