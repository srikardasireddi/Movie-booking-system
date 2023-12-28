import java.util.Scanner;
public class movieticketfinal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("dear customer please input your age");
        int age=sc.nextInt();
        System.out.println("on which day do you want to book the tickets ie; weekday or weekend or holiday ");
        String day= sc.next();
        System.out.println("at what time do you want to book i.e; morning or Matinee or evening");
        String time=sc.next();
        System.out.println("what kind of screen do you prefer for movie i;e; 3D or IMAX ");
        String screen=sc.next();
        System.out.println("if you have membership add Premium or not if not please add standard ");
        String Membership=sc.next();
        int totalPrice=200;
        if (age<=18)
        {
            if(day.equals("weekday"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+20;
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+50;
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+20;
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+50;
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX")) {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
            if (day.equals("weekend"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
            if (day.equals("holiday"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
        }
        if (age>18&&age<40)
        {
            if(day.equals("weekday"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+20;
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+50;
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+20;
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+50;
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX")) {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
            if (day.equals("weekend"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
            if (day.equals("holiday"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
        }
        if (age>40&&age<100)
        {
            if(day.equals("weekday"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+20;
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+50;
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+20;
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is "+totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if(Membership.equals("standard"))
                        {
                            totalPrice=totalPrice+50;
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                        if(Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:"+totalPrice);
                        }
                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX")) {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
            if (day.equals("weekend"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
            if (day.equals("holiday"))
            {
                if (time.equals("morning"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard")) {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium")) {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Matinee"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }

                    }
                }
                if (time.equals("Evening"))
                {
                    if (screen.equals("3D"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 20;
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("the price of an ticket is " + totalPrice);
                        }
                    }
                    if (screen.equals("IMAX"))
                    {
                        if (Membership.equals("standard"))
                        {
                            totalPrice = totalPrice + 50;
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                        if (Membership.equals("Premium"))
                        {
                            System.out.println("ticket price will be:" + totalPrice);
                        }
                    }
                }
            }
        }
    }
}

