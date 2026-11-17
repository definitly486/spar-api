package com.bumptech.glide.load.engine;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
final class wkgbmnqykc implements l8.eablkybsjg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final l8.eablkybsjg f21016ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final l8.eablkybsjg f21017zoijcleaow;

    wkgbmnqykc(l8.eablkybsjg eablkybsjgVar, l8.eablkybsjg eablkybsjgVar2) {
        this.f21017zoijcleaow = eablkybsjgVar;
        this.f21016ppxfxbqfkf = eablkybsjgVar2;
    }

    @Override // l8.eablkybsjg
    public boolean equals(Object obj) {
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f21017zoijcleaow.equals(wkgbmnqykcVar.f21017zoijcleaow) && this.f21016ppxfxbqfkf.equals(wkgbmnqykcVar.f21016ppxfxbqfkf);
    }

    @Override // l8.eablkybsjg
    public int hashCode() {
        return (this.f21017zoijcleaow.hashCode() * 31) + this.f21016ppxfxbqfkf.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f21017zoijcleaow + ", signature=" + this.f21016ppxfxbqfkf + '}';
    }

    @Override // l8.eablkybsjg
    public void zoijcleaow(MessageDigest messageDigest) {
        this.f21017zoijcleaow.zoijcleaow(messageDigest);
        this.f21016ppxfxbqfkf.zoijcleaow(messageDigest);
    }
}
