package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import g6.cllcsxoeiz;
import g6.cqumvgiudr;
import g6.yggfygwlhe;

/* JADX INFO: loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f13946iobyxmoadg = yggfygwlhe.dxjokdxxww("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        yggfygwlhe.eablkybsjg().iobyxmoadg(f13946iobyxmoadg, "Requesting diagnostics");
        try {
            cllcsxoeiz.nufgyqmvbu(context).ppxfxbqfkf(cqumvgiudr.eablkybsjg(DiagnosticsWorker.class));
        } catch (IllegalStateException e13) {
            yggfygwlhe.eablkybsjg().wkgbmnqykc(f13946iobyxmoadg, "WorkManager is not initialized", e13);
        }
    }
}
