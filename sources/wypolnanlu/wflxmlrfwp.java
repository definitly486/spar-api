package wypolnanlu;

import istkbnxepw.opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public class wflxmlrfwp implements istkbnxepw.ojitshcjhn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final istkbnxepw.ojitshcjhn f120779iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f120780ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final opjhrmiecq f120781zoijcleaow;

    public wflxmlrfwp(opjhrmiecq opjhrmiecqVar, istkbnxepw.ojitshcjhn ojitshcjhnVar) {
        this(ojitshcjhnVar, opjhrmiecqVar, -1L);
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.draadjrbmk eablkybsjg() {
        istkbnxepw.ojitshcjhn ojitshcjhnVar = this.f120779iobyxmoadg;
        return ojitshcjhnVar != null ? ojitshcjhnVar.eablkybsjg() : istkbnxepw.draadjrbmk.UNKNOWN;
    }

    @Override // istkbnxepw.ojitshcjhn
    public long getTimestamp() {
        istkbnxepw.ojitshcjhn ojitshcjhnVar = this.f120779iobyxmoadg;
        if (ojitshcjhnVar != null) {
            return ojitshcjhnVar.getTimestamp();
        }
        long j13 = this.f120780ppxfxbqfkf;
        if (j13 != -1) {
            return j13;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.wflxmlrfwp gxszxtbevo() {
        istkbnxepw.ojitshcjhn ojitshcjhnVar = this.f120779iobyxmoadg;
        return ojitshcjhnVar != null ? ojitshcjhnVar.gxszxtbevo() : istkbnxepw.wflxmlrfwp.UNKNOWN;
    }

    @Override // istkbnxepw.ojitshcjhn
    public opjhrmiecq iobyxmoadg() {
        return this.f120781zoijcleaow;
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.gtknphoqwx lqeggnwhkg() {
        istkbnxepw.ojitshcjhn ojitshcjhnVar = this.f120779iobyxmoadg;
        return ojitshcjhnVar != null ? ojitshcjhnVar.lqeggnwhkg() : istkbnxepw.gtknphoqwx.UNKNOWN;
    }

    @Override // istkbnxepw.ojitshcjhn
    public istkbnxepw.agtfadlqog ppxfxbqfkf() {
        istkbnxepw.ojitshcjhn ojitshcjhnVar = this.f120779iobyxmoadg;
        return ojitshcjhnVar != null ? ojitshcjhnVar.ppxfxbqfkf() : istkbnxepw.agtfadlqog.UNKNOWN;
    }

    public wflxmlrfwp(opjhrmiecq opjhrmiecqVar, long j13) {
        this(null, opjhrmiecqVar, j13);
    }

    private wflxmlrfwp(istkbnxepw.ojitshcjhn ojitshcjhnVar, opjhrmiecq opjhrmiecqVar, long j13) {
        this.f120779iobyxmoadg = ojitshcjhnVar;
        this.f120781zoijcleaow = opjhrmiecqVar;
        this.f120780ppxfxbqfkf = j13;
    }
}
