package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class draadjrbmk extends nufgyqmvbu {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final byte[] f21059zoijcleaow = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(l8.eablkybsjg.f61829iobyxmoadg);

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        return obj instanceof draadjrbmk;
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return -599754482;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.nufgyqmvbu
    protected Bitmap ppxfxbqfkf(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, int i13, int i14) {
        return istkbnxepw.zoijcleaow(wkgbmnqykcVar, bitmap, i13, i14);
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        messageDigest.update(f21059zoijcleaow);
    }
}
