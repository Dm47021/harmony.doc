package fr.labri.harmony.dummy;

import javax.persistence.Entity;

import fr.labri.harmony.core.model.Data;

@Entity
public class DummyData implements Data {

	private int elementId;
	private int elementKind;
	private String content;

	public DummyData() {
	}

	@Override
	public int getElementId() {
		return elementId;
	}

	@Override
	public int getElementKind() {
		return elementKind;
	}

	@Override
	public void setElementId(int arg0) {
		this.elementId = arg0;
	}

	@Override
	public void setElementKind(int arg0) {
		this.elementKind = arg0;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
