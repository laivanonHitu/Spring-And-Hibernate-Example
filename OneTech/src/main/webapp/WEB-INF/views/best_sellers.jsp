<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/taglib.jsp"%>    
<div class="best_sellers">
			<div class="container">
				<div class="row">
					<div class="col">
						<div class="tabbed_container">
							<div class="tabs clearfix tabs-right">
								<div class="new_arrivals_title">Hot Best Sellers</div>
								<ul class="clearfix">
									<li class="active">Top 20</li>
									<li>Audio & Video</li>
									<li>Laptops & Computers</li>
								</ul>
								<div class="tabs_line">
									<span></span>
								</div>
							</div>

							<div class="bestsellers_panel panel active">

								<!-- Best Sellers Slider -->

								<div class="bestsellers_slider slider">
									
									<!-- Best Sellers Item -->
									<div class="bestsellers_item discount">
										<div
											class="bestsellers_item_container d-flex flex-row align-items-center justify-content-start">
											<div class="bestsellers_image">
												<img src="images/best_1.png" alt="">
											</div>
											<div class="bestsellers_content">
												<div class="bestsellers_category">
													<a href="#">Headphones</a>
												</div>
												<div class="bestsellers_name">
													<a href="product.html">Xiaomi Redmi Note 4</a>
												</div>
												<div class="rating_r rating_r_4 bestsellers_rating">
													<i></i><i></i><i></i><i></i><i></i>
												</div>
												<div class="bestsellers_price discount">
													$225<span>$300</span>
												</div>
											</div>
										</div>
										<div class="bestsellers_fav active">
											<i class="fas fa-heart"></i>
										</div>
										<ul class="bestsellers_marks">
											<li class="bestsellers_mark bestsellers_discount">-25%</li>
											<li class="bestsellers_mark bestsellers_new">new</li>
										</ul>
									</div>

								</div>
							</div>

							<div class="bestsellers_panel panel">

								<!-- Best Sellers Slider -->

								<div class="bestsellers_slider slider">

									<!-- Best Sellers Item -->
									<div class="bestsellers_item discount">
										<div
											class="bestsellers_item_container d-flex flex-row align-items-center justify-content-start">
											<div class="bestsellers_image">
												<img src="images/best_1.png" alt="">
											</div>
											<div class="bestsellers_content">
												<div class="bestsellers_category">
													<a href="#">Headphones</a>
												</div>
												<div class="bestsellers_name">
													<a href="product.html">Xiaomi Redmi Note 4</a>
												</div>
												<div class="rating_r rating_r_4 bestsellers_rating">
													<i></i><i></i><i></i><i></i><i></i>
												</div>
												<div class="bestsellers_price discount">
													$225<span>$300</span>
												</div>
											</div>
										</div>
										<div class="bestsellers_fav active">
											<i class="fas fa-heart"></i>
										</div>
										<ul class="bestsellers_marks">
											<li class="bestsellers_mark bestsellers_discount">-25%</li>
											<li class="bestsellers_mark bestsellers_new">new</li>
										</ul>
									</div>

								
								</div>
							</div>

							<div class="bestsellers_panel panel">

								<!-- Best Sellers Slider -->

								<div class="bestsellers_slider slider">
									<c:forEach var="list" items="listProduct">
								
									<!-- Best Sellers Item -->
									<div class="bestsellers_item discount">
										<div
											class="bestsellers_item_container d-flex flex-row align-items-center justify-content-start">
											<div class="bestsellers_image">
												<img src="images/best_1.png" alt="">
											</div>
											<div class="bestsellers_content">
												<div class="bestsellers_category">
													<a href="#">Headphones</a>
												</div>
												<div class="bestsellers_name">
													<a href="product.html">${list.getTitle()}</a>
												</div>
												<div class="rating_r rating_r_4 bestsellers_rating">
													<i></i><i></i><i></i><i></i><i></i>
												</div>
												<div class="bestsellers_price discount">
													${list.getPrice()}<span>${list.getDiscount()}</span>
												</div>
											</div>
										</div>
										<div class="bestsellers_fav active">
											<i class="fas fa-heart"></i>
										</div>
										<ul class="bestsellers_marks">
											<li class="bestsellers_mark bestsellers_discount">-25%</li>
											<li class="bestsellers_mark bestsellers_new">new</li>
										</ul>
									</div>
	
									</c:forEach>
								</div>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>