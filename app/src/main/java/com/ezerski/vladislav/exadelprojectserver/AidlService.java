package com.ezerski.vladislav.exadelprojectserver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

public class AidlService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private final IAidlInterface.Stub mBinder = new IAidlInterface.Stub() {
        @Override
        public int numberSquare(int firstNum) throws RemoteException {
            return firstNum * firstNum;
        }
    };
}