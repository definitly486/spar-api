package ge;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class kcexrzcfyt extends PhantomReference implements iobyxmoadg.InterfaceC0835iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Set f36915iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Runnable f36916zoijcleaow;

    /* synthetic */ kcexrzcfyt(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, oxmwwwfdhm oxmwwwfdhmVar) {
        super(obj, referenceQueue);
        this.f36915iobyxmoadg = set;
        this.f36916zoijcleaow = runnable;
    }

    @Override // ge.iobyxmoadg.InterfaceC0835iobyxmoadg
    public final void iobyxmoadg() {
        if (this.f36915iobyxmoadg.remove(this)) {
            clear();
            this.f36916zoijcleaow.run();
        }
    }
}
