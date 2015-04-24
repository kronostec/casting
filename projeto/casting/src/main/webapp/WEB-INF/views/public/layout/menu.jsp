<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<nav ng-controller="MenuCtrl" ng-init="init()" >

	<div class="headderSmall content card {{layoutConfig.colors.menu.bgColor}} {{layoutConfig.colors.menu.fontColor}}">
	    <div class="toolbar">	        
	        	
	        <div class="toolbar__left ">
	        	<a href="#sidr-left" class="btnMenuMobile-left">
		            <button class="btn btn--l btn--black btn--icon " id="btnMenuPrincipal"  lx-ripple>
		                <i class="mdi mdi-menu {{layoutConfig.colors.menu.fontColor}}"></i>
		            </button>
	            </a>
	        </div>
	        <div class="toolbar__center ">
	        	<span class="toolbar__label fs-title">Lorem Ipsum</span>
	        </div>
	    </div>
    </div>
    <div class="row no-margin">
    	<div class="col-md-2 col-lg-2 no-margin no-padding headderLarge">
    		<span class="toolbar__label fs-title">Lorem Ipsum</span>
    	</div>
    	<div class="col-md-10 col-lg-10 no-margin no-padding flexnav-content">
			<ul data-breakpoint="975" class="flexnav  " >
			  <li><a href="">Item 1</a>
			    <ul>
			      <li> <a href="#content">Sub 1 Item 1</a></li>
			      <li><a href="/">Sub 1 Item 2</a></li>
			      <li><a href="/">Sub 1 Item 3</a></li>
			      <li><a href="/">Sub 1 Item 4</a></li>
			    </ul>
			  </li>
			  <li><a href="">Item 1</a>
			    <ul>
			      <li> <a href="#content">Sub 1 Item 1</a></li>
			      <li><a href="/">Sub 1 Item 2</a></li>
			      <li><a href="/">Sub 1 Item 3</a></li>
			      <li><a href="/">Sub 1 Item 4</a></li>
			    </ul>
			  </li>
			  <li><a href="">Item 1</a>
			    <ul>
			      <li> <a href="#content">Sub 1 Item 1</a></li>
			      <li><a href="/">Sub 1 Item 2</a></li>
			      <li><a href="/">Sub 1 Item 3</a></li>
			      <li><a href="/">Sub 1 Item 4</a></li>
			    </ul>
			  </li>
			  <li><a href="">Item 1</a>
			    <ul>
			      <li> <a href="#content">Sub 1 Item 1</a></li>
			      <li><a href="/">Sub 1 Item 2</a></li>
			      <li><a href="/">Sub 1 Item 3</a></li>
			      <li><a href="/">Sub 1 Item 4</a></li>
			    </ul>
			  </li>
			</ul>
		</div>
	</div>
</nav>
    