package gg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss implements Serializable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f37133yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f37134zdlpuopuiu;

    public vdvldrhtss(Object obj, Object obj2) {
        this.f37134zdlpuopuiu = obj;
        this.f37133yggfygwlhe = obj2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdvldrhtss)) {
            return false;
        }
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37134zdlpuopuiu, vdvldrhtssVar.f37134zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37133yggfygwlhe, vdvldrhtssVar.f37133yggfygwlhe);
    }

    public int hashCode() {
        Object obj = this.f37134zdlpuopuiu;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f37133yggfygwlhe;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final Object iobyxmoadg() {
        return this.f37134zdlpuopuiu;
    }

    public final Object lqeggnwhkg() {
        return this.f37134zdlpuopuiu;
    }

    public final Object nufgyqmvbu() {
        return this.f37133yggfygwlhe;
    }

    public String toString() {
        return '(' + this.f37134zdlpuopuiu + ", " + this.f37133yggfygwlhe + ')';
    }

    public final Object wkgbmnqykc() {
        return this.f37133yggfygwlhe;
    }
}
