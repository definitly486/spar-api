package m0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk extends CharacterStyle {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f64822iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final float f64823ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final float f64824wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f64825zoijcleaow;

    public draadjrbmk(int i13, float f13, float f14, float f15) {
        this.f64822iobyxmoadg = i13;
        this.f64825zoijcleaow = f13;
        this.f64823ppxfxbqfkf = f14;
        this.f64824wkgbmnqykc = f15;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f64824wkgbmnqykc, this.f64825zoijcleaow, this.f64823ppxfxbqfkf, this.f64822iobyxmoadg);
    }
}
