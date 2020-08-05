package PEJ;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Purchase_table")
public class Purchase {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String purchaseId;
    private String purchaseStatus;
    private String prdId;
    private Integer purchaseQty;
    private Integer purchaseAmt;
    private String prdNm;
    private Integer prdPrice;
    private String custNm;

    @PostPersist
    public void onPostPersist(){
        Purchased purchased = new Purchased();
        BeanUtils.copyProperties(this, purchased);
        purchased.publishAfterCommit();


    }

    @PreRemove
    public void onPreRemove(){
        Cancelled cancelled = new Cancelled();
        BeanUtils.copyProperties(this, cancelled);
        cancelled.setPurchaseStatus("취소됨");
        cancelled.publishAfterCommit();


    }


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
