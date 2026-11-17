package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final class esjtqupxsv implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ojitshcjhn f21061iobyxmoadg;

    public esjtqupxsv(ojitshcjhn ojitshcjhnVar) {
        this.f21061iobyxmoadg = ojitshcjhnVar;
    }

    private boolean eablkybsjg(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public n8.ppxfxbqfkf zoijcleaow(ParcelFileDescriptor parcelFileDescriptor, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return this.f21061iobyxmoadg.wkgbmnqykc(parcelFileDescriptor, i13, i14, lqeggnwhkgVar);
    }

    @Override // l8.dxjokdxxww
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(ParcelFileDescriptor parcelFileDescriptor, l8.lqeggnwhkg lqeggnwhkgVar) {
        return eablkybsjg(parcelFileDescriptor) && this.f21061iobyxmoadg.ojitshcjhn(parcelFileDescriptor);
    }
}
