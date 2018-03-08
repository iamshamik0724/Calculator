import java.util.*;
import java.lang.*;

class bodmass{

    private int countmul,countadd,countsub,countdiv,ltr[];
    private int i,j,k,l,ccn,a,b,c,d,w,x,y,z;
    private float rno,lno,ans1,temp_no,ans2,final_ans,tempno_new;
    private String temp_str,temp_str1,tempstr_new,tempstr1_new;
    private List<Character> origlist,finalanslist;


    public bodmass(List<Character> l){
        countmul=0;
        countadd=0;
        countsub=0;
        countdiv=0;

        origlist=l;



        for(Character c : l)
        {	if(c=='*')
            countmul++;}


        for(Character c : l)
        {if(c=='/')
            countdiv++;}

        for(b=0;b<(countdiv+countmul);b++){
            for(d=0;d<origlist.size();d++){
                if(origlist.get(d)=='*'){
                    solvemul(origlist);
                    break;
                }
                if(origlist.get(d)=='/'){
                    solvediv(origlist);
                    break;
                }
            }
        }
        calculate(origlist);


    }



    public void solvemul(List<Character> list){

        for(w=0;w<list.size();w++){
            int tmpsig=0;
            int sigz=0;
            if(list.get(w)=='*'){
                j=w;
                k=w;

                lno=getL_no(list,(j-1));
                rno=getR_no(list,k+1);
                ans1=solve(lno,'*',rno);

                j--;
                k++;

                while(!(list.get(j)=='*')&&!(list.get(j)=='+')&&!(list.get(j)=='/')){
                    if(j==0)
                        break;
                    j--;
                    if(list.get(j)=='-'){
                    	j--;
                        break;
                    }

                }


                while(!(list.get(k)=='*')&&!(list.get(k)=='+')&&!(list.get(k)=='-')&&!(list.get(k)=='/') || tmpsig==0){
                    k++;tmpsig++;
                    if(k==(list.size()))
                        break;
                }

                changeoriglist(list,ans1,(j==0?0:j+1),k); /* Modified */

                break;
            }

        }

    }


    public void solvediv(List<Character> listd){
        for(x=0;x<listd.size();x++){
            int tmpsig2=0;
            if(listd.get(x)=='/'){
                j=x;
                k=x;

                lno=getL_no(listd,(j-1));

                rno=getR_no(listd,(k+1));
                ans1=solve(lno,'/',rno);
                j--;
                k++;

                while(!(listd.get(j)=='*')&&!(listd.get(j)=='+')&&!(listd.get(j)=='/')){

                    if(j==0)
                        break;
                    j--;
                    if(listd.get(j)=='-'){
                    	j--;
                        break;
                    }
                }


                while(!(listd.get(k)=='*')&&!(listd.get(k)=='+')&&!(listd.get(k)=='-')&&!(listd.get(k)=='/') ||tmpsig2==0){
                    k++;tmpsig2++;
                    if(k==(listd.size()))
                        break;
                }


                changeoriglist(listd,ans1,(j==0?0:j+1),k);

                break;
            }

        }

    }



    public float getL_no(List<Character> li,int j1){
        temp_no=0;
        temp_str="";
        temp_str1="";

        while(!(li.get(j1)=='*')&&!(li.get(j1)=='+')&&!(li.get(j1)=='/')){
            temp_str1=li.get(j1).toString();
            temp_str=temp_str1+temp_str;
            if(j1==0 || li.get(j1)=='-') {
                break;
            }
            j1--;
        }

        temp_no=Float.parseFloat(temp_str);
        return temp_no;

    }

    public float getR_no(List<Character> li1,int k1){
        temp_no=0;
        temp_str="";
        temp_str1="";
        int signal=0;

        while(!(li1.get(k1)=='*') && !(li1.get(k1)=='+') && !(li1.get(k1)=='/') && !(li1.get(k1)=='-') || signal==0 && (li1.get(k1)=='-')){
            temp_str1=li1.get(k1).toString();
            temp_str=temp_str+temp_str1;
            k1++;signal++;
            if(k1==li1.size())
                break;
        }

        temp_no=Float.parseFloat(temp_str);
        return temp_no;

    }


    public float solve(float lno,char oper,float rno){
        temp_no=0;
        temp_str=null;

        if(oper=='*'){
            temp_no=lno*rno;
        }

        if(oper=='/'){
            temp_no=lno/rno;
        }

        return temp_no;
    }

    public void changeoriglist(List<Character> li2,float answer,int j1,int k1){
        List<Character> temp_list= new LinkedList<Character>();

        for(y=0;y<j1;y++){
            temp_list.add(li2.get(y));
        }
        char[] ans1char=String.valueOf(ans1).toCharArray();


        for(char ic : ans1char){
            temp_list.add(ic);}

        for(z=k1;z<li2.size();z++){
            temp_list.add(li2.get(z));
        }

        origlist=temp_list;

    }


    public void calculate(List<Character> lili){
        int u,v,w;
        List<Character>templili=lili;
        for (u=0,v=1;v<lili.size();u++,v++){
            if(lili.get(u)=='+' && lili.get(v)=='-' || lili.get(u)=='-'&& lili.get(u)=='+'){
                templili.set(u,'-');
                templili.remove(v);
            }
            if(lili.get(u)=='-' && lili.get(v)=='-'){
                templili.set(u,'+');
                templili.remove(v);
            }
        }

        lili=templili;

        final_ans=0;
        do{
            a=0;
            tempstr_new="";
            tempstr1_new="";
            do{
                tempstr1_new=String.valueOf(lili.get(a));
                tempstr_new = tempstr_new+ tempstr1_new;
                a++;

                if(a==lili.size())
                    break;
            }while(!(lili.get(a)=='+') && !(lili.get(a)=='-'));

            tempno_new = Float.parseFloat(tempstr_new);


            final_ans=final_ans+tempno_new;

            lili.subList(0,(a)).clear();


            for(i=0;i<origlist.size();i++){
               }

            c=1;
            System.out.printf("\n");
            if(lili.size()==0)
                c=0;



        }while(c>0);

        char[] finalans=String.valueOf(final_ans).toCharArray();
        finalanslist=new LinkedList<Character>();
        for(char z: finalans){
            finalanslist.add(z);
        }
    }
    public List<Character> getans(){


        return finalanslist;

    }

}