package hm;

import cm.vdvldrhtss;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final vdvldrhtss f40792jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final vdvldrhtss f40793yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final cm.gxszxtbevo f40794zdlpuopuiu;

    wkgbmnqykc(cm.gxszxtbevo gxszxtbevoVar, vdvldrhtss vdvldrhtssVar, vdvldrhtss vdvldrhtssVar2) {
        this.f40794zdlpuopuiu = gxszxtbevoVar;
        this.f40793yggfygwlhe = vdvldrhtssVar;
        this.f40792jyumaefscl = vdvldrhtssVar2;
    }

    private int dxjokdxxww() {
        return draadjrbmk().lmojexxdyd() - agtfadlqog().lmojexxdyd();
    }

    static wkgbmnqykc vdvldrhtss(DataInput dataInput) {
        long jWkgbmnqykc = iobyxmoadg.wkgbmnqykc(dataInput);
        vdvldrhtss vdvldrhtssVarNufgyqmvbu = iobyxmoadg.nufgyqmvbu(dataInput);
        vdvldrhtss vdvldrhtssVarNufgyqmvbu2 = iobyxmoadg.nufgyqmvbu(dataInput);
        if (vdvldrhtssVarNufgyqmvbu.equals(vdvldrhtssVarNufgyqmvbu2)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new wkgbmnqykc(jWkgbmnqykc, vdvldrhtssVarNufgyqmvbu, vdvldrhtssVarNufgyqmvbu2);
    }

    private Object writeReplace() {
        return new iobyxmoadg((byte) 2, this);
    }

    public vdvldrhtss agtfadlqog() {
        return this.f40793yggfygwlhe;
    }

    public cm.wkgbmnqykc btonecajqb() {
        return this.f40794zdlpuopuiu.pmvmpeiblj(this.f40793yggfygwlhe);
    }

    public vdvldrhtss draadjrbmk() {
        return this.f40792jyumaefscl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        return this.f40794zdlpuopuiu.equals(wkgbmnqykcVar.f40794zdlpuopuiu) && this.f40793yggfygwlhe.equals(wkgbmnqykcVar.f40793yggfygwlhe) && this.f40792jyumaefscl.equals(wkgbmnqykcVar.f40792jyumaefscl);
    }

    public int hashCode() {
        return (this.f40794zdlpuopuiu.hashCode() ^ this.f40793yggfygwlhe.hashCode()) ^ Integer.rotateLeft(this.f40792jyumaefscl.hashCode(), 16);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compareTo(wkgbmnqykc wkgbmnqykcVar) {
        return btonecajqb().compareTo(wkgbmnqykcVar.btonecajqb());
    }

    public long kcexrzcfyt() {
        return this.f40794zdlpuopuiu.lereixgezr(this.f40793yggfygwlhe);
    }

    public cm.gxszxtbevo lqeggnwhkg() {
        return this.f40794zdlpuopuiu;
    }

    public cm.ppxfxbqfkf nufgyqmvbu() {
        return cm.ppxfxbqfkf.dxjokdxxww(dxjokdxxww());
    }

    List ojitshcjhn() {
        return rgvfuqvkyq() ? Collections.emptyList() : Arrays.asList(agtfadlqog(), draadjrbmk());
    }

    public boolean rgvfuqvkyq() {
        return draadjrbmk().lmojexxdyd() > agtfadlqog().lmojexxdyd();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Transition[");
        sb3.append(rgvfuqvkyq() ? "Gap" : "Overlap");
        sb3.append(" at ");
        sb3.append(this.f40794zdlpuopuiu);
        sb3.append(this.f40793yggfygwlhe);
        sb3.append(" to ");
        sb3.append(this.f40792jyumaefscl);
        sb3.append(']');
        return sb3.toString();
    }

    public cm.gxszxtbevo wkgbmnqykc() {
        return this.f40794zdlpuopuiu.sopmlzcsov(dxjokdxxww());
    }

    void zdlpuopuiu(DataOutput dataOutput) {
        iobyxmoadg.dxjokdxxww(kcexrzcfyt(), dataOutput);
        iobyxmoadg.draadjrbmk(this.f40793yggfygwlhe, dataOutput);
        iobyxmoadg.draadjrbmk(this.f40792jyumaefscl, dataOutput);
    }

    wkgbmnqykc(long j13, vdvldrhtss vdvldrhtssVar, vdvldrhtss vdvldrhtssVar2) {
        this.f40794zdlpuopuiu = cm.gxszxtbevo.stevsuqkhv(j13, 0, vdvldrhtssVar);
        this.f40793yggfygwlhe = vdvldrhtssVar;
        this.f40792jyumaefscl = vdvldrhtssVar2;
    }
}
