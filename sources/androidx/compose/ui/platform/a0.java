package androidx.compose.ui.platform;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ipoelvxyzq.ppxfxbqfkf f6759iobyxmoadg = new ipoelvxyzq.ppxfxbqfkf(new Reference[16], 0);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ReferenceQueue f6760zoijcleaow = new ReferenceQueue();

    private final void iobyxmoadg() {
        Reference referencePoll;
        do {
            referencePoll = this.f6760zoijcleaow.poll();
            if (referencePoll != null) {
                this.f6759iobyxmoadg.rgvfuqvkyq(referencePoll);
            }
        } while (referencePoll != null);
    }

    public final void ppxfxbqfkf(Object obj) {
        iobyxmoadg();
        this.f6759iobyxmoadg.zoijcleaow(new WeakReference(obj, this.f6760zoijcleaow));
    }

    public final Object zoijcleaow() {
        iobyxmoadg();
        while (this.f6759iobyxmoadg.draadjrbmk() != 0) {
            ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = this.f6759iobyxmoadg;
            Object obj = ((Reference) ppxfxbqfkfVar.oxmwwwfdhm(ppxfxbqfkfVar.draadjrbmk() - 1)).get();
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }
}
