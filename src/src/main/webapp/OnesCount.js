/**
 * 
 */
 
 function onesCount()
 {
	
var number=document.getElementById("name").value;
var binaryValue="";
var count=0;
     while(number>0)
     {
           var temp=number%2;
           count=count+temp;
           binaryValue=temp+binaryValue;
           number=Math.floor(number/2);	     
     }	
	
	document.getElementById("para").innerHTML="binary value:"+binaryValue+"<br>Ones count:"+count;
 }