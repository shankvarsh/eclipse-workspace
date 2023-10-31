<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <meta name="Description" content="Enter your description here" />
  <title>VIP Main Page</title>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

  <!-- bootstrap CDN -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">

  <!-- OWN CSS -->
  <link rel="stylesheet" href="images/css/style1.css">
  <link rel="stylesheet" href="css/responsive-style.css">
  <style>
  .mySlides {display: none;}
  img {vertical-align: middle;}

  /* Slideshow container */
  .slideshow-container {
    top:110px;
    max-width:100%;
    position:absolute;
    margin-left:0px;
  }

  /* The dots/bullets/indicators */
  .dot {
    height: 15px;
    width: 15px;
    margin: 0 2px;
    background-color: #bbb;
    border-radius: 50%;
    display: inline-block;
    transition: background-color 0.6s ease;
  }

  .active {

  }

  /* Fading animation */
  .fade {
    -webkit-animation-name: fade;
    -webkit-animation-duration: 1.5s;
    animation-name: fade;
    animation-duration: 1.5s;
  }

  @-webkit-keyframes fade {
    from {opacity: .4}
    to {opacity: 1}
  }

  @keyframes fade {
    from {opacity: .4}
    to {opacity: 1}
  }

  /* On smaller screens, decrease text size */
  @media only screen and (max-width: 300px) {
    .text {font-size: 11px}
  }
  input[type=text] {
  margin-left:300px;
  width: 450px;
  box-sizing: border-box;
  border: 2px solid #ccc;
  border-radius: 4px;
  font-size: 16px;
  background-color: white;
  background-image: url('images/search.png');
  background-position: 10px 10px;
  background-repeat: no-repeat;
  padding: 12px 20px 12px 40px;
  -webkit-transition: width 0.4s ease-in-out;
  transition: width 0.4s ease-in-out;
}

input[type=text]:focus {
  width: 100%;
}
.dropdown {
  position: absolute;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  margin-left: 330px;
  margin-top: 100px;
  background-color: white;
  min-width: 160px;
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd}

.dropdown:hover .dropdown-content {
  display: block;
}

.btn:hover, .dropdown:hover .btn {
  background-color: #0b7dda;
}
.sidebar {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top:105px;
  left: 0;
  background-color: white;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidebar a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 20px;
  color: #818181;
  display: block;
  transition: 0.3s;
}

.sidebar a:hover {
  color: #f1f1f1;
}

.sidebar .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}

.openbtn {
position:absolute;
top:15px;
  margin-left:-100px;
  font-size: 35px;
  cursor: pointer;
  background-color:#472780;
  color: white;
  padding: 10px 15px;
  border: none;
}

.openbtn:hover {
  background-color: rgba(0, 0, 0, 0.2);
}

#main {
  transition: margin-left .5s;
  padding: 16px;

}

/* On smaller screens, where height is less than 450px, change the style of the sidenav (less padding and a smaller font size) */
@media screen and (max-height: 450px) {
  .sidebar {padding-top: 15px;}
  .sidebar a {font-size: 18px;}
}
 /*
==========================================
footer section Design
==========================================
*/
.footer{
  background: #472780;
  bottom:50%;
}
.footer .footer-link{
  font-size:1rem;
  color:var(--white-color);
  padding:0 1.875rem;
}
.footer .footer-link:hover{
  color:var(--white-color) !important;
}
.footer a i{
  font-size: 1.5rem;
  color:var(--white-color);
  padding:0 1rem;
}


@media (max-width:1024px)
{

    /* about section */

}

@media (max-width: 991px)
{

    /*custom classes  */
    .text-content{
        width:100%;
    }


    /* navbar brand */
    .navigation-wrap .navbar-brand img{
        height:3.8125rem;
    }
    .navigation-wrap{
        text-align: center;
        background-color: var(--white-color);
    }
    .navigation-wrap .nav-link{
        line-height: 1.875rem;
    }
    /* Banner Design */
    .top-banner{
        padding:9.375rem 0 9.375rem;
    }

    /* carousel design */
    .testimonial-section .carousel-item .carousel-caption p{
        padding:0;
    }
}
  </style>
  <script>
