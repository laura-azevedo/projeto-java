package bookstore.models;

import java.util.Date;

/** A children's book is a kind of book written for young readers.
 * They're designed to be educational, with content tailored to different stages of childhood development.
 * 
 * @field targetAge: the age group the book is intended for, like toddler, child and pre-teen.
 * @field theme: the main subject of the book, like friendship, adventure or family.
 * @field learningObjective: the educational goal that the book aims to achieve, like teaching the importance
 * of kindness, the concept of collaboration, healthy eating habits etc.
 **/
public class ChildrenBook extends Book {

	private String targetAge;
	private String theme;
	private String learningObjective;
	
	public ChildrenBook(
			String title, String author, String isbn, String genre, String publisher, 
			Date publishDate, float price, int pageCount, String language, 
			String targetAge, String theme, String learningObjective) {
		
		super(title, author, isbn, genre, publisher, publishDate, price, pageCount, language);
		this.targetAge = targetAge;
		this.theme = theme;
		this.learningObjective = learningObjective;

	}

	public String getTargetAge() {
		return targetAge;
	}

	public void setTargetAge(String targetAge) {
		this.targetAge = targetAge;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getLearningObjective() {
		return learningObjective;
	}

	public void setLearningObjective(String learningObjective) {
		this.learningObjective = learningObjective;
	}
	
}
