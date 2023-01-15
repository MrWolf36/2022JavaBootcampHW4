package kodlama.io.kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.ProLang;

public interface ProLangService {
	
	List<ProLang> getAll();
	
	void del(int id) ;
	
	void add(ProLang proLang) throws Exception;
	
	void update(ProLang proLang) throws Exception;
	
	ProLang getLangName(int id);
	
}
