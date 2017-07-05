

public class Anomalia {
private String titulo;
private String estado;







public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
	if(this.getEstado().equals("MALO"))
	{
	this.notificar();
	}
}

public void notificar()
{
	Alarma j = new Alarma();
	j.notifyObservers();
	}

}
