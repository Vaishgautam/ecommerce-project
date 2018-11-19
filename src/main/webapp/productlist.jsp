<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online shopping cart</title>
<style type="text/css">
</style>
<%@include file="productsearch.jsp"%>
<body bgcolor="#E6E6FA">

	<div class="container">
		<div class="mt-3">
			<div class="row">
				<c:forEach items="${msg}" var="user">
					<div class="col">
						<div class="card" style="width: 15rem;">
							<img class="card-img-top"
								src="src/main/webapp/WEB-INF/shirt-01.jpg" width="100" height="100"/>
								
							<div class="card-body">
								<th>ProductId:</th>
								<td><c:out value="${user.productId}" /></td> <br>
								<th>ProductName:</th>
								<td><c:out value="${user.productName}" /></td> <br>
								<th>ProductBrand:</th>
								<td><c:out value="${user.productBrand}" /></td> <br>
								<th>ProductPrice:</th>
								<td><c:out value="${user.productPrice}" /></td> <br>
								<th>ProductColor:</th>
								<td><c:out value="${user.productColor}" /></td> <br>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>