/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package budgetanalysis;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author pc8w3_000
 */
@Entity
@Table(name = "BUDGET")
@NamedQueries({
    @NamedQuery(name = "Budget.findAll", query = "SELECT b FROM Budget b"),
    @NamedQuery(name = "Budget.findByMonth", query = "SELECT b FROM Budget b WHERE b.month = :month"),
    @NamedQuery(name = "Budget.findByPeking", query = "SELECT b FROM Budget b WHERE b.peking = :peking"),
    @NamedQuery(name = "Budget.findByChinakitchen", query = "SELECT b FROM Budget b WHERE b.chinakitchen = :chinakitchen"),
    @NamedQuery(name = "Budget.findByPsu", query = "SELECT b FROM Budget b WHERE b.psu = :psu"),
    @NamedQuery(name = "Budget.findByOtherincome", query = "SELECT b FROM Budget b WHERE b.otherincome = :otherincome"),
    @NamedQuery(name = "Budget.findByIncomecomments", query = "SELECT b FROM Budget b WHERE b.incomecomments = :incomecomments"),
    @NamedQuery(name = "Budget.findByGroceries", query = "SELECT b FROM Budget b WHERE b.groceries = :groceries"),
    @NamedQuery(name = "Budget.findByRent", query = "SELECT b FROM Budget b WHERE b.rent = :rent"),
    @NamedQuery(name = "Budget.findByGas", query = "SELECT b FROM Budget b WHERE b.gas = :gas"),
    @NamedQuery(name = "Budget.findByAlienware", query = "SELECT b FROM Budget b WHERE b.alienware = :alienware"),
    @NamedQuery(name = "Budget.findByGenesis", query = "SELECT b FROM Budget b WHERE b.genesis = :genesis"),
    @NamedQuery(name = "Budget.findByPhone", query = "SELECT b FROM Budget b WHERE b.phone = :phone"),
    @NamedQuery(name = "Budget.findBySubscription", query = "SELECT b FROM Budget b WHERE b.subscription = :subscription"),
    @NamedQuery(name = "Budget.findByEatout", query = "SELECT b FROM Budget b WHERE b.eatout = :eatout"),
    @NamedQuery(name = "Budget.findByEducation", query = "SELECT b FROM Budget b WHERE b.education = :education"),
    @NamedQuery(name = "Budget.findByOtherexpense", query = "SELECT b FROM Budget b WHERE b.otherexpense = :otherexpense"),
    @NamedQuery(name = "Budget.findByExpensecomments", query = "SELECT b FROM Budget b WHERE b.expensecomments = :expensecomments")})
public class Budget implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MONTH")
    private String month;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PEKING")
    private Double peking;
    @Column(name = "CHINAKITCHEN")
    private Double chinakitchen;
    @Column(name = "PSU")
    private Double psu;
    @Column(name = "OTHERINCOME")
    private Double otherincome;
    @Column(name = "INCOMECOMMENTS")
    private String incomecomments;
    @Column(name = "GROCERIES")
    private Double groceries;
    @Column(name = "RENT")
    private Double rent;
    @Column(name = "GAS")
    private Double gas;
    @Column(name = "ALIENWARE")
    private Double alienware;
    @Column(name = "GENESIS")
    private Double genesis;
    @Column(name = "PHONE")
    private Double phone;
    @Column(name = "SUBSCRIPTION")
    private Double subscription;
    @Column(name = "EATOUT")
    private Double eatout;
    @Column(name = "EDUCATION")
    private Double education;
    @Column(name = "OTHEREXPENSE")
    private Double otherexpense;
    @Column(name = "EXPENSECOMMENTS")
    private String expensecomments;

    public Budget() {
    }

    public Budget(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getPeking() {
        return peking;
    }

    public void setPeking(Double peking) {
        this.peking = peking;
    }

    public Double getChinakitchen() {
        return chinakitchen;
    }

    public void setChinakitchen(Double chinakitchen) {
        this.chinakitchen = chinakitchen;
    }

    public Double getPsu() {
        return psu;
    }

    public void setPsu(Double psu) {
        this.psu = psu;
    }

    public Double getOtherincome() {
        return otherincome;
    }

    public void setOtherincome(Double otherincome) {
        this.otherincome = otherincome;
    }

    public String getIncomecomments() {
        return incomecomments;
    }

    public void setIncomecomments(String incomecomments) {
        this.incomecomments = incomecomments;
    }

    public Double getGroceries() {
        return groceries;
    }

    public void setGroceries(Double groceries) {
        this.groceries = groceries;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Double getGas() {
        return gas;
    }

    public void setGas(Double gas) {
        this.gas = gas;
    }

    public Double getAlienware() {
        return alienware;
    }

    public void setAlienware(Double alienware) {
        this.alienware = alienware;
    }

    public Double getGenesis() {
        return genesis;
    }

    public void setGenesis(Double genesis) {
        this.genesis = genesis;
    }

    public Double getPhone() {
        return phone;
    }

    public void setPhone(Double phone) {
        this.phone = phone;
    }

    public Double getSubscription() {
        return subscription;
    }

    public void setSubscription(Double subscription) {
        this.subscription = subscription;
    }

    public Double getEatout() {
        return eatout;
    }

    public void setEatout(Double eatout) {
        this.eatout = eatout;
    }

    public Double getEducation() {
        return education;
    }

    public void setEducation(Double education) {
        this.education = education;
    }

    public Double getOtherexpense() {
        return otherexpense;
    }

    public void setOtherexpense(Double otherexpense) {
        this.otherexpense = otherexpense;
    }

    public String getExpensecomments() {
        return expensecomments;
    }

    public void setExpensecomments(String expensecomments) {
        this.expensecomments = expensecomments;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (month != null ? month.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Budget)) {
            return false;
        }
        Budget other = (Budget) object;
        if ((this.month == null && other.month != null) || (this.month != null && !this.month.equals(other.month))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "budgetanalysis.Budget[ month=" + month + " ]";
    }
    
}
