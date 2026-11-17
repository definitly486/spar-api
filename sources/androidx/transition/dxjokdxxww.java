package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
class dxjokdxxww implements TypeEvaluator {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private Rect f13441iobyxmoadg;

    dxjokdxxww() {
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f13, Rect rect, Rect rect2) {
        int i13 = rect.left;
        int i14 = i13 + ((int) ((rect2.left - i13) * f13));
        int i15 = rect.top;
        int i16 = i15 + ((int) ((rect2.top - i15) * f13));
        int i17 = rect.right;
        int i18 = i17 + ((int) ((rect2.right - i17) * f13));
        int i19 = rect.bottom;
        int i23 = i19 + ((int) ((rect2.bottom - i19) * f13));
        Rect rect3 = this.f13441iobyxmoadg;
        if (rect3 == null) {
            return new Rect(i14, i16, i18, i23);
        }
        rect3.set(i14, i16, i18, i23);
        return this.f13441iobyxmoadg;
    }
}
