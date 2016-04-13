var exec = require('cordova/exec');

exports.coolMethod = function(arg0, success, error) {
    exec(success, error, "CallPhonePlugin", "coolMethod", [arg0]);
};

exports.call = function(phoneNumber){
    exec(success, error, "CallPhonePlugin", "call", [phoneNumber]);
}