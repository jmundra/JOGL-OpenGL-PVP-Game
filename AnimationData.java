import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GL2ES3;

public class AnimationData 
{
    FrameDef[] frames;
	int curFrame;
	float secsUntilNextFrame;
	
	public void SetSize(int y)
	{
		this.frames = new FrameDef[y];
	}
	
    // animation update function
	public boolean update(float deltaTime)
	{
        
		boolean looped = false;
        // update seconds until next frame
		secsUntilNextFrame -= (deltaTime/1000);
        // if frame has passed increment current frame in frameDef []
		while (secsUntilNextFrame <= 0)
		{
			curFrame++;
            // if max hit reset back to frame 0
			if (curFrame >= frames.length)
			{
				curFrame = 0;
				loopyyed = true;
			}
			// update time until next frame
			secsUntilNextFrame += frames[curFrame].frameTimeSecs;
		}
		return looped;
	}
	
	public void draw(int x, int y)
	{
		
	}
	
	public static void glDrawSprite(GL2 gl, int tex, int x, int y, int w, int h) {
        gl.glBindTexture(GL.GL_TEXTURE_2D, tex);
        gl.glBegin(GL2ES3.GL_QUADS);
        {
            gl.glColor3ub((byte)-1, (byte)-1, (byte)-1);
            gl.glTexCoord2f(0, 1);
            gl.glVertex2i(x, y);
            gl.glTexCoord2f(1, 1);
            gl.glVertex2i(x + w, y);
            gl.glTexCoord2f(1, 0);
            gl.glVertex2i(x + w, y + h);
            gl.glTexCoord2f(0, 0);
            gl.glVertex2i(x, y + h);
        }
        gl.glEnd();
    }
}
