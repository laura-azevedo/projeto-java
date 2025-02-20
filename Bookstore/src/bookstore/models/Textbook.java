package bookstore.models;

import java.util.Date;

/**A textbook is a type of book used for educational purposes, typically written for a specific
 * subject or academic field and used in universities and schools.
 * They often includes explanations, examples, exercises and other types of content to support learning
 * in a paced way.
 * @field targetAudience: group for whom it is intended, like undergrads, high school students, elementary school students or professionals
 * @field level: beginner, intermediate, advanced
 * @field institution: the educational organization where it is used
 **/

public class Textbook extends Book {
	
	private String targetAudience;
	private String level;
	private String institution;
	
	
	public Textbook(
			String title, String author, String isbn, String genre, String publisher, 
			Date publishDate, float price, int pageCount, String language, String targetAudience, 
			String level, String institution) {
		
		super(title, author, isbn, genre, publisher, publishDate, price, pageCount, language);
		this.targetAudience = targetAudience;
		this.level = level;
		this.institution = institution;
	}
	
	public String getTargetAudience() {
		return targetAudience;
	}
	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
}