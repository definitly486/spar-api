package pj;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class gtknphoqwx {
    public static final Object eablkybsjg(lg.btonecajqb btonecajqbVar, tg.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objB;
        lg.btonecajqb context = gxszxtbevoVar.getContext();
        lg.btonecajqb btonecajqbVarBtonecajqb = wwaezpbzkn.btonecajqb(context, btonecajqbVar);
        dvvnrvtcbc.dxjokdxxww(btonecajqbVarBtonecajqb);
        if (btonecajqbVarBtonecajqb == context) {
            uj.esjtqupxsv esjtqupxsvVar = new uj.esjtqupxsv(btonecajqbVarBtonecajqb, gxszxtbevoVar);
            objB = vj.zoijcleaow.zoijcleaow(esjtqupxsvVar, esjtqupxsvVar, rgvfuqvkyqVar);
        } else {
            lg.lqeggnwhkg.zoijcleaow zoijcleaowVar = lg.lqeggnwhkg.f62508dxjokdxxww;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(btonecajqbVarBtonecajqb.get(zoijcleaowVar), context.get(zoijcleaowVar))) {
                h hVar = new h(btonecajqbVarBtonecajqb, gxszxtbevoVar);
                lg.btonecajqb context2 = hVar.getContext();
                Object objDxjokdxxww = uj.pkzmftpjix.dxjokdxxww(context2, null);
                try {
                    Object objZoijcleaow = vj.zoijcleaow.zoijcleaow(hVar, hVar, rgvfuqvkyqVar);
                    uj.pkzmftpjix.gxszxtbevo(context2, objDxjokdxxww);
                    objB = objZoijcleaow;
                } catch (Throwable th2) {
                    uj.pkzmftpjix.gxszxtbevo(context2, objDxjokdxxww);
                    throw th2;
                }
            } else {
                jlmebxxoox jlmebxxooxVar = new jlmebxxoox(btonecajqbVarBtonecajqb, gxszxtbevoVar);
                vj.iobyxmoadg.ppxfxbqfkf(rgvfuqvkyqVar, jlmebxxooxVar, jlmebxxooxVar);
                objB = jlmebxxooxVar.b();
            }
        }
        if (objB == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objB;
    }

    public static final ntlheqmsrt iobyxmoadg(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, wypolnanlu wypolnanluVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        lg.btonecajqb btonecajqbVarGtknphoqwx = wwaezpbzkn.gtknphoqwx(cllcsxoeizVar, btonecajqbVar);
        ulzqkzuiru hszhottldkVar = wypolnanluVar.lqeggnwhkg() ? new hszhottldk(btonecajqbVarGtknphoqwx, rgvfuqvkyqVar) : new ulzqkzuiru(btonecajqbVarGtknphoqwx, true);
        hszhottldkVar.a(wypolnanluVar, hszhottldkVar, rgvfuqvkyqVar);
        return hszhottldkVar;
    }

    public static final auzgnhcxok ppxfxbqfkf(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, wypolnanlu wypolnanluVar, tg.rgvfuqvkyq rgvfuqvkyqVar) {
        lg.btonecajqb btonecajqbVarGtknphoqwx = wwaezpbzkn.gtknphoqwx(cllcsxoeizVar, btonecajqbVar);
        rhgxfdycjh fiwbwshyhdVar = wypolnanluVar.lqeggnwhkg() ? new fiwbwshyhd(btonecajqbVarGtknphoqwx, rgvfuqvkyqVar) : new rhgxfdycjh(btonecajqbVarGtknphoqwx, true);
        fiwbwshyhdVar.a(wypolnanluVar, fiwbwshyhdVar, rgvfuqvkyqVar);
        return fiwbwshyhdVar;
    }

    public static /* synthetic */ auzgnhcxok wkgbmnqykc(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, wypolnanlu wypolnanluVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            wypolnanluVar = wypolnanlu.DEFAULT;
        }
        return dxjokdxxww.ppxfxbqfkf(cllcsxoeizVar, btonecajqbVar, wypolnanluVar, rgvfuqvkyqVar);
    }

    public static /* synthetic */ ntlheqmsrt zoijcleaow(cllcsxoeiz cllcsxoeizVar, lg.btonecajqb btonecajqbVar, wypolnanlu wypolnanluVar, tg.rgvfuqvkyq rgvfuqvkyqVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        if ((i13 & 2) != 0) {
            wypolnanluVar = wypolnanlu.DEFAULT;
        }
        return dxjokdxxww.iobyxmoadg(cllcsxoeizVar, btonecajqbVar, wypolnanluVar, rgvfuqvkyqVar);
    }
}
