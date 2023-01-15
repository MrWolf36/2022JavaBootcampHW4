package kodlama.io.kodlama.io.Devs.entities;

public class ProLang {
private int id;
private String name;
private String lang;

public ProLang() {

}

public ProLang(int id, String name,String lang) {

	this.id = id;
	this.name = name;
	this.lang=lang;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLang() {
	return lang;
}

public void setLang(String lang) {
	this.lang = lang;
}
}
