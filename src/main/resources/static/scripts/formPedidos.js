// Captura o valor da pizza do localStorage e define no campo oculto
document.getElementById('valor').value = localStorage.getItem('preco');

// Função para enviar o pedido via API
document.getElementById('formPedido').addEventListener('submit', function(event) {
    event.preventDefault();  // Impede o envio tradicional do formulário

    // Coleta os dados do formulário
    const formData = new FormData(this);

    // Cria um objeto com os dados do formulário
    const pedido = {};
    formData.forEach((value, key) => {
        pedido[key] = value;
    });

    // Envia os dados para o backend via fetch
    fetch('http://localhost:8080/pedidos', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(pedido)  // Converte o objeto para JSON
    })
    .then(response => response.json())
    .then(data => {
        console.log('Pedido registrado:', data);
        alert('Pedido realizado com sucesso!');
    })
    .catch(error => {
        console.error('Erro ao enviar o pedido:', error);
        alert('Ocorreu um erro ao realizar o pedido. Tente novamente.');
    });
});