package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    private static class iobyxmoadg {
        static void iobyxmoadg(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    private static class zoijcleaow {
        static void iobyxmoadg(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static void btonecajqb(Outline outline, Path path) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            zoijcleaow.iobyxmoadg(outline, path);
            return;
        }
        if (i13 >= 29) {
            try {
                iobyxmoadg.iobyxmoadg(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            iobyxmoadg.iobyxmoadg(outline, path);
        }
    }

    public static PorterDuffColorFilter draadjrbmk(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static AttributeSet dxjokdxxww(Context context, int i13, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i13);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException e13) {
            e = e13;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i13));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e14) {
            e = e14;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i13));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static int[] eablkybsjg(int[] iArr) {
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == 16842912) {
                return iArr;
            }
            if (i14 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i13] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static void gtknphoqwx(Drawable drawable, int i13) {
        if (i13 != 0) {
            k1.iobyxmoadg.agtfadlqog(drawable, i13);
        } else {
            k1.iobyxmoadg.ojitshcjhn(drawable, null);
        }
    }

    public static ColorStateList gxszxtbevo(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !com.google.android.material.drawable.iobyxmoadg.iobyxmoadg(drawable)) {
            return null;
        }
        return com.google.android.material.drawable.zoijcleaow.iobyxmoadg(drawable).getColorStateList();
    }

    public static Drawable iobyxmoadg(Drawable drawable, Drawable drawable2) {
        return zoijcleaow(drawable, drawable2, -1, -1);
    }

    private static int lqeggnwhkg(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int nufgyqmvbu(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    public static Drawable ppxfxbqfkf(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return wkgbmnqykc(drawable, colorStateList, mode, false);
    }

    private static Drawable wkgbmnqykc(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z13) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = k1.iobyxmoadg.oxmwwwfdhm(drawable).mutate();
            if (mode != null) {
                k1.iobyxmoadg.rgvfuqvkyq(drawable, mode);
            }
        } else if (z13) {
            drawable.mutate();
        }
        return drawable;
    }

    public static Drawable zoijcleaow(Drawable drawable, Drawable drawable2, int i13, int i14) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i13 == -1) {
            i13 = nufgyqmvbu(drawable, drawable2);
        }
        if (i14 == -1) {
            i14 = lqeggnwhkg(drawable, drawable2);
        }
        if (i13 > drawable.getIntrinsicWidth() || i14 > drawable.getIntrinsicHeight()) {
            float f13 = i13 / i14;
            if (f13 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i14 = (int) (intrinsicWidth / f13);
                i13 = intrinsicWidth;
            } else {
                i14 = drawable.getIntrinsicHeight();
                i13 = (int) (f13 * i14);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i13, i14);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }
}
