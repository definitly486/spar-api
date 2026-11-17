package pj;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class skhdrjzrfn {

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {
        iobyxmoadg(Object obj) {
            super(1, obj, igdgnonuha.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((Throwable) obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(Throwable th2) {
            ((igdgnonuha) this.receiver).iwizpuwonk(th2);
        }
    }

    public static final boolean agtfadlqog(lg.btonecajqb btonecajqbVar) {
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar != null) {
            return auzgnhcxokVar.isActive();
        }
        return true;
    }

    public static final void btonecajqb(auzgnhcxok auzgnhcxokVar) {
        if (!auzgnhcxokVar.isActive()) {
            throw auzgnhcxokVar.vdvldrhtss();
        }
    }

    public static final jztzpxfvev draadjrbmk(auzgnhcxok auzgnhcxokVar, boolean z13, igdgnonuha igdgnonuhaVar) {
        return auzgnhcxokVar instanceof lxfrhoxuzk ? ((lxfrhoxuzk) auzgnhcxokVar).opjhrmiecq(z13, igdgnonuhaVar) : auzgnhcxokVar.kegysxyocb(igdgnonuhaVar.jyumaefscl(), z13, new iobyxmoadg(igdgnonuhaVar));
    }

    public static final void dxjokdxxww(lg.btonecajqb btonecajqbVar) {
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar != null) {
            dvvnrvtcbc.btonecajqb(auzgnhcxokVar);
        }
    }

    public static /* synthetic */ void eablkybsjg(lg.btonecajqb btonecajqbVar, CancellationException cancellationException, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cancellationException = null;
        }
        dvvnrvtcbc.ppxfxbqfkf(btonecajqbVar, cancellationException);
    }

    public static final auzgnhcxok gtknphoqwx(lg.btonecajqb btonecajqbVar) {
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar != null) {
            return auzgnhcxokVar;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + btonecajqbVar).toString());
    }

    public static /* synthetic */ void gxszxtbevo(auzgnhcxok auzgnhcxokVar, String str, Throwable th2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            th2 = null;
        }
        dvvnrvtcbc.wkgbmnqykc(auzgnhcxokVar, str, th2);
    }

    public static final pmvmpeiblj iobyxmoadg(auzgnhcxok auzgnhcxokVar) {
        return new iwxlajgraz(auzgnhcxokVar);
    }

    public static final Object lqeggnwhkg(auzgnhcxok auzgnhcxokVar, lg.gxszxtbevo gxszxtbevoVar) {
        auzgnhcxok.iobyxmoadg.iobyxmoadg(auzgnhcxokVar, null, 1, null);
        Object objWypolnanlu = auzgnhcxokVar.wypolnanlu(gxszxtbevoVar);
        return objWypolnanlu == mg.zoijcleaow.gxszxtbevo() ? objWypolnanlu : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final jztzpxfvev nufgyqmvbu(auzgnhcxok auzgnhcxokVar, jztzpxfvev jztzpxfvevVar) {
        return wflxmlrfwp(auzgnhcxokVar, false, new metgxyhuhe(jztzpxfvevVar), 1, null);
    }

    public static final void ppxfxbqfkf(lg.btonecajqb btonecajqbVar, CancellationException cancellationException) {
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar != null) {
            auzgnhcxokVar.nufgyqmvbu(cancellationException);
        }
    }

    public static /* synthetic */ jztzpxfvev wflxmlrfwp(auzgnhcxok auzgnhcxokVar, boolean z13, igdgnonuha igdgnonuhaVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = true;
        }
        return dvvnrvtcbc.draadjrbmk(auzgnhcxokVar, z13, igdgnonuhaVar);
    }

    public static final void wkgbmnqykc(auzgnhcxok auzgnhcxokVar, String str, Throwable th2) {
        auzgnhcxokVar.nufgyqmvbu(zfvoamnweg.iobyxmoadg(str, th2));
    }

    public static /* synthetic */ pmvmpeiblj zoijcleaow(auzgnhcxok auzgnhcxokVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            auzgnhcxokVar = null;
        }
        return dvvnrvtcbc.iobyxmoadg(auzgnhcxokVar);
    }
}
