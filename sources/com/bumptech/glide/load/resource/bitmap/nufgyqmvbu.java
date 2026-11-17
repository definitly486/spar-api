package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nufgyqmvbu implements l8.gtknphoqwx {
    @Override // l8.gtknphoqwx
    public final n8.ppxfxbqfkf iobyxmoadg(Context context, n8.ppxfxbqfkf ppxfxbqfkfVar, int i13, int i14) {
        if (!g9.draadjrbmk.zdlpuopuiu(i13, i14)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i13 + " or height: " + i14 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        o8.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = com.bumptech.glide.zoijcleaow.ppxfxbqfkf(context).gxszxtbevo();
        Bitmap bitmap = (Bitmap) ppxfxbqfkfVar.get();
        if (i13 == Integer.MIN_VALUE) {
            i13 = bitmap.getWidth();
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = bitmap.getHeight();
        }
        Bitmap bitmapPpxfxbqfkf = ppxfxbqfkf(wkgbmnqykcVarGxszxtbevo, bitmap, i13, i14);
        return bitmap.equals(bitmapPpxfxbqfkf) ? ppxfxbqfkfVar : lqeggnwhkg.eablkybsjg(bitmapPpxfxbqfkf, wkgbmnqykcVarGxszxtbevo);
    }

    protected abstract Bitmap ppxfxbqfkf(o8.wkgbmnqykc wkgbmnqykcVar, Bitmap bitmap, int i13, int i14);
}
