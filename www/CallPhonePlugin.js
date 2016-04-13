var exec = require('cordova/exec');

CallPhonePlugin = {}

CallPhonePlugin.call = function(phoneNumber, success, error) {
    exec(success, error, "CallPhonePlugin", "call", [phoneNumber]);
}

