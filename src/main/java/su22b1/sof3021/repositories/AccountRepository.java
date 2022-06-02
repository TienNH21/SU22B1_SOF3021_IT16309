package su22b1.sof3021.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import su22b1.sof3021.entities.Account;

@Repository
public interface AccountRepository
	extends JpaRepository<Account, Integer> {

	// C1: @Query(value="SELECT acc FROM Account acc WHERE acc.username = :username")
	// C2: @Query(name="Account.findByUsername")
	// public Account findByUsername(@Param("username") String username);
	
	// C3: DSL
	public Account findByUsernameEqual(String username);
}
