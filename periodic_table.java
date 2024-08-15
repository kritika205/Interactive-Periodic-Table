
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class periodic_table extends Applet
{
  private drwpanel pnl;
  private infopanel ipnl;
  private final int ELEMENTS = 118;

public void init()
  {
    setLayout(new BorderLayout());
    ipnl = new infopanel(ELEMENTS);
    pnl = new drwpanel(ipnl, ELEMENTS);
    add("Center", pnl);
    add("South", ipnl);
  }

public static void main(String args[])
  {
    Frame f = new Frame();

    periodic_table pd = new periodic_table();
    pd.init();
    pd.start();

    f.add("Center", pd);
    f.setVisible(true);
  }
}

class element
{
  private String an;
  private String as;
  private String aw;
  private String name;

  public element(String name_1, String an_1, String as_1, String aw_1)
  {
    an = new String(an_1);
    as = new String(as_1);
    aw = new String(aw_1);
    name = new String(name_1);
  }

  String getDesc()
  {
    String endl = System.getProperty("line.separator");
    String desc = new String();

    desc = name + endl + "Atomic Number : " + an + endl +
	"Atomic Symbol : " + as +
	endl + "Atomic Weight : " + aw;

    return(desc);
  }
}

class drwpanel extends Panel implements MouseListener, MouseMotionListener
{
  private infopanel target;
  private int mpc = 0;
  private final int recH = 40;
  private final int recW = 35;

  /*
  ** Map table.
  */

  private Point[] Map;

  /*
  ** Element table.
  */

