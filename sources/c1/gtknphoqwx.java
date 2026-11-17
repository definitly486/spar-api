package c1;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static boolean[] f18335iobyxmoadg = new boolean[3];

    static void iobyxmoadg(gxszxtbevo gxszxtbevoVar, z0.wkgbmnqykc wkgbmnqykcVar, eablkybsjg eablkybsjgVar) {
        eablkybsjgVar.f18324zdlpuopuiu = -1;
        eablkybsjgVar.f18321yggfygwlhe = -1;
        eablkybsjg.zoijcleaow zoijcleaowVar = gxszxtbevoVar.f18268jhduphickx[0];
        eablkybsjg.zoijcleaow zoijcleaowVar2 = eablkybsjg.zoijcleaow.WRAP_CONTENT;
        if (zoijcleaowVar != zoijcleaowVar2 && eablkybsjgVar.f18268jhduphickx[0] == eablkybsjg.zoijcleaow.MATCH_PARENT) {
            int i13 = eablkybsjgVar.f18303stevsuqkhv.f18442lqeggnwhkg;
            int iJlmebxxoox = gxszxtbevoVar.jlmebxxoox() - eablkybsjgVar.f18305tzroggbefp.f18442lqeggnwhkg;
            wkgbmnqykc wkgbmnqykcVar2 = eablkybsjgVar.f18303stevsuqkhv;
            wkgbmnqykcVar2.f18438dxjokdxxww = wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVar2);
            wkgbmnqykc wkgbmnqykcVar3 = eablkybsjgVar.f18305tzroggbefp;
            wkgbmnqykcVar3.f18438dxjokdxxww = wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVar3);
            wkgbmnqykcVar.gxszxtbevo(eablkybsjgVar.f18303stevsuqkhv.f18438dxjokdxxww, i13);
            wkgbmnqykcVar.gxszxtbevo(eablkybsjgVar.f18305tzroggbefp.f18438dxjokdxxww, iJlmebxxoox);
            eablkybsjgVar.f18324zdlpuopuiu = 2;
            eablkybsjgVar.eslsurpljm(i13, iJlmebxxoox);
        }
        if (gxszxtbevoVar.f18268jhduphickx[1] == zoijcleaowVar2 || eablkybsjgVar.f18268jhduphickx[1] != eablkybsjg.zoijcleaow.MATCH_PARENT) {
            return;
        }
        int i14 = eablkybsjgVar.f18275kegysxyocb.f18442lqeggnwhkg;
        int iLereixgezr = gxszxtbevoVar.lereixgezr() - eablkybsjgVar.f18281mbcevpiqjq.f18442lqeggnwhkg;
        wkgbmnqykc wkgbmnqykcVar4 = eablkybsjgVar.f18275kegysxyocb;
        wkgbmnqykcVar4.f18438dxjokdxxww = wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVar4);
        wkgbmnqykc wkgbmnqykcVar5 = eablkybsjgVar.f18281mbcevpiqjq;
        wkgbmnqykcVar5.f18438dxjokdxxww = wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVar5);
        wkgbmnqykcVar.gxszxtbevo(eablkybsjgVar.f18275kegysxyocb.f18438dxjokdxxww, i14);
        wkgbmnqykcVar.gxszxtbevo(eablkybsjgVar.f18281mbcevpiqjq.f18438dxjokdxxww, iLereixgezr);
        if (eablkybsjgVar.f18326zfvoamnweg > 0 || eablkybsjgVar.crxdokpmqz() == 8) {
            wkgbmnqykc wkgbmnqykcVar6 = eablkybsjgVar.f18284ntlheqmsrt;
            wkgbmnqykcVar6.f18438dxjokdxxww = wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVar6);
            wkgbmnqykcVar.gxszxtbevo(eablkybsjgVar.f18284ntlheqmsrt.f18438dxjokdxxww, eablkybsjgVar.f18326zfvoamnweg + i14);
        }
        eablkybsjgVar.f18321yggfygwlhe = 2;
        eablkybsjgVar.p(i14, iLereixgezr);
    }

    public static final boolean zoijcleaow(int i13, int i14) {
        return (i13 & i14) == i14;
    }
}
