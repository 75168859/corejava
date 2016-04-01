package day01.single;

public enum MyWeekDay {
	MON(){

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},TUE{

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},WED(3){

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	private MyWeekDay(){}
	private MyWeekDay(int n){}
	public abstract MyWeekDay nextDay();
}
enum X{
	x1{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	}
}
