package addressbook;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

	@Autowired
	private ContactDao contactDao;

	@RequestMapping(value = "/contact")
	public ModelAndView contactbook(HttpServletRequest request) {

		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phonenumber = request.getParameter("phonenumber");
		if (name != null)
			contactDao.persist(new Contact(name, address, phonenumber));

		return new ModelAndView("contact.jsp", "contactDao", contactDao);
	}
}