package examen;

public class HG_circulo {
	private int id;
	private double radio;
	private String color;

	public HG_circulo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param radio
	 * @param color
	 */
	public HG_circulo(int id, double radio, String color) {
		super();
		this.id = id;
		this.radio = radio;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "HG_circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}
	
	

}
