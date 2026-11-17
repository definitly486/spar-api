package i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {
    public static CharSequence agtfadlqog(TypedArray typedArray, int i13, int i14) {
        CharSequence text = typedArray.getText(i13);
        return text == null ? typedArray.getText(i14) : text;
    }

    public static float btonecajqb(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i13, float f13) {
        return !rgvfuqvkyq(xmlPullParser, str) ? f13 : typedArray.getFloat(i13, f13);
    }

    public static int draadjrbmk(TypedArray typedArray, int i13, int i14, int i15) {
        return typedArray.getResourceId(i13, typedArray.getResourceId(i14, i15));
    }

    public static wkgbmnqykc dxjokdxxww(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i13, int i14) {
        if (rgvfuqvkyq(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i13, typedValue);
            int i15 = typedValue.type;
            if (i15 >= 28 && i15 <= 31) {
                return wkgbmnqykc.zoijcleaow(typedValue.data);
            }
            wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = wkgbmnqykc.lqeggnwhkg(typedArray.getResources(), typedArray.getResourceId(i13, 0), theme);
            if (wkgbmnqykcVarLqeggnwhkg != null) {
                return wkgbmnqykcVarLqeggnwhkg;
            }
        }
        return wkgbmnqykc.zoijcleaow(i14);
    }

    public static boolean eablkybsjg(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i13, boolean z13) {
        return !rgvfuqvkyq(xmlPullParser, str) ? z13 : typedArray.getBoolean(i13, z13);
    }

    public static int gtknphoqwx(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i13, int i14) {
        return !rgvfuqvkyq(xmlPullParser, str) ? i14 : typedArray.getInt(i13, i14);
    }

    public static int gxszxtbevo(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i13, int i14) {
        return !rgvfuqvkyq(xmlPullParser, str) ? i14 : typedArray.getColor(i13, i14);
    }

    public static int iobyxmoadg(Context context, int i13, int i14) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        return typedValue.resourceId != 0 ? i13 : i14;
    }

    public static ColorStateList lqeggnwhkg(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i13) {
        if (!rgvfuqvkyq(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i13, typedValue);
        int i14 = typedValue.type;
        if (i14 != 2) {
            return (i14 < 28 || i14 > 31) ? ppxfxbqfkf.wkgbmnqykc(typedArray.getResources(), typedArray.getResourceId(i13, 0), theme) : nufgyqmvbu(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i13 + ": " + typedValue);
    }

    private static ColorStateList nufgyqmvbu(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static CharSequence[] ojitshcjhn(TypedArray typedArray, int i13, int i14) {
        CharSequence[] textArray = typedArray.getTextArray(i13);
        return textArray == null ? typedArray.getTextArray(i14) : textArray;
    }

    public static Drawable ppxfxbqfkf(TypedArray typedArray, int i13, int i14) {
        Drawable drawable = typedArray.getDrawable(i13);
        return drawable == null ? typedArray.getDrawable(i14) : drawable;
    }

    public static boolean rgvfuqvkyq(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray vdvldrhtss(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static String wflxmlrfwp(TypedArray typedArray, int i13, int i14) {
        String string = typedArray.getString(i13);
        return string == null ? typedArray.getString(i14) : string;
    }

    public static int wkgbmnqykc(TypedArray typedArray, int i13, int i14, int i15) {
        return typedArray.getInt(i13, typedArray.getInt(i14, i15));
    }

    public static boolean zoijcleaow(TypedArray typedArray, int i13, int i14, boolean z13) {
        return typedArray.getBoolean(i13, typedArray.getBoolean(i14, z13));
    }
}
