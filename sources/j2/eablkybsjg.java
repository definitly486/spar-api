package j2;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements KeyListener {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final KeyListener f50539iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f50540zoijcleaow;

    public static class iobyxmoadg {
        public boolean iobyxmoadg(Editable editable, int i13, KeyEvent keyEvent) {
            return i2.iobyxmoadg.ppxfxbqfkf(editable, i13, keyEvent);
        }
    }

    eablkybsjg(KeyListener keyListener) {
        this(keyListener, new iobyxmoadg());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i13) {
        this.f50539iobyxmoadg.clearMetaKeyState(view, editable, i13);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f50539iobyxmoadg.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i13, KeyEvent keyEvent) {
        return this.f50540zoijcleaow.iobyxmoadg(editable, i13, keyEvent) || this.f50539iobyxmoadg.onKeyDown(view, editable, i13, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f50539iobyxmoadg.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i13, KeyEvent keyEvent) {
        return this.f50539iobyxmoadg.onKeyUp(view, editable, i13, keyEvent);
    }

    eablkybsjg(KeyListener keyListener, iobyxmoadg iobyxmoadgVar) {
        this.f50539iobyxmoadg = keyListener;
        this.f50540zoijcleaow = iobyxmoadgVar;
    }
}
