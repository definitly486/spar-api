package androidx.camera.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class kcexrzcfyt extends eablkybsjg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final AtomicBoolean f3934iwizpuwonk;

    kcexrzcfyt(agtfadlqog agtfadlqogVar) {
        super(agtfadlqogVar);
        this.f3934iwizpuwonk = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.eablkybsjg, androidx.camera.core.agtfadlqog, java.lang.AutoCloseable
    public void close() {
        if (this.f3934iwizpuwonk.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
