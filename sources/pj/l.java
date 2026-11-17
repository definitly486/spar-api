package pj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final Object iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo;
        lg.btonecajqb context = gxszxtbevoVar.getContext();
        dvvnrvtcbc.dxjokdxxww(context);
        lg.gxszxtbevo gxszxtbevoVarPpxfxbqfkf = mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar);
        uj.lqeggnwhkg lqeggnwhkgVar = gxszxtbevoVarPpxfxbqfkf instanceof uj.lqeggnwhkg ? (uj.lqeggnwhkg) gxszxtbevoVarPpxfxbqfkf : null;
        if (lqeggnwhkgVar == null) {
            objGxszxtbevo = gg.wwaezpbzkn.f37140iobyxmoadg;
        } else {
            if (lqeggnwhkgVar.f113656iwizpuwonk.ulzqkzuiru(context)) {
                lqeggnwhkgVar.btonecajqb(context, gg.wwaezpbzkn.f37140iobyxmoadg);
            } else {
                k kVar = new k();
                lg.btonecajqb btonecajqbVarPlus = context.plus(kVar);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
                lqeggnwhkgVar.btonecajqb(btonecajqbVarPlus, wwaezpbzknVar);
                objGxszxtbevo = (!kVar.f76732zdlpuopuiu || uj.nufgyqmvbu.ppxfxbqfkf(lqeggnwhkgVar)) ? mg.zoijcleaow.gxszxtbevo() : wwaezpbzknVar;
            }
            objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        }
        if (objGxszxtbevo == mg.zoijcleaow.gxszxtbevo()) {
            kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
        }
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
