package com.beijunyi.hppc.models.data.forms;

import javax.persistence.*;

@Entity
public class FecesTestRecord {

  @Id
  @GeneratedValue
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;


}
