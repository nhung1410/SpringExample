
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="main-content">
	<div class="section__content section__content--p30">

		<div class="fontawesome-list-wrap">
			<h3 class="title-3 m-b-30">insert product type</h3>

			<form:form action="insertProductType" method="post"
				modelAttribute="type" class="form-horizontal">
				<div class="form-group">
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
