package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class mbcevpiqjq {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f3365iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private TypedValue f3366ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final TypedArray f3367zoijcleaow;

    private mbcevpiqjq(Context context, TypedArray typedArray) {
        this.f3365iobyxmoadg = context;
        this.f3367zoijcleaow = typedArray;
    }

    public static mbcevpiqjq jyumaefscl(Context context, AttributeSet attributeSet, int[] iArr, int i13, int i14) {
        return new mbcevpiqjq(context, context.obtainStyledAttributes(attributeSet, iArr, i13, i14));
    }

    public static mbcevpiqjq yggfygwlhe(Context context, AttributeSet attributeSet, int[] iArr) {
        return new mbcevpiqjq(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static mbcevpiqjq zdlpuopuiu(Context context, int i13, int[] iArr) {
        return new mbcevpiqjq(context, context.obtainStyledAttributes(i13, iArr));
    }

    public int agtfadlqog(int i13, int i14) {
        return this.f3367zoijcleaow.getResourceId(i13, i14);
    }

    public Typeface btonecajqb(int i13, int i14, i1.nufgyqmvbu.gxszxtbevo gxszxtbevoVar) {
        int resourceId = this.f3367zoijcleaow.getResourceId(i13, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f3366ppxfxbqfkf == null) {
            this.f3366ppxfxbqfkf = new TypedValue();
        }
        return i1.nufgyqmvbu.btonecajqb(this.f3365iobyxmoadg, resourceId, this.f3366ppxfxbqfkf, i14, gxszxtbevoVar);
    }

    public void cqumvgiudr() {
        this.f3367zoijcleaow.recycle();
    }

    public int draadjrbmk(int i13, int i14) {
        return this.f3367zoijcleaow.getInteger(i13, i14);
    }

    public float dxjokdxxww(int i13, float f13) {
        return this.f3367zoijcleaow.getFloat(i13, f13);
    }

    public int eablkybsjg(int i13, int i14) {
        return this.f3367zoijcleaow.getDimensionPixelOffset(i13, i14);
    }

    public int gtknphoqwx(int i13, int i14) {
        return this.f3367zoijcleaow.getInt(i13, i14);
    }

    public int gxszxtbevo(int i13, int i14) {
        return this.f3367zoijcleaow.getDimensionPixelSize(i13, i14);
    }

    public boolean iobyxmoadg(int i13, boolean z13) {
        return this.f3367zoijcleaow.getBoolean(i13, z13);
    }

    public TypedValue iwizpuwonk(int i13) {
        return this.f3367zoijcleaow.peekValue(i13);
    }

    public boolean kcexrzcfyt(int i13) {
        return this.f3367zoijcleaow.hasValue(i13);
    }

    public Drawable lqeggnwhkg(int i13) {
        int resourceId;
        return (!this.f3367zoijcleaow.hasValue(i13) || (resourceId = this.f3367zoijcleaow.getResourceId(i13, 0)) == 0) ? this.f3367zoijcleaow.getDrawable(i13) : nufgyqmvbu.iobyxmoadg.zoijcleaow(this.f3365iobyxmoadg, resourceId);
    }

    public Drawable nufgyqmvbu(int i13) {
        int resourceId;
        if (!this.f3367zoijcleaow.hasValue(i13) || (resourceId = this.f3367zoijcleaow.getResourceId(i13, 0)) == 0) {
            return null;
        }
        return nufgyqmvbu.zoijcleaow().wkgbmnqykc(this.f3365iobyxmoadg, resourceId, true);
    }

    public String ojitshcjhn(int i13) {
        return this.f3367zoijcleaow.getString(i13);
    }

    public TypedArray oxmwwwfdhm() {
        return this.f3367zoijcleaow;
    }

    public ColorStateList ppxfxbqfkf(int i13) {
        int resourceId;
        ColorStateList colorStateListIobyxmoadg;
        return (!this.f3367zoijcleaow.hasValue(i13) || (resourceId = this.f3367zoijcleaow.getResourceId(i13, 0)) == 0 || (colorStateListIobyxmoadg = nufgyqmvbu.iobyxmoadg.iobyxmoadg(this.f3365iobyxmoadg, resourceId)) == null) ? this.f3367zoijcleaow.getColorStateList(i13) : colorStateListIobyxmoadg;
    }

    public CharSequence rgvfuqvkyq(int i13) {
        return this.f3367zoijcleaow.getText(i13);
    }

    public CharSequence[] vdvldrhtss(int i13) {
        return this.f3367zoijcleaow.getTextArray(i13);
    }

    public int wflxmlrfwp(int i13, int i14) {
        return this.f3367zoijcleaow.getLayoutDimension(i13, i14);
    }

    public float wkgbmnqykc(int i13, float f13) {
        return this.f3367zoijcleaow.getDimension(i13, f13);
    }

    public int zoijcleaow(int i13, int i14) {
        return this.f3367zoijcleaow.getColor(i13, i14);
    }
}
