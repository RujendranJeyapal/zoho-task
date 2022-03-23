/**
 * 
 */
 function toFindTrap()
 { 
	var fromValue=49;
	var toValue=90;
	var secondValue=26;
	var map=new Map();
	var count=0;
	
	
	for(var i=fromValue;i<=toValue;i++)
	{
		var temp=i;
		while(true)
		{
		if((temp%secondValue==0) || (secondValue%temp==0))
		{
			map.set(i,secondValue);     
			secondValue+=2;
			++count;
			break;
		}
		else
		{
			if(temp>=10)
			{
			temp=countDigits(temp);
			}
			else
			{  
				if(secondValue>3)
				{
				secondValue-=1;
				}
				break;
			}
		}
		}
	}
	
	for(var value of map)
    {
		document.getElementById("map").innerHTML+=value+"<br>";
	}
	    document.getElementById("count").innerHTML=count;
	}

 
 function countDigits(fromValue)
 {
	         var sumOfDigits=0;
	
		      while(fromValue>0)
		      {
			        var dummy=fromValue%10;
			        sumOfDigits=sumOfDigits+dummy;
			        fromValue=Math.floor(fromValue/10); 
		      }
		      return sumOfDigits;
 }

 
 
 
 
 
 