package zi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kegysxyocb implements kh.iobyxmoadg, dj.dxjokdxxww {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f130050zdlpuopuiu;

    public /* synthetic */ kegysxyocb(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private final int ageimvtcrz() {
        return ulzqkzuiru.iobyxmoadg(this) ? super.hashCode() : (((grlcpdaxtj().hashCode() * 31) + fyldjkxazc().hashCode()) * 31) + (mhtqkkgtqm() ? 1 : 0);
    }

    public abstract si.gtknphoqwx agtfadlqog();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kegysxyocb)) {
            return false;
        }
        kegysxyocb kegysxyocbVar = (kegysxyocb) obj;
        return mhtqkkgtqm() == kegysxyocbVar.mhtqkkgtqm() && aj.zdlpuopuiu.f2080iobyxmoadg.iobyxmoadg(jrbgnlbqoe(), kegysxyocbVar.jrbgnlbqoe());
    }

    public abstract List fyldjkxazc();

    @Override // kh.iobyxmoadg
    public kh.nufgyqmvbu getAnnotations() {
        return zdlpuopuiu.iobyxmoadg(ipoelvxyzq());
    }

    public abstract zeieaojujs grlcpdaxtj();

    public final int hashCode() {
        int i13 = this.f130050zdlpuopuiu;
        if (i13 != 0) {
            return i13;
        }
        int iAgeimvtcrz = ageimvtcrz();
        this.f130050zdlpuopuiu = iAgeimvtcrz;
        return iAgeimvtcrz;
    }

    public abstract opjhrmiecq ipoelvxyzq();

    public abstract kegysxyocb ixidwrxhsl(aj.lqeggnwhkg lqeggnwhkgVar);

    public abstract grlcpdaxtj jrbgnlbqoe();

    public abstract boolean mhtqkkgtqm();

    private kegysxyocb() {
    }
}
