package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import androidx.activity.result.IntentSenderRequest;
import eablkybsjg.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
final class zac implements DialogInterface.OnClickListener {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ zoijcleaow zac;
    final /* synthetic */ GoogleApiAvailability zad;

    zac(GoogleApiAvailability googleApiAvailability, Activity activity, int i13, zoijcleaow zoijcleaowVar) {
        this.zad = googleApiAvailability;
        this.zaa = activity;
        this.zab = i13;
        this.zac = zoijcleaowVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i13) {
        dialogInterface.dismiss();
        PendingIntent errorResolutionPendingIntent = this.zad.getErrorResolutionPendingIntent(this.zaa, this.zab, 0);
        if (errorResolutionPendingIntent == null) {
            return;
        }
        this.zac.iobyxmoadg(new IntentSenderRequest.iobyxmoadg(errorResolutionPendingIntent.getIntentSender()).iobyxmoadg());
    }
}
