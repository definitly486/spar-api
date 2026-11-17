package ge;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ReferenceQueue f36911iobyxmoadg = new ReferenceQueue();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Set f36912zoijcleaow = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: ge.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public interface InterfaceC0835iobyxmoadg {
        void iobyxmoadg();
    }

    private iobyxmoadg() {
    }

    public static iobyxmoadg iobyxmoadg() {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        iobyxmoadgVar.zoijcleaow(iobyxmoadgVar, new Runnable() { // from class: ge.rgvfuqvkyq
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = iobyxmoadgVar.f36911iobyxmoadg;
        final Set set = iobyxmoadgVar.f36912zoijcleaow;
        Thread thread = new Thread(new Runnable() { // from class: ge.vdvldrhtss
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((kcexrzcfyt) referenceQueue2.remove()).iobyxmoadg();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return iobyxmoadgVar;
    }

    public InterfaceC0835iobyxmoadg zoijcleaow(Object obj, Runnable runnable) {
        kcexrzcfyt kcexrzcfytVar = new kcexrzcfyt(obj, this.f36911iobyxmoadg, this.f36912zoijcleaow, runnable, null);
        this.f36912zoijcleaow.add(kcexrzcfytVar);
        return kcexrzcfytVar;
    }
}
