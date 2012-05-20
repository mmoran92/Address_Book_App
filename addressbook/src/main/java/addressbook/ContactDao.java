package addressbook;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ContactDao {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void persist(Contact contact) {
		em.persist(contact);
	}

	public List<Contact> getAllContacts() {
		TypedQuery<Contact> query = em.createQuery(
				"SELECT g FROM Contact g ORDER BY g.id", Contact.class);
		return query.getResultList();
	}
}