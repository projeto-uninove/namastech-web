$(document).ready(function(){
	$("#inputSubmit").click(function(e){
		var usuario = $('#inputNome').val(),
			senha 	= $('#inputSenha').val(),
			tipo 	= $('#inputTipo').val();

		if (tipo !== 'DEV' && usuario && senha) {
			e.preventDefault();
			alert("Tipo de usuário inválido!");
		} else {
			if(usuario == 'usuario' && senha ==='senha' && tipo === 'DEV'){
				return true
			} else {
				e.preventDefault();
				alert("Usuário ou Senha Incorreto!");
			}
		}
	})
});