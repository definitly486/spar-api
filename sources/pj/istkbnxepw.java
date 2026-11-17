package pj;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class istkbnxepw {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f76724zoijcleaow = AtomicIntegerFieldUpdater.newUpdater(istkbnxepw.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Throwable f76725iobyxmoadg;

    public istkbnxepw(Throwable th2, boolean z13) {
        this.f76725iobyxmoadg = th2;
        this._handled$volatile = z13 ? 1 : 0;
    }

    public final boolean iobyxmoadg() {
        return f76724zoijcleaow.get(this) != 0;
    }

    public final boolean ppxfxbqfkf() {
        return f76724zoijcleaow.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return kegysxyocb.iobyxmoadg(this) + '[' + this.f76725iobyxmoadg + ']';
    }

    public /* synthetic */ istkbnxepw(Throwable th2, boolean z13, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(th2, (i13 & 2) != 0 ? false : z13);
    }
}
