package methods_HW;

public class Q_02_Cube
{
	int height, width, depth;

	public Q_02_Cube(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	void volume()
	{
		int volume = height * width * depth;
		
		System.out.println("Volume of cube => "+volume);
	}
}
