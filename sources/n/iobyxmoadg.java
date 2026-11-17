package n;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i1.gtknphoqwx;
import i1.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import m.btonecajqb;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final XmlPullParser f68196iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final btonecajqb f68197ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f68198zoijcleaow;

    public iobyxmoadg(XmlPullParser xmlPullParser, int i13) {
        this.f68196iobyxmoadg = xmlPullParser;
        this.f68198zoijcleaow = i13;
        this.f68197ppxfxbqfkf = new btonecajqb();
    }

    private final void wflxmlrfwp(int i13) {
        this.f68198zoijcleaow = i13 | this.f68198zoijcleaow;
    }

    public final String btonecajqb(TypedArray typedArray, int i13) {
        String string = typedArray.getString(i13);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return string;
    }

    public final TypedArray draadjrbmk(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayVdvldrhtss = gtknphoqwx.vdvldrhtss(resources, theme, attributeSet, iArr);
        wflxmlrfwp(typedArrayVdvldrhtss.getChangingConfigurations());
        return typedArrayVdvldrhtss;
    }

    public final int dxjokdxxww(TypedArray typedArray, String str, int i13, int i14) {
        int iGtknphoqwx = gtknphoqwx.gtknphoqwx(typedArray, this.f68196iobyxmoadg, str, i13, i14);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return iGtknphoqwx;
    }

    public final boolean eablkybsjg(TypedArray typedArray, String str, int i13, boolean z13) {
        boolean zEablkybsjg = gtknphoqwx.eablkybsjg(typedArray, this.f68196iobyxmoadg, str, i13, z13);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return zEablkybsjg;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return zdlpuopuiu.eablkybsjg(this.f68196iobyxmoadg, iobyxmoadgVar.f68196iobyxmoadg) && this.f68198zoijcleaow == iobyxmoadgVar.f68198zoijcleaow;
    }

    public final XmlPullParser gtknphoqwx() {
        return this.f68196iobyxmoadg;
    }

    public final ColorStateList gxszxtbevo(TypedArray typedArray, Resources.Theme theme, String str, int i13) {
        ColorStateList colorStateListLqeggnwhkg = gtknphoqwx.lqeggnwhkg(typedArray, this.f68196iobyxmoadg, theme, str, i13);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return colorStateListLqeggnwhkg;
    }

    public int hashCode() {
        return (this.f68196iobyxmoadg.hashCode() * 31) + Integer.hashCode(this.f68198zoijcleaow);
    }

    public final int iobyxmoadg() {
        return this.f68198zoijcleaow;
    }

    public final wkgbmnqykc lqeggnwhkg(TypedArray typedArray, Resources.Theme theme, String str, int i13, int i14) {
        wkgbmnqykc wkgbmnqykcVarDxjokdxxww = gtknphoqwx.dxjokdxxww(typedArray, this.f68196iobyxmoadg, theme, str, i13, i14);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return wkgbmnqykcVarDxjokdxxww;
    }

    public final float nufgyqmvbu(TypedArray typedArray, String str, int i13, float f13) {
        float fBtonecajqb = gtknphoqwx.btonecajqb(typedArray, this.f68196iobyxmoadg, str, i13, f13);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return fBtonecajqb;
    }

    public final float ppxfxbqfkf(TypedArray typedArray, int i13, float f13) {
        float f14 = typedArray.getFloat(i13, f13);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return f14;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f68196iobyxmoadg + ", config=" + this.f68198zoijcleaow + ')';
    }

    public final int wkgbmnqykc(TypedArray typedArray, int i13, int i14) {
        int i15 = typedArray.getInt(i13, i14);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return i15;
    }

    public final float zoijcleaow(TypedArray typedArray, int i13, float f13) {
        float dimension = typedArray.getDimension(i13, f13);
        wflxmlrfwp(typedArray.getChangingConfigurations());
        return dimension;
    }

    public /* synthetic */ iobyxmoadg(XmlPullParser xmlPullParser, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(xmlPullParser, (i14 & 2) != 0 ? 0 : i13);
    }
}
