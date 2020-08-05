package PEJ;

public class Purchased extends AbstractEvent {

    private Long id;
    private String purchaseId;
    private String purchaseStatus;
    private String prdId;
    private Integer purchaseQty;
    private Integer purchaseAmt;
    private String eventType;
    private String prdNm;
    private Integer prdPrice;
    private String custNm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }
    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }
    public String getPrdId() {
        return prdId;
    }

    public void setPrdId(String prdId) {
        this.prdId = prdId;
    }
    public Integer getPurchaseQty() {
        return purchaseQty;
    }

    public void setPurchaseQty(Integer purchaseQty) {
        this.purchaseQty = purchaseQty;
    }
    public Integer getPurchaseAmt() {
        return purchaseAmt;
    }

    public void setPurchaseAmt(Integer purchaseAmt) {
        this.purchaseAmt = purchaseAmt;
    }
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public String getPrdNm() {
        return prdNm;
    }

    public void setPrdNm(String prdNm) {
        this.prdNm = prdNm;
    }
    public Integer getPrdPrice() {
        return prdPrice;
    }

    public void setPrdPrice(Integer prdPrice) {
        this.prdPrice = prdPrice;
    }
    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }
}