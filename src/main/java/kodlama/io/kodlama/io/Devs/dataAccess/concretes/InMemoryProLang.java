package kodlama.io.kodlama.io.Devs.dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProLangDao;
import kodlama.io.kodlama.io.Devs.entities.ProLang;


@Repository
public class InMemoryProLang implements ProLangDao {
	List<ProLang> proLangs;
	
	public InMemoryProLang() {
		proLangs=new ArrayList<ProLang>();
		proLangs.add(new ProLang(1,"Halil","C++") );
		proLangs.add(new ProLang(2,"Rıfat","C#") );
		proLangs.add(new ProLang(3,"Remzi","C") );
		proLangs.add(new ProLang(4,"Gülenay","Java") );
		proLangs.add(new ProLang(5,"Gürbüz","Pyhton") );
	}

	
	
	
	@Override
	public List<ProLang> getAll()  {
	
		return proLangs;	
	
	}

	@Override
	public void del(int id)  {
		
				proLangs.remove(id-1);
		}
		

	@Override
	public void add(ProLang proLang) {
		proLangs.add(proLang);
		
	}

	@Override
	public void update(ProLang proLang) throws Exception {
		for (ProLang proLang1 :proLangs) {
				if(proLang.getId()==proLang1.getId()) {
				proLang1.setName(proLang.getName());
				proLang1.setLang(proLang.getLang());
				break;
			}
		
		else {
			throw new Exception("Girilen ID ye ait bilgi bulunamadı");
			}
		}
	}	

	

	@Override
	public ProLang getLangName(int id) {
	
				return proLangs.get(id-1); 
		
	}		
}