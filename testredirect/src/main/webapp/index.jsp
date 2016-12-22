<html>
<body>
<h2>Hello World!</h2>
<script >
var request = new XMLHttpRequest();
var path="page1.jsp";


request.open("GET", path, true);
//request.setRequestHeader("Referer", "http://www.google.com");
//request.setRequestHeader("User-Agent", "Mozilla/5.0");
request.setRequestHeader("Accept","text/plain");
request.setRequestHeader("Content-Type","text/plain");

request.setRequestHeader("Header1","value");

request.send(null);
</script>
</body>
</html>
