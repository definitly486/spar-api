package pj;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class kcexrzcfyt extends istkbnxepw {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f76733ppxfxbqfkf = AtomicIntegerFieldUpdater.newUpdater(kcexrzcfyt.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public kcexrzcfyt(lg.gxszxtbevo gxszxtbevoVar, Throwable th2, boolean z13) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + gxszxtbevoVar + " was cancelled normally");
        }
        super(th2, z13);
        this._resumed$volatile = 0;
    }

    public final boolean eablkybsjg() {
        return f76733ppxfxbqfkf.compareAndSet(this, 0, 1);
    }
}
