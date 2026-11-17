package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class lqeggnwhkg extends pkzmftpjix implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    final pkzmftpjix f23684yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    final xa.eablkybsjg f23685zdlpuopuiu;

    lqeggnwhkg(xa.eablkybsjg eablkybsjgVar, pkzmftpjix pkzmftpjixVar) {
        this.f23685zdlpuopuiu = (xa.eablkybsjg) xa.draadjrbmk.btonecajqb(eablkybsjgVar);
        this.f23684yggfygwlhe = (pkzmftpjix) xa.draadjrbmk.btonecajqb(pkzmftpjixVar);
    }

    @Override // com.google.common.collect.pkzmftpjix, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f23684yggfygwlhe.compare(this.f23685zdlpuopuiu.apply(obj), this.f23685zdlpuopuiu.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return this.f23685zdlpuopuiu.equals(lqeggnwhkgVar.f23685zdlpuopuiu) && this.f23684yggfygwlhe.equals(lqeggnwhkgVar.f23684yggfygwlhe);
    }

    public int hashCode() {
        return xa.dxjokdxxww.zoijcleaow(this.f23685zdlpuopuiu, this.f23684yggfygwlhe);
    }

    public String toString() {
        return this.f23684yggfygwlhe + ".onResultOf(" + this.f23685zdlpuopuiu + ")";
    }
}
