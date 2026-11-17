package com.bumptech.glide.integration.compose;

import androidx.compose.runtime.iwxlajgraz;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg implements i8.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iwxlajgraz f20649iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iwxlajgraz f20650zoijcleaow;

    public lqeggnwhkg(iwxlajgraz state, iwxlajgraz painter) {
        zdlpuopuiu.btonecajqb(state, "state");
        zdlpuopuiu.btonecajqb(painter, "painter");
        this.f20649iobyxmoadg = state;
        this.f20650zoijcleaow = painter;
    }

    @Override // i8.eablkybsjg
    public void iobyxmoadg(Object obj, l.ppxfxbqfkf ppxfxbqfkfVar, gxszxtbevo requestState) {
        zdlpuopuiu.btonecajqb(requestState, "requestState");
        this.f20649iobyxmoadg.setValue(requestState);
        this.f20650zoijcleaow.setValue(ppxfxbqfkfVar);
    }
}
