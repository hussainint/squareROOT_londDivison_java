
import java.util.Scanner;
public class ssqrtt4{

    public static void main(String args[])
    {
        String answer="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find square root");
        long n=sc.nextLong();
        long nd=n;
        ssqrtt4 ob=new ssqrtt4();     
        long ans=1,k=0,d=ob.dig(n),f=n/d,l=n-(f*d),dp=1,i=1;
        n=l;        
        long n2ar[]=new long[1000];
        long ld2ar[]=new long[1000];
        long snar[]=new long[1000];
        long ldar[]=new long[1000];
        long lansar[]=new long[1000];
        int arp=0;
        int pos=0;
        while(true)
        {
            if((i*i)>f)
            {
                ans=i-1;
                k=(i-1)*(i-1);
                break;
            }
            else
                ++i;
        }
        long sn=f-k;
        long dt=0,n2;
        int aa=0;
        n2ar[arp]=n;
        ld2ar[arp]=k;
        snar[arp]=sn;
        ++arp;
        answer=answer+(i-1);
        do
        {

            d=ob.dig(n);
            f=n/d;
            l=n-(f*d);

            if(n!=0)
                n2=(sn*100)+f;
            else{
                n2=sn*100;
                dt=1;
                ++aa;
            }
            long ld=ob.rt((ans*2),n2);
            lansar[arp]=ans*2;
            sn=n2-(ld*(ld%10));
            ans=(ans*10)+(ld%10);

            n2ar[arp]=n2;
            ld2ar[arp]=(ld*(ld%10));
            snar[arp]=sn;
            ldar[arp]=ld;
            ++arp;
            if(aa==1){
                answer=answer+".";
                ++aa;
            }
            answer=answer+(ld%10);
            if(dt==1)
            {
                dp=dp*10;
            }
            if(dp==100000000)
                break;
            n=l;

        }while(sn>0);
        System.out.println("\n\n\n\t\t\t\t\t\t\t\tOUTPUT");
        int jk=1;
        int chct=1;
        String kans=answer.substring(0,chct);
        for(int ar=1;ar<arp;ar++)
        {
            if(answer.charAt(chct-1)=='.')
                ++chct;
            for(jk=1;jk<=3;jk++)
            {
                ob.delay();        
                if(ar==arp-1)
                ob.pconst(nd,ld2ar[0],answer.substring(0));
                else
                ob.pconst(nd,ld2ar[0],answer.substring(0,chct));
                for(int fr=1;fr<ar;fr++)
                {
                    System.out.print("\t\t\t");
                    for(int ii=0;ii<5;ii++)
                        System.out.print("_");
                    System.out.println();
                    ob.nudig(ldar[fr],1);
                    
                    System.out.print(ldar[fr]+"|"+n2ar[fr]+"\n");
                    System.out.println("\t\t\t|"+ld2ar[fr]);
                    }


                System.out.print("\t\t\t");
                for(int ii=0;ii<5;ii++)
                    System.out.print("_");
                System.out.println();
                if(jk==1)
                    System.out.println("\t\t\t|"+n2ar[ar]);
                else if(jk==2)
                {
                    
                   ob.nudig(lansar[ar],0);
                    System.out.print(lansar[ar]+" |"+n2ar[ar]+"\n");
                }
                else{
                    ob.nudig(ldar[ar],1);
                    System.out.print(ldar[ar]+"|"+n2ar[ar]+"\n");
                    System.out.println("\t\t\t|"+ld2ar[ar]);
                    ++chct;
                }
            }
        }

    }

    void pconst(long a,long ah,String ansss)
    {
        System.out.println("\t\t\t"+ansss);
        System.out.print("\t\t\t");
        for(int ii=0;ii<20;ii++)
            System.out.print("_");

        System.out.println("\n\t\t\t|"+a);
        System.out.println("\t\t\t|"+ah);      
        System.out.println("\t\t\t|");
    }
    
    public void nudig(long numm,int u)
    {
        int sum=0;
        while(numm!=0)
        {          
            numm=numm/10;
            sum=sum+1;
        }
        if(u==0)
        sum++;
        for(int sarf=1;sarf<(25-sum);sarf++)
                    System.out.print(" ");
    }
    
    public long dig(long x)
    {
        long r=1;
        while(x>99)
        {
            r=r*100;
            x=x/100;
        }
        return r;
    }

    public long rt(long x2,long nn2)
    {
        long ddx2=0,i=0;
        while(i<10)
        {
            long dx2=(x2*10)+i;
            if((dx2*i)>nn2)
                return ddx2;
            ++i;
            ddx2=dx2;
        }
        return ddx2;
    }

    void delay()
    {
        for(double i=0.0;i<=100000000.0;i+=0.3)

            for(double i1=0.0;i<=1000000.0;i+=0.3)

                for(double i2=0.0;i<=10000000.0;i+=0.3)

                    for(double i3=0.0;i<=1000000.0;i+=0.3)

                        for(double i4=0.0;i<=100000.0;i+=0.3)

                            for(double i5=0.0;i<=1000000.0;i+=0.3){}
            System.out.println('\u000c');
    }
}

