<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!-- Start Banner Area -->

    <section class="organic-breadcrumb banner-area">
        <div class="container">
            <div class="breadcrumb-banner d-flex flex-wrap align-items-center justify-content-end">
                <div class="col-first">
                    <h1>Register</h1>
                    <nav class="d-flex align-items-center">
                        <a href="index.html">Home<span class="lnr lnr-arrow-right"></span></a>
                        <a href="category.html">Register</a>
                    </nav>
                </div>
            </div>
        </div>
    </section>
    <!-- End Banner Area -->

    <!--================Tracking Box Area =================-->
    <section class="tracking_box_area section_gap">
        <div class="container">
            <div class="tracking_box_inner">
                <form:form class="row tracking_form" action="#" method="post" novalidate="novalidate">
                    <div class="col-md-12 form-group">
                        <input type="text" class="form-control" id="name" name="us" placeholder="Username"  >
                    </div>
                    <div class="col-md-12 form-group">
                        <input type="email" class="form-control" id="email" name="email" placeholder=" Email Address" >
                    </div>
                    <div class="col-md-12 form-group">
                        <input type="password" class="form-control" id="password" name="pw" placeholder="Password" >
                    </div>
                    
                    <div class="col-md-12 form-group">
                        <button type="submit" value="submit" class="primary-btn">Create account</button>
                    </div>
                </form:form>
            </div>
        </div>
    </section>
    <!--================End Tracking Box Area =================-->