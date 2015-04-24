<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="col-md-12" ng-init="init()">
	<title-page>{{titlePage}}</title-page>
	
	<a href="#/contato">Contato</a>
	 
	<div id="message-1" class="tools-message tools-message-blue">
		Bender! Ship! Stop bickering or I'm going to come back there and change your opinions manually! Take me to your leader!
	
	</div>
	
	<button class="btn btn--m btn--black btn--flat" ng-click="opendDialog('test')" lx-ripple>Open dialog</button>
	
	<lx-dialog class="dialog dialog--l" id="test" onclose="closingDialog()">
	    <div class="dialog__header">
	        <div class="toolbar bgc-light-blue-500 pl++">
	            <span class="toolbar__label tc-white fs-title">
	                Lorem Ipsum
	            </span>
	
	            <div class="toolbar__right">
	                <button class="btn btn--l btn--white btn--icon" lx-ripple ng-click="addPerson()">
	                    <i class="mdi mdi-plus"></i>
	                </button>
	            </div>
	        </div>
	    </div>
	
	    <div class="dialog__content">
	        <lx-tabs links-tc="light" links-bgc="light-blue-500" indicator="yellow-500" no-divider="true" layout="inline">
	            <lx-tab heading="Lorem Ipsum 1">
	                <div class="p++">
	                    <div ng-repeat="person in people">
	                        {{ person.name }} - {{ person.email }} - {{ person.age }}
	                    </div>
	                </div>
	            </lx-tab>
	
	            <lx-tab heading="Lorem Ipsum 2">
	                <p class="p++">Lorem Ipsum Content 2</p>
	            </lx-tab>
	
	            <lx-tab heading="Lorem Ipsum 3">
	                <p class="p++">Lorem Ipsum Content 3</p>
	            </lx-tab>
	        </lx-tabs>
	    </div>
	
	    <div class="dialog__actions">
	        <button class="btn btn--m btn--black btn--flat" lx-ripple lx-dialog-close>Cancel</button>
	        <button class="btn btn--m btn--black btn--flat" lx-ripple>Lorem Ipsum</button>
	    </div>
	</lx-dialog>
	
	<div flex-container="row">
	    <div flex-item>
	        <lx-text-field label="Company" disabled="true">
	            <input type="text" ng-model="textFields.disabled" ng-disabled="true">
	        </lx-text-field>
	    </div>
	</div>
	
	<div flex-container="row" flex-gutter="24">
	    <div flex-item>
	        <lx-text-field label="Last name">
	            <input type="text" ng-model="textFields.lastName">
	        </lx-text-field>
	    </div>
	
	    <div flex-item>
	        <lx-text-field label="First name">
	            <input type="text" ng-model="textFields.firstName">
	        </lx-text-field>
	    </div>
	</div>
	
	<div flex-container="row" flex-gutter="24">
	    <div flex-item>
	        <lx-text-field label="Email" error="!emailValidation(textFields.firstEmail)">
	            <input type="email" ng-model="textFields.firstEmail">
	        </lx-text-field>
	    </div>
	
	    <div flex-item>
	        <lx-text-field label="Email" error="!emailValidation(textFields.secondEmail)">
	            <input type="email" ng-model="textFields.secondEmail">
	        </lx-text-field>
	    </div>
	
	    <div flex-item>
	        <lx-text-field label="Repeat previous email"
	                       valid="emailValidation(textFields.secondEmail) && textFields.secondEmail === textFields.thirdEmail"
	                       error="!emailValidation(textFields.secondEmail) || textFields.secondEmail !== textFields.thirdEmail">
	            <input type="email" ng-model="textFields.thirdEmail">
	        </lx-text-field>
	    </div>
	</div>
	<div class="tc-white-1 mt++" flex-container="row" flex-gutter="24">
	    <div flex-item="2"><div class="p+ bgc-red-500">[flex-item="2"]</div></div>
	    <div flex-item="6"><div class="p+ bgc-blue-500">[flex-item="6"]</div></div>
	    <div flex-item="4"><div class="p+ bgc-green-500">[flex-item="4"]</div></div>
	</div>
	
	<div flex-container="row">
	    <div flex-item>
	        <span class="display-block">{{ textFields.description }}</span>
	
	        <lx-text-field label="Description">
	            <textarea ng-model="textFields.description"></textarea>
	        </lx-text-field>
	    </div>
	</div>
	
	<div class="mt++" flex-container="row" flex-gutter="24">
	    <div flex-item>
	        <form>
	            <lx-text-field label="First and last name" fixed-label="true" icon="account">
	                <input type="text" ng-model="textFields.fixedFirstName">
	            </lx-text-field>
	
	            <lx-text-field label="Phone number" fixed-label="true" icon="phone">
	                <input type="text" ng-model="textFields.fixedLastName">
	            </lx-text-field>
	
	            <lx-text-field label="Email address" fixed-label="true" icon="email">
	                <input type="email" ng-model="textFields.fixedEmail">
	            </lx-text-field>
	
	            <lx-text-field label="Location" fixed-label="true" icon="city">
	                <input type="text" ng-model="textFields.fixedAdress">
	            </lx-text-field>
	        </form>
	    </div>
	
	    <div flex-item>
	        <form>
	            <lx-text-field label="First name" fixed-label="true">
	                <input type="text" ng-model="textFields.fixedFirstName2">
	            </lx-text-field>
	
	            <lx-text-field label="Last name" fixed-label="true">
	                <input type="text" ng-model="textFields.fixedLastName2">
	            </lx-text-field>
	
	            <lx-text-field label="Email" fixed-label="true">
	                <input type="email" ng-model="textFields.fixedEmail2">
	            </lx-text-field>
	
	            <lx-text-field label="Address" fixed-label="true">
	                <input type="text" ng-model="textFields.fixedAdress2">
	            </lx-text-field>
	        </form>
	    </div>
	</div>
</div>
    
    
    
    
    