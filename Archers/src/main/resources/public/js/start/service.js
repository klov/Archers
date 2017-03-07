'use strict';

App.factory('Service', ['$http', '$q', '$document', function ($http, $q, $document) {

        self.headers = {};
        self.csrf = $document[0].querySelector("meta[name='_csrf']").getAttribute('content');
        self.csrfHeaderName = $document[0].querySelector("meta[name='_csrf_header']").getAttribute('content');
        self.headers[self.csrfHeaderName] = self.csrf;
        self.headers["Content-Type"] = 'application/json';
        self.form_multiplay_header = {};
        self.form_multiplay_header[self.csrfHeaderName] = self.csrf;
        self.form_multiplay_header['Content-Type'] = undefined;
        return {
            login: function (name, password) {
                var fd = new FormData();
                fd.append('username', name);
                fd.append('password', password);
                return $http({
                    url: '/archers/login',
                    method: 'POST',
                    data: fd,
                    headers: self.form_multiplay_header,
                    transformRequest: angular.identity
                }).then(
                        function (response) {
                            return response.data;
                        },
                        function (errResponse) {
                            console.error('Error while creating page');
                            return $q.reject(errResponse);
                        }
                );

            }
        };
    }]);