function check()
{
	var name =document.getElementById('name').value;
	var sname =document.getElementById('sname').value;
	var cdn =document.getElementById('cdn').value;
	var date =document.getElementById('date').value;
	var cvv =document.getElementById('cvv').value;
	var street =document.getElementById('Street').value;
	var city =document.getElementById('city').value;
	var zip =document.getElementById('zip').value;
	var email =document.getElementById('email').value;
	var regn=/^[A-Z]/;
	var regcdn=/\d{10}/g;
	var regdt = /[0-9]+/g;
	var regdt1 = /[/]{1,1}/g;
	var gen = /[A-z]+/g;
	var regcv=/\d{3}/g;
	var regzip = /[0-9]{6}/g;
	var regmail = /[@.]{2}/g
	var flag=0;
	if (name==""||name==null) 
	{
		flag=1;
		window.alert('Invalid Name')
		return;
	}
	if(!(regn.test(name)) && flag!=1) 
	{
		flag=1;
		window.alert('Invalid Surname')
		return;
	}
	if(!(regcdn.test(cdn)) && flag!=1)
	{
		flag=1;
		window.alert('Invalid Card No.')
		return;
	}
	if (!(regdt.test(date) && regdt1.test(date)) || gen.test(date) && flag!=1) 
	{
		flag=1;
		window.alert('Invalid Expiry Date')
		return;
	}
	if(!(regcv.test(cvv)) && flag!=1)
	{
		flag=1;
		window.alert('Invalid CVV')
		return;
	}
	if(!(regzip.test(zip)) && flag!=1)
	{
		flag=1;
		window.alert('Invalid ZIP Code')
		return;
	}
	if(!(regmail.test(email)) && flag!=1)
	{
		flag=1;
		window.alert('Invalid Email Id')
		return;
	}

	if((mail=="" || mail==null) && flag!=1)
	{
		flag=1;
		window.alert('Email Address Empty')
		return;
	}

}