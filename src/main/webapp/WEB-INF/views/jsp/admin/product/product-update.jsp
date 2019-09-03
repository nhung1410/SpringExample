<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="main-content">
	<div class="section__content section__content--p30">
		<div class="container-fluid">
			<div class="fontawesome-list-wrap">
				<h3 class="title-3 m-b-30">update product</h3>
				<form:form action="updateProduct" method="POST"
					class="form-horizontal" modelAttribute="product">
					<div class="form-group row">
						<div class="form-group col-8">
							<div class="form-group row">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Name</label>
								</div>
								<div class="col col-md-7">
									<form:input path="name" placeholder="Enter product's name..."
										class="form-control" />
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group row">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Product's
										type</label>
								</div>
								<div class="col col-md-6">
									<form:select id="select" class="form-control" path="typeId">
										<c:forEach items="${types }" var="type">
											<form:option value="${type.id }">${type.name }</form:option>
										</c:forEach>
									</form:select>
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group row">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Price</label>
								</div>
								<div class="col col-md-4">
									<form:input type="number" path="price"
										placeholder="Enter product's price..." class="form-control" />
									<span class="help-block"></span>
								</div>
							</div>
							<div class="row form-group">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Sale</label>
								</div>
								<div class="col col-md-4">
									<form:select id="select" class="form-control" path="sale">
										<option value="100">Please select</option>
										<option value="10">10%</option>
										<option value="20">20%</option>
										<option value="30">30%</option>
										<option value="50">50%</option>
										<option value="70">70%</option>
									</form:select>
								</div>
							</div>
							<div class="form-group row">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Quantity</label>
								</div>
								<div class="col col-md-4">
									<form:input type="number" path="quantity"
										placeholder="Enter product's quantity..." class="form-control" />
									<span class="help-block"></span>
								</div>
							</div>
							<div class="form-group row">
								<div class="col col-md-3">
									<label for="select" class=" form-control-label">Image</label>
								</div>
								<div class="col col-md-7">
									<form:input type="file" path="imgMain"
										placeholder="Enter product's image..." class="form-control" />
									<span class="help-block"></span>
								</div>
							</div>

							<div class="au-task__footer">
								<button type="submit" class="btn btn-success btn-sm">
									<i class="fa fa-dot-circle-o"></i> Submit
								</button>
								<button type="reset" class="btn btn-danger btn-sm">
									<i class="fa fa-ban"></i> Reset
								</button>
							</div>


						</div>
						<div class="form-group col-4">
							<img src="resources/admin/images/bg-title-01.jpg"
								alt="Product image">
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</div>
