package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
class metgxyhuhe extends Binder {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final iobyxmoadg f24457eablkybsjg;

    interface iobyxmoadg {
        Task iobyxmoadg(Intent intent);
    }

    metgxyhuhe(iobyxmoadg iobyxmoadgVar) {
        this.f24457eablkybsjg = iobyxmoadgVar;
    }

    void ppxfxbqfkf(final uwvvkdfqfp.iobyxmoadg iobyxmoadgVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f24457eablkybsjg.iobyxmoadg(iobyxmoadgVar.f24498iobyxmoadg).addOnCompleteListener(new l5.zoijcleaow(), new OnCompleteListener() { // from class: com.google.firebase.messaging.xrmfcynszj
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                iobyxmoadgVar.wkgbmnqykc();
            }
        });
    }
}
