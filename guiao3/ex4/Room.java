
public class Room {
	private String roomType;
	private Point bottomLeft;
	private Point topRight;
	
	public Room (Point bottomLeft,Point topRight, String roomType){
		this.roomType = roomType;
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	public String roomType(){
		return this.roomType;
	}
	public Point bottomLeft(){
		return this.bottomLeft;
	}
	public Point topRight(){
		return this.topRight;
	}
	public Point geomCenter(){
		return this.topRight.halfWayTo(bottomLeft);
	}
	public double area(){
		double dx = this.topRight.x()-this.bottomLeft.x();
		double dy = this.topRight.y()-this.topRight.y();
		return dx*dy;
	}
		
}

