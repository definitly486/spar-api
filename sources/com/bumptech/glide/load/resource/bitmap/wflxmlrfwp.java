package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class wflxmlrfwp extends nufgyqmvbu {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final byte[] f21127zoijcleaow = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(l8.eablkybsjg.f61829iobyxmoadg);

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        return obj instanceof wflxmlrfwp;
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return -670243078;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.nufgyqmvbu
    protected Bitmap ppxfxbqfkf(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, int i13, int i14) {
        return istkbnxepw.ppxfxbqfkf(wkgbmnqykcVar, bitmap, i13, i14);
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        messageDigest.update(f21127zoijcleaow);
    }
}
