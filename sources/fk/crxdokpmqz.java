package fk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class crxdokpmqz implements dk.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f34114iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final dk.gxszxtbevo f34115ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f34116wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final dk.gxszxtbevo f34117zoijcleaow;

    public /* synthetic */ crxdokpmqz(String str, dk.gxszxtbevo gxszxtbevoVar, dk.gxszxtbevo gxszxtbevoVar2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, gxszxtbevoVar, gxszxtbevoVar2);
    }

    @Override // dk.gxszxtbevo
    public boolean dxjokdxxww(int i13) {
        if (i13 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i13 + ", " + nufgyqmvbu() + " expects only non-negative indices").toString());
    }

    @Override // dk.gxszxtbevo
    public String eablkybsjg(int i13) {
        return String.valueOf(i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crxdokpmqz)) {
            return false;
        }
        crxdokpmqz crxdokpmqzVar = (crxdokpmqz) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(), crxdokpmqzVar.nufgyqmvbu()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34117zoijcleaow, crxdokpmqzVar.f34117zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34115ppxfxbqfkf, crxdokpmqzVar.f34115ppxfxbqfkf);
    }

    @Override // dk.gxszxtbevo
    public List getAnnotations() {
        return dk.gxszxtbevo.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // dk.gxszxtbevo
    public dk.agtfadlqog getKind() {
        return dk.ojitshcjhn.ppxfxbqfkf.f29096iobyxmoadg;
    }

    @Override // dk.gxszxtbevo
    public List gxszxtbevo(int i13) {
        if (i13 >= 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        throw new IllegalArgumentException(("Illegal index " + i13 + ", " + nufgyqmvbu() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((nufgyqmvbu().hashCode() * 31) + this.f34117zoijcleaow.hashCode()) * 31) + this.f34115ppxfxbqfkf.hashCode();
    }

    @Override // dk.gxszxtbevo
    public boolean isInline() {
        return dk.gxszxtbevo.iobyxmoadg.zoijcleaow(this);
    }

    @Override // dk.gxszxtbevo
    public dk.gxszxtbevo lqeggnwhkg(int i13) {
        if (i13 >= 0) {
            int i14 = i13 % 2;
            if (i14 == 0) {
                return this.f34117zoijcleaow;
            }
            if (i14 == 1) {
                return this.f34115ppxfxbqfkf;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i13 + ", " + nufgyqmvbu() + " expects only non-negative indices").toString());
    }

    @Override // dk.gxszxtbevo
    public String nufgyqmvbu() {
        return this.f34114iobyxmoadg;
    }

    @Override // dk.gxszxtbevo
    public int ppxfxbqfkf(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        Integer numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(name);
        if (numVdvldrhtss != null) {
            return numVdvldrhtss.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    public String toString() {
        return nufgyqmvbu() + '(' + this.f34117zoijcleaow + ", " + this.f34115ppxfxbqfkf + ')';
    }

    @Override // dk.gxszxtbevo
    public int wkgbmnqykc() {
        return this.f34116wkgbmnqykc;
    }

    @Override // dk.gxszxtbevo
    public boolean zoijcleaow() {
        return dk.gxszxtbevo.iobyxmoadg.ppxfxbqfkf(this);
    }

    private crxdokpmqz(String str, dk.gxszxtbevo gxszxtbevoVar, dk.gxszxtbevo gxszxtbevoVar2) {
        this.f34114iobyxmoadg = str;
        this.f34117zoijcleaow = gxszxtbevoVar;
        this.f34115ppxfxbqfkf = gxszxtbevoVar2;
        this.f34116wkgbmnqykc = 2;
    }
}
