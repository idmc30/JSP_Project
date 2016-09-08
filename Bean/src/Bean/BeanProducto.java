package Bean;

public class BeanProducto {
    private Integer CodProd;
    private BeanCatProducto categoriaProducto;
    private String nomProd;
    private Double precProd;
    private Integer stockActualProd;
    private String descProd;
    private String estadoProd;
    private String desckar;

    public Integer getCodProd() {
        return CodProd;
    }

    public void setCodProd(Integer CodProd) {
        this.CodProd = CodProd;
    }

    public BeanCatProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(BeanCatProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    


    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public Double getPrecProd() {
        return precProd;
    }

    public void setPrecProd(Double precProd) {
        this.precProd = precProd;
    }

    public Integer getStockActualProd() {
        return stockActualProd;
    }

    public void setStockActualProd(Integer stockActualProd) {
        this.stockActualProd = stockActualProd;
    }

    public String getDescProd() {
        return descProd;
    }

    public void setDescProd(String descProd) {
        this.descProd = descProd;
    }

    public String getEstadoProd() {
        return estadoProd;
    }

    public void setEstadoProd(String estadoProd) {
        this.estadoProd = estadoProd;
    }

    public String getDesckar() {
        return desckar;
    }

    public void setDesckar(String desckar) {
        this.desckar = desckar;
    }
}
