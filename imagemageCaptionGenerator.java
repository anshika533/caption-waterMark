import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public  class imagemageCaptionGenerator {

    public static void main(String[] args) {
        try {
            // Load the original image
            BufferedImage originalImage = ImageIO.read(new File("image/img.jpg"));

            // Set up the caption properties
            String caption = "anshika chauhan";
            Font font = new Font("Arial", Font.PLAIN, 24);
            Color textColor = Color.WHITE;

            // Create a graphics object to draw on the image
            Graphics2D g2d = originalImage.createGraphics();
            g2d.setFont(font);
            g2d.setColor(textColor);

            // Set the position to add the caption (you can adjust this)
            int x = 70;
            int y = 70;

            // Draw the caption on the image
            g2d.drawString(caption, x, y);

            // Save the watermarked image
            ImageIO.write(originalImage, "jpg", new File("image/img.jpg"));

            System.out.println("Watermark added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
