package tp2;

public interface HasPlus<N extends HasPlus<N>> {

	default N add(N m) {
		return cases(m, p->this.Succ().pred().add(m).Succ());
	}
}
