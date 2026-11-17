package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
class wkgbmnqykc implements lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f24296iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TaskCompletionSource f24297zoijcleaow;

    public wkgbmnqykc(nufgyqmvbu nufgyqmvbuVar, TaskCompletionSource taskCompletionSource) {
        this.f24296iobyxmoadg = nufgyqmvbuVar;
        this.f24297zoijcleaow = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.lqeggnwhkg
    public boolean iobyxmoadg(Exception exc) {
        this.f24297zoijcleaow.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.lqeggnwhkg
    public boolean zoijcleaow(vc.wkgbmnqykc wkgbmnqykcVar) {
        if (!wkgbmnqykcVar.gtknphoqwx() || this.f24296iobyxmoadg.gxszxtbevo(wkgbmnqykcVar)) {
            return false;
        }
        this.f24297zoijcleaow.setResult(gxszxtbevo.iobyxmoadg().zoijcleaow(wkgbmnqykcVar.zoijcleaow()).wkgbmnqykc(wkgbmnqykcVar.ppxfxbqfkf()).ppxfxbqfkf(wkgbmnqykcVar.nufgyqmvbu()).iobyxmoadg());
        return true;
    }
}
