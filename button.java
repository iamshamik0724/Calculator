import java.awt.Font;

import javafx.scene.control.Button;
import javafx.scene.control.Skin;

class button{

	String num;
	Button butt;
	public button(String l){
		butt= new Button(l);
		butt.setMaxSize(50,50);
		butt.setMinSize(60,60);
		
		
		
		if(l=="CE" ||l=="0" || l=="." || l=="=")
			butt.setLayoutY(400);
		
		if(l=="1" || l=="2" || l=="3"|| l=="-")
			butt.setLayoutY(330);
		if(l=="4" || l=="5" || l=="6"|| l=="+")
			butt.setLayoutY(260);
		if(l=="7" || l=="8" || l=="9"|| l=="*")
			butt.setLayoutY(190);
		if( l=="back" || l=="/"|| l=="("|| l==")")
			butt.setLayoutY(120);
		
		
		if(l=="*" || l=="+" || l=="-"|| l=="/"|| l=="=")
			butt.setLayoutX(230);
		
		if(l=="9" || l=="6" || l=="3" || l=="back"||l=="CE")
			butt.setLayoutX(160);
		if(l=="8" || l=="5" || l=="2" || l=="."|| l==")")
			butt.setLayoutX(90);
		if(l=="7" || l=="4" || l=="1" || l=="0"|| l=="(")
			butt.setLayoutX(20);
		
		
		
	}
	public Button getbutt(){
		return butt;
	}
	
	
}
