package ee.ttu.idu0080.raamatupood.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TellimuseRida {
	private Toode toode;
	private long kogus;
	
	private TellimuseRida(Toode toode, long kogus) {
		this.toode = toode;
		this.kogus = kogus;
	}

	public Toode getToode() {
		return toode;
	}

	public void setToode(Toode toode) {
		this.toode = toode;
	}

	public long getKogus() {
		return kogus;
	}

	public void setKogus(long kogus) {
		this.kogus = kogus;
	}
}
