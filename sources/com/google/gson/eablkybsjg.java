package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg extends nufgyqmvbu implements Iterable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final ArrayList f24951zdlpuopuiu = new ArrayList();

    private nufgyqmvbu ojitshcjhn() {
        int size = this.f24951zdlpuopuiu.size();
        if (size == 1) {
            return (nufgyqmvbu) this.f24951zdlpuopuiu.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public nufgyqmvbu agtfadlqog(int i13) {
        return (nufgyqmvbu) this.f24951zdlpuopuiu.get(i13);
    }

    @Override // com.google.gson.nufgyqmvbu
    public long eablkybsjg() {
        return ojitshcjhn().eablkybsjg();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof eablkybsjg) && ((eablkybsjg) obj).f24951zdlpuopuiu.equals(this.f24951zdlpuopuiu));
    }

    @Override // com.google.gson.nufgyqmvbu
    public String gxszxtbevo() {
        return ojitshcjhn().gxszxtbevo();
    }

    public int hashCode() {
        return this.f24951zdlpuopuiu.hashCode();
    }

    @Override // com.google.gson.nufgyqmvbu
    public boolean iobyxmoadg() {
        return ojitshcjhn().iobyxmoadg();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f24951zdlpuopuiu.iterator();
    }

    public int size() {
        return this.f24951zdlpuopuiu.size();
    }

    public void wflxmlrfwp(nufgyqmvbu nufgyqmvbuVar) {
        if (nufgyqmvbuVar == null) {
            nufgyqmvbuVar = dxjokdxxww.f24950zdlpuopuiu;
        }
        this.f24951zdlpuopuiu.add(nufgyqmvbuVar);
    }
}
