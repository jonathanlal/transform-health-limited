<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



${test}

<table>
<thead>
<tr>
<th>Value</th>
<th>String</th>
</tr>
</thead>
<c:forEach items="${test}">
<tr>
<td>1</td>
<td>2</td>
</tr>
</c:forEach>

</table>