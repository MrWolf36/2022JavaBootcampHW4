package kodlama.io.kodlama.io.Devs.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.kodlama.io.Devs.business.abstracts.ProLangService;
import kodlama.io.kodlama.io.Devs.entities.ProLang;

@RestController
@RequestMapping("api/proLang")
public class ProLangController {

	private ProLangService proLangService;
	
	@Autowired
	public ProLangController(ProLangService proLangService) {

		this.proLangService = proLangService;
	}
	
	@GetMapping("/getAll")
	public List<ProLang> getAll(){
		return proLangService.getAll();
	}
	
	@DeleteMapping("/del")
	public void del(int id) throws Exception {
		proLangService.del(id);
		
	}
	
	@PostMapping("/add")
	public void add(ProLang proLang) throws Exception {
		proLangService.add(proLang);
	}
	
	@PutMapping("/update")
	public void update(ProLang proLang) throws Exception {
		proLangService.update(proLang);
	}

	@GetMapping("/getLangName")
	public ProLang getLangName(int id) {
	 return proLangService.getLangName(id);
 }
	
}
