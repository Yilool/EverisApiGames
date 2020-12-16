package com.everisapigame.EverisApiGames.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Games")
public class Games {
	
	/**ID DEL JUEGO */
	private Integer id;
	/**tITULO DEL JUEGO */
	private String title;
	/**fECHA DE LANZAMIENTO */
	private String relDate;
	/**CATEGORIA */
	private String category;
	/**GENERO DEL JUEGO */
	private String gender;
	
	//Constructors
	
	/**CONSTRUCTOR VACIO */
	public Games(){
		
	}

	/**CONSTRUCTOR SIN GENERO */
	public Games(Integer id, String title, String relDate, String category) {
		super();
		this.id = id;
		this.title = title;
		this.relDate = relDate;
		this.category = category;
	}
	
	/**CONSTRUCTOR COMPLETO */
	public Games(Integer id, String title, String relDate, String category, String gender) {
		this.id = id;
		this.title = title;
		this.relDate = relDate;
		this.category = category;
		this.gender = gender;
	}
	
	//Getter and Setter

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	@Column(name = "Title")
	public String getTitle() {
		return title;
	}

	/**
	 * @param titl the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the relDat
	 */
	@Column(name = "ReleaseDate")
	public String getRelDate() {
		return relDate;
	}

	/**
	 * @param relDat the relDat to set
	 */
	public void setRelDate(String relDat) {
		this.relDate = relDat;
	}

	/**
	 * @return the category
	 */
	@Column(name = "Category")
	public String getCategory() {
		return category;
	}

	/**
	 * @param categor the category to set
	 */
	public void setCategory(String categor) {
		this.category = categor;
	}

	/**
	 * @return the gender
	 */
	@Column(name = "Gender")
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
