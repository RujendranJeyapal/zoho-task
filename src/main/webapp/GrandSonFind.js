/**
 * 
 */
 
 function storeDadAndSon()
 {
	 var count=document.getElementById("count").value;
	 
	 for(var i=0;i<count;i++)
	 {
		
		var divName=document.createElement("div");
		document.body.appendChild(divName);
		  
		var fatherName=document.createElement("label");
		divName.appendChild(fatherName);
		fatherName.textContent="Enter Father's Name";
		
		var fatherInput=document.createElement("input");
		fatherInput.type="text";
		fatherInput.id="father"+i;
		divName.appendChild(fatherInput);
		var sonName=document.createElement("label");
		divName.appendChild(sonName);
		sonName.textContent="Enter Son's Name";		
		var sonInput=document.createElement("input");
		sonInput.type="text";
		sonInput.id="son"+i;
		divName.appendChild(sonInput);       

   
	 }

	 var buttonTag=document.createElement("button");
	 buttonTag.addEventListener("click", showEnterBox);
	 divName.appendChild(buttonTag);
	 buttonTag.innerText="submit";
	 createBreak();


 }
 
 function showEnterBox()
 {
	
	
	var divName=document.createElement("div");
	document.body.appendChild(divName);
		  
	var grandFather=document.createElement("label");
	divName.appendChild(grandFather);
	grandFather.textContent="Enter Grand Father's Name";
	var getGrandFather=document.createElement("input");
    getGrandFather.type="text";
    getGrandFather.id="grandFather";
    divName.appendChild(getGrandFather);
  
    
    
     var buttonTag=document.createElement("button");
	 buttonTag.addEventListener("click",getGrandSon);
	 divName.appendChild(buttonTag);
	 buttonTag.innerText="submit";
	
	 
 }
 
 function getGrandSon()
 {
	
	var familyMap=new Map();

	var count=document.getElementById("count").value;

	for(var i=0;i<count;i++)
	{
		var fatherName=document.getElementById("father"+i).value;
		var sonName=document.getElementById("son"+i).value;
		var listOfSons=familyMap.get(fatherName);
		
		if(listOfSons==null)
		{
			listOfSons=new Array();
			familyMap.set(fatherName,listOfSons);
		}
		listOfSons.push(sonName);		
	}
	
	var paragraph=document.createElement("p");
	paragraph.setAttribute("id","map");
	document.body.appendChild(paragraph);
	

  var grandFatherName=document.getElementById("grandFather").value;
  
  var father=familyMap.get(grandFatherName);
  var length=father.length;
  var temp=[];
  var son=[];
  for(var i=0;i<length;i++)
  {
	
    temp.push(familyMap.get(father[i]));
	  
	  if(temp[i]!=undefined)
	  {
	  var size=temp[i].length;
	  	  
	  for(var j=0;j<size;j++)
	  {
		    son.push(temp[i][j]);
	  }
     }
	  	      
  }
 
 var size=son.length;
 

	if(size==0)
	{
		paragraph.innerHTML=grandFatherName+" has no grandson";
	}
	else if(size==1)
	{
		paragraph.innerHTML=grandFatherName+" has "+size+" grandson.<br>He is "+son;
	}
	
    else
	{
		var result=grandFatherName+" has "+size+" grandsons.<br>They are ";

		
		for(var i=0;i<size;i++)
		{
			if(i==size-1)
			{
				result+=" and ";
			}
			result+=son[i];
			
			if(i==size-1)
			{
				result+=".";
			}
			
			if(i!=size-1 && i!=size-2)
			{
				result+=" , ";
			}
		}
				paragraph.innerHTML+=result;
	}
 }
 
 
 

 