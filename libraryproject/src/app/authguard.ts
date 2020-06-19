import { CanActivate,ActivatedRouteSnapshot } from '@angular/router';
import {  Injectable } from '@angular/core';

@Injectable({
    providedIn:'root'
})
export class AuthGuard implements CanActivate{
    canActivate(route:ActivatedRouteSnapshot){
        const expectedRoles=route.data.role;
        const loginUser=JSON.parse(localStorage.getItem('userDetails'));
        let role;
        for(let index in expectedRoles){
            if(expectedRoles[index]=== loginUser.userDetails.role){
                role=expectedRoles[index];
            }
        }
        if(loginUser && loginUser.userDetails.role===role){
            return true;
        }else{
            return false;
        }
    }
}