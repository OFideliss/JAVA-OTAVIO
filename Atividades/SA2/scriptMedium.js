//===========================================================Semaforo=============================================================

// "img/SemaforoVermelhoSemFundo.png"
const imagens = ["img/SemaforoVerdeSemFundo.png", "img/SemaforoAmareloSemFundo.png", "img/SemaforoVermelhoSemFundo.png"];
let i = 0;

function trocar() {
    const minhaImagen = document.getElementById('figura');
    minhaImagen.src = imagens[i];

    i++; // Incrementa i em 1

    if (i >= imagens.length) { // se i for maior que o comprimento do vetor(3), então zera o i
        i = 0; // Reinicia i para 0 quando atinge o final do array
    }

    // Define os tempos de troca com base na imagem atual
    let tempoTroca = 5000; // Tempo padrão (vermelho para verde) demora 4 segundos
    if (i === 2) { // se indice 2 (Semafaro cor vermelho) o tempo muda para 1 segundo
        tempoTroca = 2000; // o tempo de troca do amarelo para verde é menor 1 segundo
    }

    setTimeout(trocar, tempoTroca);
}

setTimeout(trocar, 0); // Inicia a função, o tempo de 0 segundos significa que a function ira rodar imediatamente sem atrasos 
