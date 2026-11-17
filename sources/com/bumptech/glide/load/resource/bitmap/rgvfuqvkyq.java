package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes2.dex */
abstract class rgvfuqvkyq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final o8.wkgbmnqykc f21124iobyxmoadg = new iobyxmoadg();

    class iobyxmoadg extends o8.eablkybsjg {
        iobyxmoadg() {
        }

        @Override // o8.eablkybsjg, o8.wkgbmnqykc
        public void ppxfxbqfkf(Bitmap bitmap) {
        }
    }

    static n8.ppxfxbqfkf iobyxmoadg(o8.wkgbmnqykc wkgbmnqykcVar, Drawable drawable, int i13, int i14) {
        Bitmap bitmapZoijcleaow;
        Drawable current = drawable.getCurrent();
        boolean z13 = false;
        if (current instanceof BitmapDrawable) {
            bitmapZoijcleaow = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapZoijcleaow = null;
        } else {
            bitmapZoijcleaow = zoijcleaow(wkgbmnqykcVar, current, i13, i14);
            z13 = true;
        }
        if (!z13) {
            wkgbmnqykcVar = f21124iobyxmoadg;
        }
        return lqeggnwhkg.eablkybsjg(bitmapZoijcleaow, wkgbmnqykcVar);
    }

    private static Bitmap zoijcleaow(o8.wkgbmnqykc wkgbmnqykcVar, Drawable drawable, int i13, int i14) {
        if (i13 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i14 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i13 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i14 = drawable.getIntrinsicHeight();
        }
        Lock lockNufgyqmvbu = istkbnxepw.nufgyqmvbu();
        lockNufgyqmvbu.lock();
        Bitmap bitmapWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc(i13, i14, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapWkgbmnqykc);
            drawable.setBounds(0, 0, i13, i14);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapWkgbmnqykc;
        } finally {
            lockNufgyqmvbu.unlock();
        }
    }
}
