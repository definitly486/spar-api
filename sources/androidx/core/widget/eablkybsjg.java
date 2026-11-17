package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {

    static class iobyxmoadg {
        static ColorStateList iobyxmoadg(ImageView imageView) {
            return imageView.getImageTintList();
        }

        static void ppxfxbqfkf(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static void wkgbmnqykc(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }

        static PorterDuff.Mode zoijcleaow(ImageView imageView) {
            return imageView.getImageTintMode();
        }
    }

    public static ColorStateList iobyxmoadg(ImageView imageView) {
        return iobyxmoadg.iobyxmoadg(imageView);
    }

    public static void ppxfxbqfkf(ImageView imageView, ColorStateList colorStateList) {
        iobyxmoadg.ppxfxbqfkf(imageView, colorStateList);
    }

    public static void wkgbmnqykc(ImageView imageView, PorterDuff.Mode mode) {
        iobyxmoadg.wkgbmnqykc(imageView, mode);
    }

    public static PorterDuff.Mode zoijcleaow(ImageView imageView) {
        return iobyxmoadg.zoijcleaow(imageView);
    }
}
