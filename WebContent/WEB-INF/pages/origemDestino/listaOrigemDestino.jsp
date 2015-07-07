<%@taglib uri="/struts-tags" prefix="s"%>
<h1 class="text-center">Lista de Origens/Destinos</h1>
<div class="row">
	<div class="col-md-1 text-center">-</div>
	<div class="col-md-4 text-left">Descrição</div>
	<div class="col-md-1 text-left">Sigla</div>
	<div class="col-md-5 text-left">Endereço</div>
</div>
<s:iterator value="origensDestinos">
	<div class="row">
		<div class="col-md-1 text-center" id="id_<s:property value="codigo"/>"><s:property value="id"/></div>
		<div class="col-md-4 text-left" id="nome_<s:property value="codigo"/>"><s:property value="descricao"/></div>
		<div class="col-md-1 text-left" id="codigo_<s:property value="codigo"/>"><s:property value="codigo"/></div>
		<div class="col-md-5 text-left" id="nome_id_<s:property value="codigo"/>">
			<s:property value="enderecoVO.tipoLogradouro"/>: <s:property value="enderecoVO.logradouro"/>, N&ordn;<s:property value="enderecoVO.numero"/>.
			<s:property value="enderecoVO.bairro"/>, <s:property value="enderecoVO.cidade"/>
		</div>
		<div class="col-md-1 text-left" ><button type="button" class="btn btn-default btn-sm" id="<s:property value="codigo"/>"  data-toggle="modal" data-target="#myModal">Editar</button></div>
	</div>
</s:iterator>

<!-- Modal -->

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Editar Autor</h4>
      </div>
      <div class="modal-body">
		<form action="gravarAutor">
			<input type="hidden" name="autorVO.codigo">
			<div class="form-group">
				<label for="nome">Descri&ccedil;&atilde;o</label>
				<input type="text" id="nome" class="form-control" name="autorVO.nome">
			</div>
			<div class="form-group">
				<label for="codigo">ID</label>
				<input type="text" id="codigo" class="form-control" name="autorVO.codigo">
			</div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
        <button type="button" class="btn btn-primary">Salvar</button>
      </div>
    </div>
  </div>
</div>