package spay.sdk.utils.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import kk.dt;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lspay/sdk/utils/receiver/OtpReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "npi/spay/ee", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OtpReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dt f107847a;

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Status status;
        zdlpuopuiu.btonecajqb(intent, "intent");
        if (intent.getAction() == SmsRetriever.SMS_RETRIEVED_ACTION) {
            Bundle extras = intent.getExtras();
            if (Build.VERSION.SDK_INT >= 33) {
                if (extras != null) {
                    status = (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class);
                } else {
                    status = null;
                }
            } else if (extras != null) {
                status = (Status) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            } else {
                status = null;
            }
            Integer numValueOf = status != null ? Integer.valueOf(status.getStatusCode()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                Intent intent2 = extras != null ? (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT) : null;
                dt dtVar = this.f107847a;
                if (dtVar == null || intent2 == null) {
                    return;
                }
                dtVar.f56325iobyxmoadg.startActivityForResult(intent2, 200);
            }
        }
    }
}
