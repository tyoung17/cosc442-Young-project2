package edu.towson.cis.cosc442.project2.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The width & height **/
	public Double width, height;
	
	/**
	 * Instantiates a new rectangle.
	 * with upper left corner at (0,0) in coordinate space
	 * @param w the width
	 * @param h the height
	 */
	Rectangle(Double w, Double h) {
		width = w;
		height = h;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		return width * height;
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		return Math.sqrt(Math.pow((width), 2) + Math.pow((height), 2));
	}
}
