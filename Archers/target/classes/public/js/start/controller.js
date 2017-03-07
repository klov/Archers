'use strict';

App.controller('LoginController', ['$scope','Service','$location',
    function ($scope,Service,$location) {
        var self = this;
        var stompClient = null;
        var socket = null;
        self.username = null;
        self.password = null;

        self.login = function () {
            Service.login(self.username,self.password).then(function(response){
                var answer = response;
                
                console.log(answer);
            },function(errResponse){
                console.log(errResponse);
            });
        };

        self.disconnect = function () {
            if (stompClient !== null) {
                stompClient.disconnect();
            }
            console.log("Disconnected");
        };

        self.connectToServer = function () {
            self.connect(self.receive);
        };

        
        self.changeName = function(newName){
             localStorage.setItem('username', newName);
        };

    }]);


