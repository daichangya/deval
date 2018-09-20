package daicy.formula;


public class ActiveOperand {
    @Override
	public String toString() {
		 
		return clazz.toString() + " " + value.toString();
	}
    
	private Class clazz;	 
	
	private Object value;


	public ActiveOperand(Class clazz, Object value) {
		super();
		this.clazz = clazz;
		this.value = value;
	}


	public Object getValue() {
		return value;
	}


	public Class getClazz() {
		return clazz;
	}
	
}
