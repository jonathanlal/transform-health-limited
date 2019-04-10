<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include flush="true" page="includes/header.jsp"></jsp:include>





<table class="table table-responsive-xl table-bordered table-hover">
  <thead class="thead-dark">
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col"></th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${users}" varStatus="count" var="user">
    <tr>
      <th scope="row">${count.count}</th>
      <td>${user.user_name}</td>
      <td>${user.user_email}</td>
      <td>
      <div class="btn-group" role="group" >
      <button type="button" class="deleteUser btn btn-danger btn-sm"><i class="far fa-trash-alt"></i></button>
      <button type="button" class="deleteUser btn btn-warning btn-sm"><i class="fas fa-pencil-alt"></i></button>
      </div>
      </td>
    </tr>
    </c:forEach>
  </tbody>
</table>



























<jsp:include flush="true" page="includes/admin_footer.jsp"></jsp:include>