
public class Point {
	//��������
	private double x;
	private double y;

	//���c�l	
	//�������J���y�������I
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//�L���J�����A�w�]�����������I(0,0)���I
	public Point(){
		this(0,0);
	}
	//���J�@���Ip�A�����X���Ip���P�y�����I
	public Point(Point p){
		this(p.x, p.y);
	}

	//���k
	//���o���I��x�y��
	public double getX() {
		return x;
	}
	//���o���I��y�y��
	public double getY() {
		return y;
	}
	//�]�w���I��x�y��
	public void setX(double x) {
		this.x = x;
	}
	//�]�w���I��y�y��
	public void setY(double y) {
		this.y = y;
	}

	//�]�w���m�A�N�I���y���]�w�����J���y��
	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
	}

	//�]�w���m�A�N�I���y���]�w�����J���Ip�@�����y��
	public void setLocation(Point p){
		setLocation(p.x, p.y);
	}

	//�p���P�y��(x2,y2)�������Z��
	public double distance(double x2, double y2){
		double dx = x-x2;
		double dy = y-y2;
		return Math.sqrt(dx*dx + dy*dy);
	}

	//�p���P�Ip�������Z��
	public double distance(Point p){
		return distance(p.x, p.y);
	}

	//�P�_�O�_�P�Ip�@��
	//�o���@�����w�q���������y�����P
	//���P�h�^��true, �_�h�^��false
	public boolean equals(Point p){
		return ( (x==p.x) && (y==p.y) );
	}

	//���I����dx�Z���Pdy�Z��
	public void translate(double dx, double dy){
		x += dx;
		y += dy;
	}
}
