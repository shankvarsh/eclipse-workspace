<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Fruits</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">

  <!-- OWN CSS -->
  <link rel="stylesheet" href="./css/style1.css">
  <link rel="stylesheet" href="./css/responsive-style.css">

</head>
<body>
  <header>
    <nav class="navbar  navbar-expand-lg navigation-wrap ">
           <img src="images/Viplogo.png" class="img-fluid" style="position:absolute;margin-left:20px;">
      <div class="container" >
        <div class="collapse navbar-collapse" id="navbarNav" >
            <a class="main-btn" href="firstpage.jsp">Home</a>
          </div>
        <a class="navbar-brand" href="#">
         <img src="./images/organicLogo.png" class="img-fluid">
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
          <!-- <span class="navbar-toggler-icon"></span> -->
          <i class="fas fa-stream navbar-toggler-icon"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav ms-auto mb-2 mb-lg-0">

            <li><a class="main-btn" href="signup.jsp">Create Account</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <nav class="navbar  navbar-expand-lg navigation-wrap " style="top:79px;postion:absolute;">
    
     <div class="collapse navbar-collapse" id="navbarNav" >
     
          <ul class="navbar-nav" style="margin-left:250px;">
            <li class="nav-item" >
              <a class="nav-link active" aria-current="page" href="fruitsforshow.jsp" style="padding-right:100px;">Fruits</a>
            </li>
             <li class="nav-item">
              <a class="nav-link" href="vegeforshow.jsp" style="padding-right:100px;">Vegetables</a>
            </li>
            
            <li class="nav-item">
              <a class="nav-link " href="grainsforshow.jsp" style="padding-right:100px;">Grains</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="dryforshow.jsp" style="padding-right:100px;">Dry fruits</a>
            </li>
            <li class="nav-item">
              <a class="nav-link " href="oilforshow.jsp" style="padding-right:100px;">Oils</a>
            </li>
             <li class="nav-item">
              <a class="nav-link " href="spicesforshow.jsp" style="padding-right:100px;">Spices</a>
            </li>
            </ul>
            </div>
            
    </nav>
  </header>
   <script>
function myFunction() {
  alert("You need to login, before adding products to cart.");
  window.location.href = "login.jsp";
}
</script>
   <!-- Products section -->
   <section id="product" class="product">
     <div class="headline text-center mb-5">
       <h2 class="pb-3 position-relative d-inline-block" style="color:#00a149 ">Fruits</h2>
     </div>
   </section>
    <section id="products" class="products">

      <div class="container">
        <div class="row">
          <div class="col-sm-12">

          </div>
        </div>
        <div class="row">
         <div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">

   <img src="./images/img/fruits/f1.PNG" alt="products" class="img-fluid product-image-first" >


               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize">Organic Banana Yelakki</h3>
                 <p class="mb-0 amount">Rs 28.00</p>
                 <div class="py-1">
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
                <button onclick="myFunction()" type="button" class="add_to_Card"> ADD TO CART</button>
               </div>
             </div>
           </a>
         </div>
         <div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
                   <img src="./images/img/fruits/f2.PNG" alt="products" class="img-fluid product-image-first">

               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize">Organic Papaya</h3>
                 <p class="mb-0 amount">Rs 56.00</p>
                 <div class="py-1">
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
                 <button onclick="myFunction()" type="button" class="add_to_Card">ADD TO CART</button>
               </div>
             </div>
           </a>
         </div>
         <div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
                   <img src="./images/img/fruits/f3.PNG" alt="products" class="img-fluid product-image-first">

               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize">Organic Watermelon</h3>
                 <p class="mb-0 amount">Rs 46.00</p>
                 <div class="py-1">
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                 </div>
                 <button type="button" onclick="myFunction()" class="add_to_Card">ADD TO CART</button>
               </div>
             </div>
           </a>
         </div>
         <div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
                   <img src="./images/img/fruits/f4.PNG" alt="products" class="img-fluid product-image-first">

               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize">Organic Pineapple</h3>
                 <p class="mb-0 amount">Rs 93.00</p>
                 <div class="py-1">
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
                 <button type="button" onclick="myFunction()" class="add_to_Card">ADD TO CART</button>
               </div>
             </div>
           </a>
         </div>
         <div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">

                   <img src="./images/img/fruits/f5.PNG" alt="products" class="img-fluid product-image-first">

               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize">Organic Pomegranate</h3>
                 <p class="mb-0 amount">Rs 174.00</p>
                 <div class="py-1">
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star"></span>
                     <span class="ti-star"></span>
                 </div>
                 <button onclick="myFunction()" type="button" class="add_to_Card">ADD TO CART</button>
               </div>
             </div>
           </a>
         </div>
         <div class="col-sm-6 col-lg-4">
           <a href="#" class="d-block text-center mb-4">
             <div class="product-list">
               <div class="product-image position-relative">
                   <img src="./images/img/fruits/f6.PNG" alt="products" class="img-fluid product-image-first">

               </div>
               <div class="product-name pt-3">
                 <h3 class="text-capitalize">Organic Muskmelon</h3>
                 <p class="mb-0 amount">Rs 93.00</p>
                 <div class="py-1">
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star active"></span>
                     <span class="ti-star"></span>
                 </div>
                 <button onclick="myFunction()" type="button" class="add_to_Card">ADD TO CART</button>
               </div>
             </div>
           </a>
         </div>
       </div>



</body>
</html>