package Portfolio;

public class Main {
	// main method to create the frame
    public static void main(String[] args) {
    	MyPortfolioFrame frame = new MyPortfolioFrame();
    	frame.addHomePanel();
    	frame.addScrollPane();
    	frame.addAboutMePanel();
    	frame.addWorkExperiencePanel();
    	frame.addContactPanel();
    	frame.setVisible(true);
    }
}
