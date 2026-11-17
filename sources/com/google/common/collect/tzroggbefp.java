package com.google.common.collect;

/* JADX INFO: loaded from: classes2.dex */
final class tzroggbefp extends jyumaefscl {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    final transient Object f23691jyumaefscl;

    tzroggbefp(Object obj) {
        this.f23691jyumaefscl = xa.draadjrbmk.btonecajqb(obj);
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    boolean agtfadlqog() {
        return false;
    }

    @Override // com.google.common.collect.oxmwwwfdhm, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f23691jyumaefscl.equals(obj);
    }

    @Override // com.google.common.collect.jyumaefscl, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f23691jyumaefscl.hashCode();
    }

    @Override // com.google.common.collect.jyumaefscl, com.google.common.collect.oxmwwwfdhm
    public zdlpuopuiu iobyxmoadg() {
        return zdlpuopuiu.istkbnxepw(this.f23691jyumaefscl);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: ojitshcjhn */
    public ulzqkzuiru iterator() {
        return cqumvgiudr.rgvfuqvkyq(this.f23691jyumaefscl);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f23691jyumaefscl.toString() + ']';
    }

    @Override // com.google.common.collect.oxmwwwfdhm
    int wkgbmnqykc(Object[] objArr, int i13) {
        objArr[i13] = this.f23691jyumaefscl;
        return i13 + 1;
    }

    @Override // com.google.common.collect.jyumaefscl, com.google.common.collect.oxmwwwfdhm
    Object writeReplace() {
        return super.writeReplace();
    }
}
