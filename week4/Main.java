interface Motivator {
void motivate(); 
void inspire();
}

class Coach implements Motivator {
public void motivate() {
System.out.println("You have the power to succeed!");
}
public void inspire() {
System.out.println("Every setback is a setup for a comeback.");
}
}
class Main {
public static void main(String[] args) {
Coach coach = new Coach();
coach.motivate();
coach.inspire();
}
}
