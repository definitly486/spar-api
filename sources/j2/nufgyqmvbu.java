package j2;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class nufgyqmvbu implements TransformationMethod {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TransformationMethod f50557iobyxmoadg;

    nufgyqmvbu(TransformationMethod transformationMethod) {
        this.f50557iobyxmoadg = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f50557iobyxmoadg;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null) {
            return charSequence;
        }
        i2.iobyxmoadg.iobyxmoadg();
        throw null;
    }

    public TransformationMethod iobyxmoadg() {
        return this.f50557iobyxmoadg;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z13, int i13, Rect rect) {
        TransformationMethod transformationMethod = this.f50557iobyxmoadg;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z13, i13, rect);
        }
    }
}
