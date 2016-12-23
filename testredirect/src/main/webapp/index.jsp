<html>
<script >

function run()
{
	var request = new XMLHttpRequest();
	var path="page1.jsp";
	
	request.onreadystatechange=state_change;
	request.open("GET", path, true);
	//request.setRequestHeader("Referer", "http://www.google.com");
	//request.setRequestHeader("User-Agent", "Mozilla/5.0");
	request.setRequestHeader("Accept","text/plain");
	request.setRequestHeader("Content-Type","text/plain");
	
	request.setRequestHeader("Header1","value");
	
	request.send(null);
	
	function state_change()
	{
	if (request.readyState==4)
	  {// 4 = "loaded"
	  if (request.status==200)
	    {// 200 = OK
	    // ...our code here...
	    //alert('ok');
	    
	    //document.getElementById('iframe1').contentWindow.document.write(request.responseText);
		  document.write(request.responseText);
	    }
	  else
	    {
	    alert("Problem retrieving XML data");
	    }
	  }
	}
}
</script>
<body onload="run()">
<h2>Hello World!</h2>
<iframe id=iframe1></iframe>
</body>
</html>
