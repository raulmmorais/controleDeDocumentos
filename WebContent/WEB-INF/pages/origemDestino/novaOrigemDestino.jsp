<h1 class="text-center">Nova Origem/Destino</h1>
<form action="gravarNaturezaDocumento" class="form-horizontal">
	<div class="form-group">
		<label for="descricao">Descrição</label>
		<textarea rows="3" cols="200"  id="descricao" class="form-control" name="origemDestinoVO.descricao"></textarea>
	</div>
	<div class="form-group">
		<label for="sigla" class="col-sm-2 control-label text-left">Sigla</label>
		<div class="col-sm-2">
			<input type="text" id="sigla" class="form-control" name="origemDestinoVO.codigo">
		</div>
	</div>
	<div class="form-group">
    	<label for="cep" class="col-sm-1 control-label text-left">Cep</label>
    	<div class="col-sm-2">
	    	<input type="zip-code" class="form-control" id="cep" placeholder="Cep" name="origemDestinoVO.enderecoVO.cep">
    	</div>
	</div>
	
	
	
	
	<div class="form-group">
		<div class="col-sm-1">
			<button type="submit" class="btn btn-default">Gravar</button>
		</div>
	</div>
</form>