package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc extends iobyxmoadg {
    private final lg.btonecajqb _context;
    private transient lg.gxszxtbevo<Object> intercepted;

    public wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar, lg.btonecajqb btonecajqbVar) {
        super(gxszxtbevoVar);
        this._context = btonecajqbVar;
    }

    @Override // lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        lg.btonecajqb btonecajqbVar = this._context;
        zdlpuopuiu.lqeggnwhkg(btonecajqbVar);
        return btonecajqbVar;
    }

    public final lg.gxszxtbevo<Object> intercepted() {
        lg.gxszxtbevo gxszxtbevoVarOjitshcjhn = this.intercepted;
        if (gxszxtbevoVarOjitshcjhn == null) {
            lg.lqeggnwhkg lqeggnwhkgVar = (lg.lqeggnwhkg) getContext().get(lg.lqeggnwhkg.f62508dxjokdxxww);
            if (lqeggnwhkgVar == null || (gxszxtbevoVarOjitshcjhn = lqeggnwhkgVar.ojitshcjhn(this)) == null) {
                gxszxtbevoVarOjitshcjhn = this;
            }
            this.intercepted = gxszxtbevoVarOjitshcjhn;
        }
        return gxszxtbevoVarOjitshcjhn;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    protected void releaseIntercepted() {
        lg.gxszxtbevo<Object> gxszxtbevoVar = this.intercepted;
        if (gxszxtbevoVar != null && gxszxtbevoVar != this) {
            lg.btonecajqb.zoijcleaow zoijcleaowVar = getContext().get(lg.lqeggnwhkg.f62508dxjokdxxww);
            zdlpuopuiu.lqeggnwhkg(zoijcleaowVar);
            ((lg.lqeggnwhkg) zoijcleaowVar).btonecajqb(gxszxtbevoVar);
        }
        this.intercepted = ppxfxbqfkf.f59996zdlpuopuiu;
    }

    public wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
        this(gxszxtbevoVar, gxszxtbevoVar != null ? gxszxtbevoVar.getContext() : null);
    }
}
