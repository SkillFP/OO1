package ar.edu.unlp.oo1.ejercicio1.impl;

/**
 * Se está construyendo una red social como Facebook o Twitter.
 * Debemos definir una clase Wallpost con los siguientes atributos:
 * un texto que se desea publicar, cantidad de likes (“me gusta”) y
 * una marca que indica si es destacado o no.
 * La clase es subclase de Object.
 */

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/*
 * Permite construir una instancia del WallpostImpl.
 * Luego de la invocación, debe tener como texto: “Undefined post”,
 * no debe estar marcado como destacado y la cantidad de “Me gusta” debe ser 0.
 */

public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean featured;

	public WallPostImpl() {
		this.text = "Undefined post";
		this.likes = 0;
		this.featured = false;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getLikes(){
		return this.likes;
	}

	public void like(){
		this.likes++;
	}

	public void dislike(){
		if (this.likes > 0) this.likes--;
	}

	public boolean isFeatured() {
		return this.featured;
	}

	public void toggleFeatured(){
		this.featured = !this.featured;
	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
