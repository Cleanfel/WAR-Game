public abstract class Collectible extends Character {
    public int X;
    public int Y;
    private String mapValue;
    
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
