app.controller('tourController', ['$scope', '$http', '$window', '$filter', '$timeout', function ($scope, $http, $window, $filter, $timeout) {

    $scope.init = function () {
        // inital form variables
        $scope.selectAsia = true;
        $scope.selectEurope = false;
        $scope.selectOME = false;
        $scope.selectAmerica = false;
        $scope.selectUD = false;
    }

    $scope.showAsia = function () {
        $scope.selectAsia = true;
        $scope.selectEurope = false;
        $scope.selectOME = false;
        $scope.selectAmerica = false;
        $scope.selectUD = false;
    }

    $scope.showEurope = function () {
        $scope.selectAsia = false;
        $scope.selectEurope = true;
        $scope.selectOME = false;
        $scope.selectAmerica = false;
        $scope.selectUD = false;
    }

    $scope.showOME = function () {
        $scope.selectAsia = false;
        $scope.selectEurope = false;
        $scope.selectOME = true;
        $scope.selectAmerica = false;
        $scope.selectUD = false;
    }

    $scope.showAmerica = function () {
        $scope.selectAsia = false;
        $scope.selectEurope = false;
        $scope.selectOME = false;
        $scope.selectAmerica = true;
        $scope.selectUD = false;
    }

    $scope.showUD = function () {
        $scope.selectAsia = false;
        $scope.selectEurope = false;
        $scope.selectOME = false;
        $scope.selectAmerica = false;
        $scope.selectUD = true;
    }


}]);