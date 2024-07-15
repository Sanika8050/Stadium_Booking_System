import java.util.Scanner;
class node{
String name;
node next;
node prev;
int seat_no1,seat_no2,seat_no;
node(String n,int s)
{
name=n;
next=null;
prev=null;
seat_no=s;
}
}
class Queue{
Scanner input=new Scanner(System.in);
node g_front,g_rear,v_front,v_rear,d_g_front,d_g_rear,d_v_front,d_v_rear;
node temp,ptr,cur,s_temp;
String name;
int seat_no1,seat_no2 ,ch,choice,no ,g_flag ,v_flag ,count1,count2 , g_count ,v_count ,g_b_seat , v_b_seat;
Queue()
{
g_front=null;
g_rear=null;
v_front=null;
v_rear=null;
g_b_seat=0;
   v_b_seat=0;
   count1=5;
count2=5;
g_count=5;
v_count=5;
g_flag=0;
   v_flag=0;
}

void matches()      //to display match schedule
{
System.out.println("WANKHEDE STADIUM");
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println("|SR NO\t|\tDATE\t\t|\t\tMATCH\t\t\t\t|\tTIMINGS\t         |");
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println("|1.\t|\t1/1/23\t\t|\t\tINDIA VS PAKISTAN\t\t|\t9 am to 2 pm     |");
System.out.println("----------------------------------------------------------------------------------------------------------");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println();
}
void book_tickets()   //to enqueue to general and VIP queue
{
 do
{
System.out.println("------------------------------------------------------------");
System.out.println(" SR NO\t|\t\tSEAT TYPE\t|\tCOST       |");
System.out.println("------------------------------------------------------------");
System.out.println(" 1\t|\t\tGENERAL\t\t|\tRS 500     |");
System.out.println("------------------------------------------------------------");
System.out.println(" 2.\t|\t\tVIP\t\t|\tRS 800     |");
System.out.println("------------------------------------------------------------");

System.out.println("Enter SR no of your choice of seat:");
choice=input.nextInt();

switch(choice)
{
case 1:                //enqueue to general queue
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println("Total number of general seats: "+count1);
System.out.println("Total number of available genaral seats: "+g_count);
System.out.println("Total number of general seats booked : "+g_b_seat);
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");

if(g_count==0)
{
System.out.println();
   System.out.println("NO GENERAL SEATS AVAILABLE!!\n*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
   System.out.println();
   }
else
{
System.out.println("Enter Your Name: ");
name=input.next();
System.out.println();
seat_no1++;
g_b_seat++;
node g_new_node=new node(name,seat_no1);
if((g_front)==null&&(g_rear==null))
{
g_front=g_new_node;
g_rear=g_new_node;
g_count--;
}
else
{
g_rear.next=g_new_node;
g_new_node.prev=g_rear;
g_rear=g_new_node;
g_count--;
}
//CRICKET MATCH GENERAL SEAT TICKET
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println("|----------------------------------------------------|");
System.out.println("|     TICKET BOOKED SUCCESSFYLLY!!                   |");
System.out.println("|----------------------------------------------------|");
System.out.println("|       INDIA VS ENGLAND                             |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         Name:"+name+"                                |");
System.out.println("|         GENERAL SEAT NO: "+seat_no1+"                         |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         MONDAY,1 JAN,2023                          |");
System.out.println("|         9 am to 2 pm                               |");
System.out.println("|         VENUE                                      |");
System.out.println("|         WANKHEDE STADIUM:MUMBAI                    |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         COST: 500 RS                               |");
System.out.println("|----------------------------------------------------|");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
break;
case 2: //enqueue to VIP queue
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println("Total number of VIP seats: "+count2);
System.out.println("Total number of available VIP seats: "+v_count);
System.out.println("Total number of VIP seats booked: "+v_b_seat);
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
if(v_count==0)
{
System.out.println("NO VIP SEATS AVAILABLE!!\n*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
else
{
System.out.println("Enter Your Name: ");
name=input.next();
seat_no2++;
v_b_seat++;
node v_new_node=new node(name,seat_no2);

if(v_front==null&&v_rear==null)
{
v_front=v_new_node;
v_rear=v_new_node;
v_count--;
}
else
{
v_rear.next=v_new_node;
v_new_node.prev=v_rear;
v_rear=v_new_node;
v_count--;
}
//CRICKET MATCH VIP SEAT TICKET
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println("|----------------------------------------------------|");
System.out.println("|     TICKET BOOKED SUCCESSFYLLY!!                   |");
System.out.println("|----------------------------------------------------|");
System.out.println("|       INDIA VS ENGLAND                             |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         Name:"+name+"                                |");
System.out.println("|         VIP SEAT NO: "+seat_no2+"                             |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         MONDAY,1 JAN,2023                          |");
System.out.println("|         9 am to 2 pm                               |");
System.out.println("|         VENUE                                      |");
System.out.println("|         WANKHEDE STADIUM:MUMBAI                    |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         COST: 500 RS                               |");
System.out.println("|----------------------------------------------------|");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
break;
default:
{
System.out.println();
System.out.println("INVALID CHOICE!!");
System.out.println();
}
}
System.out.println("Do You Want To Book More Tickets?");
System.out.println("If Yes Then Press '1' else Press '0'");
no=input.nextInt();
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}while(no==1);
System.out.println("THANK YOU FOR BOOKING YOUR TICKETS!!");
System.out.println("DO ENJOY YOUR MATCH!!");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}

void display_tickets()     //to display booked general and VIP tickets
{
System.out.println("***VIP TICKET BOOKINGS!!!***");
System.out.println();
if(v_front==null&&v_rear==null)
{
System.out.println("NO VIT TICKETS BOOKED!!");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
else
{
temp=v_front;
System.out.println("|----------------------------------------|");
System.out.println("|NAME\t\t|\tSEAT NUMBER      |");
System.out.println("|----------------------------------------|");
while(temp!=null)
{
//System.out.println(temp.name+"\t\t\t"+temp.seat_no2);
System.out.println("|"+temp.name+"\t\t|\t"+temp.seat_no+"                |");
System.out.println("|----------------------------------------|");
temp=temp.next;
}
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
System.out.println();
System.out.println("***GENERAL TICKET BOOKINGS!!***");
System.out.println();

if(g_front==null&&g_rear==null)
{
System.out.println("NO GENERAL TICKETS BOOKED!!");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
else
{
temp=g_front;
System.out.println("|----------------------------------------|");
System.out.println("|NAME\t\t|\tSEAT NUMBER      |");
System.out.println("|----------------------------------------|");
while(temp!=null)
{
//System.out.println(temp.name+"\t\t\t"+temp.seat_no2);
System.out.println("|"+temp.name+"\t\t|\t"+temp.seat_no+"                |");
System.out.println("|----------------------------------------|");
temp=temp.next;
}
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
}

void search()  //to search ticket in table
{
do
{  
int pos=0;
System.out.println("------------------------------------------------------------");
System.out.println(" SR NO\t|\t\tSEAT TYPE\t|\tCOST       |");
System.out.println("------------------------------------------------------------");
System.out.println(" 1\t|\t\tGENERAL\t\t|\tRS 500     |");
System.out.println("------------------------------------------------------------");
System.out.println(" 2.\t|\t\tVIP\t\t|\tRS 800     |");
System.out.println("------------------------------------------------------------");

System.out.println("Enter SR no of your selected type of seat to be searched:");
int choice=input.nextInt();
switch(choice)
{
case 1:if(g_front==null&&g_rear==null)
System.out.println("No Tickets Booked!!");
     else
  {
System.out.println("Enter your seat number:");
int seat_no=input.nextInt();

ptr=g_front;
if(seat_no<=0||seat_no>count1)
System.out.println("INVALID SEAT NUMBER");
else
{
while(ptr!=null)
{
pos++;
if(ptr.seat_no==seat_no)
{
g_flag=1;
break;
}
else
{
g_flag=0;
ptr=ptr.next;
}
}
if(g_flag==1)
{
System.out.println("Ticket found");
System.out.println("NAME: "+ptr.name+"\t\t\tSEAT NO: "+ptr.seat_no);
}
else
System.out.println("Ticket not found!!");
}
}
break;
case 2: if(v_front==null&&v_rear==null)
System.out.println("No Tickets Booked!!");
    else
   {
System.out.println("Enter your seat number:");
int seat_no=input.nextInt();

ptr=v_front;
if(seat_no<=0||seat_no>count1)
System.out.println("INVALID SEAT NUMBER");
else
{
while(ptr!=null)
{
pos++;
if(ptr.seat_no==seat_no)
{
v_flag=1;
break;
}
else
{
v_flag=0;
ptr=ptr.next;
}
}
if(v_flag==1)
{
System.out.println("Ticket found");
System.out.println("NAME: "+ptr.name+"\t\t\tSEAT NO: "+ptr.seat_no);
}
else
System.out.println("Ticket not found!!");
}
}
break;
default:  System.out.println("NO SUCH CHOICE AVAILABLE!!");
}
System.out.println("Do you want to  continue to search more tickets?");
System.out.println("If yes then press '1' else press '0'");
no=input.nextInt();
}while(no==1);
}

void dqueue()   // To cancel the ticket
{
do
{
int pos=0;
System.out.println("------------------------------------------------------------");
System.out.println(" SR NO\t|\t\tSEAT TYPE\t|\tCOST       |");
System.out.println("------------------------------------------------------------");
System.out.println(" 1\t|\t\tGENERAL\t\t|\tRS 500     |");
System.out.println("------------------------------------------------------------");
System.out.println(" 2.\t|\t\tVIP\t\t|\tRS 800     |");
System.out.println("------------------------------------------------------------");

System.out.println("Enter SR no of your selected seat:");
int choice=input.nextInt();

switch(choice)
{
case 1:

if(g_front==null&&g_rear==null)
System.out.println("NO SEATS BOOKED!!");

else
{
System.out.println("Total refundable amount=200 RS");
System.out.println("Enter your seat number");
int seat_no=input.nextInt();
if(seat_no<=0||seat_no>count1)
System.out.println("INVALID SEAT NUMBER");

else
{
ptr=g_front;
while(ptr!=null)
{
pos++;
if(ptr.seat_no==seat_no)
{
g_flag=1;
break;
}
else
{
g_flag=0;
ptr=ptr.next;
}
}
if(g_flag==1)
{
System.out.println("Ticket found");

if(ptr.next==null&&ptr.prev!=null)
{
g_rear=g_rear.prev;
g_rear.next=null;
ptr.prev=null;

if(d_g_front==null&&d_g_rear==null)
{
d_g_front=ptr;
d_g_rear=ptr;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
g_b_seat--;
}
else
{
d_g_rear.next=ptr;
ptr.prev=d_g_rear;
d_g_rear=d_g_rear.next;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
g_b_seat--;
}
}
else if(ptr.prev==null&&ptr.next!=null)
{
g_front=g_front.next;
g_front.prev=null;
ptr.next=null;
if(d_g_front==null&&d_g_rear==null)
{
d_g_front=ptr;
d_g_rear=ptr;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
g_b_seat--;
}
else
{
d_g_rear.next=ptr;
ptr.prev=d_g_rear;
d_g_rear=d_g_rear.next;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
g_b_seat--;
}
}
else if(ptr.prev==null&&ptr.next==null)
{
if(d_g_front==null&&d_g_rear==null)
{
d_g_front=ptr;
d_g_rear=ptr;
g_front=null;
g_rear=null;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
g_b_seat--;
}
else
{
d_g_rear.next=ptr;
ptr.prev=d_g_rear;
d_g_rear=d_g_rear.next;
ptr=null;
g_front=null;
g_rear=null;

System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
g_b_seat--;
}
}
else
{
ptr.prev.next=ptr.next;
ptr.next.prev=ptr.prev;
ptr.prev=null;
ptr.next=null;
if(d_g_front==null&&d_g_rear==null)
{
d_g_front=ptr;
d_g_rear=ptr;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
g_b_seat--;
}
else
{
d_g_rear.next=ptr;
ptr.prev=d_g_rear;
d_g_rear=d_g_rear.next;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
g_b_seat--;
}
}
}
else
System.out.println("Ticket not found!!");
}
}
break;
case 2:
if(v_front==null&&v_rear==null)
System.out.println("NO SEATS BOOKED!!");
else
{
System.out.println("Total refundable amount=200 RS");
System.out.println("Enter your seat number");
int seat_no=input.nextInt();
if(seat_no<=0||seat_no>count1)
System.out.println("INVALID SEAT NUMBER");
else
{
ptr=v_front;
while(ptr!=null)
{
pos++;
if(ptr.seat_no==seat_no)
{
v_flag=1;
break;
}
else
{
v_flag=0;
ptr=ptr.next;
}
}
if(v_flag==1)
{
System.out.println("Ticket found");

if(ptr.next==null&&ptr.prev!=null)
{
v_rear=v_rear.prev;
v_rear.next=null;
ptr.prev=null;
if(d_v_front==null&&d_v_rear==null)
{
d_v_front=ptr;
d_v_rear=ptr;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
v_b_seat--;
}
else
{
d_v_rear.next=ptr;
ptr.prev=d_v_rear;
d_v_rear=d_v_rear.next;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
v_b_seat--;
}
}

else if(ptr.prev==null&&ptr.next!=null)
{
v_front=v_front.next;
v_front.prev=null;
ptr.next=null;
if(d_v_front==null&&d_v_rear==null)
{
d_v_front=ptr;
d_v_rear=ptr;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
v_b_seat--;
}
else
{
d_v_rear.next=ptr;
ptr.prev=d_v_rear;
d_v_rear=d_v_rear.next;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
v_b_seat--;
}
}
else if(ptr.prev==null&&ptr.next==null)
{
if(d_v_front==null&&d_v_rear==null)
{
d_v_front=ptr;
d_v_rear=ptr;
v_front=null;
v_rear=null;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
v_b_seat--;
}
else
{
d_v_rear.next=ptr;
ptr.prev=d_v_rear;
d_v_rear=d_v_rear.next;
ptr=null;
v_front=null;
v_rear=null;

System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
v_b_seat--;
}
}
else
{
ptr.prev.next=ptr.next;
ptr.next.prev=ptr.prev;
ptr.prev=null;
ptr.next=null;
if(d_v_front==null&&d_v_rear==null)
{
d_v_front=ptr;
d_v_rear=ptr;
ptr=null;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
v_b_seat--;
}
else
{
d_v_rear.next=ptr;
ptr.prev=d_v_rear;
d_v_rear=d_v_rear.next;
System.out.println("YOUR TICKET HAS BEEN DELETED SUCCESSFULLY!!");
System.out.println("AMOUNT REFUNDED: 200 RS");
v_b_seat--;
}
}
}
else
System.out.println("Ticket not found!!");
}
}
break;
default:
System.out.println("NO SUCH CASE AVAILABLE!!");
}
System.out.println("Do You Want To Delete More Tickets?");
System.out.println("If Yes Then Press '1' else Press '0'");
no=input.nextInt();
}while(no==1);
}

void show_cancelled_tickets() //to show cancelled tickets of the match
{
System.out.println("***Cancelled tickets of VIP seats***");
System.out.println();
if(d_v_front==null && d_v_rear==null)
{
System.out.println("No Cancelled tickets of VIP seats ");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println();
}
else
{
System.out.println("|----------------------------------------|");
System.out.println("|NAME\t\t|\tSEAT NUMBER      |");
System.out.println("|----------------------------------------|");

temp=d_v_front;
while(temp!=null)
{
System.out.println("|"+temp.name+"\t\t|\t"+temp.seat_no+"                |");
System.out.println("|----------------------------------------|");
temp=temp.next;
}
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
System.out.println();
System.out.println("***Cancelled tickets of General seats***");
System.out.println();

if(d_g_front==null && d_g_rear==null)
{
System.out.println("No Cancelled tickets of General seats ");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println();
}
else
{
System.out.println("|----------------------------------------|");
System.out.println("|NAME\t\t|\tSEAT NUMBER      |");
System.out.println("|----------------------------------------|");

temp=d_g_front;
while(temp!=null)
{
System.out.println("|"+temp.name+"\t\t|\t"+temp.seat_no+"                |");
System.out.println("|----------------------------------------|");
temp=temp.next;
}
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
System.out.println();
}

void book_cancelled_tickets() //To book match ticket for cancelled tickets
{
int flag=0;
if((d_g_front==null && d_g_rear==null)&&(d_v_front==null && d_v_rear==null))
{
System.out.println("No Cancelled tickets  seats ");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println();
}
else
{
 do
 {
System.out.println("------------------------------------------------------------");
System.out.println(" SR NO\t|\t\tSEAT TYPE\t|\tCOST       |");
System.out.println("------------------------------------------------------------");
System.out.println(" 1\t|\t\tGENERAL\t\t|\tRS 500     |");
System.out.println("------------------------------------------------------------");
System.out.println(" 2.\t|\t\tVIP\t\t|\tRS 800     |");
System.out.println("------------------------------------------------------------");

System.out.println("Enter SR no of your choice of seat:");
choice=input.nextInt();

switch(choice)
{
case 1:if(d_g_front==null && d_g_rear==null)
{
System.out.println("No Cancelled tickets of General seats ");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println();
}
else
{
System.out.println("Enter seat no which is at the beginning of displayed cancelled general seats:");
int s_seat_no=input.nextInt();

System.out.println("Enter your name:");
name=input.next();

node d_g_temp=d_g_front;
if(s_seat_no!=d_g_front.seat_no)
{
flag=0;
System.out.println("Incorrect seat number");
System.out.println("Please enter seat no which is at the beginning of displayed cancelled seats ");  
}
else
{
node d_g_new_node= new node(name,s_seat_no);

if(s_seat_no<=0 || s_seat_no>count1) //for invalid seat number entered
{
System.out.println("Invalid seat number entered...");
flag=0;
}
else if(g_front==null && g_rear==null  ) //to add only seat in general queue  
{
g_front=d_g_new_node;//if no deleted seats are booked
g_rear=d_g_new_node;
flag=1;
if(d_g_temp.next==null&&d_g_temp.prev==null)  //to dequeue only node  from d_g_queue
{
d_g_front=null;
d_g_rear=null;
d_g_temp=null;
}
else //to dequeue from d_g_queue
{
d_g_front=d_g_front.next;
d_g_temp.next=null;
d_g_front.prev=null;
d_g_temp=null;
}
}
else if(g_front.next==null&&g_front.prev==null)//1 seat is booked
{
flag=1;
cur=g_front;
if(s_seat_no<cur.seat_no)
{
g_front.prev=d_g_new_node;
g_front=g_front.prev;
g_front.next=cur;
}
else
{
g_front.next=d_g_new_node;
g_rear=g_rear.next;
g_rear.prev=cur;
}

if(d_g_temp.next!=null)
{
d_g_front=d_g_front.next;
d_g_temp.next=null;
d_g_front.prev=null;
d_g_temp=null;
}
else
{
d_g_front=null;
d_g_rear=null;
d_g_temp=null;
}
}
else
{
flag=1;
if(s_seat_no<g_front.seat_no)
{
cur=g_front;
g_front.prev=d_g_new_node;
g_front=g_front.prev;
g_front.next=cur;
}
else if(s_seat_no>g_rear.seat_no)
{
cur=g_rear;
g_rear.next=d_g_new_node;
g_rear=g_rear.next;
g_rear.prev=cur;
}
else
{
ptr=g_front;
while(ptr!=null)
{
if(ptr.seat_no<s_seat_no)
{
cur=ptr;
ptr=ptr.next;
}
else
{
cur.next=d_g_new_node;
d_g_new_node.prev=cur;
d_g_new_node.next=ptr;
ptr.prev=d_g_new_node;
break;
}
}
}
if(d_g_temp.next!=null)
{
d_g_front=d_g_front.next;
d_g_temp.next=null;
d_g_front.prev=null;
d_g_temp=null;
}
else
{
d_g_front=null;
d_g_rear=null;
d_g_temp=null;
}
}
if(flag==0)
{
System.out.println("Unable to book ticket...");
}
else if(flag==1)
{
//CRICKET MATCH GENERAL SEAT TICKET FOR CANCELLED SEAT
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println("|----------------------------------------------------|");
System.out.println("|     TICKET BOOKED SUCCESSFYLLY!!                   |");
System.out.println("|----------------------------------------------------|");
System.out.println("|       INDIA VS ENGLAND                             |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         Name:"+name+"                                |");
System.out.println("|         GENERAL SEAT NO: "+s_seat_no+"                         |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         MONDAY,1 JAN,2023                          |");
System.out.println("|         9 am to 2 pm                               |");
System.out.println("|         VENUE                                      |");
System.out.println("|         WANKHEDE STADIUM:MUMBAI                    |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         COST: 500 RS                               |");
System.out.println("|----------------------------------------------------|");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
}
}
break;

case 2: if(d_v_front==null && d_v_rear==null)
{
System.out.println("No Cancelled tickets of General seats ");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println();
}
else
{
System.out.println("Enter seat no which is at the beginning of displayed cancelled general seats:");
int s_seat_no=input.nextInt();

System.out.println("Enter your name:");
name=input.next();

node d_v_temp=d_v_front;
if(s_seat_no!=d_v_front.seat_no)
{
flag=0;
System.out.println("Incorrect seat number");
System.out.println("Please enter seat no which is at the beginning of displayed cancelled seats ");  
}
else
{
node d_v_new_node= new node(name,s_seat_no);

if(s_seat_no<=0 || s_seat_no>count1) //for invalid seat number entered
{
System.out.println("Invalid seat number entered...");
flag=0;
}
else if(v_front==null && v_rear==null  ) //to add only seat in VIP queue
{
v_front=d_v_new_node;//if no deleted seats are booked
v_rear=d_v_new_node;
flag=1;
if(d_v_temp.next==null&&d_v_temp.prev==null)  //to dequeue only node  from d_g_queue
{
d_v_front=null;
d_v_rear=null;
d_v_temp=null;
}
else //to dequeue from d_g_queue
{
d_v_front=d_v_front.next;
d_v_temp.next=null;
d_v_front.prev=null;
d_v_temp=null;
}
}
else if(v_front.next==null&& v_front.prev==null)//1 seat is booked
{
flag=1;
cur=v_front;
if(s_seat_no<cur.seat_no)
{
v_front.prev=d_v_new_node;
v_front=v_front.prev;
v_front.next=cur;
}
else
{
v_front.next=d_v_new_node;
v_rear=v_rear.next;
v_rear.prev=cur;
}

if(d_v_temp.next!=null)
{
d_v_front=d_v_front.next;
d_v_temp.next=null;
d_v_front.prev=null;
d_v_temp=null;
}
else
{
d_v_front=null;
d_v_rear=null;
d_v_temp=null;
}
}
else
{
flag=1;
if(s_seat_no<v_front.seat_no)
{
cur=v_front;
v_front.prev=d_v_new_node;
v_front=v_front.prev;
v_front.next=cur;
}
else if(s_seat_no>v_rear.seat_no)
{
cur=v_rear;
v_rear.next=d_v_new_node;
v_rear=v_rear.next;
v_rear.prev=cur;
}
else
{
ptr=v_front;
while(ptr!=null)
{
if(ptr.seat_no<s_seat_no)
{
cur=ptr;
ptr=ptr.next;
}
else
{
cur.next=d_v_new_node;
d_v_new_node.prev=cur;
d_v_new_node.next=ptr;
ptr.prev=d_v_new_node;
break;
}
}
}
if(d_v_temp.next!=null)
{
d_v_front=d_v_front.next;
d_v_temp.next=null;
d_v_front.prev=null;
d_v_temp=null;
}
else
{
d_v_front=null;
d_v_rear=null;
d_v_temp=null;
}
}
if(flag==0)
{
System.out.println("Unable to book ticket...");
}
else if(flag==1)
{
//CRICKET MATCH GENERAL SEAT TICKET FOR CANCELLED SEAT
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
System.out.println("|----------------------------------------------------|");
System.out.println("|     TICKET BOOKED SUCCESSFYLLY!!                   |");
System.out.println("|----------------------------------------------------|");
System.out.println("|       INDIA VS ENGLAND                             |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         Name:"+name+"                                |");
System.out.println("|         VIP SEAT NO: "+s_seat_no+"                         |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         MONDAY,1 JAN,2023                          |");
System.out.println("|         9 am to 2 pm                               |");
System.out.println("|         VENUE                                      |");
System.out.println("|         WANKHEDE STADIUM:MUMBAI                    |");
System.out.println("|----------------------------------------------------|");
System.out.println("|         COST: 500 RS                               |");
System.out.println("|----------------------------------------------------|");
System.out.println("*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*==*");
}
}
}
break;

default:System.out.println("INVALID CHOICE ENTERED!!!");
break;
}
System.out.println("Do you want to continue to book more cancelled tickets?");
System.out.println("If yes then press 1 else press 0");
choice=input.nextInt();

}while(choice==1);
}
  }
}
public class Stadium {
  public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
Queue obj=new Queue();
obj.matches();

int ch=0;
do
{
System.out.println("***MENU***-What you want to perform?");
System.out.println("\n\t 1.To book match ticket");
System.out.println("\n\t 2.To display total tickets booked ");
System.out.println("\n\t 3.To delete match ticket");
System.out.println("\n\t 4.To search ticket");
System.out.println("\n\t 5.To display cancelled tickets of match");
System.out.println("\n\t 6.To book match ticket for cancelled tickets \n\t");

System.out.println("Enter your choice:");
ch=sc.nextInt();

switch(ch)
{
case 1: obj.book_tickets();
       break;
       
case 2: obj.display_tickets();
break;

case 3: obj.dqueue();
break;

case 4: obj.search();
break;

case 5: obj.show_cancelled_tickets();
break;

case 6:obj.book_cancelled_tickets();
break;

default:System.out.println("INVALID CHOICE ENTERED!!!");
}
System.out.println("Do you want to continue?");
System.out.println("If yes then press 1 else press 0");
ch=sc.nextInt();

}while(ch==1);
System.out.println("THANK YOU...");
}
}
