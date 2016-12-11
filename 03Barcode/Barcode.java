public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
   private String barcood;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      _zip = zip+"";
      try{
	  int fakeit = Integer.parseInt(zip);
      }
      catch(Exception e){
	  throw new IllegalArgumentException("Bad Value!");
      }	  
      if (!(zip.length()==5)){
	  throw new IllegalArgumentException("Bad Length!");
      }
      int getsum = 0;
      //for (int i = 0;i<zip.length()-1;i++){
      //  getsum+=Character.getNumericValue(_zip.charAt(i));
      //}
      _checkDigit = (this.checkSum())%10;
      
  }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){
      Barcode theClone = new Barcode(_zip+"");
      return theClone;
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int ret = 0;
      for (int i = 0;i<5;i++){
	  ret+=Character.getNumericValue(_zip.charAt(i));
      }
      return ret;
  }

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      if (!(barcood == null)){
	      return _zip+_checkDigit+" "+barcood;
	  }
      String ret = "";
      ret+=_zip+_checkDigit+" ";
      for (int i = 0;i<_zip.length()-1;i++){
	  switch (Character.getNumericValue(_zip.charAt(i))){
	  case 1: ret+=":::||";
	      break;
	  case 2: ret+="::|:|";
	      break;
	  case 3: ret+="::||:";
	      break;
	  case 4: ret+=":|::|";
	      break;
	  case 5: ret+=":|:|:";
	      break;
	  case 6: ret+=":||::";
	      break;
	  case 7: ret+="|:::|";
	      break;
	  case 8: ret+="|::|:";
	      break;
	  case 9: ret+="|:|::";
	      break;
	  default: ret+="||:::";
	      break;
	  }}
      if (barcood == null){
	  barcood = ret+"";
	      }
      return ret;
  }
// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
      /*String fir = _zip + _checkDigit;
      int first = Integer.parseInt(fir);
      int second = Integer.parseInt(other._zip + other._checkDigit);
      if (first>second){
	  return 1;
      }else{
	  if (second>first){
	      return -1;}
      }
      return 0;
      Ignore this stuff*/
      return this._zip.compareTo(other._zip);
  }
    
}
