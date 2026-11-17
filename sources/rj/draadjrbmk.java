package rj;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class draadjrbmk {
    public static /* synthetic */ boolean iobyxmoadg(AtomicReferenceArray atomicReferenceArray, int i13, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i13, obj, obj2)) {
            if (atomicReferenceArray.get(i13) != obj) {
                return false;
            }
        }
        return true;
    }
}
