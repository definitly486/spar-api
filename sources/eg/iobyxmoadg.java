package eg;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg implements Comparable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final zoijcleaow.EnumC0663zoijcleaow f31250cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final long f31251esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final String f31252iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f31253jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f31254yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f31255zdlpuopuiu;

    public iobyxmoadg(String str) {
        this(str, false);
    }

    private int zoijcleaow(iobyxmoadg iobyxmoadgVar, boolean z13) {
        int iIobyxmoadg = zoijcleaow.iobyxmoadg(this.f31253jyumaefscl, iobyxmoadgVar.f31253jyumaefscl);
        if (iIobyxmoadg != 0 || z13) {
            return iIobyxmoadg;
        }
        int iCompareTo = this.f31250cqumvgiudr.compareTo(iobyxmoadgVar.f31250cqumvgiudr);
        return iCompareTo != 0 ? iCompareTo : Long.compare(this.f31251esjtqupxsv, iobyxmoadgVar.f31251esjtqupxsv);
    }

    public long eablkybsjg() {
        if (this.f31253jyumaefscl.size() > 2) {
            return ((Long) this.f31253jyumaefscl.get(2)).longValue();
        }
        return 0L;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof iobyxmoadg) && gxszxtbevo((iobyxmoadg) obj)) {
            return true;
        }
        return super.equals(obj);
    }

    public boolean gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
        return compareTo(iobyxmoadgVar) == 0;
    }

    public final int hashCode() {
        int iHashCode = ((this.f31253jyumaefscl.hashCode() * 31) + this.f31250cqumvgiudr.hashCode()) * 31;
        long j13 = this.f31251esjtqupxsv;
        return iHashCode + ((int) (j13 ^ (j13 >>> 32)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public final int compareTo(iobyxmoadg iobyxmoadgVar) {
        return zoijcleaow(iobyxmoadgVar, false);
    }

    public boolean lqeggnwhkg(iobyxmoadg iobyxmoadgVar) {
        return compareTo(iobyxmoadgVar) > 0;
    }

    public long ppxfxbqfkf() {
        if (this.f31253jyumaefscl.size() > 0) {
            return ((Long) this.f31253jyumaefscl.get(0)).longValue();
        }
        return 0L;
    }

    public String toString() {
        return String.valueOf(this.f31255zdlpuopuiu);
    }

    public long wkgbmnqykc() {
        if (this.f31253jyumaefscl.size() > 1) {
            return ((Long) this.f31253jyumaefscl.get(1)).longValue();
        }
        return 0L;
    }

    public iobyxmoadg(String str, boolean z13) {
        this.f31254yggfygwlhe = new ArrayList();
        this.f31253jyumaefscl = new ArrayList();
        if (z13) {
            if (str == null) {
                throw new IllegalArgumentException("Argument versionString is null");
            }
            if (!zoijcleaow.nufgyqmvbu(str)) {
                throw new IllegalArgumentException("Argument versionString is no valid version");
            }
        }
        this.f31255zdlpuopuiu = str;
        if (str == null || !zoijcleaow.nufgyqmvbu(str)) {
            this.f31252iwizpuwonk = "";
        } else {
            StringBuilder sb3 = null;
            boolean z14 = false;
            for (String str2 : str.replaceAll("\\s", "").split("\\.")) {
                if (z14) {
                    sb3.append(".");
                    sb3.append(str2);
                } else if (zoijcleaow.wkgbmnqykc(str2)) {
                    this.f31254yggfygwlhe.add(Long.valueOf(zoijcleaow.lqeggnwhkg(str2)));
                } else {
                    for (int i13 = 0; i13 < str2.length(); i13++) {
                        if (!Character.isDigit(str2.charAt(i13))) {
                            sb3 = new StringBuilder();
                            if (i13 > 0) {
                                this.f31254yggfygwlhe.add(Long.valueOf(zoijcleaow.lqeggnwhkg(str2.substring(0, i13))));
                                sb3.append(str2.substring(i13));
                            } else {
                                sb3.append(str2);
                            }
                            z14 = true;
                            break;
                        }
                    }
                }
            }
            this.f31252iwizpuwonk = sb3 != null ? sb3.toString() : "";
            this.f31253jyumaefscl.addAll(this.f31254yggfygwlhe);
            while (!this.f31253jyumaefscl.isEmpty() && this.f31253jyumaefscl.lastIndexOf(0L) == this.f31253jyumaefscl.size() - 1) {
                List list = this.f31253jyumaefscl;
                list.remove(list.lastIndexOf(0L));
            }
        }
        zoijcleaow.EnumC0663zoijcleaow enumC0663zoijcleaowGxszxtbevo = zoijcleaow.gxszxtbevo(this.f31252iwizpuwonk);
        this.f31250cqumvgiudr = enumC0663zoijcleaowGxszxtbevo;
        this.f31251esjtqupxsv = zoijcleaow.eablkybsjg(this.f31252iwizpuwonk, enumC0663zoijcleaowGxszxtbevo);
    }
}
