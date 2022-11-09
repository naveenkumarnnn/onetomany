package one_to_many_bi_controller;

import one_to_many_bi_dto.Phone;
import one_to_many_bi_dto.Sim;
import java.util.ArrayList;
import java.util.List;
import one_to_many_bi_dao.Simdao;

public class SimMainController {
	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.setId(1);
		phone.setModel("honor");
		phone.setStorage(4);
		phone.setEmi("73483hkg");

		Sim sim = new Sim();
		sim.setId(2);
		sim.setSimno(93256);
		sim.setPhone(phone);
		
		Phone phone1 = new Phone();
		phone1.setId(3);
		phone1.setModel("honor");
		phone1.setStorage(4);
		phone1.setEmi("73483hkg");

		Sim sim1 = new Sim();
		sim1.setId(2);
		sim1.setSimno(246443);
		sim1.setPhone(phone1);

		List<Sim> siml = new ArrayList<Sim>();
		siml.add(sim);
		siml.add(sim1);

		phone.setSim(siml);

		Simdao dao = new Simdao();
		dao.savePhone(phone);
	}

}
