package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
final class cllcsxoeiz extends jyumaefscl {

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final Object[] f23625pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    static final cllcsxoeiz f23626zynmafqrjb;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    final transient Object[] f23627cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final transient int f23628esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final transient int f23629iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final transient Object[] f23630jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final transient int f23631lereixgezr;

    static {
        Object[] objArr = new Object[0];
        f23625pmvmpeiblj = objArr;
        f23626zynmafqrjb = new cllcsxoeiz(objArr, 0, objArr, 0, 0);
    }

    cllcsxoeiz(Object[] objArr, int i13, Object[] objArr2, int i14, int i15) {
        this.f23630jyumaefscl = objArr;
        this.f23629iwizpuwonk = i13;
        this.f23627cqumvgiudr = objArr2;
        this.f23628esjtqupxsv = i14;
        this.f23631lereixgezr = i15;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    boolean agtfadlqog() {
        return false;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    int btonecajqb() {
        return this.f23631lereixgezr;
    }

    @Override // com.google.common.collect.oxmwwwfdhm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f23627cqumvgiudr;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iPpxfxbqfkf = vdvldrhtss.ppxfxbqfkf(obj);
        while (true) {
            int i13 = iPpxfxbqfkf & this.f23628esjtqupxsv;
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iPpxfxbqfkf = i13 + 1;
        }
    }

    @Override // com.google.common.collect.jyumaefscl
    zdlpuopuiu cqumvgiudr() {
        return zdlpuopuiu.vdvldrhtss(this.f23630jyumaefscl, this.f23631lereixgezr);
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    int draadjrbmk() {
        return 0;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    Object[] dxjokdxxww() {
        return this.f23630jyumaefscl;
    }

    @Override // com.google.common.collect.jyumaefscl, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f23629iwizpuwonk;
    }

    @Override // com.google.common.collect.jyumaefscl
    boolean lereixgezr() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: ojitshcjhn */
    public ulzqkzuiru iterator() {
        return iobyxmoadg().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f23631lereixgezr;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    int wkgbmnqykc(Object[] objArr, int i13) {
        System.arraycopy(this.f23630jyumaefscl, 0, objArr, i13, this.f23631lereixgezr);
        return i13 + this.f23631lereixgezr;
    }

    @Override // com.google.common.collect.jyumaefscl, com.google.common.collect.oxmwwwfdhm
    Object writeReplace() {
        return super.writeReplace();
    }
}
