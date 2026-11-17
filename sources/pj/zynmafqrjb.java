package pj;

/* JADX INFO: loaded from: classes3.dex */
final class zynmafqrjb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Throwable f76808eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final Object f76809iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final tg.vdvldrhtss f76810ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Object f76811wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final wflxmlrfwp f76812zoijcleaow;

    public zynmafqrjb(Object obj, wflxmlrfwp wflxmlrfwpVar, tg.vdvldrhtss vdvldrhtssVar, Object obj2, Throwable th2) {
        this.f76809iobyxmoadg = obj;
        this.f76812zoijcleaow = wflxmlrfwpVar;
        this.f76810ppxfxbqfkf = vdvldrhtssVar;
        this.f76811wkgbmnqykc = obj2;
        this.f76808eablkybsjg = th2;
    }

    public static /* synthetic */ zynmafqrjb zoijcleaow(zynmafqrjb zynmafqrjbVar, Object obj, wflxmlrfwp wflxmlrfwpVar, tg.vdvldrhtss vdvldrhtssVar, Object obj2, Throwable th2, int i13, Object obj3) {
        if ((i13 & 1) != 0) {
            obj = zynmafqrjbVar.f76809iobyxmoadg;
        }
        if ((i13 & 2) != 0) {
            wflxmlrfwpVar = zynmafqrjbVar.f76812zoijcleaow;
        }
        wflxmlrfwp wflxmlrfwpVar2 = wflxmlrfwpVar;
        if ((i13 & 4) != 0) {
            vdvldrhtssVar = zynmafqrjbVar.f76810ppxfxbqfkf;
        }
        tg.vdvldrhtss vdvldrhtssVar2 = vdvldrhtssVar;
        if ((i13 & 8) != 0) {
            obj2 = zynmafqrjbVar.f76811wkgbmnqykc;
        }
        Object obj4 = obj2;
        if ((i13 & 16) != 0) {
            th2 = zynmafqrjbVar.f76808eablkybsjg;
        }
        return zynmafqrjbVar.iobyxmoadg(obj, wflxmlrfwpVar2, vdvldrhtssVar2, obj4, th2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zynmafqrjb)) {
            return false;
        }
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f76809iobyxmoadg, zynmafqrjbVar.f76809iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f76812zoijcleaow, zynmafqrjbVar.f76812zoijcleaow) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f76810ppxfxbqfkf, zynmafqrjbVar.f76810ppxfxbqfkf) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f76811wkgbmnqykc, zynmafqrjbVar.f76811wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f76808eablkybsjg, zynmafqrjbVar.f76808eablkybsjg);
    }

    public int hashCode() {
        Object obj = this.f76809iobyxmoadg;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        wflxmlrfwp wflxmlrfwpVar = this.f76812zoijcleaow;
        int iHashCode2 = (iHashCode + (wflxmlrfwpVar == null ? 0 : wflxmlrfwpVar.hashCode())) * 31;
        tg.vdvldrhtss vdvldrhtssVar = this.f76810ppxfxbqfkf;
        int iHashCode3 = (iHashCode2 + (vdvldrhtssVar == null ? 0 : vdvldrhtssVar.hashCode())) * 31;
        Object obj2 = this.f76811wkgbmnqykc;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f76808eablkybsjg;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final zynmafqrjb iobyxmoadg(Object obj, wflxmlrfwp wflxmlrfwpVar, tg.vdvldrhtss vdvldrhtssVar, Object obj2, Throwable th2) {
        return new zynmafqrjb(obj, wflxmlrfwpVar, vdvldrhtssVar, obj2, th2);
    }

    public final boolean ppxfxbqfkf() {
        return this.f76808eablkybsjg != null;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f76809iobyxmoadg + ", cancelHandler=" + this.f76812zoijcleaow + ", onCancellation=" + this.f76810ppxfxbqfkf + ", idempotentResume=" + this.f76811wkgbmnqykc + ", cancelCause=" + this.f76808eablkybsjg + ')';
    }

    public final void wkgbmnqykc(rgvfuqvkyq rgvfuqvkyqVar, Throwable th2) {
        wflxmlrfwp wflxmlrfwpVar = this.f76812zoijcleaow;
        if (wflxmlrfwpVar != null) {
            rgvfuqvkyqVar.btonecajqb(wflxmlrfwpVar, th2);
        }
        tg.vdvldrhtss vdvldrhtssVar = this.f76810ppxfxbqfkf;
        if (vdvldrhtssVar != null) {
            rgvfuqvkyqVar.gtknphoqwx(vdvldrhtssVar, th2, this.f76809iobyxmoadg);
        }
    }

    public /* synthetic */ zynmafqrjb(Object obj, wflxmlrfwp wflxmlrfwpVar, tg.vdvldrhtss vdvldrhtssVar, Object obj2, Throwable th2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(obj, (i13 & 2) != 0 ? null : wflxmlrfwpVar, (i13 & 4) != 0 ? null : vdvldrhtssVar, (i13 & 8) != 0 ? null : obj2, (i13 & 16) != 0 ? null : th2);
    }
}
