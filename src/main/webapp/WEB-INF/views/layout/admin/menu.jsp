
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- MENU SIDEBAR-->

<aside class="menu-sidebar d-none d-lg-block">
	<div class="logo">
		<a href="#"> <img src="resources/admin/images/icon/logo.png"
			alt="Cool Admin" />
		</a>
	</div>
	<c:url value="/productType-list" var="productType-list" />
	<c:url value="/list-product" var="list-product" />
	<div class="menu-sidebar__content js-scrollbar1">
		<nav class="navbar-sidebar">
			<ul class="list-unstyled navbar__list">
				<li><a href="dashboard"> <i class="fas fa-tachometer-alt"></i>Dashboard
				</a></li>
				<li><a href="table.html"> <i class="fas fa-users"></i>Customers
						management
				</a></li>
				<li><a href="productType-list"> <i
						class="	fas fa-boxes"></i>Product type management
				</a></li>
				<li><a href="list-product "> <i class="fas fa-box"></i>Products
						management
				</a></li>
				<li><a href="#"> <i class="fas fa-calendar-alt"></i>Calendar
				</a></li>
				<li><a href="map.html"> <i class="fas fa-map-marker-alt"></i>Maps
				</a></li>
				<li class="has-sub"><a class="js-arrow" href="#"> <i
						class="fas fa-copy"></i>Pages
				</a>
					<ul class="list-unstyled navbar__sub-list js-sub-list">
						<li><a href="login.html">Login</a></li>
						<li><a href="register.html">Register</a></li>
						<li><a href="forget-pass.html">Forget Password</a></li>
					</ul></li>
				<li class="has-sub"><a class="js-arrow" href="#"> <i
						class="fas fa-desktop"></i>UI Elements
				</a>
					<ul class="list-unstyled navbar__sub-list js-sub-list">
						<li><a href="button.html">Button</a></li>
						<li><a href="badge.html">Badges</a></li>
						<li><a href="tab.html">Tabs</a></li>
						<li><a href="card.html">Cards</a></li>
						<li><a href="alert.html">Alerts</a></li>
						<li><a href="progress-bar.html">Progress Bars</a></li>
						<li><a href="modal.html">Modals</a></li>
						<li><a href="switch.html">Switchs</a></li>
						<li><a href="grid.html">Grids</a></li>
						<li><a href="fontawesome.html">Fontawesome Icon</a></li>
						<li><a href="typo.html">Typography</a></li>
					</ul></li>
			</ul>
		</nav>
	</div>
</aside>
<!-- END MENU SIDEBAR-->