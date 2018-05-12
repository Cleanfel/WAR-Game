import java.util.Random;

public class Grid {
    // size is for the map size
    private int size = 8;
    // creates a map/grid/game Board of Character objects
    private Character[][] charBoard;
    
    // Constructor method
    public Grid()
    {
        this.charBoard = new Character[size][size];
    }
    
    // Adds a character at a random cordinate
    public void addChar(Character aChar)
    {   
        Random ran = new Random();
        int rand1 = ran.nextInt(size);
        int rand2 = ran.nextInt(size);
        
        // These loops check to make sure two characters
        // aren't on the same location.
        if (charBoard[rand1][rand2] == null)
        {
            charBoard[rand1][rand2] = aChar;
            aChar.setX(rand2);
            aChar.setY(rand1);
        } else {
            boolean notAdded = true;
            while(notAdded)
            {
                int rand3 = ran.nextInt(size);
                int rand4 = ran.nextInt(size);
                if (charBoard[rand3][rand4] == null)
                {
                    charBoard[rand3][rand4] = aChar;
                    aChar.setX(rand4);
                    aChar.setY(rand3);
                    notAdded = false;
                }
            }
        }
    }
    
    // sets all Character's X and Y values to their
    // actual values.
    public void updateCords()
    {
        for(int i=0; i>size; i++)
        {
            for(int j=0; j<size; j++)
            {
                if (charBoard[i][j] != null)
                {
                    charBoard[i][j].setX(j);
                    charBoard[i][j].setY(i);
                }
            }
        }
    }

    public int getSize()
    {
        return size;
    }
    
    public String toString()
    {
        String out = "";
        
        for(Character[] row : charBoard)
        {
            out += "{ ";
            for(Character element : row)
            {
                if (element == null)
                {
                    out += ". "; 
                } else {
                    out += element.toString() + " ";
                }
            }
            out += "}" + "\n";
        }
        
        return out;
    }
}
