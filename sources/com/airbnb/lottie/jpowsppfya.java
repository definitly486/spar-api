package com.airbnb.lottie;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public class jpowsppfya {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f20473eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private Bitmap f20474gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f20475iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f20476ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f20477wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f20478zoijcleaow;

    public jpowsppfya(int i13, int i14, String str, String str2, String str3) {
        this.f20475iobyxmoadg = i13;
        this.f20478zoijcleaow = i14;
        this.f20476ppxfxbqfkf = str;
        this.f20477wkgbmnqykc = str2;
        this.f20473eablkybsjg = str3;
    }

    public String eablkybsjg() {
        return this.f20476ppxfxbqfkf;
    }

    public int gxszxtbevo() {
        return this.f20475iobyxmoadg;
    }

    public jpowsppfya iobyxmoadg(float f13) {
        jpowsppfya jpowsppfyaVar = new jpowsppfya((int) (this.f20475iobyxmoadg * f13), (int) (this.f20478zoijcleaow * f13), this.f20476ppxfxbqfkf, this.f20477wkgbmnqykc, this.f20473eablkybsjg);
        Bitmap bitmap = this.f20474gxszxtbevo;
        if (bitmap != null) {
            jpowsppfyaVar.lqeggnwhkg(Bitmap.createScaledBitmap(bitmap, jpowsppfyaVar.f20475iobyxmoadg, jpowsppfyaVar.f20478zoijcleaow, true));
        }
        return jpowsppfyaVar;
    }

    public void lqeggnwhkg(Bitmap bitmap) {
        this.f20474gxszxtbevo = bitmap;
    }

    public String ppxfxbqfkf() {
        return this.f20477wkgbmnqykc;
    }

    public int wkgbmnqykc() {
        return this.f20478zoijcleaow;
    }

    public Bitmap zoijcleaow() {
        return this.f20474gxszxtbevo;
    }
}
