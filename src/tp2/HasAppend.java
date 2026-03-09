package tp2;

public interface HasAppend<E, L extends HasAppend<E,L>> extends IsList<E,L>{
	
	default L append(L autre) {
		return cases(autre,(hd,tl) -> tl.append(autre).add(hd));
	}

}
