/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chorra;

/**
 *
 * @author fco-j
 */
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;

public class YoutubeLikeUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel contentPane = new JPanel(new BorderLayout(0,0));
        frame.setContentPane(contentPane);

        // This is the part than you're interested in
        // Adding video to the panel
        JPanel videos = new JPanel();
        // Important, make videos stack under each other / vertically
        BoxLayout layout = new BoxLayout(videos, BoxLayout.Y_AXIS);
        videos.setLayout(layout);
        // Here we are adding the individual videos to the so called "list"
        // You can change the JPanel "video" to an JScrollPanel and make the video list scrollable
        videos.add(new Video("Why not choose the shark slayer ways?", 4975742, "Showing Slap Tech 24/7",
                "https://images.indianexpress.com/2022/03/will-smith-slap-memes.jpg"));
        videos.add(new Video("This medal SLAPS", 9284573, "Showing Slap Tech 24/7",
                "https://analyticsinsight.b-cdn.net/wp-content/uploads/2022/03/Will-Smith-Slap-Token-Another-Meme-Currency-Over-Controversy.jpg"));
        videos.add(new Video("Memes 4 life. Here's why!", 7947173, "Showing Slap Tech 24/7",
                "https://apicms.thestar.com.my/uploads/images/2022/03/29/1531537.jpg"));
        videos.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(8, 0, 8, 0), null));
        contentPane.add(videos, BorderLayout.EAST);
        // That was it, the magic, down below you see a class Video, look that up also

        // Nothing exciting, a demo video, just for the looks :)
        JPanel demoVideo = new JPanel();
        BoxLayout layout2 = new BoxLayout(demoVideo, BoxLayout.Y_AXIS);
        demoVideo.setLayout(layout2);

        // Search bar
        JTextField search = new JTextField() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                if (getText().length() == 0) {
                    int h = getHeight();
                    ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
                    Insets ins = getInsets();
                    FontMetrics fm = g.getFontMetrics();
                    int c0 = getBackground().getRGB();
                    int c1 = getForeground().getRGB();
                    int m = 0xfefefefe;
                    int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
                    g.setColor(new Color(c2, true));
                    g.drawString("Search anything", ins.left, h / 2 + fm.getAscent() / 2 - 2);
                }
            }
        };
        search.setFont(new Font("Arial", Font.PLAIN, 24));
        search.setBackground(new Color(192, 192, 192, 255));
        search.setForeground(Color.WHITE);
        search.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(8, 8, 8, 8),
                BorderFactory.createLineBorder(Color.white)));
        contentPane.add(search, BorderLayout.NORTH);

        // Video
        demoVideo.add(new JLabel(new ImageIcon(getImage("https://pbs.twimg.com/media/FO6crICVUAIfS3N?format=jpg&name=360x360").
                getScaledInstance(640, 360, Image.SCALE_SMOOTH))));
        JPanel info = new JPanel(new BorderLayout(8, 8));

        // Title
        JLabel title = new JLabel("The MASTERY of slapping it. Get professional");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        demoVideo.add(title);

        // Views
        JLabel views = new JLabel("8,195,384 views");
        views.setFont(new Font("Arial", Font.PLAIN, 18));
        demoVideo.add(views);

        // Author
        JLabel author = new JLabel(" Showing Slap Tech 24/7 ");
        author.setFont(new Font("Arial", Font.BOLD, 12));
        author.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        author.setBackground(new Color(0, 0, 0, 64));
        demoVideo.add(author);

        demoVideo.add(info);
        // Add gap around the content pane
        demoVideo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(8, 8, 8, 8), null));
        contentPane.add(demoVideo, BorderLayout.LINE_START);

        // JFrame info
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static class Video extends JPanel {
        String name, author, imageURL;
        int views;
        BufferedImage image;

        public Video(String title, int views, String author, String imageURL) {
            super(new BorderLayout(8, 8));
            // Set the size of the video panel
            setMaximumSize(new Dimension(500, 100));
            setMinimumSize(new Dimension(500, 100));
            setPreferredSize(new Dimension(500, 100));

            // Initialize variables, add your own if needed
            this.name = title;
            this.views = views;
            this.author = author;
            this.imageURL = imageURL;

            // Get image, remove it and pass the image directly as an argument if needed
            image = getImage(imageURL);

            // Add components, here's the magic
            JLabel thumbnail = new JLabel(new ImageIcon(image.getScaledInstance(170, 96, Image.SCALE_DEFAULT)));
            thumbnail.setPreferredSize(new Dimension(170, 96));
            add(thumbnail, BorderLayout.WEST);

            JPanel info = new JPanel();
            BoxLayout layout = new BoxLayout(info, BoxLayout.Y_AXIS);
            info.setLayout(layout);

            JLabel titleLabel = new JLabel(makeWebSafe(title));
            titleLabel.setForeground(Color.black);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 14));
            titleLabel.setToolTipText(title);
            info.add(titleLabel);
            JLabel authorLabel = new JLabel(makeWebSafe(author));
            authorLabel.setForeground(Color.gray);
            authorLabel.setFont(new Font("Arial", Font.PLAIN, 13));
            info.add(authorLabel);
            JLabel viewsTitle = new JLabel(makeWebSafe(NumberFormat.getNumberInstance(Locale.US).format(views)+" views"));
            viewsTitle.setForeground(new Color(64, 128, 64));
            viewsTitle.setFont(new Font("Arial", Font.PLAIN, 12));
            info.add(viewsTitle);

            add(info, BorderLayout.CENTER);

            // This is here to add a little gap between the videos in the list
            setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createEmptyBorder(0, 2, 2, 2), null));
        }
    }

    // Inserting strings to an html without telling it, that it is not an piece of code, is very dangerous, use this method!
    // I used it to show the information about videos, because the name of the video might
    // contain html
    public static String makeWebSafe(String string) {
        return string.replace("<", "&lt;").replace(">", "&gt;");
    }

    // Download the image from the url, the image will not be stored as a file
    public static BufferedImage getImage(String imageURL) {
        try { return ImageIO.read(new URL(imageURL));
        } catch (Exception e) {
            return null;
        }
    }
}