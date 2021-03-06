 
   var app = angular.module("PhotoApp", [ "ngResource", 'ngRoute']); 
   
   app.config(
        function($routeProvider){
            $routeProvider
                    .when("/main", 
            {
                templateUrl:"templates/main.html",
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
                    .when("/newEvent",
             {
                 templateUrl:"templates/NewEvent.html",
                 controller:"EditEvenController"
             }) 
                     .when("/eventDetails",
             {
                 templateUrl:"templates/EventDetails.html",
                 controller:"EventController.js"                 
             })
             ;
            $routeProvider.otherwise({redirectTo: '/main'});           
        } 
  );  