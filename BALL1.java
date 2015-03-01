import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class BALL1 extends Applet implements Runnable
{


Thread t=null;
volatile int x,y,p,q;
int w,h;

public void init()
{
	t=new Thread(this);
}
public void start()
{	p=q=50;
	x=y=50;
	t.start();

	Graphics g=getGraphics();
	g.drawRect(0,0,150,150);
}

public void run()
{
while(true)

   try
  {
	
	
	
	Thread.sleep(20);
	w=getWidth();
	h=getHeight();
//	System.out.println("WIDTH  "+w);
//	System.out.println("HEIGHT  "+h);
	System.out.println();
int z=y+50;
	int s=x+50;
		
		xy_increse();
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}


public void paint(Graphics g)
{	
	Color c1=new Color(112,84,169);
	g.setColor(c1);
	g.fillOval(x,y,p,q);
	
}

	public void xy_increse()
	{
		while(true)
		{
		 try
			{
				x++;
				y++;
				w=getWidth();
				h=getHeight();
				repaint();
				Thread.sleep(10);
				if(y+50>h)
				{
					x_inc_y_dec();
	   
				}
				if(x+50>w)
				{
	   
					x_dec_y_inc();
				}
			}
			catch(Exception r)
			{
			}
			}
	}
	public void xy_deccrese()
	{
		while(true)
		{	
		try
			{
			x--;y--;
			repaint();
			w=getWidth();
				h=getHeight();
				
			Thread.sleep(10);
				if(y==05)
		
					{
		
						x_dec_y_inc();
					}
				if(x==05)
					{
						x_inc_y_dec();
					}
			}
			catch(Exception r)
			{}
	}
	}
public void x_dec_y_inc()
{	while(true)
	{
		try
		{	
			x--;
			y++;
			repaint();
			w=getWidth();
				h=getHeight();
				
			Thread.sleep(10);
			if(y+50>h)
			{		
				xy_deccrese();
	
			}
			if(x==05)
			{
	
				xy_increse();
	
			}
		}
		catch(Exception r)
		{}

}
}
public void x_inc_y_dec()
{
	while(true)
	{	
		try{
			x++;y--;
			repaint();
			w=getWidth();
				h=getHeight();
				
			Thread.sleep(10);
			if(x+50>w)
			{	
				xy_deccrese();
		
			}
			if(y==05)
			{
		
				xy_increse();
			}

			}	
			catch(Exception r)
			{}

}
}
public void stop()
{
t=null;

}

}