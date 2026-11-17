package p0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes.dex */
class lmojexxdyd extends cdpycssgdh {
    public lmojexxdyd(InputConnection inputConnection, tg.draadjrbmk draadjrbmkVar) {
        super(inputConnection, draadjrbmkVar);
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection inputConnectionPpxfxbqfkf = ppxfxbqfkf();
        if (inputConnectionPpxfxbqfkf != null) {
            inputConnectionPpxfxbqfkf.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        InputConnection inputConnectionPpxfxbqfkf = ppxfxbqfkf();
        if (inputConnectionPpxfxbqfkf != null) {
            return inputConnectionPpxfxbqfkf.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }
}
