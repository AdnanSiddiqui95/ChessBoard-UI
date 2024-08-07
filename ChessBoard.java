import javax.swing.*;
import java.awt.*;
public class ChessBoard 
{
	JFrame frame=new JFrame("Chess UI");
	JButton[][] button=new JButton[8][8];
	public ChessBoard()
	{
		
		frame.setSize(900, 700);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		setButton();
		
		frame.setVisible(true);
	}
	private void setButton()
	{
		GridLayout layout=new GridLayout(8,8);
		frame.setLayout(layout);
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
				button[i][j]=new JButton();
				if((i+j)%2==0)
				{
					button[i][j].setBackground(Color.LIGHT_GRAY);
				}
				else 
				{
					button[i][j].setBackground(Color.white);
				}
				
				frame.add(button[i][j]);
			}
		}
		setChessImg();
	}
	private void setChessImg()
	{
		
		ImageIcon icon2=new ImageIcon(getClass().getResource("image/bp.gif"));
		ImageIcon icon3=new ImageIcon(getClass().getResource("image/wp.gif"));
		for(int i=0;i<8;i++)
		{
		ImageIcon icon1=new ImageIcon(getClass().getResource("image/b"+i+".gif"));
		button[0][i].setIcon(icon1);
		button[1][i].setIcon(icon2);
		button[6][i].setIcon(icon3);
		ImageIcon icon4=new ImageIcon(getClass().getResource("image/w"+i+".gif"));
		button[7][i].setIcon(icon4);
		}
	}
	
	public static void main(String[] args)
	{
		new ChessBoard();
	}

}
