package ud;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;

/* JADX INFO: loaded from: classes2.dex */
public final class lmojexxdyd implements iozdgvuglv {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iobyxmoadg f113401zoijcleaow = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final com.google.firebase.gxszxtbevo f113402iobyxmoadg;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public lmojexxdyd(com.google.firebase.gxszxtbevo firebaseApp) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(firebaseApp, "firebaseApp");
        this.f113402iobyxmoadg = firebaseApp;
    }

    private final Object zoijcleaow(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (IllegalArgumentException e13) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e13));
        }
    }

    @Override // ud.iozdgvuglv
    public void iobyxmoadg(Messenger callback, ServiceConnection serviceConnection) {
        boolean zBindService;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(serviceConnection, "serviceConnection");
        Context applicationContext = this.f113402iobyxmoadg.gtknphoqwx().getApplicationContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", callback);
        intent.setPackage(applicationContext.getPackageName());
        try {
            zBindService = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e13) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e13);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        zoijcleaow(applicationContext, serviceConnection);
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
