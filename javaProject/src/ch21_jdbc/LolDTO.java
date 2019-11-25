package ch21_jdbc;

public class LolDTO {
	private String champ;
	private String qs;
	private String ws;
	private String es;
	private String rs;
	public String getChamp() {
		return champ;
	}
	public void setChamp(String champ) {
		this.champ = champ;
	}
	public String getQs() {
		return qs;
	}
	public void setQs(String qs) {
		this.qs = qs;
	}
	public String getWs() {
		return ws;
	}
	public void setWs(String ws) {
		this.ws = ws;
	}
	public String getEs() {
		return es;
	}
	public void setEs(String es) {
		this.es = es;
	}
	public String getRs() {
		return rs;
	}
	public void setRs(String rs) {
		this.rs = rs;
	}
	public LolDTO() {
	}
	public LolDTO(String champ, String qs, String ws, String es, String rs) {
		super();
		this.champ = champ;
		this.qs = qs;
		this.ws = ws;
		this.es = es;
		this.rs = rs;
	}
	@Override
	public String toString() {
		return "LolDTO [champ=" + champ + ", qs=" + qs + ", ws=" + ws + ", es=" + es + ", rs=" + rs + "]";
	}
	

}
