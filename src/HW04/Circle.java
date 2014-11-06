
public class Circle {
	//��������
	private Point center;	//�����A�������A��Point�����������������y��
	private double radius;	//�b�|

	//���c�l
	//�������J������(�@��Point�I)�P�b�|������
	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	
	//���k
	//���o����
	public Point getCenter() {
		return center;
	}
	//�]�w����
	public void setCenter(Point center) {
		this.center = center;
	}
	//���o�b�|
	public double getRadius() {
		return radius;
	}
	//�]�w�b�|
	public void setRadius(double radius) {
		this.radius = radius;
	}

	//�����O�_�P��c�I��(����)
	//�������n�P�_�O�_�����A�i�H���������������Z���P�������b�|���M���P�_
	//���I���h�^��true, �_�h�^��false
	public boolean isCollision(Circle c){
		//���p�����������������Z��
		//�Q��Point���O��distance���k���p�����������������Z��
		double dist = center.distance(c.center);
		//���������b�|�M �� ���������Z�����P�_�O�_����
		if(dist > radius+c.radius ){
			return false;
		}
		else{
			return true;
		}
	}
}
