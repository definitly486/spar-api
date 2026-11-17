package pj;

/* JADX INFO: loaded from: classes3.dex */
final class e extends uj.esjtqupxsv implements Runnable {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final long f76685cqumvgiudr;

    public e(long j13, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar.getContext(), gxszxtbevoVar);
        this.f76685cqumvgiudr = j13;
    }

    @Override // pj.iobyxmoadg, pj.lxfrhoxuzk
    public String roivzttewh() {
        return super.roivzttewh() + "(timeMillis=" + this.f76685cqumvgiudr + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        pkzmftpjix(f.iobyxmoadg(this.f76685cqumvgiudr, crxdokpmqz.wkgbmnqykc(getContext()), this));
    }
}
