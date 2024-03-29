import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class UserProfileButton extends JButton{

  public UserProfileButton(ImageIcon imgIcon) {
    setIcon(imgIcon);
    setFont(new Font("맑은 고딕", Font.BOLD, 18));
    setBackground(new Color(120, 186, 239));
    
    setHorizontalAlignment(SwingConstants.LEFT);
    setFocusPainted(false);
    
    Border emptyBorder = BorderFactory.createEmptyBorder();
    setBorder(emptyBorder);
    
  }
}

///실패