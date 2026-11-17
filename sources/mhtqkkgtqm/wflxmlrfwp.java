package mhtqkkgtqm;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp extends iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private boolean f67232cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Object[] f67233iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f67234jyumaefscl;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public wflxmlrfwp(Object[] objArr, int i13, int i14, int i15) {
        super(i13, i14);
        this.f67234jyumaefscl = i15;
        Object[] objArr2 = new Object[i15];
        this.f67233iwizpuwonk = objArr2;
        ?? r13 = i13 == i14 ? 1 : 0;
        this.f67232cqumvgiudr = r13;
        objArr2[0] = objArr;
        btonecajqb(i13 - r13, 1);
    }

    private final void btonecajqb(int i13, int i14) {
        int i15 = (this.f67234jyumaefscl - i14) * 5;
        while (i14 < this.f67234jyumaefscl) {
            Object[] objArr = this.f67233iwizpuwonk;
            Object obj = objArr[i14 - 1];
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i14] = ((Object[]) obj)[agtfadlqog.iobyxmoadg(i13, i15)];
            i15 -= 5;
            i14++;
        }
    }

    private final Object dxjokdxxww() {
        int iPpxfxbqfkf = ppxfxbqfkf() & 31;
        Object obj = this.f67233iwizpuwonk[this.f67234jyumaefscl - 1];
        zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[iPpxfxbqfkf];
    }

    private final void gtknphoqwx(int i13) {
        int i14 = 0;
        while (agtfadlqog.iobyxmoadg(ppxfxbqfkf(), i14) == i13) {
            i14 += 5;
        }
        if (i14 > 0) {
            btonecajqb(ppxfxbqfkf(), ((this.f67234jyumaefscl - 1) - (i14 / 5)) + 1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void draadjrbmk(Object[] objArr, int i13, int i14, int i15) {
        eablkybsjg(i13);
        gxszxtbevo(i14);
        this.f67234jyumaefscl = i15;
        if (this.f67233iwizpuwonk.length < i15) {
            this.f67233iwizpuwonk = new Object[i15];
        }
        this.f67233iwizpuwonk[0] = objArr;
        ?? r13 = i13 == i14 ? 1 : 0;
        this.f67232cqumvgiudr = r13;
        btonecajqb(i13 - r13, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objDxjokdxxww = dxjokdxxww();
        eablkybsjg(ppxfxbqfkf() + 1);
        if (ppxfxbqfkf() == wkgbmnqykc()) {
            this.f67232cqumvgiudr = true;
            return objDxjokdxxww;
        }
        gtknphoqwx(0);
        return objDxjokdxxww;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        eablkybsjg(ppxfxbqfkf() - 1);
        if (this.f67232cqumvgiudr) {
            this.f67232cqumvgiudr = false;
            return dxjokdxxww();
        }
        gtknphoqwx(31);
        return dxjokdxxww();
    }
}
