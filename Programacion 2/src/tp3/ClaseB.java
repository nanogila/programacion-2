package tp3;

public class ClaseB extends ClaseA {
	
	@Override
	public int m1(){
		return 8;		
	}
	
	@Override
	public int m2(){
		return super.m2();		
	}
	
	@Override
	public int m3(){
		return 0;	
	}
	
	@Override
	public int m4(){
		return 20;		
	}
	
	public int m5(){
		return this.m5();		
	}
	
	public int m7(){
		return super.m4();		
	}
	
	
	
	
	
}
