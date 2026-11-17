package com.bumptech.glide;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojitshcjhn implements Cloneable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private e9.eablkybsjg f21152zdlpuopuiu = e9.ppxfxbqfkf.ppxfxbqfkf();

    private ojitshcjhn ppxfxbqfkf() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ojitshcjhn) {
            return g9.draadjrbmk.wkgbmnqykc(this.f21152zdlpuopuiu, ((ojitshcjhn) obj).f21152zdlpuopuiu);
        }
        return false;
    }

    public int hashCode() {
        e9.eablkybsjg eablkybsjgVar = this.f21152zdlpuopuiu;
        if (eablkybsjgVar != null) {
            return eablkybsjgVar.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public final ojitshcjhn clone() {
        try {
            return (ojitshcjhn) super.clone();
        } catch (CloneNotSupportedException e13) {
            throw new RuntimeException(e13);
        }
    }

    public final ojitshcjhn wkgbmnqykc(e9.eablkybsjg eablkybsjgVar) {
        this.f21152zdlpuopuiu = (e9.eablkybsjg) g9.gtknphoqwx.eablkybsjg(eablkybsjgVar);
        return ppxfxbqfkf();
    }

    final e9.eablkybsjg zoijcleaow() {
        return this.f21152zdlpuopuiu;
    }
}
