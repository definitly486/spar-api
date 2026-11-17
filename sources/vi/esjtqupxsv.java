package vi;

/* JADX INFO: loaded from: classes3.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final String f116908eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final ii.zoijcleaow f116909gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f116910iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f116911ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Object f116912wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f116913zoijcleaow;

    public esjtqupxsv(Object obj, Object obj2, Object obj3, Object obj4, String filePath, ii.zoijcleaow classId) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(filePath, "filePath");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(classId, "classId");
        this.f116910iobyxmoadg = obj;
        this.f116913zoijcleaow = obj2;
        this.f116911ppxfxbqfkf = obj3;
        this.f116912wkgbmnqykc = obj4;
        this.f116908eablkybsjg = filePath;
        this.f116909gxszxtbevo = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esjtqupxsv)) {
            return false;
        }
        esjtqupxsv esjtqupxsvVar = (esjtqupxsv) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116910iobyxmoadg, esjtqupxsvVar.f116910iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116913zoijcleaow, esjtqupxsvVar.f116913zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116911ppxfxbqfkf, esjtqupxsvVar.f116911ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116912wkgbmnqykc, esjtqupxsvVar.f116912wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116908eablkybsjg, esjtqupxsvVar.f116908eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f116909gxszxtbevo, esjtqupxsvVar.f116909gxszxtbevo);
    }

    public int hashCode() {
        Object obj = this.f116910iobyxmoadg;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f116913zoijcleaow;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f116911ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f116912wkgbmnqykc;
        return ((((iHashCode3 + (obj4 != null ? obj4.hashCode() : 0)) * 31) + this.f116908eablkybsjg.hashCode()) * 31) + this.f116909gxszxtbevo.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f116910iobyxmoadg + ", compilerVersion=" + this.f116913zoijcleaow + ", languageVersion=" + this.f116911ppxfxbqfkf + ", expectedVersion=" + this.f116912wkgbmnqykc + ", filePath=" + this.f116908eablkybsjg + ", classId=" + this.f116909gxszxtbevo + ')';
    }
}
