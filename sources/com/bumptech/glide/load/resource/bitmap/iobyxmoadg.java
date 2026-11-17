package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final l8.dxjokdxxww f21064iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Resources f21065zoijcleaow;

    public iobyxmoadg(Resources resources, l8.dxjokdxxww dxjokdxxwwVar) {
        this.f21065zoijcleaow = (Resources) g9.gtknphoqwx.eablkybsjg(resources);
        this.f21064iobyxmoadg = (l8.dxjokdxxww) g9.gtknphoqwx.eablkybsjg(dxjokdxxwwVar);
    }

    @Override // l8.dxjokdxxww
    public boolean iobyxmoadg(Object obj, l8.lqeggnwhkg lqeggnwhkgVar) {
        return this.f21064iobyxmoadg.iobyxmoadg(obj, lqeggnwhkgVar);
    }

    @Override // l8.dxjokdxxww
    public n8.ppxfxbqfkf zoijcleaow(Object obj, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return cqumvgiudr.eablkybsjg(this.f21065zoijcleaow, this.f21064iobyxmoadg.zoijcleaow(obj, i13, i14, lqeggnwhkgVar));
    }
}
