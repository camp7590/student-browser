public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array///////////////
    	private int test[] = new int[3];


 //constructor methods - 3 ways you can make a student

      

	//Additonal Constructor
	public Student(String nm, int t[]) {
		name = nm;
		test = t;
	}

	//Another constructor
	public Student(Student s) {
		this(s.name, s.test);
	}

    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int whichmark, int number){
        test[whichmark - 1] = number;//s.setscore(1,89); test[0]=89;
    }

    public int getAverage() {
    int avg = 0;
        for (int i = 0; i < 3; i++) {
            avg +=test[i];
            
        }
        return avg/3;
    }


    public int getMark(int whichmark) {
	return test[whichmark-1];
    }

    public int getHighscore() {
        int high=0;
        for (int i = 0; i < 3; i++) {
            if(high < test[i] ) high = test[i];
        }
    	return high;
    }

    public String toString() {
        String result = "Name: " + name;
        for (int i = 0; i < 3; i++) {
            result += "\nMark 1: \t"+test[i];
        }
        
    	
    	result += "\nMark 1:\t" + test[0];
    	result += "\nMark 2:\t" + test[1];
    	result += "\nMark 3:\t" + test[2];
    	result += "\n~~~~~~~~~~~~~~~~~~";
    	result += "\nAverage:\t" + getAverage();
    	return result;
    }

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String message = null;
    	//check if name is entered
    	if (name.equals("")) 
    		message += "\nName is required\nPlease re-enter all data";
    	
	if (test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2]< 0 || test[2] > 100) 
    		message += "\nAt least one mark is out of range, please re-enter all data";
	
	return message;
    	}

 }