  private String[] ET;

public drwpanel(infopanel target, int ELEMENTS)
  {
    setBackground(Color.white);
    addMouseListener(this);
    addMouseMotionListener(this);
    this.target = target;
    mpc = 0;
    Map = new Point[ELEMENTS];
  }

public void paint(Graphics g)
  {
    
    int xshift = 0;
    int yshift = 50;
 
    mpc = 0;
    ET = new String[7];
    ET[0] = "H";
    ET[1] = "Li";
    ET[2] = "Na";
    ET[3] = "K";
    ET[4] = "Rb";
    ET[5] = "Cs";
    ET[6] = "Fr";
    g.setColor(Color.gray);
    for(int i = 0; i < 7; i++)
      {
	g.drawRect(xshift + 65, yshift + 35 + i * recH + (i > 0 ? i * 5 : 0),
		   recW, recH);
	g.fillRect(xshift + 65, yshift + 35 + i * recH + (i > 0 ? i * 5 : 0),
		   recW, recH);
      }
    for(int i = 0; i < 7; i++)
      {
	g.setColor(Color.black);
	g.setColor(Color.orange);
	g.draw3DRect(xshift + 60,
		     yshift + 30 + i * recH + (i > 0 ? i * 5 : 0),
		     recW, recH, true);
	Point p = new Point(xshift + 60, yshift + 30 + i * recH +
			    (i > 0 ? i * 5 : 0));
	Map[mpc++] = p;
	g.fill3DRect(xshift + 60,
		     yshift + 30 + i * recH + (i > 0 ? i * 5 : 0),
		     recW, recH, true);
	g.setColor(Color.black);
	g.drawString(ET[i],
		     xshift + 65,
		     yshift + 30 + i * recH + (i > 0 ? i * 5 : 0) + recH / 2);
      }
    ET = new String[6];
    ET[0] = "Be";
    ET[1] = "Mg";
    ET[2] = "Ca";
    ET[3] = "Sr";
    ET[4] = "Ba";
    ET[5] = "Ra";
    g.setColor(Color.gray);
    for(int i = 0; i < 6; i++)
      {
	g.drawRect(xshift + 70 + recW,
		   yshift + 40 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		   recW, recH);
	g.fillRect(xshift + 70 + recW,
		   yshift + 40 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		   recW, recH);
      }
    for(int i = 0; i < 6; i++)
      {
	g.setColor(new Color(165, 42, 42));
	g.draw3DRect(xshift + 65 + recW,
		     yshift + 35 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		     recW, recH, true);
	Point p = new Point(xshift + 65 + recW,
			    yshift + 35 + i * recH + (i > 0 ? i * 5 : 0) +
			    recH);
	Map[mpc++] = p;
	g.fill3DRect(xshift + 65 + recW,
		     yshift + 35 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		     recW, recH, true);
	g.setColor(Color.black);
	g.drawString(ET[i], xshift + 70 + recW,
		     yshift + 35 + i * recH + (i > 0 ? i * 5 : 0) +
		     recH / 2 + recH);
      }
    ET = new String[4 * 10];
    ET[0] = "Sc";
    ET[1] = "Ti";
    ET[2] = "V";
    ET[3] = "Cr";
    ET[4] = "Mn";
    ET[5] = "Fe";
    ET[6] = "Co";
    ET[7] = "Ni";
    ET[8] = "Cu";
    ET[9] = "Zn";
    ET[10] = "Y";
    ET[11] = "Zr";
    ET[12] = "Nb";
    ET[13] = "Mo";
    ET[14] = "Tc";
    ET[15] = "Ru";
    ET[16] = "Rh";
    ET[17] = "Pd";
    ET[18] = "Ag";
    ET[19] = "Cd";
    ET[20] = "Lu";
    ET[21] = "Hf";
    ET[22] = "Ta";
    ET[23] = "W";
    ET[24] = "Re";
    ET[25] = "Os";
    ET[26] = "Ir";
    ET[27] = "Pt";
    ET[28] = "Au";
    ET[29] = "Hg";
    ET[30] = "Lr";
    ET[31] = "Rf";
    ET[32] = "Db";
    ET[33] = "Sg";
    ET[34] = "Bh";
    ET[35] = "Hs";
    ET[36] = "Mt";
    ET[37] = "Uun";
    ET[38] = "Uuu";
    ET[39] = "Uub";
    for(int i = 0; i < 4; i++)
      for(int j = 0; j < 10; j++)
	{
	  g.setColor(Color.gray);
	  g.drawRect(xshift + 70 + 3 * recW + j * recW + 5 * j,
		     yshift + 50 + i * recH + (i > 0 ? i * 5 : 0) + 3 * recH,
		     recW, recH);
	  g.fillRect(xshift + 70 + 3 * recW + j * recW + 5 * j,
		     yshift + 50 + i * recH + (i > 0 ? i * 5 : 0) + 3 * recH,
		     recW, recH);
	  g.setColor(new Color(210, 105, 30));
	  g.draw3DRect(xshift + 65 + 3 * recW + j * recW + 5 * j,
		       yshift + 45 + i * recH + (i > 0 ? i * 5 : 0) + 3 * recH,
		       recW, recH, true);
	  Point p = new Point(xshift + 65 + 3 * recW + j * recW + 5 * j,
			      yshift + 45 + i * recH +
			      (i > 0 ? i * 5 : 0) + 3 * recH);
	  Map[mpc++] = p;
	  g.fill3DRect(xshift + 65 + 3 * recW + j * recW + 5 * j,
		       yshift + 45 + i * recH + (i > 0 ? i * 5 : 0) + 3 * recH,
		       recW, recH, true);
	  g.setColor(Color.black);
	  g.drawString(ET[i * 10 + j],
		       xshift + 70 + 3 * recW + j * recW + 5 * j,
		       yshift + 45 + i * recH + (i > 0 ? i * 5 : 0) +
		       recH / 2 + 3 * recH);
	}
    ET = new String[6 * 5];
    ET[0] = "B";
    ET[1] = "C";
    ET[2] = "N";
    ET[3] = "O";
    ET[4] = "F";
    ET[5] = "Al";
    ET[6] = "Si";
    ET[7] = "P";
    ET[8] = "S";
    ET[9] = "Cl";
    ET[10] = "Ga";
    ET[11] = "Ge";
    ET[12] = "As";
    ET[13] = "Se";
    ET[14] = "Br";
    ET[15] = "In";
    ET[16] = "Sn";
    ET[17] = "Sb";
    ET[18] = "Te";
    ET[19] = "I";
    ET[20] = "Tl";
    ET[21] = "Pb";
    ET[22] = "Bi";
    ET[23] = "Po";
    ET[24] = "At";
    ET[25] = "Uut";
    ET[26] = "Uuq";
    ET[27] = "Uup";
    ET[28] = "Uuh";
    ET[29] = "Uus";
    for(int i = 0; i < 6; i++)
      for(int j = 0; j < 5; j++)
	{
	  g.setColor(Color.gray);
	  g.drawRect(xshift + 85 + 14 * recW + j * recW + 5 * j,
		     yshift + 40 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		     recW, recH);
	  g.fillRect(xshift + 85 + 14 * recW + j * recW + 5 * j,
		     yshift + 40 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		     recW, recH);
	  g.setColor(new Color(0, 180 + j * 10, 255));
	  g.draw3DRect(xshift + 80 + 14 * recW + j * recW + 5 * j,
		       yshift + 35 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		       recW, recH, true);
	  Point p = new Point(xshift + 80 + 14 * recW + j * recW + 5 * j,
			      yshift + 35 + i * recH + (i > 0 ?
							i * 5 : 0) + recH);
	  Map[mpc++] = p;
	  g.fill3DRect(xshift + 80 + 14 * recW + j * recW + 5 * j,
		       yshift + 35 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		       recW, recH, true);
	  g.setColor(Color.black);
	  g.drawString(ET[i * 5 + j],
		       xshift + 85 + 14 * recW + j * recW + 5 * j,
		       yshift + 35 + i * recH + (i > 0 ?
						 i * 5 : 0) + recH / 2 + recH);
	}
    ET = new String[7];
    ET[0] = "He";
    ET[1] = "Ne";
    ET[2] = "Ar";
    ET[3] = "Kr";
    ET[4] = "Xe";
    ET[5] = "Rn";
    ET[6] = "Uuo";
    for(int i = 0; i < 7; i++)
      {
	g.setColor(Color.gray);
	g.drawRect(xshift + 75 + 20 * recW,
		   yshift + 35 + i * recH + (i > 0 ? i * 5 : 0),
		   recW, recH);
	g.fillRect(xshift + 75 + 20 * recW,
		   yshift + 35 + i * recH + (i > 0 ? i * 5 : 0),
		   recW, recH);
	g.setColor(new Color(0, 230, 255));
	g.draw3DRect(xshift + 70 + 20 * recW,
		     yshift + 30 + i * recH + (i > 0 ? i * 5 : 0),
		     recW, recH, true);
	Point p = new Point(xshift + 70 + 20 * recW,
			    yshift + 30 + i * recH + (i > 0 ? i * 5 : 0));
	Map[mpc++] = p;
	g.fill3DRect(xshift + 70 + 20 * recW,
		     yshift + 30 + i * recH + (i > 0 ? i * 5 : 0),
		     recW, recH, true);
	g.setColor(Color.black);
	g.drawString(ET[i], xshift + 75 + 20 * recW,
		     yshift + 30 + i * recH + (i > 0 ? i * 5 : 0) + recH / 2);
      }
    ET = new String[28];
    ET[0] = "La";
    ET[1] = "Ce";
    ET[2] = "Pr";
    ET[3] = "Nd";
    ET[4] = "Pm";
    ET[5] = "Sm";
    ET[6] = "Eu";
    ET[7] = "Gd";
    ET[8] = "Tb";
    ET[9] = "Dy";
    ET[10] = "Ho";
    ET[11] = "Er";
    ET[12] = "Tm";
    ET[13] = "Yb";
    ET[14] = "Ac";
    ET[15] = "Th";
    ET[16] = "Pa";
    ET[17] = "U";
    ET[18] = "Np";
    ET[19] = "Pu";
    ET[20] = "Am";
    ET[21] = "Cm";
    ET[22] = "Bk";
    ET[23] = "Cf";
    ET[24] = "Es";
    ET[25] = "Fm";
    ET[26] = "Md";
    ET[27] = "No";
    for(int i = 0; i < 2; i++)
      for(int j = 0; j < 14; j++)
	{
	  g.setColor(Color.gray);
	  g.drawRect(xshift + 175 + j * recW + 5 * j,
		     yshift + 310 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		     recW, recH);
	  g.fillRect(xshift + 175 + j * recW + 5 * j,
		     yshift + 310 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		     recW, recH);
	  if(i == 1)
	    g.setColor(new Color(160, 32, 240));
	  else
	    g.setColor(new Color(110, 105, 30));
	  g.draw3DRect(xshift + 170 + j * recW + 5 * j,
		       yshift + 305 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		       recW, recH, true);
	  Point p = new Point(xshift + 170 + j * recW + 5 * j,
			      yshift + 305 + i * recH +
			      (i > 0 ? i * 5 : 0) + recH);
	  Map[mpc++] = p;
	  g.fill3DRect(xshift + 170 + j * recW + 5 * j,
		       yshift + 305 + i * recH + (i > 0 ? i * 5 : 0) + recH,
		       recW, recH, true);
	  g.setColor(Color.black);
	  g.drawString(ET[i * 14 + j],
		       xshift + 175 + j * recW + 5 * j,
		       yshift + 305 + i * recH + (i > 0 ? i * 5 : 0) +
		       recH / 2 + recH);
	}

    /*
    ** Add some text information.
    */

    g.setFont(new Font("Times", Font.BOLD, 15));
    g.setColor(Color.black);

    g.drawString("Group", 5, 25);
    g.drawString("Period", 5, 60);

    for(int i = 0; i < 2; i++)
      {
	g.drawString(i + 1 + "", 70 + (recW + 5) * i, 25);
	g.drawString(i + 1 + "A", 63 + (recW + 5) * i, 43);
      }

    for(int i = 2; i < 18; i++)
      {
	g.drawString(i + 1 + "", 95 + (recW + 5) * i, 25);
	if(i <= 6)
	  {
	    g.drawString(i + 1 + "B", 93 + (recW + 5) * i, 43);
	  }
	else if(i == 8)
	  {
	    g.drawString("8B", 93 + (recW + 5) * i, 43);
	  }
	else if(i > 9 && i < 12)
	  {
	    g.drawString(i - 9 + "B", 93 + (recW + 5) * i, 43);
	  }
	else if(i >= 12)
	  {
	    g.drawString(i - 9 + "A", 93 + (recW + 5) * i, 43);
	  }
      }

    for(int i = 0; i < 7; i++)
      {
	g.drawString(i + 1 + "", 20, 105 + (recH + 5) * i);
      }

    g.drawString("lanthanides", xshift + 70, yshift + 370);
    g.drawString("actinides", xshift + 70, yshift + 410);
  }

public Point []getMap()
  {
    return(Map);
  }

public int getMapSize()
  {
    return(mpc);
  }

 

public void mouseEntered(MouseEvent e)
  {
  }

public void mouseExited(MouseEvent e)
  {
  }

public void mouseClicked(MouseEvent e)
  {
    e.consume();
    target.setCoords(e.getX(), e.getY(), getMap(), getMapSize(), recW, recH);
  }

public void mousePressed(MouseEvent e)
  {
  }

public void mouseReleased(MouseEvent e)
  {
  }

public void mouseDragged(MouseEvent e)
  {
  }

public void mouseMoved(MouseEvent e)
  {
    target.setCoords(e.getX(), e.getY(), getMap(), getMapSize(), recW, recH);
  }
}

