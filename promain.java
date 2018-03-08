import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.*;

public class promain extends Application implements EventHandler<ActionEvent> {

	
	TextArea screen;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
	List<Character> mainexp =new LinkedList<Character>();
	List<Character> ans;
	int equalsflag=0;
	
	public static void main(String[] args){
		launch(args);
		
	} 

	public void start(Stage stage) throws Exception {
		stage.setTitle("My Calculator");
		
		
		screen = new TextArea();
		screen.setMaxSize(268, 80);
		screen.setMinSize(268, 80);
		screen.setLayoutX(21);
		screen.setLayoutY(20);
		
		
		button one = new button("1");
		b1=one.getbutt();
		b1.setOnAction(this);
		
		button two = new button("2");
		b2=two.getbutt();
		b2.setOnAction(this);
		
		button three = new button("3");
		b3=three.getbutt();
		b3.setOnAction(this);
		
		button four = new button("4");
		b4=four.getbutt();
		b4.setOnAction(this);
		
		button five = new button("5");
		b5=five.getbutt();
		b5.setOnAction(this);
		
		button six= new button("6");
		b6=six.getbutt();
		b6.setOnAction(this);
		
		button seven = new button("7");
		b7=seven.getbutt();
		b7.setOnAction(this);
		
		button eight = new button("8");
		b8=eight.getbutt();
		b8.setOnAction(this);
		
		button nine = new button("9");
		b9=nine.getbutt();
		b9.setOnAction(this);
		
		button zero= new button("0");
		b0=zero.getbutt();
		b0.setOnAction(this);
		
		button dot= new button(".");
		b11=dot.getbutt();
		b11.setOnAction(this);
		
		button clrall = new button("CE");
		b12=clrall.getbutt();
		b12.setOnAction(this);
		
		button back= new button("back");
		b13=back.getbutt();
		b13.setOnAction(this);
		
		button multiply = new button("*");
		b14=multiply.getbutt();
		b14.setOnAction(this);
		
		button divide = new button("/");
		b15=divide.getbutt();
		b15.setOnAction(this);
		
		button plus = new button("+");
		b17=plus.getbutt();
		b17.setOnAction(this);
		
		button minus = new button("-");
		b16=minus.getbutt();
		b16.setOnAction(this);
		
		button eq = new button("=");
		b18=eq.getbutt();
		b18.setOnAction(this);
		
		button opbrac = new button("(");
		b19=opbrac.getbutt();
		b19.setOnAction(this);
		
		button closebrac = new button(")");
		b20=closebrac.getbutt();
		b20.setOnAction(this);
		
		
		
			
		Pane lay = new Pane();
		lay.getChildren().add(screen);
		lay.getChildren().add(b1);
		lay.getChildren().add(b2);
		lay.getChildren().add(b3);
		lay.getChildren().add(b4);
		lay.getChildren().add(b5);
		lay.getChildren().add(b6);
		lay.getChildren().add(b7);
		lay.getChildren().add(b8);
		lay.getChildren().add(b9);
		lay.getChildren().add(b0);
		lay.getChildren().add(b11);
		lay.getChildren().add(b12);
		lay.getChildren().add(b13);
		lay.getChildren().add(b14);
		lay.getChildren().add(b15);
		lay.getChildren().add(b16);
		lay.getChildren().add(b17);
		lay.getChildren().add(b18);
		lay.getChildren().add(b19);
		lay.getChildren().add(b20);
		
		Scene scene = new Scene(lay,300,460);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}
	
	public void handle(ActionEvent event){
		
		System.out.println() ;
		if(event.getSource()==b1){
			mainexp.add('1');
			updateGUI();
		}
		if(event.getSource()==b2){
			mainexp.add('2');
			updateGUI();
		}
		if(event.getSource()==b3){
			mainexp.add('3');
			updateGUI();
		}
		if(event.getSource()==b4){
			mainexp.add('4');
			updateGUI();
		}
		if(event.getSource()==b5){
			mainexp.add('5');
			updateGUI();
		}
		if(event.getSource()==b6){
			mainexp.add('6');
			updateGUI();
		}
		if(event.getSource()==b7){
			mainexp.add('7');
			updateGUI();
		}
		if(event.getSource()==b8){
			mainexp.add('8');
			updateGUI();
		}
		if(event.getSource()==b9){
			mainexp.add('9');
			updateGUI();
		}
		if(event.getSource()==b0){
			mainexp.add('0');
			updateGUI();
		}
		if(event.getSource()==b11){
			mainexp.add('.');
			updateGUI();
		}
		if(event.getSource()==b12){
			mainexp.clear();
			updateGUI();
		}
		if(event.getSource()==b13){
			mainexp.remove((mainexp.size()-1));
			updateGUI();
		}
		if(event.getSource()==b14){
			mainexp.add('*');
			updateGUI();
		}
		if(event.getSource()==b15){
			mainexp.add('/');
			updateGUI();
		}
		if(event.getSource()==b16){
			mainexp.add('-');
			updateGUI();
		}
		if(event.getSource()==b17){
			mainexp.add('+');
			updateGUI();
		}
		if(event.getSource()==b18){
			on_equals gogogo =new on_equals(mainexp);
			ans=gogogo.ultimateans();
			equalsflag=1;
			updateGUI();
			mainexp.clear();
		
		}
		if(event.getSource()==b19){
			mainexp.add('(');
			updateGUI();
		}
		if(event.getSource()==b20){
			mainexp.add(')');
			updateGUI();
		}
		
	}
	
	public void updateGUI(){
		Platform.runLater(
				new Runnable(){
					public void run(){
					if(equalsflag==0){
						String temp="";
						String temp1="";
						for(char z:mainexp){
							temp1=String.valueOf(z);
							temp=temp+temp1;
							
						}
						screen.setText(temp);}
					else{
						String temp="";
						String temp1="";
						for(char z:ans){
							temp1=String.valueOf(z);
							temp=temp+temp1;
							
						}
						screen.setText(temp);
						equalsflag=0;
						}
					}
				}
				);
	}
	
	
}
