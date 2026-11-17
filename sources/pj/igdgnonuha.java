package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class igdgnonuha extends uj.agtfadlqog implements jztzpxfvev, zeieaojujs {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public lxfrhoxuzk f76716iwizpuwonk;

    public final void cqumvgiudr(lxfrhoxuzk lxfrhoxuzkVar) {
        this.f76716iwizpuwonk = lxfrhoxuzkVar;
    }

    @Override // pj.jztzpxfvev
    public void iobyxmoadg() {
        yggfygwlhe().hszhottldk(this);
    }

    @Override // pj.zeieaojujs
    public boolean isActive() {
        return true;
    }

    public abstract void iwizpuwonk(Throwable th2);

    public abstract boolean jyumaefscl();

    @Override // pj.zeieaojujs
    public fyldjkxazc ppxfxbqfkf() {
        return null;
    }

    @Override // uj.agtfadlqog
    public String toString() {
        return kegysxyocb.iobyxmoadg(this) + '@' + kegysxyocb.zoijcleaow(this) + "[job@" + kegysxyocb.zoijcleaow(yggfygwlhe()) + ']';
    }

    public final lxfrhoxuzk yggfygwlhe() {
        lxfrhoxuzk lxfrhoxuzkVar = this.f76716iwizpuwonk;
        if (lxfrhoxuzkVar != null) {
            return lxfrhoxuzkVar;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("job");
        return null;
    }
}
