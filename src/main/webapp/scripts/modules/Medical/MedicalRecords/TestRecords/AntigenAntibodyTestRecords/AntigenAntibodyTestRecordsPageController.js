app.controller('AntigenAntibodyTestRecordsPageController', function($scope, $state, $stateParams, $filter, ngTableParams, AntigenAntibodyTestRecord) {

  $scope.$stateParams = $stateParams;

  $scope.tableParams = new ngTableParams({
    page: 1,
    count: 25
  },{
    counts: [],
    getData: function($defer, params) {
      var query = $filter('hppcParamsFilter')(params);
      query['match-parentForm'] = $stateParams.id;
      AntigenAntibodyTestRecord.query(query, function (data, responseHeaders) {
        params.total(parseInt(responseHeaders('total')));
        $defer.resolve(data);
        params.$selection = null;
      });
    }
  });

  $scope.select = function(record) {
    $scope.tableParams.$selection = record;
  };

  $scope.edit = function(record) {
    $state.go('medical.record.antigen-antibody-test-record', {
      id: $stateParams.id,
      tid: record.id
    });
  };
});