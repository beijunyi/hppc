package com.beijunyi.hppc.models.data.forms;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "biochemistry_test_record")
public class BiochemistryTestRecord {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "parent_form", nullable = false, updatable = false)
  private Integer parentForm;

  @Column(name = "timestamp", nullable = false)
  private Date timestamp;

  @Column(name = "veterinarian_name")
  private String veterinarianName;

  @Column(name = "docimaster_name")
  private String docimasterName;

  @Column(name = "amyl")
  private Double amyl;

  @Column(name = "tp")
  private Double tp;

  @Column(name = "ca")
  private Double ca;

  @Column(name = "phos")
  private Double phos;

  @Column(name = "alkp")
  private Double alkp;

  @Column(name = "alb")
  private Double alb;

  @Column(name = "alt")
  private Double alt;

  @Column(name = "tbil")
  private Double tbil;

  @Column(name = "chol")
  private Double chol;

  @Column(name = "glu")
  private Double glu;

  @Column(name = "crea")
  private Double crea;

  @Column(name = "bun")
  private Double bun;

  @Column(name = "glob")
  private Double glob;

  @Column(name = "supplementary_information")
  private String supplementaryInformation;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getParentForm() {
    return parentForm;
  }

  public void setParentForm(Integer parentForm) {
    this.parentForm = parentForm;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getVeterinarianName() {
    return veterinarianName;
  }

  public void setVeterinarianName(String veterinarianName) {
    this.veterinarianName = veterinarianName;
  }

  public String getDocimasterName() {
    return docimasterName;
  }

  public void setDocimasterName(String docimasterName) {
    this.docimasterName = docimasterName;
  }

  public Double getAmyl() {
    return amyl;
  }

  public void setAmyl(Double amyl) {
    this.amyl = amyl;
  }

  public Double getTp() {
    return tp;
  }

  public void setTp(Double tp) {
    this.tp = tp;
  }

  public Double getCa() {
    return ca;
  }

  public void setCa(Double ca) {
    this.ca = ca;
  }

  public Double getPhos() {
    return phos;
  }

  public void setPhos(Double phos) {
    this.phos = phos;
  }

  public Double getAlkp() {
    return alkp;
  }

  public void setAlkp(Double alkp) {
    this.alkp = alkp;
  }

  public Double getAlb() {
    return alb;
  }

  public void setAlb(Double alb) {
    this.alb = alb;
  }

  public Double getAlt() {
    return alt;
  }

  public void setAlt(Double alt) {
    this.alt = alt;
  }

  public Double getTbil() {
    return tbil;
  }

  public void setTbil(Double tbil) {
    this.tbil = tbil;
  }

  public Double getChol() {
    return chol;
  }

  public void setChol(Double chol) {
    this.chol = chol;
  }

  public Double getGlu() {
    return glu;
  }

  public void setGlu(Double glu) {
    this.glu = glu;
  }

  public Double getCrea() {
    return crea;
  }

  public void setCrea(Double crea) {
    this.crea = crea;
  }

  public Double getBun() {
    return bun;
  }

  public void setBun(Double bun) {
    this.bun = bun;
  }

  public Double getGlob() {
    return glob;
  }

  public void setGlob(Double glob) {
    this.glob = glob;
  }

  public String getSupplementaryInformation() {
    return supplementaryInformation;
  }

  public void setSupplementaryInformation(String supplementaryInformation) {
    this.supplementaryInformation = supplementaryInformation;
  }
}
