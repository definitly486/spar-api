package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class rgvfuqvkyq {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static eablkybsjg f8376lqeggnwhkg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static String f8378wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f8379iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final NotificationManager f8380zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f8377ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static Set f8374eablkybsjg = new HashSet();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final Object f8375gxszxtbevo = new Object();

    private static class eablkybsjg implements Handler.Callback, ServiceConnection {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final Handler f8383jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final HandlerThread f8384yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Context f8385zdlpuopuiu;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final Map f8382iwizpuwonk = new HashMap();

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private Set f8381cqumvgiudr = new HashSet();

        private static class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final ComponentName f8387iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            zoijcleaow.iobyxmoadg f8388ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            boolean f8390zoijcleaow = false;

            /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
            ArrayDeque f8389wkgbmnqykc = new ArrayDeque();

            /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
            int f8386eablkybsjg = 0;

            iobyxmoadg(ComponentName componentName) {
                this.f8387iobyxmoadg = componentName;
            }
        }

        eablkybsjg(Context context) {
            this.f8385zdlpuopuiu = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f8384yggfygwlhe = handlerThread;
            handlerThread.start();
            this.f8383jyumaefscl = new Handler(handlerThread.getLooper(), this);
        }

        private void btonecajqb() {
            Set setEablkybsjg = rgvfuqvkyq.eablkybsjg(this.f8385zdlpuopuiu);
            if (setEablkybsjg.equals(this.f8381cqumvgiudr)) {
                return;
            }
            this.f8381cqumvgiudr = setEablkybsjg;
            List<ResolveInfo> listQueryIntentServices = this.f8385zdlpuopuiu.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setEablkybsjg.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f8382iwizpuwonk.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f8382iwizpuwonk.put(componentName2, new iobyxmoadg(componentName2));
                }
            }
            Iterator it = this.f8382iwizpuwonk.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    zoijcleaow((iobyxmoadg) entry.getValue());
                    it.remove();
                }
            }
        }

        private void dxjokdxxww(iobyxmoadg iobyxmoadgVar) {
            if (this.f8383jyumaefscl.hasMessages(3, iobyxmoadgVar.f8387iobyxmoadg)) {
                return;
            }
            int i13 = iobyxmoadgVar.f8386eablkybsjg;
            int i14 = i13 + 1;
            iobyxmoadgVar.f8386eablkybsjg = i14;
            if (i14 <= 6) {
                int i15 = (1 << i13) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i15 + " ms");
                }
                this.f8383jyumaefscl.sendMessageDelayed(this.f8383jyumaefscl.obtainMessage(3, iobyxmoadgVar.f8387iobyxmoadg), i15);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + iobyxmoadgVar.f8389wkgbmnqykc.size() + " tasks to " + iobyxmoadgVar.f8387iobyxmoadg + " after " + iobyxmoadgVar.f8386eablkybsjg + " retries");
            iobyxmoadgVar.f8389wkgbmnqykc.clear();
        }

        private void eablkybsjg(ComponentName componentName, IBinder iBinder) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f8382iwizpuwonk.get(componentName);
            if (iobyxmoadgVar != null) {
                iobyxmoadgVar.f8388ppxfxbqfkf = zoijcleaow.iobyxmoadg.AbstractBinderC3342iobyxmoadg.wflxmlrfwp(iBinder);
                iobyxmoadgVar.f8386eablkybsjg = 0;
                lqeggnwhkg(iobyxmoadgVar);
            }
        }

        private void gxszxtbevo(ComponentName componentName) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f8382iwizpuwonk.get(componentName);
            if (iobyxmoadgVar != null) {
                zoijcleaow(iobyxmoadgVar);
            }
        }

        private boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar.f8390zoijcleaow) {
                return true;
            }
            boolean zBindService = this.f8385zdlpuopuiu.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(iobyxmoadgVar.f8387iobyxmoadg), this, 33);
            iobyxmoadgVar.f8390zoijcleaow = zBindService;
            if (zBindService) {
                iobyxmoadgVar.f8386eablkybsjg = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + iobyxmoadgVar.f8387iobyxmoadg);
                this.f8385zdlpuopuiu.unbindService(this);
            }
            return iobyxmoadgVar.f8390zoijcleaow;
        }

        private void lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + iobyxmoadgVar.f8387iobyxmoadg + ", " + iobyxmoadgVar.f8389wkgbmnqykc.size() + " queued tasks");
            }
            if (iobyxmoadgVar.f8389wkgbmnqykc.isEmpty()) {
                return;
            }
            if (!iobyxmoadg(iobyxmoadgVar) || iobyxmoadgVar.f8388ppxfxbqfkf == null) {
                dxjokdxxww(iobyxmoadgVar);
                return;
            }
            while (true) {
                gxszxtbevo gxszxtbevoVar = (gxszxtbevo) iobyxmoadgVar.f8389wkgbmnqykc.peek();
                if (gxszxtbevoVar == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + gxszxtbevoVar);
                    }
                    gxszxtbevoVar.iobyxmoadg(iobyxmoadgVar.f8388ppxfxbqfkf);
                    iobyxmoadgVar.f8389wkgbmnqykc.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + iobyxmoadgVar.f8387iobyxmoadg);
                    }
                } catch (RemoteException e13) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + iobyxmoadgVar.f8387iobyxmoadg, e13);
                }
            }
            if (iobyxmoadgVar.f8389wkgbmnqykc.isEmpty()) {
                return;
            }
            dxjokdxxww(iobyxmoadgVar);
        }

        private void ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            btonecajqb();
            for (iobyxmoadg iobyxmoadgVar : this.f8382iwizpuwonk.values()) {
                iobyxmoadgVar.f8389wkgbmnqykc.add(gxszxtbevoVar);
                lqeggnwhkg(iobyxmoadgVar);
            }
        }

        private void wkgbmnqykc(ComponentName componentName) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f8382iwizpuwonk.get(componentName);
            if (iobyxmoadgVar != null) {
                lqeggnwhkg(iobyxmoadgVar);
            }
        }

        private void zoijcleaow(iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar.f8390zoijcleaow) {
                this.f8385zdlpuopuiu.unbindService(this);
                iobyxmoadgVar.f8390zoijcleaow = false;
            }
            iobyxmoadgVar.f8388ppxfxbqfkf = null;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i13 = message.what;
            if (i13 == 0) {
                ppxfxbqfkf((gxszxtbevo) message.obj);
                return true;
            }
            if (i13 == 1) {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) message.obj;
                eablkybsjg(wkgbmnqykcVar.f8395iobyxmoadg, wkgbmnqykcVar.f8396zoijcleaow);
                return true;
            }
            if (i13 == 2) {
                gxszxtbevo((ComponentName) message.obj);
                return true;
            }
            if (i13 != 3) {
                return false;
            }
            wkgbmnqykc((ComponentName) message.obj);
            return true;
        }

        public void nufgyqmvbu(gxszxtbevo gxszxtbevoVar) {
            this.f8383jyumaefscl.obtainMessage(0, gxszxtbevoVar).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f8383jyumaefscl.obtainMessage(1, new wkgbmnqykc(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f8383jyumaefscl.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface gxszxtbevo {
        void iobyxmoadg(zoijcleaow.iobyxmoadg iobyxmoadgVar);
    }

    static class iobyxmoadg {
        static boolean iobyxmoadg(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    private static class ppxfxbqfkf implements gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final String f8391iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final String f8392ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final Notification f8393wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final int f8394zoijcleaow;

        ppxfxbqfkf(String str, int i13, String str2, Notification notification) {
            this.f8391iobyxmoadg = str;
            this.f8394zoijcleaow = i13;
            this.f8392ppxfxbqfkf = str2;
            this.f8393wkgbmnqykc = notification;
        }

        @Override // androidx.core.app.rgvfuqvkyq.gxszxtbevo
        public void iobyxmoadg(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
            iobyxmoadgVar.gtknphoqwx(this.f8391iobyxmoadg, this.f8394zoijcleaow, this.f8392ppxfxbqfkf, this.f8393wkgbmnqykc);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f8391iobyxmoadg + ", id:" + this.f8394zoijcleaow + ", tag:" + this.f8392ppxfxbqfkf + "]";
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final ComponentName f8395iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final IBinder f8396zoijcleaow;

        wkgbmnqykc(ComponentName componentName, IBinder iBinder) {
            this.f8395iobyxmoadg = componentName;
            this.f8396zoijcleaow = iBinder;
        }
    }

    static class zoijcleaow {
        static NotificationChannel iobyxmoadg(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }
    }

    private rgvfuqvkyq(Context context) {
        this.f8379iobyxmoadg = context;
        this.f8380zoijcleaow = (NotificationManager) context.getSystemService("notification");
    }

    private static boolean btonecajqb(Notification notification) {
        Bundle bundleIobyxmoadg = wflxmlrfwp.iobyxmoadg(notification);
        return bundleIobyxmoadg != null && bundleIobyxmoadg.getBoolean("android.support.useSideChannel");
    }

    private void dxjokdxxww(gxszxtbevo gxszxtbevoVar) {
        synchronized (f8375gxszxtbevo) {
            try {
                if (f8376lqeggnwhkg == null) {
                    f8376lqeggnwhkg = new eablkybsjg(this.f8379iobyxmoadg.getApplicationContext());
                }
                f8376lqeggnwhkg.nufgyqmvbu(gxszxtbevoVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Set eablkybsjg(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f8377ppxfxbqfkf) {
            if (string != null) {
                try {
                    if (!string.equals(f8378wkgbmnqykc)) {
                        String[] strArrSplit = string.split(StringUtils.PROCESS_POSTFIX_DELIMITER, -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f8374eablkybsjg = hashSet;
                        f8378wkgbmnqykc = string;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            set = f8374eablkybsjg;
        }
        return set;
    }

    public static rgvfuqvkyq wkgbmnqykc(Context context) {
        return new rgvfuqvkyq(context);
    }

    public NotificationChannel gxszxtbevo(String str) {
        return zoijcleaow.iobyxmoadg(this.f8380zoijcleaow, str);
    }

    public boolean iobyxmoadg() {
        return iobyxmoadg.iobyxmoadg(this.f8380zoijcleaow);
    }

    public void lqeggnwhkg(int i13, Notification notification) {
        nufgyqmvbu(null, i13, notification);
    }

    public void nufgyqmvbu(String str, int i13, Notification notification) {
        if (!btonecajqb(notification)) {
            this.f8380zoijcleaow.notify(str, i13, notification);
        } else {
            dxjokdxxww(new ppxfxbqfkf(this.f8379iobyxmoadg.getPackageName(), i13, str, notification));
            this.f8380zoijcleaow.cancel(str, i13);
        }
    }

    public void ppxfxbqfkf(String str, int i13) {
        this.f8380zoijcleaow.cancel(str, i13);
    }

    public void zoijcleaow(int i13) {
        ppxfxbqfkf(null, i13);
    }
}
