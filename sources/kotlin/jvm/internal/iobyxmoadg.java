package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg implements ojitshcjhn, Serializable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final boolean f60016cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final int f60017esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f60018iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f60019jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final int f60020lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Class f60021yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    protected final Object f60022zdlpuopuiu;

    public iobyxmoadg(int i13, Class cls, String str, String str2, int i14) {
        this(i13, gxszxtbevo.NO_RECEIVER, cls, str, str2, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return this.f60016cqumvgiudr == iobyxmoadgVar.f60016cqumvgiudr && this.f60017esjtqupxsv == iobyxmoadgVar.f60017esjtqupxsv && this.f60020lereixgezr == iobyxmoadgVar.f60020lereixgezr && zdlpuopuiu.eablkybsjg(this.f60022zdlpuopuiu, iobyxmoadgVar.f60022zdlpuopuiu) && zdlpuopuiu.eablkybsjg(this.f60021yggfygwlhe, iobyxmoadgVar.f60021yggfygwlhe) && this.f60019jyumaefscl.equals(iobyxmoadgVar.f60019jyumaefscl) && this.f60018iwizpuwonk.equals(iobyxmoadgVar.f60018iwizpuwonk);
    }

    @Override // kotlin.jvm.internal.ojitshcjhn
    public int getArity() {
        return this.f60017esjtqupxsv;
    }

    public int hashCode() {
        Object obj = this.f60022zdlpuopuiu;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.f60021yggfygwlhe;
        return ((((((((((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f60019jyumaefscl.hashCode()) * 31) + this.f60018iwizpuwonk.hashCode()) * 31) + (this.f60016cqumvgiudr ? 1231 : 1237)) * 31) + this.f60017esjtqupxsv) * 31) + this.f60020lereixgezr;
    }

    public String toString() {
        return cllcsxoeiz.dxjokdxxww(this);
    }

    public iobyxmoadg(int i13, Object obj, Class cls, String str, String str2, int i14) {
        this.f60022zdlpuopuiu = obj;
        this.f60021yggfygwlhe = cls;
        this.f60019jyumaefscl = str;
        this.f60018iwizpuwonk = str2;
        this.f60016cqumvgiudr = (i14 & 1) == 1;
        this.f60017esjtqupxsv = i13;
        this.f60020lereixgezr = i14 >> 1;
    }
}
