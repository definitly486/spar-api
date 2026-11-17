package uj;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class cqumvgiudr {
    private volatile AtomicReferenceArray<Object> array;

    public cqumvgiudr(int i13) {
        this.array = new AtomicReferenceArray<>(i13);
    }

    public final int iobyxmoadg() {
        return this.array.length();
    }

    public final void ppxfxbqfkf(int i13, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i13 < length) {
            atomicReferenceArray.set(i13, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(zg.gtknphoqwx.gxszxtbevo(i13 + 1, length * 2));
        for (int i14 = 0; i14 < length; i14++) {
            atomicReferenceArray2.set(i14, atomicReferenceArray.get(i14));
        }
        atomicReferenceArray2.set(i13, obj);
        this.array = atomicReferenceArray2;
    }

    public final Object zoijcleaow(int i13) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i13 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i13);
        }
        return null;
    }
}
