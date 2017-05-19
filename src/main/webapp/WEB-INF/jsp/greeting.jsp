<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
   
<h2> repository.findAll()</h2>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>City</th>
   <c:forEach var="person" items="${table}">   
   <tr>  
   <td>${person.id}</td>  
   <td>${person.fname}</td>  
   <td>${person.lname}</td>  
   <td>${person.city}</td>  
   </tr>  
   </c:forEach>  
   </table>
   <h2>findBylname("Nowak")</h2>  
   <table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>City</th>
   <c:forEach var="person" items="${table2}">   
   <tr>  
   <td>${person.id}</td>  
   <td>${person.fname}</td>  
   <td>${person.lname}</td>  
   <td>${person.city}</td>  
   </tr>  
   </c:forEach>  
   </table>
      <h2>findByFnameAndLname("Krzysztof","Kowal")</h2>  
   <table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>First Name</th><th>Last Name</th><th>City</th>
   <c:forEach var="person" items="${table3}">   
   <tr>  
   <td>${person.id}</td>  
   <td>${person.fname}</td>  
   <td>${person.lname}</td>  
   <td>${person.city}</td>  
   </tr>  
   </c:forEach>  
   </table>