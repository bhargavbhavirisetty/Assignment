package w3;


class MotifScrollBar extends ScrollBar{
	
	MotifScrollBar(String s){
		System.out.println("MotifScrollBar "+s);
	}

}
class MotifWidgetFactory extends WidgetFactory{
	
	Window createWindow() {
		return new MotifWindow("Motif Window");
	}
	
	ScrollBar createScrollBar() {
		return new MotifScrollBar("Motif ScrollBar");
	}

}
class MotifWindow extends Window{
	

	public MotifWindow(String s) {
		System.out.println("MotifWindow "+s);
	}

}
class FactoryMaker {
	
	public static WidgetFactory wt = null;
	
	static WidgetFactory getFactory(String c) {
		if(c.equals("PMWidget")) {
			wt= new PMWidgetFactory();
		}
		else if(c.equals("motif")) {
			wt= new MotifWidgetFactory();
		}
		return wt;
	}

}
class PMScrollBar extends ScrollBar{
	
	PMScrollBar(String s){
		System.out.println("PMScrollBar "+s);
	}

}
class PMWidgetFactory extends WidgetFactory{
	
	Window createWindow() {
		return new PMWindow("PMWindow");
	}
	
	ScrollBar createScrollBar() {
		return new PMScrollBar("PMScrollBar");
	}

}
class PMWindow extends Window{
	
	PMWindow(String s){
		System.out.println("PMWindow "+s);
	}
}
abstract class ScrollBar {
	

}
abstract class WidgetFactory {
	
	abstract ScrollBar createScrollBar();
	abstract Window createWindow();
	

}
abstract class Window {
public void get() {
		
	}

}
public class Client {
	
	public static void main(String args[]) {
		String inp="PMWidget";
		
		WidgetFactory w = FactoryMaker.getFactory(inp);
		Window win = w.createWindow();
		w=new MotifWidgetFactory();
		System.out.println(w.createWindow());
		System.out.println(w.createScrollBar());
		
	}

}