package PEJ;

public class OutOfStock extends AbstractEvent {

    private Long id;
    private String prdId;
    private Integer prdQty;
    private Integer prdPrice;
    private String prdNm;
    private String eventType;
    private String purchaseId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId;
    }
    public Integer getPrdQty() {
        return prdQty;
    }

    public void setPrdQty(Integer prdQty) {
        this.prdQty = prdQty;
    }
    public Integer getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(Integer prdPrice) {
        this.prdPrice = prdPrice;
    }
    public String getPrdNm() {
        return prdNm;
    }

    public void setPrdNm(String prdNm) {
        this.prdNm = prdNm;
    }
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }
}