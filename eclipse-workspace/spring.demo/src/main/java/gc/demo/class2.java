package gc.demo;

public class class2 implements vehicle{
	private Disc disc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getMileage() {
		// TODO Auto-generated method stub
		return "bussss";
	}

	@Override
	public String getDisc() {
		// TODO Auto-generated method stub
		return this.disc.getDisc();
	}

}
