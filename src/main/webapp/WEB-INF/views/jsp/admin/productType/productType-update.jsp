<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="main-content">
	<div class="section__content section__content--p30">
		<div class="container-fluid">
			<div class="alert alert-success" role="alert">This is a
				success!</div>
			<div class="container-fluid">
				<div class="fontawesome-list-wrap">
					<h3 class="title-3 m-b-30">update product type</h3>
					<c:url value="/updateProductType" var="updateProductType" />

					<form:form action="${updateProductType }" method="POST"
						modelAttribute="type" class="form-horizontal">
						<div class="form-group">
							<div class="col col-md-3">
								<label for="select" class=" form-control-label">ID</label>
							</div>
							<div class=" col-md-9">

								<form:input type="text" id="type-id" path="id"
									placeholder="Enter product's name..." class="form-control"
									readonly="true" />
							</div>
							<div class="col col-md-3">
								<label for="select" class=" form-control-label">Name</label>
							</div>
							<div class=" col-md-9">
								<form:input type="text" id="type-name" path="name"
									placeholder="Enter product's name..." class="form-control" />
								<span class="help-block">Please enter product's name</span>
							</div>
						</div>
						<div class="card-footer">
							<button type="submit" class="btn btn-success btn-sm">
								<i class="fa fa-dot-circle-o"></i> Submit
							</button>
							<button type="reset" class="btn btn-danger btn-sm">
								<i class="fa fa-ban"></i> Reset
							</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>