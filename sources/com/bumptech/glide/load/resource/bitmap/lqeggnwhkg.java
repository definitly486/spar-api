package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg implements n8.ppxfxbqfkf, n8.zoijcleaow {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final o8.wkgbmnqykc f21103yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Bitmap f21104zdlpuopuiu;

    public lqeggnwhkg(Bitmap bitmap, o8.wkgbmnqykc wkgbmnqykcVar) {
        this.f21104zdlpuopuiu = (Bitmap) g9.gtknphoqwx.gxszxtbevo(bitmap, "Bitmap must not be null");
        this.f21103yggfygwlhe = (o8.wkgbmnqykc) g9.gtknphoqwx.gxszxtbevo(wkgbmnqykcVar, "BitmapPool must not be null");
    }

    public static lqeggnwhkg eablkybsjg(Bitmap bitmap, o8.wkgbmnqykc wkgbmnqykcVar) {
        if (bitmap == null) {
            return null;
        }
        return new lqeggnwhkg(bitmap, wkgbmnqykcVar);
    }

    @Override // n8.ppxfxbqfkf
    public int getSize() {
        return g9.draadjrbmk.nufgyqmvbu(this.f21104zdlpuopuiu);
    }

    @Override // n8.zoijcleaow
    public void iobyxmoadg() {
        this.f21104zdlpuopuiu.prepareToDraw();
    }

    @Override // n8.ppxfxbqfkf
    public Class ppxfxbqfkf() {
        return Bitmap.class;
    }

    @Override // n8.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f21104zdlpuopuiu;
    }

    @Override // n8.ppxfxbqfkf
    public void zoijcleaow() {
        this.f21103yggfygwlhe.ppxfxbqfkf(this.f21104zdlpuopuiu);
    }
}
