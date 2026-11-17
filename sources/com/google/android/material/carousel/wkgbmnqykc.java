package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private float f22410iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private float f22411zoijcleaow;

    static int[] iobyxmoadg(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            iArr2[i13] = iArr[i13] * 2;
        }
        return iArr2;
    }

    static float zoijcleaow(float f13, float f14, float f15) {
        return 1.0f - ((f13 - f15) / (f14 - f15));
    }

    void eablkybsjg(Context context) {
        float fNufgyqmvbu = this.f22410iobyxmoadg;
        if (fNufgyqmvbu <= 0.0f) {
            fNufgyqmvbu = eablkybsjg.nufgyqmvbu(context);
        }
        this.f22410iobyxmoadg = fNufgyqmvbu;
        float fLqeggnwhkg = this.f22411zoijcleaow;
        if (fLqeggnwhkg <= 0.0f) {
            fLqeggnwhkg = eablkybsjg.lqeggnwhkg(context);
        }
        this.f22411zoijcleaow = fLqeggnwhkg;
    }

    boolean gxszxtbevo() {
        return true;
    }

    abstract gxszxtbevo lqeggnwhkg(zoijcleaow zoijcleaowVar, View view);

    abstract boolean nufgyqmvbu(zoijcleaow zoijcleaowVar, int i13);

    public float ppxfxbqfkf() {
        return this.f22411zoijcleaow;
    }

    public float wkgbmnqykc() {
        return this.f22410iobyxmoadg;
    }
}
