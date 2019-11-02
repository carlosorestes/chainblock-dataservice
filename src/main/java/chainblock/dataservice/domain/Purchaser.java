package chainblock.dataservice.domain;

import java.io.Serializable;

public class Purchaser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String venda;
	private String lote;
	private String grupodolote;
	private String cordolote;
	private String categoriadolote;
	private String calibredolote;
	private String insumosdolote;
	private String quantidadelotevendido;
	private String valornegociadodavenda;
	private String safra;
	private String datacadastrovendadolote;
	private String qtdvendido;
	private String produtor;
	private String fazenda;
	private String inscricaoestadualfazenda;
	private String cnpjfazenda;
	private String cgcfazenda;
	private String ccirfazenda;
	private String enderecofazenda;
	private String cidadedafazenda;
	private String estadodafazenda;
	private String telefonefazenda;
	private String cepfazenda;
	private String fazendalatitude;
	private String fazendalongitude;
	private String distribuidor;
	private String cnpjdistribuidor;
	private String iedistribuidor;
	private String enderecodistribuidor;
	private String numerodistribuidor;
	private String bairrodistribuidor;
	private String cidadedistribuidor;
	private String estadodistribuidor;
	private String telefonedistribuidor;
	private String distribuidorlatitude;
	private String distribuidorlongitude;
	private String cliente;
	private String cnpjcliente;
	private String iecliente;
	private String enderecocliente;
	private String numerocliente;
	private String bairrocliente;
	private String cidadecliente;
	private String estadocliente;
	private String cepcliente;
	private String telefonecliente;
	private String clientelatitude;
	private String clientelongitude;
	private String previousHash;
	
	public Purchaser() {
	}

	public Purchaser(String venda, String lote, String grupodolote, String cordolote, String categoriadolote,
			String calibredolote, String insumosdolote, String quantidadelotevendido, String valornegociadodavenda,
			String safra, String datacadastrovendadolote, String qtdvendido, String produtor, String fazenda,
			String inscricaoestadualfazenda, String cnpjfazenda, String cgcfazenda, String ccirfazenda,
			String enderecofazenda, String cidadedafazenda, String estadodafazenda, String telefonefazenda,
			String cepfazenda, String fazendalatitude, String fazendalongitude, String distribuidor,
			String cnpjdistribuidor, String iedistribuidor, String enderecodistribuidor, String numerodistribuidor,
			String bairrodistribuidor, String cidadedistribuidor, String estadodistribuidor,
			String telefonedistribuidor, String distribuidorlatitude, String distribuidorlongitude, String cliente,
			String cnpjcliente, String iecliente, String enderecocliente, String numerocliente, String bairrocliente,
			String cidadecliente, String estadocliente, String cepcliente, String telefonecliente,
			String clientelatitude, String clientelongitude, String previousHash) {
		
		this.venda = venda;
		this.lote = lote;
		this.grupodolote = grupodolote;
		this.cordolote = cordolote;
		this.categoriadolote = categoriadolote;
		this.calibredolote = calibredolote;
		this.insumosdolote = insumosdolote;
		this.quantidadelotevendido = quantidadelotevendido;
		this.valornegociadodavenda = valornegociadodavenda;
		this.safra = safra;
		this.datacadastrovendadolote = datacadastrovendadolote;
		this.qtdvendido = qtdvendido;
		this.produtor = produtor;
		this.fazenda = fazenda;
		this.inscricaoestadualfazenda = inscricaoestadualfazenda;
		this.cnpjfazenda = cnpjfazenda;
		this.cgcfazenda = cgcfazenda;
		this.ccirfazenda = ccirfazenda;
		this.enderecofazenda = enderecofazenda;
		this.cidadedafazenda = cidadedafazenda;
		this.estadodafazenda = estadodafazenda;
		this.telefonefazenda = telefonefazenda;
		this.cepfazenda = cepfazenda;
		this.fazendalatitude = fazendalatitude;
		this.fazendalongitude = fazendalongitude;
		this.distribuidor = distribuidor;
		this.cnpjdistribuidor = cnpjdistribuidor;
		this.iedistribuidor = iedistribuidor;
		this.enderecodistribuidor = enderecodistribuidor;
		this.numerodistribuidor = numerodistribuidor;
		this.bairrodistribuidor = bairrodistribuidor;
		this.cidadedistribuidor = cidadedistribuidor;
		this.estadodistribuidor = estadodistribuidor;
		this.telefonedistribuidor = telefonedistribuidor;
		this.distribuidorlatitude = distribuidorlatitude;
		this.distribuidorlongitude = distribuidorlongitude;
		this.cliente = cliente;
		this.cnpjcliente = cnpjcliente;
		this.iecliente = iecliente;
		this.enderecocliente = enderecocliente;
		this.numerocliente = numerocliente;
		this.bairrocliente = bairrocliente;
		this.cidadecliente = cidadecliente;
		this.estadocliente = estadocliente;
		this.cepcliente = cepcliente;
		this.telefonecliente = telefonecliente;
		this.clientelatitude = clientelatitude;
		this.clientelongitude = clientelongitude;
		this.previousHash = previousHash;
	}

	public String getVenda() {
		return venda;
	}

	public void setVenda(String venda) {
		this.venda = venda;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getGrupodolote() {
		return grupodolote;
	}

	public void setGrupodolote(String grupodolote) {
		this.grupodolote = grupodolote;
	}

	public String getCordolote() {
		return cordolote;
	}

	public void setCordolote(String cordolote) {
		this.cordolote = cordolote;
	}

	public String getCategoriadolote() {
		return categoriadolote;
	}

	public void setCategoriadolote(String categoriadolote) {
		this.categoriadolote = categoriadolote;
	}

	public String getCalibredolote() {
		return calibredolote;
	}

	public void setCalibredolote(String calibredolote) {
		this.calibredolote = calibredolote;
	}

	public String getInsumosdolote() {
		return insumosdolote;
	}

	public void setInsumosdolote(String insumosdolote) {
		this.insumosdolote = insumosdolote;
	}

	public String getQuantidadelotevendido() {
		return quantidadelotevendido;
	}

	public void setQuantidadelotevendido(String quantidadelotevendido) {
		this.quantidadelotevendido = quantidadelotevendido;
	}

	public String getValornegociadodavenda() {
		return valornegociadodavenda;
	}

	public void setValornegociadodavenda(String valornegociadodavenda) {
		this.valornegociadodavenda = valornegociadodavenda;
	}

	public String getSafra() {
		return safra;
	}

	public void setSafra(String safra) {
		this.safra = safra;
	}

	public String getDatacadastrovendadolote() {
		return datacadastrovendadolote;
	}

	public void setDatacadastrovendadolote(String datacadastrovendadolote) {
		this.datacadastrovendadolote = datacadastrovendadolote;
	}

	public String getQtdvendido() {
		return qtdvendido;
	}

	public void setQtdvendido(String qtdvendido) {
		this.qtdvendido = qtdvendido;
	}

	public String getProdutor() {
		return produtor;
	}

	public void setProdutor(String produtor) {
		this.produtor = produtor;
	}

	public String getFazenda() {
		return fazenda;
	}

	public void setFazenda(String fazenda) {
		this.fazenda = fazenda;
	}

	public String getInscricaoestadualfazenda() {
		return inscricaoestadualfazenda;
	}

	public void setInscricaoestadualfazenda(String inscricaoestadualfazenda) {
		this.inscricaoestadualfazenda = inscricaoestadualfazenda;
	}

	public String getCnpjfazenda() {
		return cnpjfazenda;
	}

	public void setCnpjfazenda(String cnpjfazenda) {
		this.cnpjfazenda = cnpjfazenda;
	}

	public String getCgcfazenda() {
		return cgcfazenda;
	}

	public void setCgcfazenda(String cgcfazenda) {
		this.cgcfazenda = cgcfazenda;
	}

	public String getCcirfazenda() {
		return ccirfazenda;
	}

	public void setCcirfazenda(String ccirfazenda) {
		this.ccirfazenda = ccirfazenda;
	}

	public String getEnderecofazenda() {
		return enderecofazenda;
	}

	public void setEnderecofazenda(String enderecofazenda) {
		this.enderecofazenda = enderecofazenda;
	}

	public String getCidadedafazenda() {
		return cidadedafazenda;
	}

	public void setCidadedafazenda(String cidadedafazenda) {
		this.cidadedafazenda = cidadedafazenda;
	}

	public String getEstadodafazenda() {
		return estadodafazenda;
	}

	public void setEstadodafazenda(String estadodafazenda) {
		this.estadodafazenda = estadodafazenda;
	}

	public String getTelefonefazenda() {
		return telefonefazenda;
	}

	public void setTelefonefazenda(String telefonefazenda) {
		this.telefonefazenda = telefonefazenda;
	}

	public String getCepfazenda() {
		return cepfazenda;
	}

	public void setCepfazenda(String cepfazenda) {
		this.cepfazenda = cepfazenda;
	}

	public String getFazendalatitude() {
		return fazendalatitude;
	}

	public void setFazendalatitude(String fazendalatitude) {
		this.fazendalatitude = fazendalatitude;
	}

	public String getFazendalongitude() {
		return fazendalongitude;
	}

	public void setFazendalongitude(String fazendalongitude) {
		this.fazendalongitude = fazendalongitude;
	}

	public String getDistribuidor() {
		return distribuidor;
	}

	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}

	public String getCnpjdistribuidor() {
		return cnpjdistribuidor;
	}

	public void setCnpjdistribuidor(String cnpjdistribuidor) {
		this.cnpjdistribuidor = cnpjdistribuidor;
	}

	public String getIedistribuidor() {
		return iedistribuidor;
	}

	public void setIedistribuidor(String iedistribuidor) {
		this.iedistribuidor = iedistribuidor;
	}

	public String getEnderecodistribuidor() {
		return enderecodistribuidor;
	}

	public void setEnderecodistribuidor(String enderecodistribuidor) {
		this.enderecodistribuidor = enderecodistribuidor;
	}

	public String getNumerodistribuidor() {
		return numerodistribuidor;
	}

	public void setNumerodistribuidor(String numerodistribuidor) {
		this.numerodistribuidor = numerodistribuidor;
	}

	public String getBairrodistribuidor() {
		return bairrodistribuidor;
	}

	public void setBairrodistribuidor(String bairrodistribuidor) {
		this.bairrodistribuidor = bairrodistribuidor;
	}

	public String getCidadedistribuidor() {
		return cidadedistribuidor;
	}

	public void setCidadedistribuidor(String cidadedistribuidor) {
		this.cidadedistribuidor = cidadedistribuidor;
	}

	public String getEstadodistribuidor() {
		return estadodistribuidor;
	}

	public void setEstadodistribuidor(String estadodistribuidor) {
		this.estadodistribuidor = estadodistribuidor;
	}

	public String getTelefonedistribuidor() {
		return telefonedistribuidor;
	}

	public void setTelefonedistribuidor(String telefonedistribuidor) {
		this.telefonedistribuidor = telefonedistribuidor;
	}

	public String getDistribuidorlatitude() {
		return distribuidorlatitude;
	}

	public void setDistribuidorlatitude(String distribuidorlatitude) {
		this.distribuidorlatitude = distribuidorlatitude;
	}

	public String getDistribuidorlongitude() {
		return distribuidorlongitude;
	}

	public void setDistribuidorlongitude(String distribuidorlongitude) {
		this.distribuidorlongitude = distribuidorlongitude;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCnpjcliente() {
		return cnpjcliente;
	}

	public void setCnpjcliente(String cnpjcliente) {
		this.cnpjcliente = cnpjcliente;
	}

	public String getIecliente() {
		return iecliente;
	}

	public void setIecliente(String iecliente) {
		this.iecliente = iecliente;
	}

	public String getEnderecocliente() {
		return enderecocliente;
	}

	public void setEnderecocliente(String enderecocliente) {
		this.enderecocliente = enderecocliente;
	}

	public String getNumerocliente() {
		return numerocliente;
	}

	public void setNumerocliente(String numerocliente) {
		this.numerocliente = numerocliente;
	}

	public String getBairrocliente() {
		return bairrocliente;
	}

	public void setBairrocliente(String bairrocliente) {
		this.bairrocliente = bairrocliente;
	}

	public String getCidadecliente() {
		return cidadecliente;
	}

	public void setCidadecliente(String cidadecliente) {
		this.cidadecliente = cidadecliente;
	}

	public String getEstadocliente() {
		return estadocliente;
	}

	public void setEstadocliente(String estadocliente) {
		this.estadocliente = estadocliente;
	}

	public String getCepcliente() {
		return cepcliente;
	}

	public void setCepcliente(String cepcliente) {
		this.cepcliente = cepcliente;
	}

	public String getTelefonecliente() {
		return telefonecliente;
	}

	public void setTelefonecliente(String telefonecliente) {
		this.telefonecliente = telefonecliente;
	}

	public String getClientelatitude() {
		return clientelatitude;
	}

	public void setClientelatitude(String clientelatitude) {
		this.clientelatitude = clientelatitude;
	}

	public String getClientelongitude() {
		return clientelongitude;
	}

	public void setClientelongitude(String clientelongitude) {
		this.clientelongitude = clientelongitude;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((venda == null) ? 0 : venda.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchaser other = (Purchaser) obj;
		if (venda == null) {
			if (other.venda != null)
				return false;
		} else if (!venda.equals(other.venda))
			return false;
		return true;
	}

}