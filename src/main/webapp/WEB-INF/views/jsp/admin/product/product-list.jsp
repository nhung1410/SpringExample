<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="main-content">
	<div class="section__content section__content--p30">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<!-- DATA TABLE -->
					<h3 class="title-5 m-b-35">data table</h3>
					<div class="table-data__tool">
						<div class="table-data__tool-left">
							<a href="insert-product" class="text-light">
								<button class="au-btn au-btn-icon au-btn--green au-btn--small">
									<i class="zmdi zmdi-plus"></i>add item
								</button>
							</a>
						</div>

						<c:url value="/product-update" var="product-update" />
						<div class="table-data__tool-right">
							<form class="form-header" action="" method="POST">
								<input class="au-input au-input--xl" type="text" name="search"
									placeholder="Search for datas &amp; reports...">
								<button class="au-btn--submit" type="submit">
									<i class="zmdi zmdi-search"></i>
								</button>
							</form>
						</div>
					</div>
					<div class="table-responsive table-responsive-data2">
						<table class="table table-data2">
							<thead>
								<tr>
									<th>no</th>
									<th>id</th>
									<th>name</th>
									<th>type</th>
									<th>image</th>
									<th>quanity</th>
									<th>price</th>
									<th>sale</th>
									<th>action</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${productList}" var="product">
									<tr class="tr-shadow">
										<td class="desc"></td>
										<td class="desc">${product.id}</td>
										<td class="desc">${product.name }</td>

										<td class="desc">${product.typeId}</td>

										<td></td>
										<td class="desc">${product.quantity }</td>
										<td class="desc">${product.price}</td>
										<td class="desc">${product.sale}</td>
										<td>
											<div class="table-data-feature">
												<button
													onclick="location.href='product-update?id=${product.id}'"
													class="item" data-toggle="tooltip" data-placement="top"
													title="" data-original-title="Edit">
													<i class="zmdi zmdi-edit"></i>
												</button>
												<button class="item" data-toggle="tooltip"
													data-placement="top" title="" data-original-title="Delete">
													<i class="zmdi zmdi-delete"></i>
												</button>
											</div>
										</td>
									</tr>
								</c:forEach>

							</tbody>

						</table>
					</div>
					<!-- END DATA TABLE -->
				</div>
			</div>
		</div>
	</div>
</div>