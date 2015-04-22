<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="col-md-12" ng-init="init()">
	<title-page>{{titlePage}}</title-page>
	<a href="#/home">Home</a>
	
	<div flex-container="row" flex-gutter="24" >
	    <div flex-item ng-repeat="item in [0,1,2,3,4,5]">
	        <div class="card">
	            <div flex-container="row">
	                <div class="card__img card__img--left" style="height: 160px">
	                    <img src="resources/src/img/3-vertical.jpg">
	                </div>
	
	                <div flex-item flex-container="column">
	                    <div flex-item>
	                        <div class="p+">
	                            <strong class="fs-headline display-block">Lorem Ipsum</strong>
	                            <span class="fs-subhead tc-black-2 display-block">Lorem Ipsum</span>
	                        </div>
	                    </div>
	
	                    <div class="card__actions">
	                        <button class="btn btn--m btn--black btn--flat" lx-ripple>Free sample</button>
	                        <button class="btn btn--m btn--orange btn--flat" lx-ripple>Review</button>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	</div>
	<div>
	    <!-- Up direction -->
	    <div class="fab">
	        <button class="fab__primary btn btn--xl btn--blue btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="left">
	            <i class="mdi mdi-android"></i>
	            <i class="mdi mdi-plus"></i>
	        </button>
	
	        <div class="fab__actions fab__actions--up">
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="left"><i class="mdi mdi-delete"></i></button>
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="left"><i class="mdi mdi-package"></i></button>
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="left"><i class="mdi mdi-pencil"></i></button>
	        </div>
	    </div>
	
	    <!-- Down direction -->
	    <div class="fab ml">
	        <button class="fab__primary btn btn--xl btn--green btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="right">
	            <i class="mdi mdi-android"></i>
	            <i class="mdi mdi-plus"></i>
	        </button>
	
	        <div class="fab__actions fab__actions--down">
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="right"><i class="mdi mdi-pencil"></i></button>
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="right"><i class="mdi mdi-package"></i></button>
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="right"><i class="mdi mdi-delete"></i></button>
	        </div>
	    </div>
	</div>
	
	<div class="mt">
	    <!-- Left direction -->
	    <div class="fab">
	        <button class="fab__primary btn btn--xl btn--red btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="top">
	            <i class="mdi mdi-android"></i>
	            <i class="mdi mdi-plus"></i>
	        </button>
	
	        <div class="fab__actions fab__actions--left">
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="top"><i class="mdi mdi-delete"></i></button>
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="top"><i class="mdi mdi-package"></i></button>
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="top"><i class="mdi mdi-pencil"></i></button>
	        </div>
	    </div>
	
	    <!-- Right direction -->
	    <div class="fab ml">
	        <button class="fab__primary btn btn--xl btn--indigo btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="bottom">
	            <i class="mdi mdi-android"></i>
	            <i class="mdi mdi-plus"></i>
	        </button>
	
	        <div class="fab__actions fab__actions--right">
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="bottom"><i class="mdi mdi-pencil"></i></button>
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="bottom"><i class="mdi mdi-package"></i></button>
	            <button class="btn btn--l btn--black btn--fab" lx-ripple lx-tooltip="Lorem Ipsum" tooltip-position="bottom"><i class="mdi mdi-delete"></i></button>
	        </div>
	    </div>
	</div>
	
	<div class="dropup">
	  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-expanded="true">
	    Dropdown
	    <span class="caret"></span>
	  </button>
	  <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu2">
	    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Action</a></li>
	    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Another action</a></li>
	    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Something else here</a></li>
	    <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Separated link</a></li>
	  </ul>
	</div>
</div>    
    
    