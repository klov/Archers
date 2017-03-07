'use strict';

App.factory('MainService', ['$http', '$q','$document', function ($http, $q, $document) {

        self.headers = {};
        self.csrf = $document[0].querySelector("meta[name='_csrf']").getAttribute('content');
        self.csrfHeaderName = $document[0].querySelector("meta[name='_csrf_header']").getAttribute('content');      
        self.headers["Content-Type"] = 'application/json';
        self.headers[self.csrfHeaderName] = self.csrf;
        self.headers["Content-Type"] = 'application/json';
        return {
            createGame: function (game) {
                return $http.post('/archers/games/item',
                        JSON.stringify(game),{headers:self.headers})
                        .then(
                                function (response) {
                                    return response.data;
                                },
                                function (errResponse) {
                                    console.error('Error while creating game');
                                    return $q.reject(errResponse);
                                }
                        );
            },
            updateGame: function (command) {
                return $http.put('/archers/games/item',
                        JSON.stringify(command),{headers:self.headers})
                        .then(
                                function (response) {
                                    return response.data;
                                },
                                function (errResponse) {
                                    console.error('Error while updating game');
                                    return $q.reject(errResponse);
                                }
                        );
            }

        };
    }]);