class infopanel extends Panel implements MouseListener
{
  private int X = 0;
  private int Y = 0;
  private element[] es;
  private TextArea ta;

public infopanel(int ELEMENTS)
  {
    setBackground(Color.white);
    ta = new TextArea("", 5, 50, TextArea.SCROLLBARS_NONE);
    ta.setBackground(Color.white);
    ta.setForeground(Color.black);
    ta.setEditable(false);
    add(ta);

    es = new element[ELEMENTS];

    es[0] = new element("Hydrogen", "1", "H", "1.01");
    es[1] = new element("Lithium", "3", "Li", "6.941");
    es[2] = new element("Sodium", "11", "Na", "22.99");
    es[3] = new element("Potassium", "19", "K", "39.10");
    es[4] = new element("Rubidium", "37", "Rb", "85.47");
    es[5] = new element("Caesium", "55", "Cs", "132.90");
    es[6] = new element("Francium", "87", "Fr", "223.00");

    es[7] = new element("Beryllium", "4", "Be", "9.012");
    es[8] = new element("Magnesium", "12", "Mg", "24.31");
    es[9] = new element("Calcium", "20", "Ca", "40.08");
    es[10] = new element("Strontium", "38", "Sr", "87.62");
    es[11] = new element("Barium", "56", "Ba", "137.30");
    es[12] = new element("Radium", "88", "Ra", "226.00");

    es[13] = new element("Scandium", "21", "Sc", "44.96");
    es[14] = new element("Yttrium", "39", "Y", "88.91");
    es[15] = new element("Lutetium", "71", "Lu", "174.97");
    es[16] = new element("Lawrencium", "103", "Lr", "262.00");

    es[17] = new element("Titanium", "22", "Ti", "47.87");
    es[18] = new element("Zirconium", "40", "Zr", "91.22");
    es[19] = new element("Hafnium", "72", "Hf", "178.49");
    es[20] = new element("Rutherfordium", "104", "Rf", "261.00");

    es[21] = new element("Vanadium", "23", "V", "50.94");
    es[22] = new element("Niobium", "41", "Nb", "92.91");
    es[23] = new element("Tantalum", "73", "Ta", "180.95");
    es[24] = new element("Dubnium", "105", "Db", "262.00");

    es[25] = new element("Chromium", "24", "Cr", "51.996");
    es[26] = new element("Molybdenum", "42", "Mo", "95.94");
    es[27] = new element("Tungsten", "74", "W", "183.84");
    es[28] = new element("Seaborgium", "106", "Sg", "263.00");

    es[29] = new element("Manganese", "25", "Mn", "54.94");
    es[30] = new element("Technetium", "43", "Tc", "98.00");
    es[31] = new element("Rhenium", "75", "Re", "186.21");
    es[32] = new element("Bohrium", "107", "Bh", "262.00");

    es[33] = new element("Iron", "26", "Fe", "55.85");
    es[34] = new element("Ruthenium", "44", "Ru", "101.07");
    es[35] = new element("Osmium", "76", "Os", "190.23");
    es[36] = new element("Hassium", "108", "Hs", "265.00");

    es[37] = new element("Cobalt", "27", "Co", "58.93");
    es[38] = new element("Rhodium", "45", "Rh", "102.91");
    es[39] = new element("Iridium", "77", "Ir", "192.22");
    es[40] = new element("Meitnerium", "109", "Mt", "266.00");

    es[41] = new element("Nickel", "28", "Ni", "58.69");
    es[42] = new element("Palladium", "46", "Pd", "106.42");
    es[43] = new element("Platinum", "78", "Pt", "195.08");
    es[44] = new element("Ununnilium", "110", "Uun", "269.00");

    es[45] = new element("Copper", "29", "Cu", "63.55");
    es[46] = new element("Silver", "47", "Ag", "107.87");
    es[47] = new element("Gold", "79", "Au", "196.97");
    es[48] = new element("Unununium", "111", "Uuu", "272.00");

    es[49] = new element("Zinc", "30", "Zn", "65.39");
    es[50] = new element("Cadmium", "48", "Cd", "112.41");
    es[51] = new element("Mercury", "80", "Hg", "200.59");
    es[52] = new element("Ununbium", "112", "Uub", "277.00");

    es[53] = new element("Boron", "5", "B", "10.81");
    es[54] = new element("Aluminum", "13", "Al", "26.98");
    es[55] = new element("Gallium", "31", "Ga", "69.72");
    es[56] = new element("Indium", "49", "In", "114.82");
    es[57] = new element("Thallium", "81", "Tl", "204.38");
    es[58] = new element("Ununtrium", "113", "Uut", "?");

    es[59] = new element("Carbon", "6", "C", "12.01");
    es[60] = new element("Silicon", "14", "Si", "28.09");
    es[61] = new element("Germanium", "32", "Ge", "72.61");
    es[62] = new element("Tin", "50", "Sn", "118.71");
    es[63] = new element("Lead", "82", "Pb", "207.2");
    es[64] = new element("Ununquadium", "114", "Uuq", "285.00");

    es[65] = new element("Nitrogen", "7", "N", "14.01");
    es[66] = new element("Phosphorus", "15", "P", "30.97");
    es[67] = new element("Arsenic", "33", "As", "74.92");
    es[68] = new element("Antimony", "51", "Sb", "121.76");
    es[69] = new element("Bismuth", "83", "Bi", "208.98");
    es[70] = new element("?", "115", "Uup", "?");

    es[71] = new element("Oxygen", "8", "O", "15.999");
    es[72] = new element("Sulfur", "16", "S", "32.07");
    es[73] = new element("Selenium", "34", "Se", "78.96");
    es[74] = new element("Tellurium", "52", "Te", "127.60");
    es[75] = new element("Polonium", "84", "Po", "209.00");
    es[76] = new element("Ununhexium", "116", "Uuh", "289.00");

    es[77] = new element("Flourine", "9", "F", "18.998");
    es[78] = new element("Chlorine", "17", "Cl", "35.45");
    es[79] = new element("Bromine", "35", "Br", "79.90");
    es[80] = new element("Iodine", "53", "I", "126.90");
    es[81] = new element("Astatine", "85", "At", "210.00");
    es[82] = new element("?", "117", "Uus", "?");

    es[83] = new element("Helium", "2", "He", "4.003");
    es[84] = new element("Neon", "10", "Ne", "20.18");
    es[85] = new element("Argon", "18", "Ar", "39.95");
    es[86] = new element("Krypton", "36", "Kr", "83.80");
    es[87] = new element("Xenon", "54", "Xe", "131.29");
    es[88] = new element("Radon", "86", "Rn", "222.00");
    es[89] = new element("Ununoctium", "118", "Uuo", "293.00");

    es[90] = new element("Lanthanum", "57", "La", "138.91");
    es[91] = new element("Actinium", "89", "Ac", "227.03");
    es[92] = new element("Cerium", "58", "Ce", "140.116");
    es[93] = new element("Thorium", "90", "Th", "232.04");
    es[94] = new element("Praseodymium", "59", "Pr", "140.91");
    es[95] = new element("Protactinium", "91", "Pa", "231.06");
    es[96] = new element("Neodymium", "60", "Nd", "144.24");
    es[97] = new element("Uranium", "92", "U", "238.03");
    es[98] = new element("Promethium", "61", "Pm", "145.00");
    es[99] = new element("Neptunium", "93", "Np", "237.00");
    es[100] = new element("Samarium", "62", "Sm", "150.36");
    es[101] = new element("Plutonium", "94", "Pu", "244.00");
    es[102] = new element("Europium", "63", "Eu", "151.96");
    es[103] = new element("Americium", "95", "Am", "243.00");
    es[104] = new element("Gadolinium", "64", "Gd", "157.25");
    es[105] = new element("Curium", "96", "Cm", "247.00");
    es[106] = new element("Terbium", "65", "Tb", "158.93");
    es[107] = new element("Berkelium", "97", "Bk", "247.00");
    es[108] = new element("Dysprosium", "66", "Dy", "162.50");
    es[109] = new element("Californium", "98", "Cf", "251.00");
    es[110] = new element("Holmium", "67", "Ho", "164.93");
    es[111] = new element("Einsteinium", "99", "Es", "252.00");
    es[112] = new element("Erbium", "68", "Er", "167.26");
    es[113] = new element("Fermium", "100", "Fm", "257.00");
    es[114] = new element("Thulium", "69", "Tm", "168.93");
    es[115] = new element("Mendelvium", "101", "Md", "258.00");
    es[116] = new element("Ytterbium", "70", "Yb", "173.04");
    es[117] = new element("Nobelium", "102", "No", "259.00");
  }

public void setCoords(int x, int y, Point []Map, int mapsize,
		      int recW, int recH)
  {
    X = x;
    Y = y;
    int p = 0;
    Point P = new Point();
    Boolean set = Boolean.FALSE;

    for(int i = 0; i < mapsize; i++)
      {
	if(i <= 13)
	  {
	    p = i;
	  }
	else if(i >= 14 && i <= 22)
	  {
	    p = i + 3 * (i % 13);
	  }
	else if(i >= 23 && i <= 32)
	  {
	    p = i - 9 + 4 * (i % 23) - 1 * (i % 23);
	  }
	else if(i >= 33 && i <= 42)
	  {
	    p = i - 18 + 4 * (i % 33) - 1 * (i % 33);
	  }
	else if(i >= 43 && i <= 52)
	  {
	    p = i - 27 + 4 * (i % 43) - 1 * (i % 43);
	  }
	else if(i >= 53 && i <= 57)
	  {
	    p = i + 5 * (i % 53);
	  }
	else if(i >= 58 && i <= 62)
	  {
	    p = i - 4 + 6 * (i % 58) - 1 * (i % 58);
	  }
	else if(i >= 63 && i <= 67)
	  {
	    p = i - 8 + 6 * (i % 63) - 1 * (i % 63);
	  }
	else if(i >= 68 && i <= 72)
	  {
	    p = i - 12 + 6 * (i % 68) - 1 * (i % 68);
	  }
	else if(i >= 73 && i <= 77)
	  {
	    p = i - 16 + 6 * (i % 73) - 1 * (i % 73);
	  }
	else if(i >= 78 && i <= 82)
	  {
	    p = i - 20 + 6 * (i % 78) - 1 * (i % 78);
	  }
	else if(i >= 83 && i <= 89)
	  {
	    p = i;
	  }
	else if(i >= 90 && i <= 103)
	  {
	    p =  i + 1 * (i % 90);
	  }
	else if(i >= 104 && i <= 117)
	  {
	    p = i - 13 + 2 * (i % 104) - 1 * (i % 104);
	  }
	if(X >= Map[i].x && X <= (Map[i].x + recW) &&
	   Y >= Map[i].y && Y <= (Map[i].y + recH))
	  {
	    set = Boolean.TRUE;
	    if(!ta.getText().equals(es[p].getDesc()))
		ta.setText(es[p].getDesc());
	    break;
	  }
      }

    if(!set.booleanValue())
      {
	  if(!ta.getText().equals(""))
	      ta.setText("");
      }
  }


public void mouseEntered(MouseEvent e)
  {
  }

public void mouseExited(MouseEvent e)
  {
  }

public void mouseClicked(MouseEvent e)
  {
  }

public void mousePressed(MouseEvent e)
  {
  }

public void mouseReleased(MouseEvent e)
  {
  }
}
