/**
 * 
 */

 var actualNumber='';
 var secondNumber='';
 var operator='';

 
 function showDisplay(numbers)
 {	  
 
 	document.getElementById("disp").value+=numbers;

	if((actualNumber!='' || actualNumber===0) && operator!='')
	{
		secondNumber+=numbers;
	}
	else
	{
		actualNumber+=numbers;
	}
   } 

 
 
 function giveOperators(oper)
 {	   

	
	if(actualNumber!='-' && secondNumber!='-')
	{
	
      if((actualNumber!='' || actualNumber===0) && secondNumber!='')
      {
	     actualNumber= operation(actualNumber,secondNumber,operator); 
	    
	     document.getElementById(operator).style.backgroundColor='';
	     document.getElementById(oper).style.backgroundColor='green';
	     operator=oper;
	     secondNumber='';
	     document.getElementById("disp").value='';

      } 
      
       

      
      else if((actualNumber!=''|| actualNumber===0) && operator=='' && secondNumber=='')
      {   	        
	         document.getElementById(oper).style.backgroundColor='green';
	         operator=oper;
	         document.getElementById("disp").value='';

      }
      
      
      else 
      {
	        if(oper=='-')
	        {
		           showDisplay(oper);
	        }
	        else
	        {
                   if(operator!='')
                   {		
		           document.getElementById(operator).style.backgroundColor='';
	               document.getElementById(oper).style.backgroundColor='green';
		           operator=oper;
		           }
		           else
		           {
			         document.getElementById("disp").value='';
		           }
		          
	        }
      }	 
      
     }
 }  
 
 
 function equalFunction()
 {
	document.getElementById(operator).style.backgroundColor='';
    actualNumber=operation(actualNumber,secondNumber,operator); 
    document.getElementById("disp").value= actualNumber; 
    secondNumber='';
    operator='';
 }
 
 function operation(firstNumber,secondNumber,operator)
 {
	var firstNo=Number(firstNumber);
	var secondNo=Number(secondNumber);
	
	if(operator=='+')
	{
		return firstNo+secondNo;
	}
	
	if(operator=='-')
	{
		return firstNo-secondNo;
	}
	
	if(operator=='*')
	{
		return firstNo*secondNo;
	}
	
	if(operator=='/')
	{
		return firstNo/secondNo;
	}
 }
 
 
 
 function empty(cancel)
 { 
	   if(operator!='')
	   {
	     document.getElementById(operator).style.backgroundColor=cancel;
	   }
         document.getElementById("disp").value=cancel;
      
         actualNumber='';
         secondNumber='';
         operator='';
 }
 