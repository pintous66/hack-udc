package health.mental.repositories;

import health.mental.domain.Chat.Chat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {



    public List<Chat> findAll();


}
