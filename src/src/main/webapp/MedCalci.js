/**
 * 
 */

var actualNumber = 0;
var secondNumber = '';
var operator = '';


function showDisplay(numbers) 
{



	if ((actualNumber != '' || actualNumber == 0) && operator != '') 
	{


		if (secondNumber.includes('.') && numbers == '.')
	    {
			numbers = '';
		}
		
		secondNumber += numbers;
		
		if (secondNumber == '.') 
		{
			secondNumber = '0' + secondNumber;
		}

		document.getElementById("disp").value = toSeparateComma(secondNumber);


		document.getElementById("disp1").value += numbers;


	}


	else
	{
		var actNoWithComma = '';
		var displayNo = document.getElementById("disp").value;


		if (displayNo == 0 && displayNo != "0.") 
		{
			if (numbers == '.') 
			{
				actualNumber = displayNo + numbers;
			}
			else
			{
				actualNumber = numbers;
			}

			document.getElementById("disp").value = actualNumber;
			document.getElementById("disp1").value = actualNumber;
		}


		else 
		{
			if (String(actualNumber).includes('.') && numbers == '.')
			{
				numbers='';
			}
			actualNumber += numbers;
			actNoWithComma = toSeparateComma(actualNumber);
			document.getElementById("disp").value = actNoWithComma;
			document.getElementById("disp1").value = actNoWithComma;

		}



	}



}


function giveOperators(oper) 
{


	if (secondNumber != '-')
	 {

		if ((actualNumber != '' || actualNumber == 0) && secondNumber != '')
		 {
			actualNumber = operation(actualNumber, secondNumber, operator);

			document.getElementById(operator).style.backgroundColor = '';
			document.getElementById(oper).style.backgroundColor = 'green';
			operator = oper;
			secondNumber = '';
			document.getElementById("disp").value = toSeparateComma(actualNumber.toString());
			document.getElementById("disp1").value += oper;
		}





		else if ((actualNumber != '' || actualNumber == 0) && operator == '' && secondNumber == '') 
		{
			document.getElementById(oper).style.backgroundColor = 'green';
			operator = oper;
			document.getElementById("disp1").value = toSeparateComma(actualNumber.toString()) + oper;


		}

		else 
		{
			if (oper == '-') 
			{
				showDisplay(oper);
			}
			else 
			{
				document.getElementById(operator).style.backgroundColor = '';
				document.getElementById(oper).style.backgroundColor = 'green';
				operator = oper;
				document.getElementById("disp1").value += oper;
				document.getElementById("disp").value = '';


			}
		}
	}


}


function equalFunction() 
{
	document.getElementById(operator).style.backgroundColor = '';
	actualNumber = operation(actualNumber, secondNumber, operator);
	document.getElementById("disp").value = toSeparateComma(actualNumber.toString());
	secondNumber = '';
	operator = '';
}

function operation(firstNumber, secondNumber, operator) 
{
	var firstNo = Number(firstNumber);
	var secondNo = Number(secondNumber);

	if (operator == '+') {
		return firstNo + secondNo;
	}

	if (operator == '-') {
		return firstNo - secondNo;
	}

	if (operator == '*') {
		return firstNo * secondNo;
	}

	if (operator == '/') {
		return firstNo / secondNo;
	}
}



function empty(cancel) 
{
	if (operator != '') 
	{
		document.getElementById(operator).style.backgroundColor = cancel;
	}
	document.getElementById("disp").value = 0;
	document.getElementById("disp1").value = cancel;
	actualNumber = 0;
	secondNumber = '';
	operator = '';

}


function toSeparateComma(number) 
{
	var temp = number;
	var decimal = '';
	if (number.includes('.'))
	 {
		var separater = number.split('.');
		temp = separater[0];
		decimal = separater[1];
	}
	var length = temp.length;
	var eachChar = temp.split('');
	var lastDigit = eachChar[length - 1];

	var result = '';
	var count = 0;

	for (var i = length - 2; i >= 0; i--)
	 {
		result = eachChar[i] + result;
		if (i != 0 && count == 1) 
		{
			result = ',' + result;
			count = 0;
		}
		else
		{
			count++;
		}

	}
	result += lastDigit;

	if (number.includes('.'))
    {
		return result + '.' + decimal;
	}

	else
	{
		return result;
	}
}



