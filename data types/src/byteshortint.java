
public class byteshortint {
	
		public static void main(String []args) {
			/*data type 
			1.Primitive data type
			rules-->
			1.must not begin with digit
			2.should not be a keyword
			3.white space not allowed
			 syntax --> datatype variablename = value;
			data types-->
			1.byte 2.short 3.integer*/
			
			//1.  1byte= 8bit range=-128 to 127
			
			byte b1 = 58;
			byte b2 = 127; //max value
			// byte b3 = 128; more than max value not accepted
			
			System.out.println("byte data type -->"+b1);
			System.out.println("byte data type max limit -->"+b2);
			
			byte b4 = -85;
			byte b5 = -128; //min value
			// byte b6 = -130; less than min value not accepted
			System.out.println("byte data type-->"+b4);
			System.out.println("byte data type min limit-->"+b5);
			System.out.println("********************************");
			
			
			/* 2.short = 2 bytes= 16 bit 
			 * range= -32768 to 32767
			 * syntax--> datatype variablename = value;
			 */
			short s1 = 5582;
			short s2 = 32767; //max value
			//short s3 = 32768; more than max value not accpted
			System.out.println("short data type-->"+s1);
			System.out.println("short data type max limit-->"+s2);
			
			short s4 = -5586;
			short s5 = -32768; //min value
			//short s6 = -32769; less than min value not accepted
			
			System.out.println("short data type -->"+s4);
			System.out.println("short data type min limit-->"+s5);
			System.out.println("**********************");
			
			/* 3. integer = 4 byte = 64bit range = -2147483648 to 2147483647
			 * syntax Datatype variablename = value;
			 */
			int i1 = 555555;
			int i2 = 2147483647; //max value
			 //int i3 = 2147483648 more than max value not accepted
			 System.out.println("integer data type-->"+i1);
			 System.out.println("integer data type max limit-->"+i2);
			 
			 int i4 = -55555;
			 int i5 = -2147483648;
			 //int i6 = -2147483649; less than min value
			  
			 System.out.println("integer data type-->"+i4);
			 System.out.println("integer data type min limit-->"+i5);
			 
			
			
			 
		}
	}


