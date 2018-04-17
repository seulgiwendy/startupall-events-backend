package kr.startupall.events.domain.repositories;

import kr.startupall.events.domain.authentication.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByLoginId(String loginId);
}
