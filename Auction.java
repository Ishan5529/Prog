import java.io.*;
import java.util.*;
class Auction
{
	String name="";
	String z[]=new String[47];
	void line_Space(int n)
	{
		for (int i=0;i<=n;i++)
		{
			System.out.println();
		}
	}
	void buffer()
	{
		for(int i=0;i<80;i++)
		{
			System.out.print("=");
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e){}
		}
	}
	int disp()
	{
		Scanner sc=new Scanner(System.in);
		int choice = 0;
		String b;
		for(int i=0;i<1;i--)
		{
			System.out.println("                  ________________________________________________ ");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |         SELECT ANY ONE OPTION                  |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |          1. SIGN IN                            |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |          2. SIGN UP                            |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |      ENTER YOUR CHOICE[1/2]                    |");			
			System.out.println("                 |                                                |");		
			System.out.println("                 |________________________________________________|");
			System.out.print  ("                  ");
			choice=sc.nextInt();
			if(choice==1||choice==2)break;
			else
				System.out.println(" Invalid Choice");
			System.out.println("\n\n\n\nEnter any key to continue");
			z[1]=sc.next();
		}
		buffer();
		return choice;
	}
	void sign_In()throws IOException
	{
		Scanner sc=new Scanner (System.in);	
		File f=new File("num.xyz");
		File f1=new File("pass.dat");
		DataInputStream dis=new DataInputStream(new FileInputStream(f));
		DataInputStream disp=new DataInputStream(new FileInputStream(f1));
		String uname="",pword="",buff="",u="",p="";
		int x=0;
		line_Space(25);
		for (int i=0;i<1;i--)
		{
			x=0;
			System.out.print("                      USERNAME: ");uname=sc.next();
			//*****
			try
			{
				while(true)
				{
					u=dis.readUTF();
					p=disp.readUTF();
					if (uname.equals(u))
					{
						x++;
						break;
					}
				}
			}
			catch(EOFException e){}
			//*****
			if (x>=1)break;
			else
			{
				System.out.print("Username doesnot exists.\n\n");						
			}
		}
		for (int i=0;i<1;i--)
		{
			System.out.print("                      PASSWORD: ");
			pword=sc.next();
			if(pword.equals(p))
			{
				line_Space(25);
				System.out.println("CONGRATS, YOU ARE SUCCESSFULLY LOGGED IN");
				line_Space(10);
				System.out.println("Enter any key to continue");
				z[2]=sc.next();
				break;
			}
			else
			{
				System.out.println("Inappropriate Password");
			}
		}
		dis.close();
		disp.close();
	}
	void sign_Up()throws IOException
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("num.xyz");
		File f1=new File("pass.dat");
		DataInputStream dis=new DataInputStream(new FileInputStream(f));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(f,true));
		DataOutputStream dosp=new DataOutputStream(new FileOutputStream(f1,true));
		String uname="",pword="",u="",p="",buff="";
		int x=0;
		line_Space(25);
		for(int i=-0;i<1;i--)
		{
			x=0;
			System.out.print("                      USERNAME: ");uname=sc.next();
			try
			{
				while(true)
				{
					u=dis.readUTF();
					if (uname.equals(u))
					{
						x++;
						break;
					}
				}
			}
			catch(EOFException e){}
			if (x==0)
			{
				dos.writeUTF(uname);
				break;
			}
			else
			{
				System.out.println("Username already exists.\n\n");						
			}
		}
		System.out.print("                      Password : ");
		pword=sc.next();
		dosp.writeUTF(pword);
		line_Space(3);
		buffer();
		line_Space(25);
		System.out.println("CONGRATS!! YOUR ACCOUNT IS REGISTERED");
		line_Space(10);
		System.out.println("Enter any key to continue");
		z[3]=sc.next();
		sign_In();
		dis.close();
		dos.close();
		dosp.close();
	}
	int Selection()
	{
		Scanner sc =new Scanner(System.in);
		int choice=0;
		for (int i=0;i<1;i--)
		{
			System.out.println("                  ________________________________________________ ");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |         SELECT ANY ONE OPTION                  |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |          1. BUY                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |          2. SELL                               |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |                                                |");
			System.out.println("                 |________________________________________________|");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.print  ("                       ENTER YOUR CHOICE[1/2]: ");
			choice=sc.nextInt();
			if (choice==1||choice==2)
			{
				break;
			}
			else
			{
				line_Space(13);
				System.out.println("                            INAPPROPRIATE CHOICE");
				line_Space(11);
				System.out.print  ("	press enter to continue.");
				z[4]=sc.next();
			}
		}
		return choice;
	}
	int Display(String choice)
	{
		Scanner sc= new Scanner (System.in);
		int ch=0;
		for (int i=0;i<1;i--)
		{
			if (choice.equalsIgnoreCase("buy"))
			{	
				System.out.println("                   ________________________________________________ ");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     SELECT THE ITEM WHICH YOU WANT TO BUY:     |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     1. CAR               2. BIKE               |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     3. SCOOTER           4. MOBILE PHONE       |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     5. T.V.              6. COMPUTER           |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     7. PAINTING          8. JEWELLERY          |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     9. REFRIDGERATION   10. A.C.               |");
				System.out.println("                  |                                                |");
				System.out.println("                  |________________________________________________|");
				System.out.println();
				System.out.println();
				System.out.print  ("                        ENTER YOUR CHOICE: ");
				ch=sc.nextInt();
			}
			else if(choice.equalsIgnoreCase("sell"))
			{
				System.out.println("                   ________________________________________________ ");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     SELECT THE ITEM WHICH YOU WANT TO SELL:    |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     1. CAR               2. BIKE               |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     3. SCOOTER           4. MOBILE PHONE       |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     5. T.V.              6. COMPUTER           |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     7. PAINTING          8. JEWELLERY          |");
				System.out.println("                  |                                                |");
				System.out.println("                  |                                                |");
				System.out.println("                  |     9. REFRIDGERATION   10. A.C.               |");
				System.out.println("                  |                                                |");
				System.out.println("                  |________________________________________________|");
				System.out.println();
				System.out.println();
				System.out.print  ("                        ENTER YOUR CHOICE: ");
				ch=sc.nextInt();
			}
			if (ch>0 && ch<11)
			{
				break;
			}
			else
			{
				line_Space(13);
				System.out.println("                            INAPPROPRIATE CHOICE");
				line_Space(11);
				System.out.print  ("	press enter to continue.");
				z[5]=sc.next();
			}
		}
		return ch;
	}
	void rules_Regulations(int a,String s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("                   ________________________________________________ ");
		System.out.println("                  |                                                |");
		System.out.println("                  |              RULES AND REGULATION              |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * THIS AUCTION IS COMPLETELY AUTOMATIC.     |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * YOUR BIDDING SESSION WILL BE CANCELLED    |");
		System.out.println("                  |                                                |");
		System.out.println("                  |      IF YOU BID AN AMOUNT SMALLER THAN THE     |");
		System.out.println("                  |                                                |");
		System.out.println("                  |      LAST BID.                                 |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * WARNING WILL BE GIVEN FOR ONCE IF YOU     |");
		System.out.println("                  |                                                |");
		System.out.println("                  |      BID A SMALLER AMOUNT AS COMPARED TO THE   |");
		System.out.println("                  |                                                |");
		System.out.println("                  |      LAST BID.                                 |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * BID MUST BE DONE WITHIN 7 SECONDS.        |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * MINIMUM BIDDING AMOUNT: "+a+s);
		System.out.println("                  |                                                |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    PRESS ENTER TO CONTINUE.                    |");
		System.out.print  ("                  |________________________________________________|");
		z[6]=sc.next();
		line_Space(27);
	}
	void rules_Regulations1(int a,String s)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("                   ________________________________________________ ");
		System.out.println("                  |                                                |");
		System.out.println("                  |              RULES AND REGULATION              |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * THIS AUCTION IS COMPLETELY AUTOMATIC.     |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * AUCTION WILL BE CARRIED ON WITH THE       |");
		System.out.println("                  |                                                |");
		System.out.println("                  |      HELP OF COMPUTERS AND NO INTERFERENCE     |");
		System.out.println("                  |                                                |");
		System.out.println("                  |      CAN BE DONE BY YOU.                       |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * AFTER EVERY BID, YOU WILL BE ASKED IF     |");
		System.out.println("                  |                                                |");
		System.out.println("                  |      YOU WANT TO TERMINATE AUCTION.            |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    * MINIMUM BID AMOUNT: "+a+s);
		System.out.println("                  |                                                |");
		System.out.println("                  |                                                |");
		System.out.println("                  |                                                |");
		System.out.println("                  |                                                |");
		System.out.println("                  |                                                |");
		System.out.println("                  |                                                |");
		System.out.println("                  |    PRESS ENTER TO CONTINUE.                    |");
		System.out.print  ("                  |________________________________________________|");
		z[7]=sc.next();
		line_Space(27);
	}
	void choice_Buy()
	{
		Scanner sc= new Scanner (System.in);
		/* rno & rno1 refers to random number.
		ubid is user's bid.
		pubid is user's previous bid.
		ruser1 & ruser refers to random user.
		rbid1 &rbid refers to random user's bid.*/
		// c &k are counters.
		// for 1 character, 19 spaces.
		
		double rno1,ruser1,ubid=0.0,pubid,rbid1;
		int rno,x=0,k=0,ruser,rbid,r;
		int ch=Display("BUY");
		long t1,t2;
		// rules_Regulations(1,"                   |");
		if (ch==1)
		{
			rules_Regulations(100000,"            |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=99999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((15000-5000)*Math.random()+5000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("               YOU BOUGHT A CAR FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[8]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[9]=sc.next();
			}
		}
		else if(ch==2)
		{
			rules_Regulations(15000,"             |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=14999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((5000-2000)*Math.random()+2000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("                 YOU BOUGHT A BIKRE FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[10]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[11]=sc.next();
			}
		}
		else if(ch==3)
		{
			rules_Regulations(10000,"             |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=9999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((3000-1000)*Math.random()+1000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("             YOU BOUGHT A SCOOTER FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[12]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[13]=sc.next();
			}
		}
		else if(ch==4)
		{
			rules_Regulations(5000,"              |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=4999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((2000-800)*Math.random()+800);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("          YOU BOUGHT A MOBILE PHONE FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[14]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[15]=sc.next();
			}
		}
		else if(ch==5)
		{
			rules_Regulations(8000,"              |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=7999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((4000-1000)*Math.random()+1000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("               YOU BOUGHT A T.V. FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[16]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[17]=sc.next();
			}
		}
		else if(ch==6)
		{
			rules_Regulations(13000,"             |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=12999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((4000-1500)*Math.random()+1500);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("             YOU BOUGHT A COMPUTER FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[18]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[19]=sc.next();
			}
		}
		else if(ch==7)
		{
			rules_Regulations(2000,"              |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=1999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((3000-500)*Math.random()+500);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("            YOU BOUGHT A PAINTING FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[20]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[21]=sc.next();
			}
		}
		else if(ch==8)
		{
			rules_Regulations(50000,"             |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=49999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((8000-3000)*Math.random()+3000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println();
				System.out.println("             YOU BOUGHT A JEWELLERY FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[22]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[23]=sc.next();
			}
		}
		else if(ch==9)
		{
			rules_Regulations(10000,"             |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=9999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((4000-1500)*Math.random()+1500);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("            YOU BOUGHT A REFRIDGERATOR FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[24]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[25]=sc.next();
			}
		}
		else if(ch==10)
		{
			rules_Regulations(40000,"             |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=39999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((8000-4000)*Math.random()+4000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				t1=(System.currentTimeMillis())/1000;
				System.out.print("ENTER YOUR BID : ");
				ubid =sc.nextDouble();
				t2=(System.currentTimeMillis())/1000;
				if(t2-t1>7)
					break;
				if(ubid<=pubid)
				{
					x++;
					if(x==2)
					{
						break;
					}
					System.out.println("IF YOU AGAIN ENTER SMALLER BID THEN AUCTION WILL BE TERMINATED.");
					i++;
					k--;
					continue;
				}
				pubid=ubid;
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("             YOU BOUGHT AN A.C. FOR Rs. "+ubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[26]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                  YOU ARE DISQUALIFIED");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[27]=sc.next();
			}
		}
	}
	void choice_Sell()
	{
		Scanner sc= new Scanner (System.in);
		/* rno & rno1 refers to random number.
		ubid is user's bid.
		pubid is user's previous bid.
		ruser1 & ruser refers to random user.
		rbid1 &rbid refers to random user's bid.*/
		// c &k are counters.
		// for 1 character, 19 spaces.
		
		double rno1,ruser1,ubid=0.0,pubid,rbid1;
		int rno,k=0,ruser,rbid,r;
		int ch=Display("SELL");
		String uch;
		// rules_Regulations(1,"                   |");
		if (ch==1)
		{
			rules_Regulations1(100000,"                |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=99999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((15000-5000)*Math.random()+5000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("                YOU SOLD A CAR FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[28]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[29]=sc.next();
			}
		}
		else if(ch==2)
		{
			rules_Regulations1(15000,"                 |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=14999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((5000-2000)*Math.random()+2000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("                 YOU SOLD A BIKE FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[30]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[31]=sc.next();
			}
		}
		else if(ch==3)
		{
			rules_Regulations1(10000,"                 |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=9999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((3000-1000)*Math.random()+1000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("              YOU SOLD A SCOOTER FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[32]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[33]=sc.next();
			}
		}
		else if(ch==4)
		{
			rules_Regulations1(5000,"            |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=4999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((2000-800)*Math.random()+800);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("          YOU SOLD A MOBILE PHONE FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[34]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[35]=sc.next();
			}
		}
		else if(ch==5)
		{
			rules_Regulations1(8000,"                  |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=7999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((4000-1000)*Math.random()+1000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("                YOU SOLD A T.V. FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[36]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[37]=sc.next();
			}
		}
		else if (ch==6)
		{
			rules_Regulations1(13000,"                 |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=12999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((4000-1500)*Math.random()+1500);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("              YOU SOLD A COMPUTER FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[38]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[39]=sc.next();
			}
		}
		else if(ch==7)
		{
			rules_Regulations1(2000,"                  |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=1999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((5000-1000)*Math.random()+1000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("               YOU SOLD A PAINTING FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[40]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[41]=sc.next();
			}
		}
		else if(ch==8)
		{
			rules_Regulations1(50000,"                 |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=49999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((8000-3000)*Math.random()+3000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("              YOU SOLD A JEWELLERY FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[42]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[43]=sc.next();
			}
		}
		else if(ch==9)
		{
			rules_Regulations1(10000,"                 |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=9999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((4000-1500)*Math.random()+1500);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("           YOU SOLD A REFRIDGERATOR FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[44]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[45]=sc.next();
			}
		}
		else if(ch==10)
		{
			rules_Regulations1(40000,"                 |");
			rno1=(8-3)*Math.random()+3;
			rno=(int)rno1;
			pubid=39999;
			for (int i=rno;i>0;i--)
			{
				r=(int)((8000-4000)*Math.random()+4000);
				ruser1=(5-1)*Math.random()+1;
				ruser=(int)ruser1;
				rbid1=((pubid+r)-pubid)*Math.random()+pubid;
				rbid=(int)rbid1;
				System.out.println("BID BY USER "+ruser+" : "+rbid);
				pubid=rbid;
				k++;
				System.out.print("\nDO YOU WANT TO TERMINATE AUCTION[ENTER Y TO TERMINATE.]");
				uch=sc.next();
				if(uch.equalsIgnoreCase("y"))
				{
					break;
				}
			}
			if(k==rno)
			{
				line_Space(8);
				System.out.println("                        CONGRATULATIONS!!");
				line_Space(5);
				System.out.println("                YOU SOLD AN A.C. FOR Rs. "+pubid);
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[46]=sc.next();
			}
			else
			{
				line_Space(8);
				System.out.println("                         SORRY !!");
				line_Space(5);
				System.out.println("                YOU TERMINATED THE AUCTION");
				line_Space(10);
				System.out.print  ("PRESS ENTER TO CONTINUE.");
				z[47]=sc.next();
			}
		}
	}
	int Thanks()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("\t               THANK YOU FOR USING" );
		System.out.println();
		System.out.println();
		System.out.println("\t               ONLINE AUCTION SYSTEM");
		System.out.println();
		System.out.println();
		System.out.println("\t________________________________________________");
		System.out.println("\t|                                               |");
		System.out.println("\t|                                               |");
		System.out.println("\t|    CREATED BY : ISHAN SINGH                   |");
		System.out.println("\t|                                               |");
		System.out.println("\t|    STD. : X                SEC : B            |");
		System.out.println("\t|                                               |");
		System.out.println("\t|    ROLL NO. : 13                              |");
		System.out.println("\t|                                               |");
		System.out.println("\t|    TEACHER IN CHARGE : SIR TUSHAR KANTI       |");
		System.out.println("\t|                                               |");
		System.out.println("\t|                        SHYAMAL                |");
		System.out.println("\t|                                               |");
		System.out.println("\t|                                               |");
		System.out.println("\t|_______________________________________________|");
		System.out.println();
		System.out.print  ("    enter 0 if you want to restart program.");
		int c=sc.nextInt();
		return c;
	}
	public static void main(String arg[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		Auction ob=new Auction();
		int c=ob.disp();
		switch(c)
		{
			case 1:ob.sign_In();break;
			case 2:ob.sign_Up();
		}
		int ch;
		for (int i=0;i==0;i=ch)
		{
			int s=ob.Selection();
			if(s==1)
			{
				ob.choice_Buy();
			}
			else
			{
				ob.choice_Sell();
			}
			ch=ob.Thanks();
		}
	}
}