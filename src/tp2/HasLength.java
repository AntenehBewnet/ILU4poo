package tp2;

public interface HasLength<E, L extends HasLength<E,L>> extends IsList<E,L> {
	
	default int length() {
		return cases(0,(hd,tl)-> 1+ tl.length());
	}
	

}
