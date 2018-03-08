import java.util.*;
import java.lang.*;

public class on_equals {

	private int count;
	List<Character> orili,l,finalanswer;
	int i,j,k,m,n,p,q,close,open,aisi,w,wtf;
	bodmass tfinal;
	
	public on_equals(List<Character> exp){
		count=0;
		orili= new LinkedList<Character>();
		orili= exp;
		for(Character c: exp){
			if(c=='(')
				count++;}
		wtf=count;
		System.out.printf("\n%d\n",count);
		for(i=0;i<=wtf;i++){
			System.out.printf("\nrun %d\n",i);
			sender(orili);}	
	
	}
	
	private void sender(List<Character> leo){
		System.out.println("wow");
		if(count==0){
			System.out.println();
			
			for(w=0;w<leo.size();w++){
				System.out.printf("%c",leo.get(w));
				}
			System.out.println();
			
			tfinal = new bodmass(leo);
			
			finalanswer= tfinal.getans();
			
			for(w=0;w<finalanswer.size();w++){
				System.out.printf("%c",finalanswer.get(w));
				}
			System.out.println();
			
		}
		else{
			for(j=(leo.size()-1);j>=0;j--)
				if(leo.get(j)=='('){
					open=j;
					break;}
			
			for(j=open;j<leo.size();j++)
				if(leo.get(j)==')'){
					close=j;
					break;}
				
			List<Character> leo2 = new LinkedList<Character>();
			System.out.printf("check %d\n",(close));
			System.out.printf("check %d\n",(open));
			for(k=(open+1);k<close;k++){
				leo2.add(leo.get(k));}
			
			bodmass t2 = new bodmass(leo2);
			l=t2.getans();
			modifyorili((open),(close),l,leo);
			count--;
			
		}	
	}
	
	
	private void modifyorili(int before,int after,List<Character> ans,List<Character> ori){
		List<Character> tempy = new LinkedList<Character>();
		if(!(before==0)){
			for(m=0;m<before;m++)
				tempy.add(ori.get(m));}
		
		for(p=0;p<ans.size();p++)
		{	tempy.add(ans.get(p));
		System.out.printf("%c",ans.get(p));
		}
		
		for(w=0;w<tempy.size();w++){
			System.out.printf("%c",tempy.get(w));
			}
		
		if(!(after>=(ori.size()-1))){
			for(n=(after+1);n<ori.size();n++)
				tempy.add(ori.get(n));}
		
		orili=tempy;
		
	
		
	}
	
	
public List<Character> ultimateans(){
		
	return finalanswer;
		
	}
	
	
}
