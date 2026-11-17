package jq1;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import iq1.zoijcleaow;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements zoijcleaow {
    private final boolean gxszxtbevo(Bundle bundle) {
        Status status;
        return (bundle == null || (status = (Status) bundle.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) == null || status.getStatusCode() != 0) ? false : true;
    }

    @Override // iq1.zoijcleaow
    public IntentFilter eablkybsjg() {
        return new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION);
    }

    @Override // iq1.zoijcleaow
    public Intent iobyxmoadg(Bundle extras) {
        zdlpuopuiu.btonecajqb(extras, "extras");
        return (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT);
    }

    @Override // iq1.zoijcleaow
    public String ppxfxbqfkf(Intent data) {
        zdlpuopuiu.btonecajqb(data, "data");
        String stringExtra = data.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE);
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // iq1.zoijcleaow
    public void wkgbmnqykc(Activity activity) {
        zdlpuopuiu.btonecajqb(activity, "activity");
        SmsRetriever.getClient(activity).startSmsUserConsent(null);
    }

    @Override // iq1.zoijcleaow
    public boolean zoijcleaow(Intent intent) {
        zdlpuopuiu.btonecajqb(intent, "intent");
        return zdlpuopuiu.eablkybsjg(intent.getAction(), SmsRetriever.SMS_RETRIEVED_ACTION) && gxszxtbevo(intent.getExtras());
    }
}
