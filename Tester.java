public class Tester{
    public static void main(String[] args) {

        int TestCases = 0;
        int TestCasesPassed = 0;
        
        //test initialization
        TestCases++;
        LPHashTable HT1 = new LPHashTable(20);
        TestCasesPassed++;
        System.out.println("Passed " + TestCases);

        //test search with empty table
        TestCases++;
        if(HT1.search(8) == null){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test insert into table
        TestCases++;
        HT1.insert(12);
        if(HT1.search(12) == 12){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test insert into table at start
        TestCases++;
        HT1.insert(0);
        if(HT1.search(0) == 0){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test insert into table at end
        TestCases++;
        HT1.insert(20);
        if(HT1.search(20) == 20){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test insert overflow
        TestCases++;
        try{  
            HT1.insert(21);
        }catch(Exception RuntimeException){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test insert negative
        TestCases++;
        HT1.insert(-1);
        if(HT1.search(1) == -1){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test delete with empty table
        TestCases++;
        HT1.delete(8);
        if(HT1.search(8) == null){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test delete into table
        TestCases++;
        HT1.delete(12);
        if(HT1.search(12) == null){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test delete into table at start
        TestCases++;
        HT1.delete(0);
        if(HT1.search(0) == null){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test delete into table at end
        TestCases++;
        HT1.delete(20);
        if(HT1.search(20) == null){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test delete overflow
        TestCases++;
        try{  
            HT1.delete(21);
        }catch(Exception RuntimeException){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

        //test delete underflow
        TestCases++;
        try{  
            HT1.delete(-1);
        }catch(Exception RuntimeException){
            TestCasesPassed++;
            System.out.println("Passed " + TestCases);
        }

         //test insert collision (3 parts)
         TestCases++;
         TestCases++;
         HT1.insert(1);
         if(HT1.search(1) == -1){
             TestCasesPassed++;
             System.out.println("Passed " + 14);
        }
        HT1.delete(1);
        if(HT1.search(1) == 1){
            System.out.println("Passed " + TestCases);
            TestCasesPassed++;
        }


        System.out.println("Passed: " + TestCasesPassed + "/" + TestCases + " test cases");

    }
}