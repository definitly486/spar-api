package bl;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final AtomicReference[] f16655eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final int f16658wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final cdpycssgdh f16656iobyxmoadg = new cdpycssgdh();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final int f16659zoijcleaow = 65536;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final istkbnxepw f16657ppxfxbqfkf = new istkbnxepw(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f16658wkgbmnqykc = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i13 = 0; i13 < iHighestOneBit; i13++) {
            atomicReferenceArr[i13] = new AtomicReference();
        }
        f16655eablkybsjg = atomicReferenceArr;
    }

    private cdpycssgdh() {
    }

    private final AtomicReference iobyxmoadg() {
        return f16655eablkybsjg[(int) (Thread.currentThread().getId() & (((long) f16658wkgbmnqykc) - 1))];
    }

    public static final istkbnxepw ppxfxbqfkf() {
        AtomicReference atomicReferenceIobyxmoadg = f16656iobyxmoadg.iobyxmoadg();
        istkbnxepw istkbnxepwVar = f16657ppxfxbqfkf;
        istkbnxepw istkbnxepwVar2 = (istkbnxepw) atomicReferenceIobyxmoadg.getAndSet(istkbnxepwVar);
        if (istkbnxepwVar2 == istkbnxepwVar) {
            return new istkbnxepw();
        }
        if (istkbnxepwVar2 == null) {
            atomicReferenceIobyxmoadg.set(null);
            return new istkbnxepw();
        }
        atomicReferenceIobyxmoadg.set(istkbnxepwVar2.f16699gxszxtbevo);
        istkbnxepwVar2.f16699gxszxtbevo = null;
        istkbnxepwVar2.f16702ppxfxbqfkf = 0;
        return istkbnxepwVar2;
    }

    public static final void zoijcleaow(istkbnxepw segment) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(segment, "segment");
        if (segment.f16699gxszxtbevo != null || segment.f16701lqeggnwhkg != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f16703wkgbmnqykc) {
            return;
        }
        AtomicReference atomicReferenceIobyxmoadg = f16656iobyxmoadg.iobyxmoadg();
        istkbnxepw istkbnxepwVar = f16657ppxfxbqfkf;
        istkbnxepw istkbnxepwVar2 = (istkbnxepw) atomicReferenceIobyxmoadg.getAndSet(istkbnxepwVar);
        if (istkbnxepwVar2 == istkbnxepwVar) {
            return;
        }
        int i13 = istkbnxepwVar2 != null ? istkbnxepwVar2.f16702ppxfxbqfkf : 0;
        if (i13 >= f16659zoijcleaow) {
            atomicReferenceIobyxmoadg.set(istkbnxepwVar2);
            return;
        }
        segment.f16699gxszxtbevo = istkbnxepwVar2;
        segment.f16704zoijcleaow = 0;
        segment.f16702ppxfxbqfkf = i13 + 8192;
        atomicReferenceIobyxmoadg.set(segment);
    }
}
