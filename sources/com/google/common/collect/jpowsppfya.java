package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class jpowsppfya extends zdlpuopuiu {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    static final zdlpuopuiu f23664cqumvgiudr = new jpowsppfya(new Object[0], 0);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final transient int f23665iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final transient Object[] f23666jyumaefscl;

    jpowsppfya(Object[] objArr, int i13) {
        this.f23666jyumaefscl = objArr;
        this.f23665iwizpuwonk = i13;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    boolean agtfadlqog() {
        return false;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    int btonecajqb() {
        return this.f23665iwizpuwonk;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    int draadjrbmk() {
        return 0;
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    Object[] dxjokdxxww() {
        return this.f23666jyumaefscl;
    }

    @Override // java.util.List
    public Object get(int i13) {
        xa.draadjrbmk.nufgyqmvbu(i13, this.f23665iwizpuwonk);
        Object obj = this.f23666jyumaefscl[i13];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f23665iwizpuwonk;
    }

    @Override // com.google.common.collect.zdlpuopuiu, com.google.common.collect.oxmwwwfdhm
    int wkgbmnqykc(Object[] objArr, int i13) {
        System.arraycopy(this.f23666jyumaefscl, 0, objArr, i13, this.f23665iwizpuwonk);
        return i13 + this.f23665iwizpuwonk;
    }

    @Override // com.google.common.collect.zdlpuopuiu, com.google.common.collect.oxmwwwfdhm
    Object writeReplace() {
        return super.writeReplace();
    }
}
