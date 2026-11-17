package p0;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
class cdpycssgdh extends istkbnxepw {
    public cdpycssgdh(InputConnection inputConnection, tg.draadjrbmk draadjrbmkVar) {
        super(inputConnection, draadjrbmkVar);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        InputConnection inputConnectionPpxfxbqfkf = ppxfxbqfkf();
        if (inputConnectionPpxfxbqfkf != null) {
            return inputConnectionPpxfxbqfkf.commitContent(inputContentInfo, i13, bundle);
        }
        return false;
    }
}
