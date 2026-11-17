package i1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final ThreadLocal f41679iobyxmoadg = new ThreadLocal();

    private static ColorStateList eablkybsjg(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i13 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrIobyxmoadg = new int[20];
        int i14 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i13 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayNufgyqmvbu = nufgyqmvbu(resources, theme, attributeSet, g1.wkgbmnqykc.ColorStateListItem);
                int resourceId = typedArrayNufgyqmvbu.getResourceId(g1.wkgbmnqykc.ColorStateListItem_android_color, -1);
                if (resourceId == -1 || gxszxtbevo(resources, resourceId)) {
                    color = typedArrayNufgyqmvbu.getColor(g1.wkgbmnqykc.ColorStateListItem_android_color, -65281);
                } else {
                    try {
                        color = iobyxmoadg(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayNufgyqmvbu.getColor(g1.wkgbmnqykc.ColorStateListItem_android_color, -65281);
                    }
                }
                float f13 = 1.0f;
                if (typedArrayNufgyqmvbu.hasValue(g1.wkgbmnqykc.ColorStateListItem_android_alpha)) {
                    f13 = typedArrayNufgyqmvbu.getFloat(g1.wkgbmnqykc.ColorStateListItem_android_alpha, 1.0f);
                } else if (typedArrayNufgyqmvbu.hasValue(g1.wkgbmnqykc.ColorStateListItem_alpha)) {
                    f13 = typedArrayNufgyqmvbu.getFloat(g1.wkgbmnqykc.ColorStateListItem_alpha, 1.0f);
                }
                float f14 = (Build.VERSION.SDK_INT < 31 || !typedArrayNufgyqmvbu.hasValue(g1.wkgbmnqykc.ColorStateListItem_android_lStar)) ? typedArrayNufgyqmvbu.getFloat(g1.wkgbmnqykc.ColorStateListItem_lStar, -1.0f) : typedArrayNufgyqmvbu.getFloat(g1.wkgbmnqykc.ColorStateListItem_android_lStar, -1.0f);
                typedArrayNufgyqmvbu.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i15 = 0;
                for (int i16 = 0; i16 < attributeCount; i16++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != g1.iobyxmoadg.alpha && attributeNameResource != g1.iobyxmoadg.lStar) {
                        int i17 = i15 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i16, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i15] = attributeNameResource;
                        i15 = i17;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i15);
                iArrIobyxmoadg = lqeggnwhkg.iobyxmoadg(iArrIobyxmoadg, i14, lqeggnwhkg(color, f13, f14));
                iArr = (int[][]) lqeggnwhkg.zoijcleaow(iArr, i14, iArrTrimStateSet);
                i14++;
            }
            i13 = 1;
        }
        int[] iArr3 = new int[i14];
        int[][] iArr4 = new int[i14][];
        System.arraycopy(iArrIobyxmoadg, 0, iArr3, 0, i14);
        System.arraycopy(iArr, 0, iArr4, 0, i14);
        return new ColorStateList(iArr4, iArr3);
    }

    private static boolean gxszxtbevo(Resources resources, int i13) {
        TypedValue typedValuePpxfxbqfkf = ppxfxbqfkf();
        resources.getValue(i13, typedValuePpxfxbqfkf, true);
        int i14 = typedValuePpxfxbqfkf.type;
        return i14 >= 28 && i14 <= 31;
    }

    public static ColorStateList iobyxmoadg(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return zoijcleaow(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static int lqeggnwhkg(int i13, float f13, float f14) {
        boolean z13 = f14 >= 0.0f && f14 <= 100.0f;
        if (f13 == 1.0f && !z13) {
            return i13;
        }
        int iZoijcleaow = o1.iobyxmoadg.zoijcleaow((int) ((Color.alpha(i13) * f13) + 0.5f), 0, KotlinVersion.MAX_COMPONENT_VALUE);
        if (z13) {
            iobyxmoadg iobyxmoadgVarPpxfxbqfkf = iobyxmoadg.ppxfxbqfkf(i13);
            i13 = iobyxmoadg.wflxmlrfwp(iobyxmoadgVarPpxfxbqfkf.btonecajqb(), iobyxmoadgVarPpxfxbqfkf.dxjokdxxww(), f14);
        }
        return (i13 & 16777215) | (iZoijcleaow << 24);
    }

    private static TypedArray nufgyqmvbu(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static TypedValue ppxfxbqfkf() {
        ThreadLocal threadLocal = f41679iobyxmoadg;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList wkgbmnqykc(Resources resources, int i13, Resources.Theme theme) {
        try {
            return iobyxmoadg(resources, resources.getXml(i13), theme);
        } catch (Exception e13) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e13);
            return null;
        }
    }

    public static ColorStateList zoijcleaow(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return eablkybsjg(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }
}
