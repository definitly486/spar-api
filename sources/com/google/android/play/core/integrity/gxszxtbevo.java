package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import wa.agtfadlqog;
import wa.draadjrbmk;

/* JADX INFO: loaded from: classes2.dex */
final class gxszxtbevo extends draadjrbmk {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final agtfadlqog f23585eablkybsjg = new agtfadlqog("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final TaskCompletionSource f23586gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    final /* synthetic */ lqeggnwhkg f23587lqeggnwhkg;

    gxszxtbevo(lqeggnwhkg lqeggnwhkgVar, TaskCompletionSource taskCompletionSource) {
        this.f23587lqeggnwhkg = lqeggnwhkgVar;
        this.f23586gxszxtbevo = taskCompletionSource;
    }

    @Override // wa.wflxmlrfwp
    public final void wkgbmnqykc(Bundle bundle) {
        this.f23587lqeggnwhkg.f23590ppxfxbqfkf.oxmwwwfdhm(this.f23586gxszxtbevo);
        this.f23585eablkybsjg.wkgbmnqykc("onRequestIntegrityToken", new Object[0]);
        int i13 = bundle.getInt("error");
        if (i13 != 0) {
            this.f23586gxszxtbevo.trySetException(new IntegrityServiceException(i13, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f23586gxszxtbevo.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        TaskCompletionSource taskCompletionSource = this.f23586gxszxtbevo;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        iobyxmoadgVar.iobyxmoadg(string);
        taskCompletionSource.trySetResult(iobyxmoadgVar.zoijcleaow());
    }
}
