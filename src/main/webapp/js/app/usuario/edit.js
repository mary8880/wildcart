'use strict'





moduleUsuario.controller('usuarioEditController', ['$scope', '$http', '$location', 'toolService', '$routeParams',
    function ($scope, $http, $location, toolService, $routeParams) {
        $scope.id = $routeParams.id;
        $scope.ruta = $location.path();

        $scope.mostrar = false;
        $scope.activar = true;
        $scope.ajaxData = "";

        $scope.obj = null;
        $scope.ob = 'usuario';
        $scope.op = 'edit';
        $scope.result = null;
        $scope.title = "Edición de usuario";
        $scope.icon = "fa-file-text-o";







        $http({
            method: 'GET',
            //withCredentials: true,
            url: 'json?ob=usuario&op=get&id=' + $scope.id
        }).then(function (response) {
            $scope.status = response.status;
            $scope.data = response.data.message;
        }, function (response) {
            $scope.data = response.data.message || 'Request failed';
            $scope.status = response.status;
        });


        $scope.save = function () {
            $http({
                method: 'GET',
                url: 'json?ob=tipousuario&op=update&id=2',
                data: {json: JSON.stringify($scope.obj)}
            }).then(function (response) {
                $scope.status = response.status;
                $scope.ajaxData = response.data.message;
            }, function (response) {
                $scope.ajaxData = response.data.message || 'Request failed';
                $scope.status = response.status;
            });

        };


        $scope.tipoUsuarioRefresh = function (f, consultar) {
            var form = f;
            if (consultar) {
                $http({
                    method: 'GET',
                    //withCredentials: true,
                    url: 'json?ob=tipousuario&op=get&id=' + $scope.data.obj_tipoUsuario.id
                }).then(function (response) {
                    //$scope.status = response.status;
                    $scope.data.obj_tipoUsuario = response.data.message;
                    form.outerForm.obj_tipousuario.$setValidity('valid', true);
                }, function (response) {
//                $scope.data = response.data.message || 'Request failed';
                    //$scope.status = response.status;
                    form.outerForm.obj_tipousuario.$setValidity('valid', false);
                    //$scope.outerForm.obj_tipousuario.$setValidity('exists', false);
                });
            } else {
                form.outerForm.obj_tipousuario.$setValidity('valid', true);
            }


        }




        $scope.back = function () {
            window.history.back();
        };
        $scope.close = function () {
            $location.path('/home');
        };
        $scope.plist = function () {
            $location.path('/usuario/plist');
        };



    }]);