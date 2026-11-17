package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import ba.iobyxmoadg;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import q9.rgvfuqvkyq;
import q9.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zoijcleaow() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i13 = intent.getExtras().getInt("attemptNumber");
        yggfygwlhe.gxszxtbevo(context);
        rgvfuqvkyq.iobyxmoadg iobyxmoadgVarWkgbmnqykc = rgvfuqvkyq.iobyxmoadg().zoijcleaow(queryParameter).wkgbmnqykc(iobyxmoadg.zoijcleaow(iIntValue));
        if (queryParameter2 != null) {
            iobyxmoadgVarWkgbmnqykc.ppxfxbqfkf(Base64.decode(queryParameter2, 0));
        }
        yggfygwlhe.ppxfxbqfkf().eablkybsjg().jyumaefscl(iobyxmoadgVarWkgbmnqykc.iobyxmoadg(), i13, new Runnable() { // from class: x9.iobyxmoadg
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.zoijcleaow();
            }
        });
    }
}
