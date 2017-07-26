package de.wuffitv.gapj;

import de.wuffitv.gapj.editor.Window;

public class GAPI {

	public static GAPI gapi;

	public static void main(String[] args) {
		gapi = new GAPI();
	}

	public GAPI() {
		new Window();
	}

}
