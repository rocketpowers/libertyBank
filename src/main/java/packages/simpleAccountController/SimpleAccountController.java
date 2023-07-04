package packages.simpleAccountController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import packages.SimpleAccountRepository.SimpleAccountRepository;
import packages.models.SimpleAccount;

@RestController
public class SimpleAccountController {

	@Autowired
	private SimpleAccountRepository simpleAccountRepository;

	@PostMapping("/register")
	public SimpleAccount register(@RequestBody SimpleAccount savSimpleAccount) {
		System.out.println("create sucessfull");
		return simpleAccountRepository.save(savSimpleAccount);
		
	}

	@GetMapping("/list")
	public Iterable<SimpleAccount> list() {
		return simpleAccountRepository.findAll();
	}
	
	@GetMapping("{id}")
	public SimpleAccount listId(@PathVariable Long id) {
		return simpleAccountRepository.findById(id).get();
	}
	
	

	@PutMapping("/update")
	public SimpleAccount update(@RequestBody SimpleAccount simpleAccount) {
		//System.out.println("update sucessfull");
		return simpleAccountRepository.save(simpleAccount);
		
	}
	
	@DeleteMapping("/del/{id}")
	public void del(@PathVariable long id) {
		simpleAccountRepository.deleteById(id);
		System.out.println("removed sucessfull");

	}

}
