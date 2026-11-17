package ixidwrxhsl;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class yggfygwlhe implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f50006jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f50007yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Object[] f50008zdlpuopuiu = zdlpuopuiu.f50009eablkybsjg.iobyxmoadg().rgvfuqvkyq();

    public final void btonecajqb() {
        fmlbqenlif.iobyxmoadg.iobyxmoadg(gxszxtbevo());
        this.f50006jyumaefscl++;
    }

    public final void draadjrbmk(Object[] objArr, int i13, int i14) {
        this.f50008zdlpuopuiu = objArr;
        this.f50007yggfygwlhe = i13;
        this.f50006jyumaefscl = i14;
    }

    public final void dxjokdxxww() {
        fmlbqenlif.iobyxmoadg.iobyxmoadg(eablkybsjg());
        this.f50006jyumaefscl += 2;
    }

    public final boolean eablkybsjg() {
        return this.f50006jyumaefscl < this.f50007yggfygwlhe;
    }

    public final void gtknphoqwx(Object[] objArr, int i13) {
        draadjrbmk(objArr, i13, 0);
    }

    public final boolean gxszxtbevo() {
        fmlbqenlif.iobyxmoadg.iobyxmoadg(this.f50006jyumaefscl >= this.f50007yggfygwlhe);
        return this.f50006jyumaefscl < this.f50008zdlpuopuiu.length;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return eablkybsjg();
    }

    public final Object iobyxmoadg() {
        fmlbqenlif.iobyxmoadg.iobyxmoadg(eablkybsjg());
        return this.f50008zdlpuopuiu[this.f50006jyumaefscl];
    }

    protected final Object[] ppxfxbqfkf() {
        return this.f50008zdlpuopuiu;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    protected final void wflxmlrfwp(int i13) {
        this.f50006jyumaefscl = i13;
    }

    protected final int wkgbmnqykc() {
        return this.f50006jyumaefscl;
    }

    public final zdlpuopuiu zoijcleaow() {
        fmlbqenlif.iobyxmoadg.iobyxmoadg(gxszxtbevo());
        Object obj = this.f50008zdlpuopuiu[this.f50006jyumaefscl];
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (zdlpuopuiu) obj;
    }
}
