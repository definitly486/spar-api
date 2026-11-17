package i7;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {
    public static final Bitmap.Config eablkybsjg(Bitmap.Config config) {
        return (config == null || wkgbmnqykc(config)) ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final int iobyxmoadg(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                return zoijcleaow(bitmap.getConfig()) * bitmap.getWidth() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static final Bitmap.Config ppxfxbqfkf(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        return config == null ? Bitmap.Config.ARGB_8888 : config;
    }

    public static final boolean wkgbmnqykc(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static final int zoijcleaow(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return config == Bitmap.Config.RGBA_F16 ? 8 : 4;
    }
}
