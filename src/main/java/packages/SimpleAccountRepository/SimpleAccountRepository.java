package packages.SimpleAccountRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import packages.models.SimpleAccount;

public interface SimpleAccountRepository  extends JpaRepository<SimpleAccount, Long> {

}
