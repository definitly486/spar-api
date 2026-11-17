package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final EditText f3293iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j2.iobyxmoadg f3294zoijcleaow;

    dxjokdxxww(EditText editText) {
        this.f3293iobyxmoadg = editText;
        this.f3294zoijcleaow = new j2.iobyxmoadg(editText, false);
    }

    InputConnection eablkybsjg(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f3294zoijcleaow.ppxfxbqfkf(inputConnection, editorInfo);
    }

    void gxszxtbevo(boolean z13) {
        this.f3294zoijcleaow.wkgbmnqykc(z13);
    }

    KeyListener iobyxmoadg(KeyListener keyListener) {
        return zoijcleaow(keyListener) ? this.f3294zoijcleaow.iobyxmoadg(keyListener) : keyListener;
    }

    boolean ppxfxbqfkf() {
        return this.f3294zoijcleaow.zoijcleaow();
    }

    void wkgbmnqykc(AttributeSet attributeSet, int i13) {
        TypedArray typedArrayObtainStyledAttributes = this.f3293iobyxmoadg.getContext().obtainStyledAttributes(attributeSet, lqeggnwhkg.btonecajqb.AppCompatTextView, i13, 0);
        try {
            boolean z13 = typedArrayObtainStyledAttributes.hasValue(lqeggnwhkg.btonecajqb.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(lqeggnwhkg.btonecajqb.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            gxszxtbevo(z13);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    boolean zoijcleaow(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }
}
