package it.alfasoft.biagio.Request;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="contatore",eager=true)
//@RequestScoped
@SessionScoped
public class RequestContatore implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int cnt;
	
	public RequestContatore() {
		setCnt(0);
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void incrementa(){
		this.cnt++;
	}
}
