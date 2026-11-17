package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg extends lxfrhoxuzk implements auzgnhcxok, lg.gxszxtbevo, cllcsxoeiz {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final lg.btonecajqb f76720jyumaefscl;

    public iobyxmoadg(lg.btonecajqb btonecajqbVar, boolean z13, boolean z14) {
        super(z14);
        if (z13) {
            bfopjjpdmp((auzgnhcxok) btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx));
        }
        this.f76720jyumaefscl = btonecajqbVar.plus(this);
    }

    public final void a(wypolnanlu wypolnanluVar, Object obj, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        wypolnanluVar.wkgbmnqykc(rgvfuqvkyqVar, obj, this);
    }

    protected void eslsurpljm(Throwable th2, boolean z13) {
    }

    @Override // lg.gxszxtbevo
    public final lg.btonecajqb getContext() {
        return this.f76720jyumaefscl;
    }

    @Override // pj.cllcsxoeiz
    public lg.btonecajqb getCoroutineContext() {
        return this.f76720jyumaefscl;
    }

    @Override // pj.lxfrhoxuzk, pj.auzgnhcxok
    public boolean isActive() {
        return super.isActive();
    }

    protected void krqnebusok(Object obj) {
    }

    @Override // pj.lxfrhoxuzk
    public final void oipsdeybqn(Throwable th2) {
        jpowsppfya.iobyxmoadg(this.f76720jyumaefscl, th2);
    }

    @Override // lg.gxszxtbevo
    public final void resumeWith(Object obj) {
        Object objTbqsvytpvh = tbqsvytpvh(cdpycssgdh.zoijcleaow(obj));
        if (objTbqsvytpvh == wizcaqwiak.f76797zoijcleaow) {
            return;
        }
        yzdjzghtvl(objTbqsvytpvh);
    }

    @Override // pj.lxfrhoxuzk
    public String roivzttewh() {
        String strLqeggnwhkg = wwaezpbzkn.lqeggnwhkg(this.f76720jyumaefscl);
        if (strLqeggnwhkg == null) {
            return super.roivzttewh();
        }
        return '\"' + strLqeggnwhkg + "\":" + super.roivzttewh();
    }

    @Override // pj.lxfrhoxuzk
    protected final void skhdrjzrfn(Object obj) {
        if (!(obj instanceof istkbnxepw)) {
            krqnebusok(obj);
        } else {
            istkbnxepw istkbnxepwVar = (istkbnxepw) obj;
            eslsurpljm(istkbnxepwVar.f76725iobyxmoadg, istkbnxepwVar.iobyxmoadg());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pj.lxfrhoxuzk
    public String ulzqkzuiru() {
        return kegysxyocb.iobyxmoadg(this) + " was cancelled";
    }

    protected void yzdjzghtvl(Object obj) {
        yadqdtsiqt(obj);
    }
}
