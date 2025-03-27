function setPreco(valor) {
    localStorage.setItem('preco', valor);  // Salva o valor no localStorage
    window.location.href = 'formvenda.html';  // Redireciona para o formulário
}