<h1 class="text-center">Nova Origem/Destino</h1>
<form action="gravarOrigemDestino" method="post" class="form-horizontal">
	<div class="form-group">
		<label for="descricao">Descri&ccedil;&atilde;o</label>
		<textarea rows="3" cols="200"  id="descricao" class="form-control" name="origemDestinoVO.descricao"></textarea>
	</div>
	<div class="form-group">
		<label for="sigla" class="col-sm-1 control-label">Sigla</label>
		<div class="col-sm-2">
			<input type="text" id="sigla" class="form-control" name="origemDestinoVO.codigo">
		</div>
	</div>
	
	<div class="form-group">
		<label class="col-sm-12 text-center">Dados de Endere&ccedil;o</label>
		<hr>
	</div>
	<div class="form-group">
		<div class="col-sm-2">
			<select name="origemDestinoVO.enderecoVO.tipoLogradouro" class="form-control">
				<option>Selecione</option>
				<option value="AEROPORTO">Aeroporto</option> 
				<option value="ALAMEDA">Alameda</option> 
				<option value="APARTAMENTO">Apartamento</option> 
				<option value="AVENIDA">Avenida</option> 
				<option value="BECO">Beco</option> 
				<option value="BLOCO">Bloco</option>
				<option value="CAMINHO">Caminho</option>
				<option value="ESCADINHA">Escadinha</option>
				<option value="ESTACAO">Esta&ccedil;&atilde;o</option>
				<option value="ESTRADA">Estrada</option>
				<option value="FAZENDA">Fazemda</option>
				<option value="FORTALEZA">Fortaleza</option>
				<option value="GALERIA">Galeria</option>
				<option value="LADEIRA">Ladeira</option>
				<option value="LARGO">Largo</option>
				<option value="PRAÇA">Pra&ccedil;a</option>
				<option value="PARQUE">Parque</option>
				<option value="PRAIA">Praia</option>
				<option value="QUADRA">Quadra</option>
				<option value="QUILOMETRO">Quil&ocirc;metro</option>
				<option value="QUINTA">Quinta</option>
				<option value="RODOVIA">Rodovia</option>
				<option value="RUA">Rua</option>
				<option value="SUPERQUADRA">Super Quadra</option>  
				<option value="TRAVESSA">Travessa</option>
				<option value="VIADUTO">Viadulto</option>
				<option value="VILA">Vila</option>
			</select>
		</div>
		<div class="col-sm-7">
			<input type="text" class="form-control" placeholder="Endere&ccedil;o" name="origemDestinoVO.enderecoVO.logradouro">
		</div>
    	<label for="numero" class="col-sm-1 control-label">N&uacute;mero</label>
    	<div class="col-sm-2">
	    	<input type="text" class="form-control" id="numero" placeholder="N&ordm;" name="origemDestinoVO.enderecoVO.numero">
    	</div>
	</div>
	<div class="form-group">
    	<label for="cep" class="col-sm-1 control-label text-left">Cep</label>
    	<div class="col-sm-2">
	    	<input type="text" class="form-control" id="cep" placeholder="Cep" name="origemDestinoVO.enderecoVO.cep">
    	</div>
		<label for="complemento" class="col-sm-1 control-label">Complemento</label>
		<div class="col-sm-8">
			<input type="text" class="form-control" id="complemento" placeholder="Complemento" name="origemDestinoVO.enderecoVO.complemento">
		</div>
	</div>
	<div class="form-group">
    	<label for="bairro" class="col-sm-1 control-label text-left">Bairro</label>
    	<div class="col-sm-5">
	    	<input type="text" class="form-control" id="bairro" placeholder="Bairro" name="origemDestinoVO.enderecoVO.bairro">
    	</div>
		<label for="cidade" class="col-sm-1 control-label">Cidade</label>
		<div class="col-sm-5">
			<input type="text" class="form-control" id="complemento" placeholder="Complemento" name="origemDestinoVO.enderecoVO.cidade">
		</div>
	</div>
	
	
	
	
	<div class="form-group">
		<div class="col-sm-offset-11 col-sm-1">
			<button type="submit" class="btn btn-default">Gravar</button>
		</div>
	</div>
</form>