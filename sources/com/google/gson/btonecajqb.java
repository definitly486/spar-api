package com.google.gson;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class btonecajqb extends nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.google.gson.internal.lqeggnwhkg f24949zdlpuopuiu = new com.google.gson.internal.lqeggnwhkg(false);

    public void agtfadlqog(String str, String str2) {
        wflxmlrfwp(str, str2 == null ? dxjokdxxww.f24950zdlpuopuiu : new gtknphoqwx(str2));
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof btonecajqb) && ((btonecajqb) obj).f24949zdlpuopuiu.equals(this.f24949zdlpuopuiu));
    }

    public int hashCode() {
        return this.f24949zdlpuopuiu.hashCode();
    }

    public nufgyqmvbu kcexrzcfyt(String str) {
        return (nufgyqmvbu) this.f24949zdlpuopuiu.remove(str);
    }

    public Set ojitshcjhn() {
        return this.f24949zdlpuopuiu.entrySet();
    }

    public Set oxmwwwfdhm() {
        return this.f24949zdlpuopuiu.keySet();
    }

    public nufgyqmvbu rgvfuqvkyq(String str) {
        return (nufgyqmvbu) this.f24949zdlpuopuiu.get(str);
    }

    public boolean vdvldrhtss(String str) {
        return this.f24949zdlpuopuiu.containsKey(str);
    }

    public void wflxmlrfwp(String str, nufgyqmvbu nufgyqmvbuVar) {
        com.google.gson.internal.lqeggnwhkg lqeggnwhkgVar = this.f24949zdlpuopuiu;
        if (nufgyqmvbuVar == null) {
            nufgyqmvbuVar = dxjokdxxww.f24950zdlpuopuiu;
        }
        lqeggnwhkgVar.put(str, nufgyqmvbuVar);
    }
}
