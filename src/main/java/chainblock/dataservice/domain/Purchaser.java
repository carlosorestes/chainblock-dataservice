package chainblock.dataservice.domain;

import java.io.Serializable;

public class Purchaser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long identity;
	private String name;
	private double value;
	public String previousHash;
	
	public Purchaser() {
	}

	public Purchaser(long identity, String name, double value, String previousHash) {
		super();
		this.identity = identity;
		this.name = name;
		this.value = value;
		this.previousHash = previousHash;
	}

	public long getIdentity() {
		return identity;
	}

	public void setIdentity(long identity) {
		this.identity = identity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (identity ^ (identity >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Purchaser other = (Purchaser) obj;
		if (identity != other.identity)
			return false;
		return true;
	}

}
