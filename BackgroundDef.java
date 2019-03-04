// background class definition to store background data like design and
// functions to get tile using xy coordinates
public class BackgroundDef 
{
	private static int width;
	private static int height;
	private static int[] tiles;
	
    // constructor to set background width and height
    // initializes and allocates tiles array to tile width * height
	public BackgroundDef(int w, int h)
	{
		width= w;
		height= h;
		tiles = new int[w*h];
	}
	
    // top left is 0,0 tile
    // return tile number with x y coordinates
	public int getTile(int x, int y)
	{
		return tiles[y * width + x];
	}
	
    // stors array of background design with tiles into definition
	public void insertPattern(int x[])
	{
		tiles = x;
	}
	
}
