package pizzaEating;

public class MainPizza {

	public static void main(String[] args) {
		
		PizzaMethods pizza = new PizzaMethods(5);
		
		PizzaGuy guy = new PizzaGuy("PizzaGuy", pizza);
		ScrumMaster scrumM = new ScrumMaster("ScrumMaster", pizza);
		
		TeamMember member1 = new TeamMember("Member1", pizza);
		TeamMember member2 = new TeamMember("Member2", pizza);
		TeamMember member3 = new TeamMember("Member3", pizza);
				
		guy.start();
		scrumM.start();
		
		member1.start();
		member2.start();
		member3.start();

		
	}

}
