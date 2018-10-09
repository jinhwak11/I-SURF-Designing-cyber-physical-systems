package edu.stanford.nlp.parser.lexparser.demo;

import java.util.Vector;

public class Noun {
	String name;
	Vector<Modifier> modarr;
	String depIdx;
	String govIdx;

	public Noun() {
		this.name = "";
		this.modarr = new Vector<Modifier>();
		this.depIdx = "";
	}

	public void setName(String s) {
		this.name = s;
	}

	public void setModifier(Modifier mod) {
		this.modarr.add(mod);
	}

	public void setDepIdx(String idx) {
		this.depIdx = idx;
	}
	
	public void setGovIdx(String idx) {
		this.govIdx = idx;
	}
}
