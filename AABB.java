
public class AABB 
{
    // constructor to store xy coorindates, width, and height of boxes
	public AABB(int xt, int yt, int wt, int ht)
	{
        this.x = xt;
        this.y = yt;
        this.w = wt;
        this.h = ht;
	}
	
	int x, y, w, h;
	
//    public void setX (int holder)
//    {
//        this.x = holder;
//    }
	
	public int getX ()
	{
		return x;
	}
//    public void setY (int holder)
//    {
//        this.y = holder;
//    }
	
	public int getY ()
	{
		return y;
	}
//    public void setW (int holder)
//    {
//        this.w = holder;
//    }
	
	public int getW ()
	{
		return w;
	}
//    public void setH (int holder)
//    {
//        this.h = holder;
//    }
	
	public int getH ()
	{
		return h;
	}

    // check each corner of both AABB boxes to check intersection
	public static boolean AABBIntersect(AABB box1, AABB box2)
	{
    // box1 is to the right
	 if (box1.x > box2.x + box2.w) 
	 	{
		 	return false;
	 	}
	 // box1 to the left
	 if (box1.x + box1.w < box2.x) 
	 	{
		 	return false;
	 	}
	 // box1 below
	 if (box1.y > box2.y + box2.h) 
	 	{
		 	return false;
	 	}
	 // box1 above
	 if (box1.y + box1.h < box2.y) 
	 {
		 	return false;
	 }
	 return true;
	}
	
	
}
