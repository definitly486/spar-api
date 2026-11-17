package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TextView f3253iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j2.gxszxtbevo f3254zoijcleaow;

    btonecajqb(TextView textView) {
        this.f3253iobyxmoadg = textView;
        this.f3254zoijcleaow = new j2.gxszxtbevo(textView, false);
    }

    void eablkybsjg(boolean z13) {
        this.f3254zoijcleaow.wkgbmnqykc(z13);
    }

    public TransformationMethod gxszxtbevo(TransformationMethod transformationMethod) {
        return this.f3254zoijcleaow.eablkybsjg(transformationMethod);
    }

    InputFilter[] iobyxmoadg(InputFilter[] inputFilterArr) {
        return this.f3254zoijcleaow.iobyxmoadg(inputFilterArr);
    }

    void ppxfxbqfkf(AttributeSet attributeSet, int i13) {
        TypedArray typedArrayObtainStyledAttributes = this.f3253iobyxmoadg.getContext().obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.AppCompatTextView, i13, 0);
        try {
            boolean z13 = typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            eablkybsjg(z13);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void wkgbmnqykc(boolean z13) {
        this.f3254zoijcleaow.ppxfxbqfkf(z13);
    }

    public boolean zoijcleaow() {
        return this.f3254zoijcleaow.zoijcleaow();
    }
}