function openNav() {
document.getElementById("mySidebar").style.width = "250px";
document.getElementById("slide").style.marginLeft = "300px";
document.getElementById("doc").style.marginLeft = "300px";
document.getElementById("cat").style.marginLeft = "300px";
document.getElementById("organic").style.marginLeft = "300px";
document.getElementById("organic1").style.marginLeft = "300px";

}

function closeNav() {
	document.getElementById("mySidebar").style.width = "0";
	document.getElementById("slide").style.marginLeft= "300px";
	document.getElementById("doc").style.marginLeft= "300px";
	document.getElementById("cat").style.marginLeft= "300px";
	document.getElementById("organic").style.marginLeft= "300px";
	document.getElementById("organic1").style.marginLeft= "300px";

	}
</script>

</head>

    <body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="100" style="background-color:#FBF8FF;">
    <%String email=session.getAttribute("email").toString(); %>
      <!-- header design -->
      <header>
        <nav class="navbar navbar-expand-lg navigation-wrap" style="background:#472780;top:0px;">
          <div class="container">
            <a class="navbar-brand" href="#">
              <div id="mySidebar" class="sidebar" style= "border-radius: 0.5rem;box-shadow: 0px 2px 10px -1px rgb(0 0 0 / 19%);">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">x</a>
  <a href="#"><img src="images/user1.png">&nbsp &nbsp  My Profile</a><br>
  <a href="Help.html"><img src="images/male-telemarketer.png">&nbsp &nbsp  Help & Support</a><br>
  <a href="about.html"><img src="images/information-button.png">&nbsp &nbsp Terms Applied</a><br>
  <a href="logoutvip.jsp"><img src="images/logout1.png">&nbsp &nbsp  Logout</a><br>
</div>
              <div id="main">
  <button class="openbtn" onclick="openNav()">=</button>  </div>
              <a href="#"><img src="images/vip.png" class="img-fluid"></a>
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
              <!-- <span class="navbar-toggler-icon"></span> -->
              <i class="fas fa-stream navbar-toggler-icon"></i>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
              <form>
  <input type="text" name="search" placeholder="Search..">
</form>
<div  style="position:absolute;margin-left:750px;top:0px;">
<button class="main-btn" style="position:absolute;margin-left:260px;top:29px;width:250px;height:50px;"><%out.println(email);%></button>


 </div>
