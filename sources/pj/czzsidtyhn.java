package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class czzsidtyhn extends pkzmftpjix {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private hg.wflxmlrfwp f76678iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private boolean f76679jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private long f76680yggfygwlhe;

    private final long czzsidtyhn(boolean z13) {
        return z13 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void iyctptxqzt(czzsidtyhn czzsidtyhnVar, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        czzsidtyhnVar.opjhrmiecq(z13);
    }

    public static /* synthetic */ void rlfsiqarku(czzsidtyhn czzsidtyhnVar, boolean z13, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        czzsidtyhnVar.xrmfcynszj(z13);
    }

    @Override // pj.pkzmftpjix
    public final pkzmftpjix jlmebxxoox(int i13, String str) {
        uj.gtknphoqwx.iobyxmoadg(i13);
        return uj.gtknphoqwx.zoijcleaow(this, str);
    }

    public boolean lxfrhoxuzk() {
        return false;
    }

    public final boolean nuxfzjnpeb() {
        hg.wflxmlrfwp wflxmlrfwpVar = this.f76678iwizpuwonk;
        if (wflxmlrfwpVar != null) {
            return wflxmlrfwpVar.isEmpty();
        }
        return true;
    }

    public final void opjhrmiecq(boolean z13) {
        this.f76680yggfygwlhe += czzsidtyhn(z13);
        if (z13) {
            return;
        }
        this.f76679jyumaefscl = true;
    }

    public abstract void shutdown();

    public abstract long tbqsvytpvh();

    public final boolean uawqvzlxes() {
        ribwqtqdhb ribwqtqdhbVar;
        hg.wflxmlrfwp wflxmlrfwpVar = this.f76678iwizpuwonk;
        if (wflxmlrfwpVar == null || (ribwqtqdhbVar = (ribwqtqdhb) wflxmlrfwpVar.lereixgezr()) == null) {
            return false;
        }
        ribwqtqdhbVar.run();
        return true;
    }

    public final boolean weqkydbzbr() {
        return this.f76680yggfygwlhe >= czzsidtyhn(true);
    }

    public final void xrmfcynszj(boolean z13) {
        long jCzzsidtyhn = this.f76680yggfygwlhe - czzsidtyhn(z13);
        this.f76680yggfygwlhe = jCzzsidtyhn;
        if (jCzzsidtyhn <= 0 && this.f76679jyumaefscl) {
            shutdown();
        }
    }

    public final void yfnezrywwk(ribwqtqdhb ribwqtqdhbVar) {
        hg.wflxmlrfwp wflxmlrfwpVar = this.f76678iwizpuwonk;
        if (wflxmlrfwpVar == null) {
            wflxmlrfwpVar = new hg.wflxmlrfwp();
            this.f76678iwizpuwonk = wflxmlrfwpVar;
        }
        wflxmlrfwpVar.addLast(ribwqtqdhbVar);
    }

    protected long zfvoamnweg() {
        hg.wflxmlrfwp wflxmlrfwpVar = this.f76678iwizpuwonk;
        return (wflxmlrfwpVar == null || wflxmlrfwpVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }
}
