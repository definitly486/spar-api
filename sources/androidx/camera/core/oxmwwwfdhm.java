package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import lereixgezr.dsvhmnatus;

/* JADX INFO: loaded from: classes.dex */
public final class oxmwwwfdhm extends eablkybsjg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final dsvhmnatus f3949cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Rect f3950esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final Object f3951iwizpuwonk;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f3952lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final int f3953pmvmpeiblj;

    oxmwwwfdhm(agtfadlqog agtfadlqogVar, dsvhmnatus dsvhmnatusVar) {
        this(agtfadlqogVar, null, dsvhmnatusVar);
    }

    @Override // androidx.camera.core.eablkybsjg, androidx.camera.core.agtfadlqog
    public dsvhmnatus K() {
        return this.f3949cqumvgiudr;
    }

    @Override // androidx.camera.core.eablkybsjg, androidx.camera.core.agtfadlqog
    public int getHeight() {
        return this.f3953pmvmpeiblj;
    }

    @Override // androidx.camera.core.eablkybsjg, androidx.camera.core.agtfadlqog
    public int getWidth() {
        return this.f3952lereixgezr;
    }

    @Override // androidx.camera.core.eablkybsjg, androidx.camera.core.agtfadlqog
    public void oipsdeybqn(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f3951iwizpuwonk) {
            this.f3950esjtqupxsv = rect;
        }
    }

    public oxmwwwfdhm(agtfadlqog agtfadlqogVar, Size size, dsvhmnatus dsvhmnatusVar) {
        super(agtfadlqogVar);
        this.f3951iwizpuwonk = new Object();
        if (size == null) {
            this.f3952lereixgezr = super.getWidth();
            this.f3953pmvmpeiblj = super.getHeight();
        } else {
            this.f3952lereixgezr = size.getWidth();
            this.f3953pmvmpeiblj = size.getHeight();
        }
        this.f3949cqumvgiudr = dsvhmnatusVar;
    }
}
