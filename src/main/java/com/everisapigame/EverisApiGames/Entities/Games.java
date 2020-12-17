package com.everisapigame.EverisApiGames.Entities;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Games")
public class Games {
	
	/**ID DEL JUEGO */
	private Integer id;
	/**TITULO DEL JUEGO */
	private String title;
	/**FECHA DE LANZAMIENTO */
	private String relDate;
	/**CATEGORIA */
	private String category;
	/**GENERO DEL JUEGO */
	private String gender;
	/**IMG DEL JUEGO*/
	private Blob picture;
	private String fileName;
	private Integer fileSize;
	
	//Constructors
	
	/**CONSTRUCTOR VACIO */
	public Games(){
		
	}

	/**CONSTRUCTOR SIN GENERO */
	public Games(Integer id, String title, String relDate, String category, String gender) {
		super();
		this.id = id;
		this.title = title;
		this.relDate = relDate;
		this.category = category;
		this.gender = gender;
	}
	
	/**CONSTRUCTOR COMPLETO */
	public Games(Integer id, String title, String relDate, String category, Blob pic, String name, Integer size) {
		this.id = id;
		this.title = title;
		this.relDate = relDate;
		this.category = category;
		this.picture = pic;
		this.fileName = name;
		this.fileSize = size;
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

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}
}
