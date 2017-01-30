<!DOCTYPE html>
<html lang="fr"
      xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
<head>
	<meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

	<title>Restaurant - Reservation de table en ligne</title>
	
	<!-- Main CSS file -->
        <link rel="stylesheet" href="../template/css/bootstrap.min.css" />
        <link rel="stylesheet" href="../template/css/owl.carousel.css" />
        <link rel="stylesheet" href="../template/css/magnific-popup.css" />
        <link rel="stylesheet" href="../template/css/font-awesome.css" />
        <link rel="stylesheet" href="../template/css/style.css" />
        <link rel="stylesheet" href="../template/css/responsive.css" />

	
	<!-- Favicon -->
        <link rel="shortcut icon" href="../template/images/icon/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../template/images/icon/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../template/images/icon/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../template/images/icon/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="../template/images/icon/apple-touch-icon-57-precomposed.png">
	
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
	  <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	  <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
        <!--style form-->
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../template/css/favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="/template/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="../template/css/style2.css" />
        <link rel="stylesheet" type="text/css" href="/template/css/animate-custom.css" />
	
</head>
<body>

	<!-- PRELOADER -->
	<div id="st-preloader">
		<div id="pre-status">
			<div class="preload-placeholder"></div>
		</div>
	</div>
	<!-- /PRELOADER -->

	
	<!-- HEADER -->
	<header id="header">
		<nav class="navbar st-navbar navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#st-navbar-collapse">
						<span class="sr-only">Menu</span>
				    	<span class="icon-bar"></span>
				    	<span class="icon-bar"></span>
				    	<span class="icon-bar"></span>
					</button>
                                    <a class="logo" href="index.html"><img src="../template/images/lat.JPG" alt="" width="50" height="50"></a>
				</div>

				<div class="collapse navbar-collapse" id="st-navbar-collapse">
					<ul class="nav navbar-nav navbar-right">
				    	<li><a href="">NOS PRODUITS</a></li>
				    	<li><a href="">NOS ACTUALITES</a></li>
				    	<li><a href="">CONTACT</a></li>
                                        <li><a href="">SE CONNECTER</a></li>
					</ul>
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container -->
		</nav>
	</header>
	<!-- /HEADER -->

	
	<!-- PAGE HEADER -->
	<section id="page-header">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="section-title">
						<h4>Bienvenue dans votre site en ligne de Reservation de restaurant</h4>
						<span class="st-border"></span>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- /PAGE HEADER -->


	<!-- BLOG -->
	<section id="blog">
		<div class="container">
			<div class="row">
				<div class="col-md-9">
					<hr>
					<div class="single-blog">
						<article>
							<div class="post-slider">
                                                            <div class="row jumbotron">
                                                                <div class="col-sm-8">
                                                                     <div id="container_demo" >
                                                                         <a class="hiddenanchor" id="toregister"></a>
                                                                         <a class="hiddenanchor" id="tologin"></a>
                                                                         <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="${pageContext.request.contextPath}/User" autocomplete="on" method="POST"> 
                                <h1> S'inscrire </h1> 
                                <p> 
                                    <label for="nom" class="uname" data-icon="u">Nom</label>
                                    <input id="nom" name="nom" required="required" type="text" placeholder="votre nom" />
                                </p>
                                <p> 
                                    <label for="prenom" class="uname" data-icon="u">Prenom</label>
                                    <input id="prenom" name="prenom" required="required" type="text" placeholder="votre prenom" />
                                </p>
                                <p> 
                                    <label for="tel" class="uname" data-icon="u">Telephone</label>
                                    <input id="tel" name="tel" required="required" type="text" placeholder="votre numero de t�l�phone" />
                                </p>
                                <p> 
                                    <label for="adresse" class="uname" data-icon="u">Adresse</label>
                                    <input id="adresse" name="adresse" required="required" type="text" placeholder="votre adresse" />
                                </p>

                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Email</label>
                                    <input id="email" name="login" required="required" type="email" placeholder="votre adresse mail"/> 
                                </p>
                                <p> 
                                    <label for="mdp" class="youpasswd" data-icon="p">Mot de Passe </label>
                                    <input id="mdp" name="mdp" required="required" type="password" placeholder="compose de 5 chiffres"/>
                                </p>
                                <p> 
                                    <label for="profil" class="youpasswd" >Profil </label>
                                    <select name="profil" id="profil">
                                        <option value="Client" id="client"> Client</option>
                                        <option value="restaurateur" id="restaurateur"> Restaurateur</option>
                                    </select>
                                </p>
                                <p class="signin button"> 
                                    <input type="submit" value="Valider"/> 
                                </p>
                                <p class="change_link">  
                                    D�j� membre ?
                                    <a href="connexion.jsp" class="to_register"> S'authentifier </a>
                                </p>
                            </form>
                        </div>

                                                        </div>
                                                    <h4 class="post-title"><a href="">Au Coeur de vos d&eacute;lices</a></h4>
                                                </article>
                                        </div>
                                        <hr>
                                        <ul class="pagination">
                                            <li><a href="#"><i class="fa fa-angle-left"></i></a></li>
                                            <li class="active"><a href="#">1</a></li>
                                            <li><a href="#">2</a></li>
                                            <li><a href="#">3</a></li>
                                            <li><a href="#">4</a></li>
                                            <li><a href="#"><i class="fa fa-angle-right"></i></a></li>
                                </div>
                            <div class="col-md-3">
                                <div class="sidebar-widget">
                                    <div class="blog-search">
                                        <form>
                                            <input type="text" name="search">
                                            <span>
                                                <button id="submit_btn" class="search-submit" type="submit">
                                                    <i class="fa fa-search"></i>
                                                </button>
                                            </span>
                                        </form>
                                    </div>
                                </div>
                                <div class="sidebar-widget">
                                    <h4 class="sidebar-title">NOS PRODUITS</h4>
                                    <ul>
                                        <li><a href="annonce.jsp">NOS ANNONCES</a></li>
                                        <li><a href="">NOS MENU</a></li>
                                        <li><a href="">NOS PLATS DU JOURS</a></li>
                                        <li><a href="">NOS SANDWICHS</a></li>
                                        <li><a href="">COFFRET SPECIALE</a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
		</div>
	</section>
	<!-- /BLOG -->

	<!-- FOOTER -->
	<footer id="footer">
		<div class="container">
			<div class="row">
				<!-- SOCIAL ICONS -->
				<div class="col-sm-6 col-sm-push-6 footer-social-icons">
					<span>Follow us:</span>
					<a href=""><i class="fa fa-facebook"></i></a>
					<a href=""><i class="fa fa-twitter"></i></a>
					<a href=""><i class="fa fa-google-plus"></i></a>
					<a href=""><i class="fa fa-pinterest-p"></i></a>
				</div>
				<!-- /SOCIAL ICONS -->
				<div class="col-sm-6 col-sm-pull-6 copyright">
					<p>&copy; 2017 <a href="">Etudiant en master 2, universit&eacute; de Paris Dauphine</a>. All Rights Reserved with NDIAYE, NIANG, DIENG.</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- /FOOTER -->

	<!-- Scroll-up -->
	<div class="scroll-up">
		<ul><li><a href="#header"><i class="fa fa-angle-up"></i></a></li></ul>
	</div>
	
	<!-- JS -->
        <script type="text/javascript" src="../template/js/jquery.min.js"></script><!-- jQuery -->
        <script type="text/javascript" src="../template/js/bootstrap.min.js"></script><!-- Bootstrap -->
        <script type="text/javascript" src="../template/js/jquery.parallax.js"></script><!-- Parallax -->
        <script type="text/javascript" src="../template/js/smoothscroll.js"></script><!-- Smooth Scroll -->
        <script type="text/javascript" src="../template/js/masonry.pkgd.min.js"></script><!-- masonry -->
        <script type="text/javascript" src="../template/js/jquery.fitvids.js"></script><!-- fitvids -->
        <script type="text/javascript" src="../template/js/owl.carousel.min.js"></script><!-- Owl-Carousel -->
        <script type="text/javascript" src="../template/js/jquery.counterup.min.js"></script><!-- CounterUp -->
        <script type="text/javascript" src="../template/js/waypoints.min.js"></script><!-- CounterUp -->
        <script type="text/javascript" src="../template/js/jquery.isotope.min.js"></script><!-- isotope -->
        <script type="text/javascript" src="../template/js/jquery.magnific-popup.min.js"></script><!-- magnific-popup -->
        <script type="text/javascript" src="../template/js/scripts.js"></script><!-- Scripts -->


</body>
</html>