</div>

            </div>
          </div>
        </nav>

      </header>
    <section id="slide" style="margin-left:280px;">
        <div class="slideshow-container" style=" border-radius: 0.5rem;box-shadow: 0px 2px 10px -1px rgb(0 0 0 / 19%)">
        <div class="mySlides fade">
          <img src="images\s4.jpg" style="width:100%">
        </div>

        <div class="mySlides fade">

          <img src="images\s5.jpg" style="width:100%">

        </div>

        <div class="mySlides fade" >

          <img src="images\s3.jpg" style="width:100%">

        </div>



        </div>
        <br>

        <div style="text-align:center">
          <span class="dot"></span>
          <span class="dot"></span>
          <span class="dot"></span>
        </div>

        <script>
        var slideIndex = 0;
        showSlides();

        function showSlides() {
          var i;
          var slides = document.getElementsByClassName("mySlides");
          var dots = document.getElementsByClassName("dot");
          for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
          }
          slideIndex++;
          if (slideIndex > slides.length) {slideIndex = 1}
          for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace(" active", "");
          }
          slides[slideIndex-1].style.display = "block";
          dots[slideIndex-1].className += " active";
          setTimeout(showSlides, 2000); // Change image every 2 seconds
        }
        </script>
      </section >
      <section id="doc" style="margin-left:280px;">
        <h4 style="position:absolute;top:465px;">My Documents (From Digilocker)</h4>
        <div style="position:absolute;top:525px;width:1000px;height:100px;border-radius: 0.5rem;background-color:white; box-shadow: 0px 2px 10px -1px rgb(0 0 0 / 19%); " >
                  <img src="images/vip.png" style="position:absolute;margin-left:25px;top:4px;"class="img-fluid"><a href="../Image-Uploader-master/Index.html"><button class="main-btn" style="position:absolute;margin-left:700px;top:29px;width:250px;height:50px;"><img src="images/enter.png" style="position:absolute;margin-left:130px;top:5px;">Click To Upload</button></a>
        </div>
      </section>
    </section >
    <section id="cat" style="margin-left:280px;">
      <h4 style="position:absolute;top:650px;">Category</h4>
      <div style="position:absolute;top:700px;width:1000px;height:460px;border-radius: 0.5rem;background-color:white; box-shadow: 0px 2px 10px -1px rgb(0 0 0 / 19%); " >
    <a href="health_schemes.html"><img src="images\health-care.png" style="position:absolute;margin-left:100px;top:30px;"></a>
      <h5 style="position:absolute;margin-left:130px;top:180px;">Health</h5>
        <a href="education_scheme.html"><img src="images\open-book.png" style="position:absolute;margin-left:400px;top:30px;"></a>
      <h5 style="position:absolute;margin-left:417px;top:180px;">Education</h5>
      <a href="women&children_scheme.html">  <img src="images\mother-and-son-silhouettes.png" style="position:absolute;margin-left:700px;top:30px;"></a>
      <h5 style="position:absolute;margin-left:690px;top:180px;">Women & Children</h5>
      <a href="Youthskillsschemes.html">  <img src="images\skill.png" style="position:absolute;margin-left:100px;top:260px;"></a>
      <h5 style="position:absolute;margin-left:40px;top:420px;">Youth. Skills and Employment</h5>
      <a href="farmerschemes.html">  <img src="images\farmer.png" style="position:absolute;margin-left:400px;top:260px;"></a>
      <h5 style="position:absolute;margin-left:428px;top:420px;">Farmers</h5>
      <a href="utilitiesschemes.html">  <img src="images\maintenance.png" style="position:absolute;margin-left:700px;top:260px;"></a>
      <h5 style="position:absolute;margin-left:735px;top:420px;">Utility</h5>




    </div>
    </section>
    <section id="organic" style="margin-left:280px;">
    <a href="../firstpage.jsp"> <div class="organic" style=" border-radius: 0.5rem;box-shadow: 0px 2px 10px -1px rgb(0 0 0 / 19%); background:url(./images/bg7.jpeg); background-repeat: no-repeat;background-size: 1200px 500px;">
       <div class="container book-salon-text">
         <div class="row text-center">
           <div class="col-lg-9 col-md-12">
             <img src="images/organicLogo.png" class="img-fluid" style="border-radius: 0.5rem;box-shadow: 0px 2px 10px -1px rgb(0 0 0 / 19%);margin-left:550px">
               <h2 style="border-radius: 0.5rem;box-shadow: 0px 2px 10px -1px rgb(0 0 0 / 19%);width:700px;margin-left:350px">  ORGANIC Healthy Food Grown by Farmers  </h2>
           </div>

         </div>
       </div>
     </div></a>
   </section>
<section id="organic1" style="margin-left:280px;">
 <a href="../firstpage.jsp"> <h1 style="position:absolute;top:1590px;margin-left:440px;color:white;text-align:center;"><button class="main-btn1" >Visit Organic Farming</button></h1></a>
</section>
<!-- section-9 footer-->
  <footer id="footer" class="footer" style="position:absolute;top:1720px;width:100%;">
    <div class="footer py-5">
      <div class="container">
        <div class="row">
          <div class="col-md-12 text-center">
            <a class="footer-link" href="#doc">Documents</a>
            <a class="footer-link" href="#organic">Organic</a>
            <a class="footer-link" href="#cat">Categories</a>
            <a class="footer-link" href="#slide">Services</a>
            <div class="footer-social pt-4 text-center">
              <a href="#"><i class="fab fa-facebook-f"></i></a>
              <a href="#"><i class="fab fa-twitter"></i></a>
              <a href="#"><i class="fab fa-pinterest"></i></a>
              <a href="#"><i class="fab fa-linkedin"></i></a>
              <a href="#"><i class="fab fa-instagram"></i></a>
            </div>
          </div>
          <div class="col-sm-12">
            <div class="footer-copy">
              <div class="copy-right text-center pt-5">
                <p class="text-light">© 2021. VIP. All rights reserved.</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </footer>
  </body>
</html>