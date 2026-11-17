package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
class eablkybsjg implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    final TaskCompletionSource f24268iobyxmoadg;

    public eablkybsjg(TaskCompletionSource taskCompletionSource) {
        this.f24268iobyxmoadg = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.lqeggnwhkg
    public boolean iobyxmoadg(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.lqeggnwhkg
    public boolean zoijcleaow(vc.wkgbmnqykc wkgbmnqykcVar) {
        if (!wkgbmnqykcVar.draadjrbmk() && !wkgbmnqykcVar.gtknphoqwx() && !wkgbmnqykcVar.dxjokdxxww()) {
            return false;
        }
        this.f24268iobyxmoadg.trySetResult(wkgbmnqykcVar.wkgbmnqykc());
        return true;
    }
}
