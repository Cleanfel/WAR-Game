public abstract class Hero extends Character {
    private int X;
    private int Y;
    private String mapValue;
    private String name;
    
    private int HP = 4;
    private int ammo = 5;
    private int ATK = 1;
    
    public String toString()
    {
        return mapValue;
    }
    
    public void attack(Character opponent)
    {
        int oppDist = this.getDistance(opponent);
        int ATKModifier;
        if(oppDist >= 5) {
        	ATK = ATK;
        } else if((oppDist < 5) && (oppDist > 2)){
        	ATK = ATK;
        } else if(oppDist <= 2) {
        	ATK = ATK;
        }
    	opponent.setHP(opponent.getHP() - ATK);
        this.ammo--;
    }
    
    public void move(int xDist, int yDist) {
        X = getX() + xDist;
        Y = getY() + yDist;
    }
    
    public String getMapValue() 
    {
        return mapValue;
    }
    
    public String getName()
    {
        return name;
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
