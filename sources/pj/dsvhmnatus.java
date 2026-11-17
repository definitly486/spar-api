package pj;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dsvhmnatus {
    public static final cllcsxoeiz dxjokdxxww(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar) {
        return new uj.wkgbmnqykc(cllcsxoeizVar.getCoroutineContext().plus(btonecajqbVar));
    }

    public static /* synthetic */ void eablkybsjg(cllcsxoeiz cllcsxoeizVar, CancellationException cancellationException, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            cancellationException = null;
        }
        wkgbmnqykc(cllcsxoeizVar, cancellationException);
    }

    public static final Object gxszxtbevo(tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        uj.esjtqupxsv esjtqupxsvVar = new uj.esjtqupxsv(gxszxtbevoVar.getContext(), gxszxtbevoVar);
        Object objZoijcleaow = vj.zoijcleaow.zoijcleaow(esjtqupxsvVar, esjtqupxsvVar, rgvfuqvkyqVar);
        if (objZoijcleaow == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objZoijcleaow;
    }

    public static final cllcsxoeiz iobyxmoadg(lg.btonecajqb btonecajqbVar) {
        if (btonecajqbVar.get(auzgnhcxok.f76671gtknphoqwx) == null) {
            btonecajqbVar = btonecajqbVar.plus(skhdrjzrfn.zoijcleaow(null, 1, null));
        }
        return new uj.wkgbmnqykc(btonecajqbVar);
    }

    public static final void lqeggnwhkg(cllcsxoeiz cllcsxoeizVar) {
        dvvnrvtcbc.dxjokdxxww(cllcsxoeizVar.getCoroutineContext());
    }

    public static final boolean nufgyqmvbu(cllcsxoeiz cllcsxoeizVar) {
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) cllcsxoeizVar.getCoroutineContext().get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar != null) {
            return auzgnhcxokVar.isActive();
        }
        return true;
    }

    public static final void ppxfxbqfkf(cllcsxoeiz cllcsxoeizVar, String str, Throwable th2) {
        wkgbmnqykc(cllcsxoeizVar, zfvoamnweg.iobyxmoadg(str, th2));
    }

    public static final void wkgbmnqykc(cllcsxoeiz cllcsxoeizVar, CancellationException cancellationException) {
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) cllcsxoeizVar.getCoroutineContext().get(auzgnhcxok.f76671gtknphoqwx);
        if (auzgnhcxokVar != null) {
            auzgnhcxokVar.nufgyqmvbu(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + cllcsxoeizVar).toString());
    }

    public static final cllcsxoeiz zoijcleaow() {
        return new uj.wkgbmnqykc(krqnebusok.zoijcleaow(null, 1, null).plus(ikoacuggdj.ppxfxbqfkf()));
    }
}
