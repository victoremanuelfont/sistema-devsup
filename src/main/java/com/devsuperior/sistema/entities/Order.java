package com.devsuperior.sistema.entities;

public class Order {

        private Integer code;
        private Double basic;
        private Double discount;

        public Order(){
        }

    public Order(Integer code, Double basic, Double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "code=" + code +
                ", basic=" + basic +
                ", discount=" + discount +
                '}';
    }
}
