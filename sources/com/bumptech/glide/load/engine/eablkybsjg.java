package com.bumptech.glide.load.engine;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
class eablkybsjg implements p8.iobyxmoadg.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final l8.wkgbmnqykc f20841iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final l8.lqeggnwhkg f20842ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f20843zoijcleaow;

    eablkybsjg(l8.wkgbmnqykc wkgbmnqykcVar, Object obj, l8.lqeggnwhkg lqeggnwhkgVar) {
        this.f20841iobyxmoadg = wkgbmnqykcVar;
        this.f20843zoijcleaow = obj;
        this.f20842ppxfxbqfkf = lqeggnwhkgVar;
    }

    @Override // p8.iobyxmoadg.zoijcleaow
    public boolean iobyxmoadg(File file) {
        return this.f20841iobyxmoadg.iobyxmoadg(this.f20843zoijcleaow, file, this.f20842ppxfxbqfkf);
    }
}
