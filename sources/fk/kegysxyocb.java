package fk;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kegysxyocb implements dk.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final dk.gxszxtbevo f34193iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f34194zoijcleaow;

    public /* synthetic */ kegysxyocb(dk.gxszxtbevo gxszxtbevoVar, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(gxszxtbevoVar);
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
        if (!(obj instanceof kegysxyocb)) {
            return false;
        }
        kegysxyocb kegysxyocbVar = (kegysxyocb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f34193iobyxmoadg, kegysxyocbVar.f34193iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(nufgyqmvbu(), kegysxyocbVar.nufgyqmvbu());
    }

    @Override // dk.gxszxtbevo
    public List getAnnotations() {
        return dk.gxszxtbevo.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // dk.gxszxtbevo
    public dk.agtfadlqog getKind() {
        return dk.ojitshcjhn.zoijcleaow.f29098iobyxmoadg;
    }

    @Override // dk.gxszxtbevo
    public List gxszxtbevo(int i13) {
        if (i13 >= 0) {
            return hg.jyumaefscl.wflxmlrfwp();
        }
        throw new IllegalArgumentException(("Illegal index " + i13 + ", " + nufgyqmvbu() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f34193iobyxmoadg.hashCode() * 31) + nufgyqmvbu().hashCode();
    }

    @Override // dk.gxszxtbevo
    public boolean isInline() {
        return dk.gxszxtbevo.iobyxmoadg.zoijcleaow(this);
    }

    @Override // dk.gxszxtbevo
    public dk.gxszxtbevo lqeggnwhkg(int i13) {
        if (i13 >= 0) {
            return this.f34193iobyxmoadg;
        }
        throw new IllegalArgumentException(("Illegal index " + i13 + ", " + nufgyqmvbu() + " expects only non-negative indices").toString());
    }

    @Override // dk.gxszxtbevo
    public int ppxfxbqfkf(String name) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        Integer numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(name);
        if (numVdvldrhtss != null) {
            return numVdvldrhtss.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    public String toString() {
        return nufgyqmvbu() + '(' + this.f34193iobyxmoadg + ')';
    }

    @Override // dk.gxszxtbevo
    public int wkgbmnqykc() {
        return this.f34194zoijcleaow;
    }

    @Override // dk.gxszxtbevo
    public boolean zoijcleaow() {
        return dk.gxszxtbevo.iobyxmoadg.ppxfxbqfkf(this);
    }

    private kegysxyocb(dk.gxszxtbevo gxszxtbevoVar) {
        this.f34193iobyxmoadg = gxszxtbevoVar;
        this.f34194zoijcleaow = 1;
    }
}
