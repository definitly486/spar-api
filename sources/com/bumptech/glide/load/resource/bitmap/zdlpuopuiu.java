package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class zdlpuopuiu extends nufgyqmvbu {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final byte[] f21136gxszxtbevo = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(l8.eablkybsjg.f61829iobyxmoadg);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final float f21137eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f21138ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f21139wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f21140zoijcleaow;

    public zdlpuopuiu(float f13, float f14, float f15, float f16) {
        this.f21140zoijcleaow = f13;
        this.f21138ppxfxbqfkf = f14;
        this.f21139wkgbmnqykc = f15;
        this.f21137eablkybsjg = f16;
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (!(obj instanceof zdlpuopuiu)) {
            return false;
        }
        zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) obj;
        return this.f21140zoijcleaow == zdlpuopuiuVar.f21140zoijcleaow && this.f21138ppxfxbqfkf == zdlpuopuiuVar.f21138ppxfxbqfkf && this.f21139wkgbmnqykc == zdlpuopuiuVar.f21139wkgbmnqykc && this.f21137eablkybsjg == zdlpuopuiuVar.f21137eablkybsjg;
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return g9.draadjrbmk.wflxmlrfwp(this.f21137eablkybsjg, g9.draadjrbmk.wflxmlrfwp(this.f21139wkgbmnqykc, g9.draadjrbmk.wflxmlrfwp(this.f21138ppxfxbqfkf, g9.draadjrbmk.agtfadlqog(-2013597734, g9.draadjrbmk.draadjrbmk(this.f21140zoijcleaow)))));
    }

    @Override // com.bumptech.glide.load.resource.bitmap.nufgyqmvbu
    protected Bitmap ppxfxbqfkf(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, int i13, int i14) {
        return istkbnxepw.agtfadlqog(wkgbmnqykcVar, bitmap, this.f21140zoijcleaow, this.f21138ppxfxbqfkf, this.f21139wkgbmnqykc, this.f21137eablkybsjg);
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        messageDigest.update(f21136gxszxtbevo);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f21140zoijcleaow).putFloat(this.f21138ppxfxbqfkf).putFloat(this.f21139wkgbmnqykc).putFloat(this.f21137eablkybsjg).array());
    }
}
