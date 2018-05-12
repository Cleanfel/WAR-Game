public class AmmoBox extends Collectible {
    public int X;
    public int Y;
    private String mapValue = "\u25A6";
    private int ammo = 2;
    
    public String toString()
    {
        return mapValue;
    }
    
    public void attack(Character aChar){}
    
    public String getMapValue()
    {
        return mapValue;
    }
    
    public int getDistance(Character aChar)
    {
        return super.getDistance(aChar);
    }
    
    public int getX()
    {
        return X;
    }
    
    public int getY()
    {
        return Y;
    }
    
    public void setX(int x)
    {
        this.X = x;
    }
    
    public void setY(int y)
    {
        this.Y = y;
    }
}
