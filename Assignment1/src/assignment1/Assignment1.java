package assignment1;

public class Assignment1 {

    public static void main(String[] args) {
        
        int capacity1 = 2 ;
        int capacity2 = 8;
        
        int correctIndex = 2;
        int highIndex = 20 ;
        int negativeIndex = -1 ;
        
        char initialChar = 'e' ;
        char initialChar2= 'd' ;
        char finalChar = 'm' ;
        char finalChar2 = 'f' ;
        
        String[] string1 = {"apple", "bear", "coffee", "door"} ; // sorted no repeats
        String[] string2 = {"zebra","year", "xenon", "work"} ; // unsorted no repeats
        String[] string3 = { "elephant", "job" , "food", "pen", "food" } ; // unsorted w/ repeatds
        
        String word1 = "apple" ; // remove/find in string1 insert string2
        String word2 = "zebra" ; // find/remove in string2 insert string1
        String word3 = "food" ; // remove/insert string3
        String word4 = "insert" ; // insert in string3
        
        
        System.out.println("---------------CREATED DEMO---------------\n");
        
        System.out.println("----------Testing constructors----------");
        
        // Constructor initialized with a capacity, makes an empty WordList object
        WordList listObj1= new WordList(capacity1);
        System.out.println("\nTest 1 Constructor 1 with capacity: "+ capacity1+ "\n"+"List:\n"+ listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize()); 
        
        // Constructor initialized with a sorted array
        WordList listObj2= new WordList(string1);
        System.out.println("\nTest 2 Constructor 2 with sorted list:\n"+"List:\n"+ listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());  
        
        // Constructor initialized with a non sorted array
        WordList listObj3= new WordList(string2);
        System.out.println("\nTest 3 Constructor 2 with unsorted list:\n"+"List:\n"+ listObj3.toString());
        System.out.println("capacity="+listObj3.getCapacity());
        System.out.println("size="+listObj3.getSize());
        
        // Constructor initializes with a non sorted array with repeats
        WordList listObj4= new WordList(string3);
        System.out.println("\nTest 4 Constructor 2 with unsorted list and repetitions:\n"+"List:\n"+ listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());
        
        System.out.println("\n----------Testing insert method----------");
        
        // Insert a string at the 0th index
        System.out.println("\nTest 5 Insert "+word1+" at the beggining of the list:\nList before:\n"+listObj3.toString());
        System.out.println("capacity="+listObj3.getCapacity());
        System.out.println("size="+listObj3.getSize());
        listObj3.insert(word1) ;
        System.out.println("\nList after:\n"+listObj3.toString());
        System.out.println("capacity="+listObj3.getCapacity());
        System.out.println("size="+listObj3.getSize());
        
        // Insert a string at the end of the list
        System.out.println("\nTest 6 Insert "+word2+" at end of the list:\nList before:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        listObj2.insert(word2) ;
        System.out.println("\nList after:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
        // Insert a string in the middle of the list
        System.out.println("\nTest 7 Insert "+word4+" in the middle of the list: \nList before:\n"+listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());
        listObj4.insert(word4) ;
        System.out.println("\nList after:\n"+listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());
        
        // Insert a word in an empty list
        System.out.println("\nTest 8 Insert "+word1+"  into an empty list: \nList before:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        listObj1.insert(word1) ;
        System.out.println("\nList after:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        
        // Insert a word that is already in the list
        listObj2 = new WordList(string1) ;
        System.out.println("\nTest 9 Insert "+word1+", but it's already in list: \nList before:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        listObj2.insert(word1) ;
        System.out.println("\nList after:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
        // Insert a word into a list where capacity = listsize 
        listObj2 = new WordList(capacity1) ;
        listObj2.insert(word1) ;
        listObj2.insert(word2) ;
        System.out.println("\nTest 10 Insert new word, "+word3+" into full list: \nList before:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        listObj2.insert(word3) ;
        System.out.println("\nList after:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
        // Insert a word into a list where the capacity = listsize and the word is already in the list
        listObj2 = new WordList(capacity1) ;
        listObj2.insert(word1) ;
        listObj2.insert(word2) ;
        System.out.println("\nTest 11 Insert "+word1+" into a full list that it is in: \nList before:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        listObj2.insert(word1) ;
        System.out.println("\nList after:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
        System.out.println("\n----------Testing getWordAt method----------");
        
         // getWord() method with a correct index
        listObj2=new WordList(string1);
        try{
            System.out.println("\nTest 12 Get word at index: " + correctIndex+" which is a valid index");
            System.out.println(listObj2.getWordAt(correctIndex));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        
        // getWord() at a negative index
        listObj2=new WordList(string1);
        try{
            System.out.println("\nTest 13 Get word at index "+negativeIndex+" which is negative");
            System.out.println(listObj2.getWordAt(negativeIndex));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        
        // getWord() at an index > list size
        listObj2=new WordList(string1);
        try{
            System.out.println("\nTest 14 Get word at index "+highIndex+" which is too high");
            System.out.println(listObj2.getWordAt(highIndex));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        
        System.out.println("\n----------Testing find method----------");
        
        // Finding a word in a list that the word is in
        listObj2= new WordList(string3);
        System.out.println("\nTest 15 Find " + word3 + " in the list:");
        System.out.println(listObj2.toString());        
        int Index = listObj2.find(word3);
        System.out.println("returned index: "+ Index);
        
        // Finding a word that is not in the list
        System.out.println("\nTest 16 Find " + word2+ " which is not in the list:") ;
        System.out.println(listObj2.toString()); 
        Index = listObj2.find(word2);
        System.out.println("returned index: "+ Index);
        
        
        System.out.println("\n----------Testing remove method----------");

        // Remove a word from the beginning of the list
        listObj2= new WordList(string1);
        System.out.println("\nTest 17 Remove "+word1+" from beginning of list: \nList before:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize()); 
        listObj2.remove(word1);
        System.out.println("\nList after:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());  
        
        // Remove a word from the end of the list
        listObj3= new WordList(string2);
        System.out.println("\nTest 18 Remove "+word2+" from the end of list \nList before:\n" + listObj3.toString());
        System.out.println("capacity="+listObj3.getCapacity());
        System.out.println("size="+listObj3.getSize());
        listObj3.remove(word2);
        System.out.println("\nList after:\n" + listObj3.toString());
        System.out.println("capacity="+listObj3.getCapacity());
        System.out.println("size="+listObj3.getSize());
        
        // Remove a word from the middle of a list
        listObj4= new WordList(string3);
        System.out.println("\nTest 19 Remove "+word3+" from the middle of list\nList before:\n" + listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());
        listObj4.remove(word3) ;
        System.out.println("\nList after:\n" + listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());
        
        
        // Remove a word from an empty list
        listObj1 = new WordList(capacity2) ;
        System.out.println("\nTest 20 Remove "+word2+" from an empty list: \nList before:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        listObj1.remove(word2) ;
        System.out.println("\nList after:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        
        // Remove a word that is not in the list
        listObj2= new WordList(string1);
        System.out.println("\nTest 21 Remove "+word2+" which is not in the list: \nList before:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        listObj2.remove(word2);
        System.out.println("\nList after:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
      
        System.out.println("\n----------Testing subList method----------");
        
        // Creating a non-empty sublist from a non-empty list, initalChar2 and finalChar are not starting characters of the strings
        listObj1 = new WordList(string3) ;
        listObj2 = listObj1.sublist(initialChar2, finalChar) ;
        System.out.println("\nTest 22 Sublist from "+initialChar2+" to "+finalChar+", non-empty-sublist from non-empty list, word do not start with the characters\nInitial List:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        System.out.println("\nSublist:\n" + listObj2.toString()) ;
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
        
        // Creating an empty sublist from a non-empty list
        listObj1 = new WordList(string1) ;
        listObj2 = listObj1.sublist(initialChar, finalChar) ;
        System.out.println("\nTest 23 Sublist from "+initialChar+" to "+finalChar+", empty sublist from non-empty list\nInitial List:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        System.out.println("\nSublist:\n" + listObj2.toString()) ;
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
        
        // Creating an empty sublist from an empty list
        listObj1 = new WordList(capacity1) ;
        listObj2 = listObj1.sublist(initialChar, finalChar) ;
        System.out.println("\nTest 24 Sublist from "+initialChar+" to "+finalChar+", empty sublist from empty list\nInitial List:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        System.out.println("\nSublist:\n" + listObj2.toString()) ;
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
        
        // Creating a non-empty list from a non-empty sublist, initial character and final characters are included in the strings
        listObj1 = new WordList(string3) ;
        listObj2 = listObj1.sublist(initialChar, finalChar2) ;
        System.out.println("\ntest 25 Sublist from "+initialChar+" to "+finalChar2+", non-empty sublist from non-empty list, words start with the chracters\nInitial List:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        System.out.println("\nSublist:\n" + listObj2.toString()) ;
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        
        
        /*
        //PROVIDED DEMO
         
        System.out.println("---------------PROVIDED DEMO---------------");  
          
         
        int cap=6; //capacity
        int cap2=2; //capacity
        
        int i1=1; //valid position in words2
        int i2=4; //invalid position in words2 ( size<=i2<=capacity-1 )
        int i3=12; //invalid position in words2 ( i3<0 or i3>capacity-1 )
        
        //chosen according to the tests for sublist()
        char c1='i';
        char c2='k';
        char c3='h';
        char c4='m';
        char c5='b';
        char c6='h';  
        char c7='j'; 
        char c8='p'; 
        
        String[] words2={"add", "alpha", "boy", "car"}; //sorted, used to test insert & remove
	String[] words3={"now", "then", "after", "five", "zoom"}; //unsorted, without repetitions - to test constructor 2
        String[] words4={"made","know","seven","know"};//unsorted with repetitions - to test constructor 2
        String[] words5={"fall", "flag","fly","ha", "haha", "ma", "me", "mm","my",  "so"};//to test sublist & find

	String s2="buy";//word not in words2 - test insert inside list
        String s4="boy";//word in words2
        String s7="car";//last word of words2
	String s6="mm";//word in words5 - test find()
	String s1=s7+"ab";
        String s5=s1+"a";
	String s8="aaabbb"; //smaller than first word in words 2
        
        // inputs end 
	//**************************************************************************************

 
        //test constructor 1
        listObj1= new WordList(cap);
        System.out.println("Test 1 - Constructor 1:\n"+"List:\n"+ listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());        
        
        
        System.out.println("*************************************************************");
        //test constructor 2 with sorted input without repetitions
       
        listObj2= new WordList(words2);
        //test if words are stored correctly
        System.out.println("Test 2 - Constructor 2 (sorted input):\n"+"List:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());

	
	System.out.println("*************************************************************");
        //test constructor 2 - unsorted input without duplicates
        
        listObj4= new WordList(words3);
        //display listObj4
        System.out.println("Test 3 - Constructor 2 (unsorted input without repetitions):\n"+"List:\n"+listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());

 
	System.out.println("*************************************************************");
        //test constructor 2 - unsorted input & with duplicates
        
        listObj4= new WordList(words4);
        //display listObj4
        System.out.println("Test 4 - Constructor 2 (unsorted input with repetitions):\n"+"List:\n"+listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());
              
        
        System.out.println("*************************************************************");
        // test insert one word to listObj2 at the end
        listObj2.insert(s1);
        System.out.println("Test 5 - insert at end of list, newword: "+s1+"\nList:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
                
             
        System.out.println("*************************************************************");
        //test insert inside list 
        listObj2=new WordList(words2);
        listObj2.insert(s2);
        System.out.println("Test 6 - insert inside list, newword: "+s2+"\nList:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());


	System.out.println("*************************************************************");
        //test insert at front 
        listObj2=new WordList(words2);
        listObj2.insert(s8);
        System.out.println("Test 7 - insert at front, newword: "+s8+"\nList:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        

         System.out.println("*************************************************************");
        //attempt to insert when word is in list
        listObj2=new WordList(words2);
        listObj2.insert(s4);
        System.out.println("Test 8 - attempt to insert when word is in list, newword: "+s4+"\nList:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        

         System.out.println("*************************************************************");
        //test insert in empty list
        listObj1= new WordList(cap);
        listObj1.insert(s1);
        System.out.println("Test 9 - insert "+s1+ " in empty list:\n"+"List:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        
        
        System.out.println("*************************************************************");
        //test insert when size==capacity and neword not in list 
        listObj2= new WordList(cap2);
        for(int i=0;i<cap2;i++){
            listObj2.insert(s1);
            s1=s1+"a";
        }
        System.out.println("Test 10 - insert - size==capacity, new word not in list, newword: "+s2);
        listObj2.insert(s2);
        System.out.println("List:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());             
        
        
         System.out.println("*************************************************************");
        //test getWordAt valid position
        listObj2=new WordList(words2);
        try{
            System.out.println("Test 11 - getWordAt(i) - valid index i");
            System.out.println(listObj2.getWordAt(i1));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}

        
        System.out.println("*************************************************************");
        //test getWordAt invalid list position
        try{
            System.out.println("Test 12 - getWordAt(i) - invalid index i");
            System.out.println(listObj2.getWordAt(i2));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}


	System.out.println("*************************************************************");
        //test getWordAt invalid list position
        try{
            System.out.println("Test 13 - getWordAt(i) - invalid index i");
            System.out.println(listObj2.getWordAt(i3));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        
        
        System.out.println("*************************************************************");
        //test binary search:
        listObj2= new WordList(words5);
        System.out.println("Test 14 - find - key not in list, key is " + s2);
        int searchIndex=listObj2.find(s2);
        System.out.println("returned index: "+ searchIndex);


        System.out.println("*************************************************************");
        System.out.println("Test 15 - find - key  in list, key is " + s6);
        searchIndex=listObj2.find(s6);
        System.out.println("returned index: "+ searchIndex);
        

         System.out.println("*************************************************************");
        //test remove
        System.out.println("Test 16 - remove - word not in list, word is "+s2);
        listObj2=new WordList(words2);
        listObj2.remove(s2);
        System.out.println("List: \n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());


         System.out.println("*************************************************************");
        //test remove from inside or beginning
        listObj2= new WordList(words2);
        System.out.println("Test 17 - remove from inside or beginning, word is "+s4);
        listObj2.remove(s4);
        System.out.println("List: \n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());


        System.out.println("*************************************************************");
        //test remove from empty list
        System.out.println("Test 18 - remove from empty list");
        WordList listObj5= new WordList(cap);
        listObj5.remove(s7);
        System.out.println("List: \n"+listObj5.toString());
        System.out.println("capacity="+listObj5.getCapacity());
        System.out.println("size="+listObj5.getSize());

        
        System.out.println("*************************************************************");
        //test sublist  - from empty list - its capacity could be any positive value
        System.out.println("Test 19 - sublist from empty list ");
        WordList listObj6= new WordList(cap);
        WordList listObj7=listObj6.sublist(c3,c4);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
        
        
        System.out.println("*************************************************************");
        //test sublist  - empty sublist from non empty list - its capacity could be any positive value
        System.out.println("Test 20 - empty sublist from non empty list ");
        listObj6= new WordList(words5);
        listObj7=listObj6.sublist(c1,c2);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
               
        
        System.out.println("*************************************************************");
        //test sublist - non-empty sublist; words starting with init and fin are in list (more than one for each)
        System.out.println("Test 21 - non-empty sublist ");
        listObj6= new WordList(words5);
        listObj7=listObj6.sublist(c3,c4);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
        //System.out.println("Initial list: \n"+listObj6.toString());


	System.out.println("*************************************************************");
        //test sublist - non-empty sublist words starting with init and fin are not in list
        System.out.println("Test 22 - non-empty sublist ");
        listObj6= new WordList(words5);
        listObj7=listObj6.sublist(c7,c8);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
               
        
        
        System.out.println("*************************************************************");
        //test sublist  - sublist is a prefix or suffix
        System.out.println("Test 23 - sublist is a prefix or a suffix");
        listObj6= new WordList(words5);
        listObj7=listObj6.sublist(c5,c6);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
        
        */
        System.out.println("\n\n----------SECOND DEMO----------\n");
        
        // Test code for Lab 1
        // Prepared by Steven Lyon

        // inputs start

        int cap = 7; //capacity list 1
        int cap2 = 3; //capacity
        
        int i1=2; //valid position in words2
        int i2=5; //invalid position in words2 ( size<=i2<=capacity-1 )
        int i3=-1; //invalid position in words2 ( i3<0 or i3>capacity-1 )
        
        //chosen according to the tests for sublist()
        char c1='c';//c1-c2 empty sublist of words5
        char c2='e';

        char c3='f';//non-empty sublist of words5, multiple words of each char
        char c4='w';

        char c5='e';//non-empty sublist of words5, no words of either char
        char c6='g';

        char c7='t';//non-empty sublist of words5, mid-end of list
        char c8='z'; 
        
        String[] words2={"first", "second", "third"}; //sorted, used to test insert & remove
	String[] words3={"cheetah", "leopard", "cougar", "jaguar", "lion", "tiger"}; //unsorted, without repetitions - to test constructor 2
        String[] words4={"just","three","just","words","three"};//unsorted with repetitions - to test constructor 2
        String[] words5={"better","the","witty","fool","than","foolish","wit"};//to test sublist & find
        //Sorted: better, fool, foolish, than, the, wit, witty

        String s1="zeroth";//word not in words2 - test insert at end of list
        String s2="hello";//word not in words2 - test insert inside list
        String s3="and";//word not in words2 - test insert at beginning of list
        String s4="first";//word in words2 - test insert existing word
        String s5="someword";//any word - test insert in empty list

        String s6="bat";//any word - test insert when size==capacity

        String s7="car";//word not in words 5 - test find target not in list
	String s8="better"; //word in words 5 - test find with target in list
        
        // inputs end 
	//**************************************************************************************

 
        
        
        
        
        //test constructor 1
        WordList listObj1= new WordList(cap);
        System.out.println("Test 1 [1pt] - Constructor 1:\n"+"List:\n"+ listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        
        
        System.out.println("*************************************************************");
        //test constructor 2 with sorted input without repetitions
       
        WordList listObj2= new WordList(words2);
        //test if words are stored correctly
        System.out.println("Test 2 - Constructor 2 (sorted input):\n"+"List:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());

	
	System.out.println("*************************************************************");
        //test constructor 2 - unsorted input without duplicates
        
        WordList listObj4= new WordList(words3);
        //display listObj4
        System.out.println("Test 3 - Constructor 2 (unsorted input without repetitions):\n"+"List:\n"+listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());

 
	System.out.println("*************************************************************");
        //test constructor 2 - unsorted input & with duplicates
        
        listObj4= new WordList(words4);
        //display listObj4
        System.out.println("Test 4 - Constructor 2 (unsorted input with repetitions):\n"+"List:\n"+listObj4.toString());
        System.out.println("capacity="+listObj4.getCapacity());
        System.out.println("size="+listObj4.getSize());
              
        
        System.out.println("*************************************************************");
        // test insert one word to listObj2 at the end
        listObj2.insert(s1);
        System.out.println("Test 5 - insert at end of list, newword: "+s1+"\nList:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
                
             
        System.out.println("*************************************************************");
        //test insert inside list 
        listObj2=new WordList(words2);//reset list to words2
        listObj2.insert(s2);
        System.out.println("Test 6 - insert inside list, newword: "+s2+"\nList:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());


	System.out.println("*************************************************************");
        //test insert at front 
        listObj2=new WordList(words2);//reset list to words2
        listObj2.insert(s3);
        System.out.println("Test 7 - insert at front, newword: "+s3+"\nList:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        

         System.out.println("*************************************************************");
        //attempt to insert when word is in list
        listObj2=new WordList(words2);
        listObj2.insert(s4);
        System.out.println("Test 8 - attempt to insert when word is in list, newword: "+s4+"\nList:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());
        

         System.out.println("*************************************************************");
        //test insert in empty list
        listObj1= new WordList(cap); // new empty list
        listObj1.insert(s5);
        System.out.println("Test 9 - insert "+s5+ " in empty list:\n"+"List:\n"+listObj1.toString());
        System.out.println("capacity="+listObj1.getCapacity());
        System.out.println("size="+listObj1.getSize());
        
        
        System.out.println("*************************************************************");
        //test insert when size==capacity and neword not in list 
        listObj2= new WordList(cap2); //empty list cap 3
        listObj2.insert("aaaaa");
        listObj2.insert("bbbbb");
        listObj2.insert("ccccc");
        System.out.println("Test 10 - insert - size==capacity, new word not in list, newword: "+s6);
        listObj2.insert(s6);
        System.out.println("List:\n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());             
        
        
         System.out.println("*************************************************************");
        //test getWordAt valid position
        listObj2=new WordList(words2);
        try{
            System.out.println("Test 11 - getWordAt(i) - valid index i");
            System.out.println(listObj2.getWordAt(i1));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}

        
        System.out.println("*************************************************************");
        //test getWordAt invalid list position
        try{
            System.out.println("Test 12 - getWordAt(i) - invalid index i");
            System.out.println(listObj2.getWordAt(i2));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}


	System.out.println("*************************************************************");
        //test getWordAt invalid list position
        try{
            System.out.println("Test 13 - getWordAt(i) - invalid index i");
            System.out.println(listObj2.getWordAt(i3));
        }
        catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
        
        
        System.out.println("*************************************************************");
        //test binary search:
        listObj2= new WordList(words5);
        System.out.println("Test 14 - find - key not in list, key is " + s7);
        int searchIndex=listObj2.find(s7);
        System.out.println("returned index: "+ searchIndex);


        System.out.println("*************************************************************");
        System.out.println("Test 15 - find - key in list, key is " + s8);
        searchIndex=listObj2.find(s8);
        System.out.println("returned index: "+ searchIndex);
        

         System.out.println("*************************************************************");
        //test remove
        System.out.println("Test 16 - remove - word not in list, word is "+s1);
        listObj2=new WordList(words2);
        listObj2.remove(s1);
        System.out.println("List: \n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());


         System.out.println("*************************************************************");
        //test remove from inside or beginning
        listObj2= new WordList(words2);
        System.out.println("Test 17 - remove from inside or beginning, word is "+s4);
        listObj2.remove(s4);
        System.out.println("List: \n"+listObj2.toString());
        System.out.println("capacity="+listObj2.getCapacity());
        System.out.println("size="+listObj2.getSize());


        System.out.println("*************************************************************");
        //test remove from empty list
        System.out.println("Test 18 - remove from empty list");
        WordList listObj5= new WordList(cap);
        listObj5.remove(s7);
        System.out.println("List: \n"+listObj5.toString());
        System.out.println("capacity="+listObj5.getCapacity());
        System.out.println("size="+listObj5.getSize());

        
        System.out.println("*************************************************************");
        //test sublist  - from empty list - its capacity could be any positive value
        System.out.println("Test 19 - sublist from empty list ");
        WordList listObj6= new WordList(cap);
        WordList listObj7=listObj6.sublist(c3,c4);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
        
        
        System.out.println("*************************************************************");
        //test sublist  - empty sublist from non empty list - its capacity could be any positive value
        System.out.println("Test 20 - empty sublist from non empty list ");
        listObj6= new WordList(words5);
        listObj7=listObj6.sublist(c1,c2);
        System.out.println("\nsublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
              
        
        System.out.println("*************************************************************");
        //test sublist - non-empty sublist; words starting with init and fin are in list (more than one for each)
        System.out.println("Test 21 - non-empty sublist init fin in list");
        listObj6= new WordList(words5);
        listObj7=listObj6.sublist(c3,c4);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
        //System.out.println("Initial list: \n"+listObj6.toString());


	System.out.println("*************************************************************");
        //test sublist - non-empty sublist words starting with init and fin are not in list
        System.out.println("Test 22 - non-empty sublist ");
        listObj6= new WordList(words5);
        listObj7=listObj6.sublist(c5,c6);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
               
        
        
        System.out.println("*************************************************************");
        //test sublist  - sublist is a prefix or suffix
        System.out.println("Test 23 - sublist is a prefix or a suffix");
        listObj6= new WordList(words5);
        listObj7=listObj6.sublist(c7,c8);
        System.out.println("sublist: \n"+listObj7.toString());
        System.out.println("capacity="+listObj7.getCapacity());
        System.out.println("size="+listObj7.getSize());
        
    }//end main
}//end class
