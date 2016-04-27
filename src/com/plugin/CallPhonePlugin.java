package com.plugin;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by liuminhan on 16-4-13.
 */
public class CallPhonePlugin extends CordovaPlugin{

    private final static String CALL = "call";
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext)
           throws JSONException {
        if(action.equalsIgnoreCase(CALL)) {
            String phoneNumber = args.getString(0).trim();
            callPhone(phoneNumber, callbackContext);
        }
        return true;
    }

    private void callPhone(String phoneNumber, CallbackContext callbackContext) {
        callbackContext.success("call phone success");
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        cordova.getActivity().startActivity(intent);
    }
}
