package de.mklinger.maven.jshint.cache;

import java.io.Serializable;

public class Cache implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public final Hash hash;
	public final Results previousResults;
	
	public Cache(Hash hash) {
      this(hash, new Results());
	}

	public Cache(Hash hash, Results previousResults) {
	  this.hash = hash;
	  this.previousResults = previousResults;
	}
}
