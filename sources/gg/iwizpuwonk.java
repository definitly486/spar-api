package gg;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class iwizpuwonk implements Serializable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final Object f37111jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Object f37112yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f37113zdlpuopuiu;

    public iwizpuwonk(Object obj, Object obj2, Object obj3) {
        this.f37113zdlpuopuiu = obj;
        this.f37112yggfygwlhe = obj2;
        this.f37111jyumaefscl = obj3;
    }

    public final Object btonecajqb() {
        return this.f37111jyumaefscl;
    }

    public final Object dxjokdxxww() {
        return this.f37112yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwizpuwonk)) {
            return false;
        }
        iwizpuwonk iwizpuwonkVar = (iwizpuwonk) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37113zdlpuopuiu, iwizpuwonkVar.f37113zdlpuopuiu) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37112yggfygwlhe, iwizpuwonkVar.f37112yggfygwlhe) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37111jyumaefscl, iwizpuwonkVar.f37111jyumaefscl);
    }

    public int hashCode() {
        Object obj = this.f37113zdlpuopuiu;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f37112yggfygwlhe;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f37111jyumaefscl;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final Object iobyxmoadg() {
        return this.f37113zdlpuopuiu;
    }

    public final Object lqeggnwhkg() {
        return this.f37111jyumaefscl;
    }

    public final Object nufgyqmvbu() {
        return this.f37113zdlpuopuiu;
    }

    public String toString() {
        return '(' + this.f37113zdlpuopuiu + ", " + this.f37112yggfygwlhe + ", " + this.f37111jyumaefscl + ')';
    }

    public final Object wkgbmnqykc() {
        return this.f37112yggfygwlhe;
    }
}
