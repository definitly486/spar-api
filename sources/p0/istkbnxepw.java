package p0;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
abstract class istkbnxepw extends zynmafqrjb {
    public istkbnxepw(InputConnection inputConnection, tg.draadjrbmk draadjrbmkVar) {
        super(inputConnection, draadjrbmkVar);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i13, int i14) {
        InputConnection inputConnectionPpxfxbqfkf = ppxfxbqfkf();
        if (inputConnectionPpxfxbqfkf != null) {
            return inputConnectionPpxfxbqfkf.deleteSurroundingTextInCodePoints(i13, i14);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnectionPpxfxbqfkf = ppxfxbqfkf();
        if (inputConnectionPpxfxbqfkf != null) {
            return inputConnectionPpxfxbqfkf.getHandler();
        }
        return null;
    }

    @Override // p0.zynmafqrjb
    protected final void zoijcleaow(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }
}
