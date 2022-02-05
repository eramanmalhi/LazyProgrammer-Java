package edu.aman.tech.zone.innerclasses.part2;

public class MainClassForAnonymousInnerClasses {

	static SuperClass superClass=new SuperClass() {

		@Override
		public void showMsg() {
			super.showMsg();
			System.out.println("This is Anonymous Inner Class");
		}
		
	};
	
	static InnerClassInterface in=new InnerClassInterface() {
		
		@Override
		public void showMsg() {
			System.out.println("This is Anonymous Inner Class from Interface");
			
		}
	};
	
	public static void main(String[] args) {
		//superClass.showMsg();
		in.showMsg();
		
	}

}
