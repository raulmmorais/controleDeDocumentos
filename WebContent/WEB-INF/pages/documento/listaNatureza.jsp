<%@taglib uri="/struts-tags" prefix="s"%>
<h1 class="text-center">Lista Natureza Documento</h1>
<div class="row">
	<div class="col-md-1 text-center">id</div>
	<div class="col-md-7 text-left">Descri&ccedil;&atilde;o</div>
	<div class="col-md-3 text-left">C&oacute;digo</div>
</div>
<s:iterator value="natuezaDocumentos">
	<div class="row">
		<div class="col-md-1 text-center" id="id_<s:property value="id"/>"><s:property value="id"/></div>
		<div class="col-md-7 text-left" id="descricao_<s:property value="id"/>"><s:property value="descricao"/></div>
		<div class="col-md-3 text-left" id="codigo_<s:property value="id"/>"><s:property value="codigo"/></div>
		<div class="col-md-1 text-left" ><button type="button" class="btn btn-default btn-sm" id="<s:property value="id"/>"  data-toggle="modal" data-target="#myModal">Editar</button></div>
	</div>
</s:iterator>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Editar Natureza de Documento</h4>
      </div>
      <div class="modal-body">
		<form action="gravarNaturezaDocumento">
			<input type="hidden" name="naturezaDocumentoVO.id">
			<div class="form-group">
				<label for="descricao">Descri&ccedil;&atilde;o</label>
				<input type="text" id="descricao" class="form-control" name="naturezaDocumentoVO.descricao">
			</div>
			<div class="form-group">
				<label for="codigo">C&oacute;digo</label>
				<input type="text" id="codigo" class="form-control" name="naturezaDocumentoVO.codigo">
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