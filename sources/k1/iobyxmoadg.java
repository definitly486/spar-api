package k1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: k1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static class C1141iobyxmoadg {
        static void dxjokdxxww(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        static void eablkybsjg(Drawable drawable, float f13, float f14) {
            drawable.setHotspot(f13, f14);
        }

        static void gxszxtbevo(Drawable drawable, int i13, int i14, int i15, int i16) {
            drawable.setHotspotBounds(i13, i14, i15, i16);
        }

        static void iobyxmoadg(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static void lqeggnwhkg(Drawable drawable, int i13) {
            drawable.setTint(i13);
        }

        static void nufgyqmvbu(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static ColorFilter ppxfxbqfkf(Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void wkgbmnqykc(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static boolean zoijcleaow(Drawable drawable) {
            return drawable.canApplyTheme();
        }
    }

    static class zoijcleaow {
        static int iobyxmoadg(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        static boolean zoijcleaow(Drawable drawable, int i13) {
            return drawable.setLayoutDirection(i13);
        }
    }

    public static void agtfadlqog(Drawable drawable, int i13) {
        C1141iobyxmoadg.lqeggnwhkg(drawable, i13);
    }

    public static void btonecajqb(Drawable drawable, boolean z13) {
        drawable.setAutoMirrored(z13);
    }

    public static void draadjrbmk(Drawable drawable, int i13, int i14, int i15, int i16) {
        C1141iobyxmoadg.gxszxtbevo(drawable, i13, i14, i15, i16);
    }

    public static void dxjokdxxww(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static ColorFilter eablkybsjg(Drawable drawable) {
        return C1141iobyxmoadg.ppxfxbqfkf(drawable);
    }

    public static void gtknphoqwx(Drawable drawable, float f13, float f14) {
        C1141iobyxmoadg.eablkybsjg(drawable, f13, f14);
    }

    public static int gxszxtbevo(Drawable drawable) {
        return zoijcleaow.iobyxmoadg(drawable);
    }

    public static void iobyxmoadg(Drawable drawable, Resources.Theme theme) {
        C1141iobyxmoadg.iobyxmoadg(drawable, theme);
    }

    public static void lqeggnwhkg(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C1141iobyxmoadg.wkgbmnqykc(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean nufgyqmvbu(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void ojitshcjhn(Drawable drawable, ColorStateList colorStateList) {
        C1141iobyxmoadg.nufgyqmvbu(drawable, colorStateList);
    }

    public static Drawable oxmwwwfdhm(Drawable drawable) {
        return drawable;
    }

    public static void ppxfxbqfkf(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static void rgvfuqvkyq(Drawable drawable, PorterDuff.Mode mode) {
        C1141iobyxmoadg.dxjokdxxww(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable vdvldrhtss(Drawable drawable) {
        return drawable instanceof k1.zoijcleaow ? ((k1.zoijcleaow) drawable).iobyxmoadg() : drawable;
    }

    public static boolean wflxmlrfwp(Drawable drawable, int i13) {
        return zoijcleaow.zoijcleaow(drawable, i13);
    }

    public static int wkgbmnqykc(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static boolean zoijcleaow(Drawable drawable) {
        return C1141iobyxmoadg.zoijcleaow(drawable);
    }
}
