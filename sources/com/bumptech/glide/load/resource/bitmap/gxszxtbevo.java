package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo implements l8.dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final o8.wkgbmnqykc f21063iobyxmoadg = new o8.eablkybsjg();

    @Override // l8.dxjokdxxww
    public /* bridge */ /* synthetic */ boolean iobyxmoadg(Object obj, l8.lqeggnwhkg lqeggnwhkgVar) {
        return wkgbmnqykc(wkgbmnqykc.iobyxmoadg(obj), lqeggnwhkgVar);
    }

    public n8.ppxfxbqfkf ppxfxbqfkf(ImageDecoder.Source source, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new t8.nufgyqmvbu(i13, i14, lqeggnwhkgVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i13 + "x" + i14 + "]");
        }
        return new lqeggnwhkg(bitmapDecodeBitmap, this.f21063iobyxmoadg);
    }

    public boolean wkgbmnqykc(ImageDecoder.Source source, l8.lqeggnwhkg lqeggnwhkgVar) {
        return true;
    }

    @Override // l8.dxjokdxxww
    public /* bridge */ /* synthetic */ n8.ppxfxbqfkf zoijcleaow(Object obj, int i13, int i14, l8.lqeggnwhkg lqeggnwhkgVar) {
        return ppxfxbqfkf(wkgbmnqykc.iobyxmoadg(obj), i13, i14, lqeggnwhkgVar);
    }
}
