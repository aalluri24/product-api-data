package com.sample.productapidata.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductOrder {
    @Id
    private String id;
    private String customerId;
    private String invoiceAmount;

    public ProductOrder() {
    }

    public ProductOrder(String id, String customerId, String invoiceAmount) {
        this.id = id;
        this.customerId = customerId;
        this.invoiceAmount = invoiceAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }
}
