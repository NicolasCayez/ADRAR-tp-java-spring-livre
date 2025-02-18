package com.nicolas.tp_spring_mysql_livre.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livre")
public class Book {
  /* *********************************
  * ATTRIBUTS
  ********************************* */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "titre")
  private String title;
  private String description;
  @Column(name = "date_publication")
  private Date publication_date; // "AAAA-MM-JJ"

  /* *********************************
  * CONSTRUCTEUR
  ********************************* */
  // Vide
  public Book() {
  }
  // Complet sauf Id
  public Book(String title, String description, Date publication_date) {
    this.title = title;
    this.description = description;
    this.publication_date = publication_date;
  }

  /* *********************************
  * GET / SET
  ********************************* */
  // id
  public Long getId() {
    return this.id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  // titre
  public String getTitle() {
    return this.title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  // description
  public String getDescription() {
    return this.description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  // date_publication
  public Date getPublication_date() {
    return this.publication_date;
  }
  public void setPublication_date(Date publication_date) {
    this.publication_date = publication_date;
  }

  /* *********************************
  * toString
  ********************************* */
  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", titre='" + getTitle() + "'" +
      ", description='" + getDescription() + "'" +
      ", date_publication='" + getPublication_date() + "'" +
      "}";
  }

}
