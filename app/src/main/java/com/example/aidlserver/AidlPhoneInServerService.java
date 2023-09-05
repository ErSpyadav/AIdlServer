package com.example.aidlserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AidlPhoneInServerService extends Service {
    public AidlPhoneInServerService() {
    }

    private final IAidlPhoneInService.Stub binder = new IAidlPhoneInService.Stub() {
        @Override
        public int getCallDetai() throws RemoteException {
            return 4;
        }

        @Override
        public String getMobile() throws RemoteException {
            return "7676779531";
        }
    };

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }


}