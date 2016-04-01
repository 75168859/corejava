package day01.single;

public abstract class WeekDay {
	private WeekDay(){}
	public static final WeekDay MON = new WeekDay(){

		@Override
		public WeekDay nextDay() {
			// TODO Auto-generated method stub
			return TUE;
		}
		
	};
	public static final WeekDay TUE = new WeekDay(){

		@Override
		public WeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	public static final WeekDay WED = new WeekDay(){

		@Override
		public WeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	//...
	public abstract WeekDay nextDay();
}
