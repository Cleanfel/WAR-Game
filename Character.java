public abstract class Character {
    private int X;
    private int Y;
    private String mapValue;
    
    private int HP;
    private int ammo;
    private int ATK;
    
    public abstract void attack(Character aChar);
    
    public abstract String getMapValue();
    
    public String toString()
    {
        return mapValue;
    }
    
    public int getDistance(Character aChar)
    {
        int out = 100;
        
        if (this.getX() == aChar.getX())
        {
            // calculates the distance via Y-cords.
            out = Math.abs(aChar.getY() - this.getY());
        } else if (aChar.getY() == this.getY())
        {
            // calculates the distance via X-cords.
            out = Math.abs(aChar.getX() - this.getX());
        } else {
            // calculates the distance via pythagorean theorem.
            int riseA = Math.abs(aChar.getY() - this.getY());
            int runB = Math.abs(aChar.getX() - this.getX());
            int diagC = (int) Math.sqrt((Math.pow(riseA, 2) + Math.pow(runB, 2)));
            out = diagC;
        }
        return out;
    }
    
    public int getX()
    {
        return X;
    }
    
    public int getY()
    {
        return Y;
    }
    
    public int getHP()
    {
        return HP;
    }
    
    public int getAmmo()
    {
        return ammo;
    }
    
    public void setHP(int hp)
    {
        this.HP = hp;
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
