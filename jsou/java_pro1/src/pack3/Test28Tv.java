package pack3;

public class Test28Tv implements Test28Volume{
	private int level;
	
	public Test28Tv() {
		level =0;
	}
	
	@Override
	public void volumeUp(int level) {
		this.level += level;
		System.out.println("Tv 볼륨 올리면 " + level);
		
	}
	
	@Override
	public void volumeDown(int level) {
		this.level -= level;
		System.out.println("Tv 볼륨 내리면 " + level);
		
	}
	
	
}
