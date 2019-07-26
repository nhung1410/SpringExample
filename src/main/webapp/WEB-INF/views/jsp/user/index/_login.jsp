<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
	<!-- Start Banner Area -->
	<section class="banner-area organic-breadcrumb">
		<div class="container">
			<div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
				<div class="col-first">
					<h1>Login/Register</h1>
					<nav class="d-flex align-items-center">
						<a href="index.html">Home<span class="lnr lnr-arrow-right"></span></a>
						<a href="category.html">Login</a>
					</nav>
				</div>
			</div>
		</div>
	</section>
	<!-- End Banner Area -->

	<!--================Login Box Area =================-->
	<section class="login_box_area section_gap">
		<div class="container">
			<div class="row">
				<div class="col-lg-6">
					<div class="login_box_img">
						<img class="img-fluid" src="resources/img/login.jpg" alt="">
						<div class="hover">
							<h4>New to our website?</h4>
							<p>There are advances being made in science and technology everyday, and a good example of this is the</p>
							<a class="primary-btn" href="register-form">Create an Account</a>
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="login_form_inner">
						<h3>Log in to enter</h3>
						<form:form class="row login_form" method="GET" action="login" id="contactForm" novalidate="novalidate">
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="us" placeholder="Username"  >
							</div>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="password" name="pw" placeholder="Password" >
							</div>
							<div class="col-md-12 form-group">
								<div class="creat_account">
									<input type="checkbox" id="f-option2" name="selector">
									<label for="f-option2">Keep me logged in</label>
								</div>
							</div>
							<div class="col-md-12 form-group">
								<button type="submit" value="submit" class="primary-btn">Log In</button>
								<a href="#">Forgot Password?</a>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!--================End Login Box Area =================-->
<%--  <div>
		<h2>Login</h2>
		${loginFail}
		<form:form method="GET" action="login">
			<table>

				<tr>
					<td>Name</td>
					<td><input type="text" name="us"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pw"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="login" /></td>
				</tr>

			</table>
		</form:form>
	</div>  --%>
</body>
</html>