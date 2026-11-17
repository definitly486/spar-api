package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Object f24506ppxfxbqfkf = new Object();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static uwvvkdfqfp f24507wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f24508iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Executor f24509zoijcleaow = new l5.zoijcleaow();

    public wflxmlrfwp(Context context) {
        this.f24508iobyxmoadg = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task btonecajqb(Context context, Intent intent, boolean z13, Task task) {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? eablkybsjg(context, intent, z13).continueWith(new l5.zoijcleaow(), new Continuation() { // from class: com.google.firebase.messaging.gtknphoqwx
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return wflxmlrfwp.dxjokdxxww(task2);
            }
        }) : task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer dxjokdxxww(Task task) {
        return Integer.valueOf(OkHttpErrorHandlerImpl.HTTP_ACCESS_DENIED);
    }

    private static Task eablkybsjg(Context context, Intent intent, boolean z13) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        uwvvkdfqfp uwvvkdfqfpVarGxszxtbevo = gxszxtbevo(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z13) {
            return uwvvkdfqfpVarGxszxtbevo.ppxfxbqfkf(intent).continueWith(new l5.zoijcleaow(), new Continuation() { // from class: com.google.firebase.messaging.draadjrbmk
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return wflxmlrfwp.lqeggnwhkg(task);
                }
            });
        }
        if (mbcevpiqjq.zoijcleaow().eablkybsjg(context)) {
            jztzpxfvev.gxszxtbevo(context, uwvvkdfqfpVarGxszxtbevo, intent);
        } else {
            uwvvkdfqfpVarGxszxtbevo.ppxfxbqfkf(intent);
        }
        return Tasks.forResult(-1);
    }

    private static uwvvkdfqfp gxszxtbevo(Context context, String str) {
        uwvvkdfqfp uwvvkdfqfpVar;
        synchronized (f24506ppxfxbqfkf) {
            try {
                if (f24507wkgbmnqykc == null) {
                    f24507wkgbmnqykc = new uwvvkdfqfp(context, str);
                }
                uwvvkdfqfpVar = f24507wkgbmnqykc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uwvvkdfqfpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lqeggnwhkg(Task task) {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer nufgyqmvbu(Context context, Intent intent) {
        return Integer.valueOf(mbcevpiqjq.zoijcleaow().lqeggnwhkg(context, intent));
    }

    public Task draadjrbmk(final Context context, final Intent intent) {
        boolean z13 = PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z14 = (intent.getFlags() & 268435456) != 0;
        return (!z13 || z14) ? Tasks.call(this.f24509zoijcleaow, new Callable() { // from class: com.google.firebase.messaging.dxjokdxxww
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return wflxmlrfwp.nufgyqmvbu(context, intent);
            }
        }).continueWithTask(this.f24509zoijcleaow, new Continuation() { // from class: com.google.firebase.messaging.btonecajqb
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return wflxmlrfwp.btonecajqb(context, intent, z14, task);
            }
        }) : eablkybsjg(context, intent, z14);
    }

    public Task gtknphoqwx(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return draadjrbmk(this.f24508iobyxmoadg, intent);
    }
}
