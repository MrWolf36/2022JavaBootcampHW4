package kodlama.io.kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.kodlama.io.Devs.entities.ProLang;

public interface ProLangDao {
	
List<ProLang> getAll();

void del(int id) ;

void add(ProLang proLang);

void update(ProLang proLang) throws Exception;

ProLang getLangName(int id);

}
