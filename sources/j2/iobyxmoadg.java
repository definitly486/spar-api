package j2;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f50546iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f50548zoijcleaow = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f50547ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: j2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static class C1082iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final EditText f50549iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final lqeggnwhkg f50550zoijcleaow;

        C1082iobyxmoadg(EditText editText, boolean z13) {
            this.f50549iobyxmoadg = editText;
            lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(editText, z13);
            this.f50550zoijcleaow = lqeggnwhkgVar;
            editText.addTextChangedListener(lqeggnwhkgVar);
            editText.setEditableFactory(j2.zoijcleaow.getInstance());
        }

        @Override // j2.iobyxmoadg.zoijcleaow
        KeyListener iobyxmoadg(KeyListener keyListener) {
            if (keyListener instanceof eablkybsjg) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new eablkybsjg(keyListener);
        }

        @Override // j2.iobyxmoadg.zoijcleaow
        InputConnection ppxfxbqfkf(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof ppxfxbqfkf ? inputConnection : new ppxfxbqfkf(this.f50549iobyxmoadg, inputConnection, editorInfo);
        }

        @Override // j2.iobyxmoadg.zoijcleaow
        void wkgbmnqykc(boolean z13) {
            this.f50550zoijcleaow.zoijcleaow(z13);
        }

        @Override // j2.iobyxmoadg.zoijcleaow
        boolean zoijcleaow() {
            return this.f50550zoijcleaow.iobyxmoadg();
        }
    }

    static class zoijcleaow {
        zoijcleaow() {
        }

        abstract KeyListener iobyxmoadg(KeyListener keyListener);

        abstract InputConnection ppxfxbqfkf(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void wkgbmnqykc(boolean z13);

        abstract boolean zoijcleaow();
    }

    public iobyxmoadg(EditText editText, boolean z13) {
        u1.nufgyqmvbu.lqeggnwhkg(editText, "editText cannot be null");
        this.f50546iobyxmoadg = new C1082iobyxmoadg(editText, z13);
    }

    public KeyListener iobyxmoadg(KeyListener keyListener) {
        return this.f50546iobyxmoadg.iobyxmoadg(keyListener);
    }

    public InputConnection ppxfxbqfkf(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f50546iobyxmoadg.ppxfxbqfkf(inputConnection, editorInfo);
    }

    public void wkgbmnqykc(boolean z13) {
        this.f50546iobyxmoadg.wkgbmnqykc(z13);
    }

    public boolean zoijcleaow() {
        return this.f50546iobyxmoadg.zoijcleaow();
    }
}
