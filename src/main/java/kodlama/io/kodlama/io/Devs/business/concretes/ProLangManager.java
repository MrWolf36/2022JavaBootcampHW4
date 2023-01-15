package kodlama.io.kodlama.io.Devs.business.concretes;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.io.kodlama.io.Devs.business.abstracts.ProLangService;
import kodlama.io.kodlama.io.Devs.dataAccess.abstracts.ProLangDao;
import kodlama.io.kodlama.io.Devs.entities.ProLang;


@Service
public class ProLangManager implements ProLangService{

	
	
	
	private ProLangDao proLangDao;
	
	
	@Autowired
	public ProLangManager(ProLangDao proLangDao) {
	
		this.proLangDao = proLangDao;
	
	}

	
	
	
	@Override
	public List<ProLang> getAll()  {
		
		return proLangDao.getAll() ;
	}

	@Override
	public void del(int id){
		
		proLangDao.del(id);
		}
	
		
	

	@Override
	public void add(ProLang proLang) throws Exception  {
		for (ProLang proLang1 :proLangDao.getAll()) {
			if(proLang.getName().equals(proLang1.getName())||proLang.getId()==proLang1.getId()) {
				throw new Exception("Bu Kullanıcı daha önceden eklenmiştir!!!");
			}
			if(proLang.getLang().equals("")) {
				throw new Exception("Programlama Dili Boş Geçilemez");
			}
			else{
				proLangDao.add(proLang);
				break;
			}
		
		}
		
	}

	@Override
	public void update(ProLang proLang) throws Exception {
					proLangDao.update(proLang);
			
	}

	@Override
	public ProLang getLangName(int id) {
		
	return	proLangDao.getLangName(id);	
			
	}
}
