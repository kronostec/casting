<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="card  "  >
    <div class="toolbar {{layoutConfig.colors.menu.bgColor}} {{layoutConfig.colors.menu.fontColor}} ">
        <div class="toolbar__left mr+++">
            <button class="btn btn--l {{layoutConfig.colors.menu.btnColor}} btn--icon" lx-ripple>
                <i class="mdi mdi-menu"></i>
            </button>
        </div>

        <span class="toolbar__label fs-title">Lorem Ipsum</span>

        <div class="toolbar__right">
            <lx-dropdown position="right"  from-top="false">
                <button class="btn btn--l {{layoutConfig.colors.menu.btnColor}} btn--icon" lx-ripple lx-dropdown-toggle>
                    <i class="mdi mdi-dots-vertical"></i>
                </button>
                <lx-dropdown-menu >
                    <ul target-fixed="div.dropdown-menu"  fixed-top="{{scrollTop}}" >
                        <li><a class="dropdown-link">Action</a></li>
                        <li><a class="dropdown-link">Another action</a></li>
                        <li><a class="dropdown-link">Something else here</a></li>
                        <li class="dropdown-divider"></li>
                        <li><a class="dropdown-link dropdown-link--is-header">Header</a></li>
                        <li><a class="dropdown-link">Separated link</a></li>
                    </ul>
                </lx-dropdown-menu>
            </lx-dropdown>
        </div>
    </div>
</div>

    