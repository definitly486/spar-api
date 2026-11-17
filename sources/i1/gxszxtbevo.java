package i1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
abstract class gxszxtbevo {
    private static iobyxmoadg iobyxmoadg(iobyxmoadg iobyxmoadgVar, int i13, int i14, boolean z13, int i15) {
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        return z13 ? new iobyxmoadg(i13, i15, i14) : new iobyxmoadg(i13, i14);
    }

    private static iobyxmoadg ppxfxbqfkf(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayVdvldrhtss = gtknphoqwx.vdvldrhtss(resources, theme, attributeSet, g1.wkgbmnqykc.GradientColorItem);
                boolean zHasValue = typedArrayVdvldrhtss.hasValue(g1.wkgbmnqykc.GradientColorItem_android_color);
                boolean zHasValue2 = typedArrayVdvldrhtss.hasValue(g1.wkgbmnqykc.GradientColorItem_android_offset);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayVdvldrhtss.getColor(g1.wkgbmnqykc.GradientColorItem_android_color, 0);
                float f13 = typedArrayVdvldrhtss.getFloat(g1.wkgbmnqykc.GradientColorItem_android_offset, 0.0f);
                typedArrayVdvldrhtss.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f13));
            }
        }
        if (arrayList2.size() > 0) {
            return new iobyxmoadg(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode wkgbmnqykc(int i13) {
        if (i13 != 1) {
            return i13 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static Shader zoijcleaow(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayVdvldrhtss = gtknphoqwx.vdvldrhtss(resources, theme, attributeSet, g1.wkgbmnqykc.GradientColor);
        float fBtonecajqb = gtknphoqwx.btonecajqb(typedArrayVdvldrhtss, xmlPullParser, "startX", g1.wkgbmnqykc.GradientColor_android_startX, 0.0f);
        float fBtonecajqb2 = gtknphoqwx.btonecajqb(typedArrayVdvldrhtss, xmlPullParser, "startY", g1.wkgbmnqykc.GradientColor_android_startY, 0.0f);
        float fBtonecajqb3 = gtknphoqwx.btonecajqb(typedArrayVdvldrhtss, xmlPullParser, "endX", g1.wkgbmnqykc.GradientColor_android_endX, 0.0f);
        float fBtonecajqb4 = gtknphoqwx.btonecajqb(typedArrayVdvldrhtss, xmlPullParser, "endY", g1.wkgbmnqykc.GradientColor_android_endY, 0.0f);
        float fBtonecajqb5 = gtknphoqwx.btonecajqb(typedArrayVdvldrhtss, xmlPullParser, "centerX", g1.wkgbmnqykc.GradientColor_android_centerX, 0.0f);
        float fBtonecajqb6 = gtknphoqwx.btonecajqb(typedArrayVdvldrhtss, xmlPullParser, "centerY", g1.wkgbmnqykc.GradientColor_android_centerY, 0.0f);
        int iGtknphoqwx = gtknphoqwx.gtknphoqwx(typedArrayVdvldrhtss, xmlPullParser, "type", g1.wkgbmnqykc.GradientColor_android_type, 0);
        int iGxszxtbevo = gtknphoqwx.gxszxtbevo(typedArrayVdvldrhtss, xmlPullParser, "startColor", g1.wkgbmnqykc.GradientColor_android_startColor, 0);
        boolean zRgvfuqvkyq = gtknphoqwx.rgvfuqvkyq(xmlPullParser, "centerColor");
        int iGxszxtbevo2 = gtknphoqwx.gxszxtbevo(typedArrayVdvldrhtss, xmlPullParser, "centerColor", g1.wkgbmnqykc.GradientColor_android_centerColor, 0);
        int iGxszxtbevo3 = gtknphoqwx.gxszxtbevo(typedArrayVdvldrhtss, xmlPullParser, "endColor", g1.wkgbmnqykc.GradientColor_android_endColor, 0);
        int iGtknphoqwx2 = gtknphoqwx.gtknphoqwx(typedArrayVdvldrhtss, xmlPullParser, "tileMode", g1.wkgbmnqykc.GradientColor_android_tileMode, 0);
        float fBtonecajqb7 = gtknphoqwx.btonecajqb(typedArrayVdvldrhtss, xmlPullParser, "gradientRadius", g1.wkgbmnqykc.GradientColor_android_gradientRadius, 0.0f);
        typedArrayVdvldrhtss.recycle();
        iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadg(ppxfxbqfkf(resources, xmlPullParser, attributeSet, theme), iGxszxtbevo, iGxszxtbevo3, zRgvfuqvkyq, iGxszxtbevo2);
        if (iGtknphoqwx != 1) {
            return iGtknphoqwx != 2 ? new LinearGradient(fBtonecajqb, fBtonecajqb2, fBtonecajqb3, fBtonecajqb4, iobyxmoadgVarIobyxmoadg.f41657iobyxmoadg, iobyxmoadgVarIobyxmoadg.f41658zoijcleaow, wkgbmnqykc(iGtknphoqwx2)) : new SweepGradient(fBtonecajqb5, fBtonecajqb6, iobyxmoadgVarIobyxmoadg.f41657iobyxmoadg, iobyxmoadgVarIobyxmoadg.f41658zoijcleaow);
        }
        if (fBtonecajqb7 > 0.0f) {
            return new RadialGradient(fBtonecajqb5, fBtonecajqb6, fBtonecajqb7, iobyxmoadgVarIobyxmoadg.f41657iobyxmoadg, iobyxmoadgVarIobyxmoadg.f41658zoijcleaow, wkgbmnqykc(iGtknphoqwx2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int[] f41657iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final float[] f41658zoijcleaow;

        iobyxmoadg(List list, List list2) {
            int size = list.size();
            this.f41657iobyxmoadg = new int[size];
            this.f41658zoijcleaow = new float[size];
            for (int i13 = 0; i13 < size; i13++) {
                this.f41657iobyxmoadg[i13] = ((Integer) list.get(i13)).intValue();
                this.f41658zoijcleaow[i13] = ((Float) list2.get(i13)).floatValue();
            }
        }

        iobyxmoadg(int i13, int i14) {
            this.f41657iobyxmoadg = new int[]{i13, i14};
            this.f41658zoijcleaow = new float[]{0.0f, 1.0f};
        }

        iobyxmoadg(int i13, int i14, int i15) {
            this.f41657iobyxmoadg = new int[]{i13, i14, i15};
            this.f41658zoijcleaow = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
