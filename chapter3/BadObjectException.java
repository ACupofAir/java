package chapter3;
                          
public class BadObjectException extends Exception{
  Object badObject;                       

                                                  
  public BadObjectException(Object object, String msg) {
    super(msg);                                   
    this.badObject = object;                      
  }                                               
                                                  
  
  /** 
   * @return Object
   */
  public Object getBadObject() {                  
    return this.badObject;                        
  }                                               
}                                                       