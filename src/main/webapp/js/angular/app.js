 
   var app = angular.module("PhotoApp", [ "ngResource"]); 
   
   app.config(
        function($routeProvider){
            $routeProvider
                    .when("/main", 
            {
                templateUrl:"index.html",
                controller:"MainController"
            })
                    .when("/account/login",
            {
                templateUrl:"login.html",
                controller:"AccountController"
            })  
                    .when("/about",
            {
                templateUrl:"templates/about.html",
                controller:"MainController" 
            })
                   .otherwise({redirectTo: '/main'});
           
           
            $routeProvider.otherwise({redirectTo: '/main'});
        } 
  );  