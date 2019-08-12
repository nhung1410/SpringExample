<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="main-content">
	<div class="section__content section__content--p30">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-12">
					<!-- DATA TABLE -->
					<h3 class="title-5 m-b-35">product type</h3>
					<div class="table-data__tool">
						<div class="table-data__tool-left">
							<a href="productType-insert" class="text-light">
								<button class="au-btn au-btn-icon au-btn--green au-btn--small">
									<i class="zmdi zmdi-plus"></i>add item
								</button>
							</a>
						</div>
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
									<th>name</th>
									<th>action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="type" items="${listType}">
									<tr class="tr-shadow">
										<td>1</td>
										<td class="desc">${type.name}</td>
										<td>
											<div class="table-data-feature">
												<button class="item" data-toggle="tooltip"
													data-placement="top" title="" data-original-title="Edit">
													<a href="productType-update/${type.id}"><i
														class="zmdi zmdi-edit"></i></a>
												</button>
												<button class="item" data-toggle="tooltip"
													data-placement="top" title="" data-original-title="Delete">
													<a href="deleteProductType/${type.id}"><i
														class="zmdi zmdi-delete"></i></a>
												</button>
											</div>
										</td>
									</tr>
									<tr class="spacer"></tr>
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