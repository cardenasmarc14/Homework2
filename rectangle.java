public class Rectangle {
    private double width; 
    private double height; 

    // Default constructor to create a rectangle
    public Rectangle() {
        width = 4;
        height = 40; 
    }

    // Constructor to create a rectangle with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;  // Set the width to the specified value
        this.height = height;  // Set the height to the specified value
    }

    // Calculating and return the area of the rectangle
    // Area = width * height
    public double getArea() {
        return width * height;  
    }
    // Calculating and return the perimeter of the rectangle
    // Perimeter = 2 * (width + height)
    public double getPerimeter() {
        return 2 * (width + height);  
    }

    // Retrieving the width of the rectangle
    public double getWidth() {
        return width; 
    }

    // Setting the width of the rectangle
    public void setWidth(double width) {
        this.width = width;  // Set the width of the rectangle to the specified value
    }

    // Getter method to retrieve the height of the rectangle
    public double getHeight() {
        return height;  // Return the height of the rectangle
    }

    // Setter method to set the height of the rectangle
    public void setHeight(double height) {
        this.height = height;  // Set the height of the rectangle to the specified value
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a default rectangle using the default constructor
        Rectangle rectangle1 = new Rectangle();
        // Print details of rectangle1
        System.out.println("Rectangle 1 - Width: " + rectangle1.getWidth() + ", Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());  // Print the area of rectangle1
        System.out.println("Perimeter: " + rectangle1.getPerimeter());  // Print the perimeter of rectangle1

        // Create a rectangle with specified width and height
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        // Print details of rectangle2
        System.out.println("\nRectangle 2 - Width: " + rectangle2.getWidth() + ", Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());  // Print the area of rectangle2
        System.out.println("Perimeter: " + rectangle2.getPerimeter());  // Print the perimeter of rectangle2
    }
}
}