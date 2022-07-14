package Basic_Java;

abstract class Abstraction {

   public abstract void cal_Human_Age();
   public void feature () {
	   System.out.println("Age of this person can be calculated");
   }
}
class Human extends Abstraction{
	@Override
	public void cal_Human_Age() {
		// TODO Auto-generated method stub
		System.out.println("Age of this person cannot be calculated");
	}

}
class HumanAgeCalculator{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.cal_Human_Age();
        obj.feature();

    }
}
