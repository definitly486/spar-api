package m;

import h.mhtqkkgtqm;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final float[] f64617iobyxmoadg = new float[0];

    private static final void iobyxmoadg(mhtqkkgtqm mhtqkkgtqmVar, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d23, double d24) {
        double d25 = d15;
        double d26 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d24 * d26) / 3.141592653589793d));
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double dCos2 = Math.cos(d23);
        double dSin2 = Math.sin(d23);
        double d27 = -d25;
        double d28 = d27 * dCos;
        double d29 = d16 * dSin;
        double d33 = (d28 * dSin2) - (d29 * dCos2);
        double d34 = d27 * dSin;
        double d35 = d16 * dCos;
        double d36 = (dSin2 * d34) + (dCos2 * d35);
        double d37 = d24 / ((double) iCeil);
        double d38 = d17;
        double d39 = d36;
        double d43 = d33;
        int i13 = 0;
        double d44 = d18;
        double d45 = d23;
        while (i13 < iCeil) {
            double d46 = d45 + d37;
            double dSin3 = Math.sin(d46);
            double dCos3 = Math.cos(d46);
            int i14 = iCeil;
            double d47 = (d13 + ((d25 * dCos) * dCos3)) - (d29 * dSin3);
            double d48 = d14 + (d25 * dSin * dCos3) + (d35 * dSin3);
            double d49 = (d28 * dSin3) - (d29 * dCos3);
            double d53 = (dSin3 * d34) + (dCos3 * d35);
            double d54 = d46 - d45;
            double dTan = Math.tan(d54 / ((double) 2));
            double dSin4 = (Math.sin(d54) * (Math.sqrt(d26 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            mhtqkkgtqmVar.ppxfxbqfkf((float) (d38 + (d43 * dSin4)), (float) (d44 + (d39 * dSin4)), (float) (d47 - (dSin4 * d49)), (float) (d48 - (dSin4 * d53)), (float) d47, (float) d48);
            i13++;
            d37 = d37;
            dSin = dSin;
            d38 = d47;
            d34 = d34;
            d45 = d46;
            d39 = d53;
            d26 = d26;
            d43 = d49;
            dCos = dCos;
            iCeil = i14;
            d44 = d48;
            d25 = d15;
        }
    }

    public static final mhtqkkgtqm ppxfxbqfkf(List list, mhtqkkgtqm mhtqkkgtqmVar) {
        float f13;
        float f14;
        float fPpxfxbqfkf;
        float fEablkybsjg;
        float fWkgbmnqykc;
        float fWkgbmnqykc2;
        float fGxszxtbevo;
        float fGxszxtbevo2;
        float f15;
        float f16;
        float fEablkybsjg2;
        float fWkgbmnqykc3;
        float fGxszxtbevo3;
        float f17;
        float f18;
        List list2 = list;
        mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqmVar;
        int iKcexrzcfyt = mhtqkkgtqmVar.kcexrzcfyt();
        mhtqkkgtqmVar.wflxmlrfwp();
        mhtqkkgtqmVar2.gtknphoqwx(iKcexrzcfyt);
        nufgyqmvbu nufgyqmvbuVar = list.isEmpty() ? nufgyqmvbu.zoijcleaow.f64722ppxfxbqfkf : (nufgyqmvbu) list2.get(0);
        int size = list.size();
        float f19 = 0.0f;
        int i13 = 0;
        float fPpxfxbqfkf2 = 0.0f;
        float fWkgbmnqykc4 = 0.0f;
        float fPpxfxbqfkf3 = 0.0f;
        float fWkgbmnqykc5 = 0.0f;
        float f23 = 0.0f;
        float f24 = 0.0f;
        while (i13 < size) {
            nufgyqmvbu nufgyqmvbuVar2 = (nufgyqmvbu) list2.get(i13);
            if (nufgyqmvbuVar2 instanceof nufgyqmvbu.zoijcleaow) {
                mhtqkkgtqmVar.close();
                nufgyqmvbuVar2 = nufgyqmvbuVar2;
                f19 = f19;
                i13 = i13;
                size = size;
                fPpxfxbqfkf2 = f23;
                fPpxfxbqfkf3 = fPpxfxbqfkf2;
                fWkgbmnqykc4 = f24;
                fWkgbmnqykc5 = fWkgbmnqykc4;
            } else {
                if (nufgyqmvbuVar2 instanceof nufgyqmvbu.agtfadlqog) {
                    nufgyqmvbu.agtfadlqog agtfadlqogVar = (nufgyqmvbu.agtfadlqog) nufgyqmvbuVar2;
                    fPpxfxbqfkf3 += agtfadlqogVar.ppxfxbqfkf();
                    fWkgbmnqykc5 += agtfadlqogVar.wkgbmnqykc();
                    mhtqkkgtqmVar2.nufgyqmvbu(agtfadlqogVar.ppxfxbqfkf(), agtfadlqogVar.wkgbmnqykc());
                    f23 = fPpxfxbqfkf3;
                } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.gxszxtbevo) {
                    nufgyqmvbu.gxszxtbevo gxszxtbevoVar = (nufgyqmvbu.gxszxtbevo) nufgyqmvbuVar2;
                    float fPpxfxbqfkf4 = gxszxtbevoVar.ppxfxbqfkf();
                    float fWkgbmnqykc6 = gxszxtbevoVar.wkgbmnqykc();
                    mhtqkkgtqmVar2.iobyxmoadg(gxszxtbevoVar.ppxfxbqfkf(), gxszxtbevoVar.wkgbmnqykc());
                    fPpxfxbqfkf3 = fPpxfxbqfkf4;
                    f23 = fPpxfxbqfkf3;
                    fWkgbmnqykc5 = fWkgbmnqykc6;
                } else {
                    if (nufgyqmvbuVar2 instanceof nufgyqmvbu.wflxmlrfwp) {
                        nufgyqmvbu.wflxmlrfwp wflxmlrfwpVar = (nufgyqmvbu.wflxmlrfwp) nufgyqmvbuVar2;
                        mhtqkkgtqmVar2.iwizpuwonk(wflxmlrfwpVar.ppxfxbqfkf(), wflxmlrfwpVar.wkgbmnqykc());
                        fPpxfxbqfkf3 += wflxmlrfwpVar.ppxfxbqfkf();
                        fGxszxtbevo2 = wflxmlrfwpVar.wkgbmnqykc();
                    } else {
                        if (nufgyqmvbuVar2 instanceof nufgyqmvbu.eablkybsjg) {
                            nufgyqmvbu.eablkybsjg eablkybsjgVar = (nufgyqmvbu.eablkybsjg) nufgyqmvbuVar2;
                            mhtqkkgtqmVar2.wkgbmnqykc(eablkybsjgVar.ppxfxbqfkf(), eablkybsjgVar.wkgbmnqykc());
                            fWkgbmnqykc2 = eablkybsjgVar.ppxfxbqfkf();
                            fGxszxtbevo = eablkybsjgVar.wkgbmnqykc();
                        } else {
                            if (nufgyqmvbuVar2 instanceof nufgyqmvbu.draadjrbmk) {
                                nufgyqmvbu.draadjrbmk draadjrbmkVar = (nufgyqmvbu.draadjrbmk) nufgyqmvbuVar2;
                                mhtqkkgtqmVar2.iwizpuwonk(draadjrbmkVar.ppxfxbqfkf(), f19);
                                fPpxfxbqfkf3 += draadjrbmkVar.ppxfxbqfkf();
                            } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.wkgbmnqykc) {
                                nufgyqmvbu.wkgbmnqykc wkgbmnqykcVar = (nufgyqmvbu.wkgbmnqykc) nufgyqmvbuVar2;
                                mhtqkkgtqmVar2.wkgbmnqykc(wkgbmnqykcVar.ppxfxbqfkf(), fWkgbmnqykc5);
                                fPpxfxbqfkf3 = wkgbmnqykcVar.ppxfxbqfkf();
                            } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.oxmwwwfdhm) {
                                nufgyqmvbu.oxmwwwfdhm oxmwwwfdhmVar = (nufgyqmvbu.oxmwwwfdhm) nufgyqmvbuVar2;
                                mhtqkkgtqmVar2.iwizpuwonk(f19, oxmwwwfdhmVar.ppxfxbqfkf());
                                fGxszxtbevo2 = oxmwwwfdhmVar.ppxfxbqfkf();
                            } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.kcexrzcfyt) {
                                nufgyqmvbu.kcexrzcfyt kcexrzcfytVar = (nufgyqmvbu.kcexrzcfyt) nufgyqmvbuVar2;
                                mhtqkkgtqmVar2.wkgbmnqykc(fPpxfxbqfkf3, kcexrzcfytVar.ppxfxbqfkf());
                                fWkgbmnqykc5 = kcexrzcfytVar.ppxfxbqfkf();
                            } else {
                                if (nufgyqmvbuVar2 instanceof nufgyqmvbu.gtknphoqwx) {
                                    nufgyqmvbu.gtknphoqwx gtknphoqwxVar = (nufgyqmvbu.gtknphoqwx) nufgyqmvbuVar2;
                                    mhtqkkgtqmVar.btonecajqb(gtknphoqwxVar.ppxfxbqfkf(), gtknphoqwxVar.gxszxtbevo(), gtknphoqwxVar.wkgbmnqykc(), gtknphoqwxVar.lqeggnwhkg(), gtknphoqwxVar.eablkybsjg(), gtknphoqwxVar.nufgyqmvbu());
                                    fPpxfxbqfkf = gtknphoqwxVar.wkgbmnqykc() + fPpxfxbqfkf3;
                                    fEablkybsjg = gtknphoqwxVar.lqeggnwhkg() + fWkgbmnqykc5;
                                    fPpxfxbqfkf3 += gtknphoqwxVar.eablkybsjg();
                                    fWkgbmnqykc = gtknphoqwxVar.nufgyqmvbu();
                                } else {
                                    if (nufgyqmvbuVar2 instanceof nufgyqmvbu.ppxfxbqfkf) {
                                        nufgyqmvbu.ppxfxbqfkf ppxfxbqfkfVar = (nufgyqmvbu.ppxfxbqfkf) nufgyqmvbuVar2;
                                        mhtqkkgtqmVar.ppxfxbqfkf(ppxfxbqfkfVar.ppxfxbqfkf(), ppxfxbqfkfVar.gxszxtbevo(), ppxfxbqfkfVar.wkgbmnqykc(), ppxfxbqfkfVar.lqeggnwhkg(), ppxfxbqfkfVar.eablkybsjg(), ppxfxbqfkfVar.nufgyqmvbu());
                                        fPpxfxbqfkf = ppxfxbqfkfVar.wkgbmnqykc();
                                        fEablkybsjg2 = ppxfxbqfkfVar.lqeggnwhkg();
                                        fWkgbmnqykc3 = ppxfxbqfkfVar.eablkybsjg();
                                        fGxszxtbevo3 = ppxfxbqfkfVar.nufgyqmvbu();
                                    } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.rgvfuqvkyq) {
                                        if (nufgyqmvbuVar.iobyxmoadg()) {
                                            f18 = fWkgbmnqykc5 - fWkgbmnqykc4;
                                            f17 = fPpxfxbqfkf3 - fPpxfxbqfkf2;
                                        } else {
                                            f17 = f19;
                                            f18 = f17;
                                        }
                                        nufgyqmvbu.rgvfuqvkyq rgvfuqvkyqVar = (nufgyqmvbu.rgvfuqvkyq) nufgyqmvbuVar2;
                                        mhtqkkgtqmVar.btonecajqb(f17, f18, rgvfuqvkyqVar.ppxfxbqfkf(), rgvfuqvkyqVar.eablkybsjg(), rgvfuqvkyqVar.wkgbmnqykc(), rgvfuqvkyqVar.gxszxtbevo());
                                        fPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf() + fPpxfxbqfkf3;
                                        fEablkybsjg = rgvfuqvkyqVar.eablkybsjg() + fWkgbmnqykc5;
                                        fPpxfxbqfkf3 += rgvfuqvkyqVar.wkgbmnqykc();
                                        fWkgbmnqykc = rgvfuqvkyqVar.gxszxtbevo();
                                    } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.C1346nufgyqmvbu) {
                                        if (nufgyqmvbuVar.iobyxmoadg()) {
                                            float f25 = 2;
                                            f16 = (f25 * fWkgbmnqykc5) - fWkgbmnqykc4;
                                            f15 = (fPpxfxbqfkf3 * f25) - fPpxfxbqfkf2;
                                        } else {
                                            f15 = fPpxfxbqfkf3;
                                            f16 = fWkgbmnqykc5;
                                        }
                                        nufgyqmvbu.C1346nufgyqmvbu c1346nufgyqmvbu = (nufgyqmvbu.C1346nufgyqmvbu) nufgyqmvbuVar2;
                                        mhtqkkgtqmVar.ppxfxbqfkf(f15, f16, c1346nufgyqmvbu.ppxfxbqfkf(), c1346nufgyqmvbu.eablkybsjg(), c1346nufgyqmvbu.wkgbmnqykc(), c1346nufgyqmvbu.gxszxtbevo());
                                        fPpxfxbqfkf = c1346nufgyqmvbu.ppxfxbqfkf();
                                        fEablkybsjg2 = c1346nufgyqmvbu.eablkybsjg();
                                        fWkgbmnqykc3 = c1346nufgyqmvbu.wkgbmnqykc();
                                        fGxszxtbevo3 = c1346nufgyqmvbu.gxszxtbevo();
                                    } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.ojitshcjhn) {
                                        nufgyqmvbu.ojitshcjhn ojitshcjhnVar = (nufgyqmvbu.ojitshcjhn) nufgyqmvbuVar2;
                                        mhtqkkgtqmVar2.ojitshcjhn(ojitshcjhnVar.ppxfxbqfkf(), ojitshcjhnVar.eablkybsjg(), ojitshcjhnVar.wkgbmnqykc(), ojitshcjhnVar.gxszxtbevo());
                                        fPpxfxbqfkf2 = ojitshcjhnVar.ppxfxbqfkf() + fPpxfxbqfkf3;
                                        fWkgbmnqykc4 = ojitshcjhnVar.eablkybsjg() + fWkgbmnqykc5;
                                        fPpxfxbqfkf3 += ojitshcjhnVar.wkgbmnqykc();
                                        fGxszxtbevo2 = ojitshcjhnVar.gxszxtbevo();
                                    } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.lqeggnwhkg) {
                                        nufgyqmvbu.lqeggnwhkg lqeggnwhkgVar = (nufgyqmvbu.lqeggnwhkg) nufgyqmvbuVar2;
                                        mhtqkkgtqmVar2.draadjrbmk(lqeggnwhkgVar.ppxfxbqfkf(), lqeggnwhkgVar.eablkybsjg(), lqeggnwhkgVar.wkgbmnqykc(), lqeggnwhkgVar.gxszxtbevo());
                                        fPpxfxbqfkf2 = lqeggnwhkgVar.ppxfxbqfkf();
                                        fWkgbmnqykc4 = lqeggnwhkgVar.eablkybsjg();
                                        fWkgbmnqykc2 = lqeggnwhkgVar.wkgbmnqykc();
                                        fGxszxtbevo = lqeggnwhkgVar.gxszxtbevo();
                                    } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.vdvldrhtss) {
                                        if (nufgyqmvbuVar.zoijcleaow()) {
                                            f13 = fPpxfxbqfkf3 - fPpxfxbqfkf2;
                                            f14 = fWkgbmnqykc5 - fWkgbmnqykc4;
                                        } else {
                                            f13 = f19;
                                            f14 = f13;
                                        }
                                        nufgyqmvbu.vdvldrhtss vdvldrhtssVar = (nufgyqmvbu.vdvldrhtss) nufgyqmvbuVar2;
                                        mhtqkkgtqmVar2.ojitshcjhn(f13, f14, vdvldrhtssVar.ppxfxbqfkf(), vdvldrhtssVar.wkgbmnqykc());
                                        fPpxfxbqfkf = f13 + fPpxfxbqfkf3;
                                        fEablkybsjg = f14 + fWkgbmnqykc5;
                                        fPpxfxbqfkf3 += vdvldrhtssVar.ppxfxbqfkf();
                                        fWkgbmnqykc = vdvldrhtssVar.wkgbmnqykc();
                                    } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.dxjokdxxww) {
                                        if (nufgyqmvbuVar.zoijcleaow()) {
                                            float f26 = 2;
                                            fPpxfxbqfkf3 = (fPpxfxbqfkf3 * f26) - fPpxfxbqfkf2;
                                            fWkgbmnqykc5 = (f26 * fWkgbmnqykc5) - fWkgbmnqykc4;
                                        }
                                        nufgyqmvbu.dxjokdxxww dxjokdxxwwVar = (nufgyqmvbu.dxjokdxxww) nufgyqmvbuVar2;
                                        mhtqkkgtqmVar2.draadjrbmk(fPpxfxbqfkf3, fWkgbmnqykc5, dxjokdxxwwVar.ppxfxbqfkf(), dxjokdxxwwVar.wkgbmnqykc());
                                        float fPpxfxbqfkf5 = dxjokdxxwwVar.ppxfxbqfkf();
                                        fWkgbmnqykc4 = fWkgbmnqykc5;
                                        nufgyqmvbuVar2 = nufgyqmvbuVar2;
                                        f19 = f19;
                                        i13 = i13;
                                        size = size;
                                        fWkgbmnqykc5 = dxjokdxxwwVar.wkgbmnqykc();
                                        float f27 = fPpxfxbqfkf3;
                                        fPpxfxbqfkf3 = fPpxfxbqfkf5;
                                        fPpxfxbqfkf2 = f27;
                                    } else if (nufgyqmvbuVar2 instanceof nufgyqmvbu.btonecajqb) {
                                        nufgyqmvbu.btonecajqb btonecajqbVar = (nufgyqmvbu.btonecajqb) nufgyqmvbuVar2;
                                        float fPpxfxbqfkf6 = btonecajqbVar.ppxfxbqfkf() + fPpxfxbqfkf3;
                                        float fWkgbmnqykc7 = btonecajqbVar.wkgbmnqykc() + fWkgbmnqykc5;
                                        nufgyqmvbuVar2 = nufgyqmvbuVar2;
                                        i13 = i13;
                                        f19 = 0.0f;
                                        size = size;
                                        zoijcleaow(mhtqkkgtqmVar, fPpxfxbqfkf3, fWkgbmnqykc5, fPpxfxbqfkf6, fWkgbmnqykc7, btonecajqbVar.eablkybsjg(), btonecajqbVar.lqeggnwhkg(), btonecajqbVar.gxszxtbevo(), btonecajqbVar.nufgyqmvbu(), btonecajqbVar.dxjokdxxww());
                                        fWkgbmnqykc4 = fWkgbmnqykc7;
                                        fWkgbmnqykc5 = fWkgbmnqykc4;
                                        fPpxfxbqfkf2 = fPpxfxbqfkf6;
                                        fPpxfxbqfkf3 = fPpxfxbqfkf2;
                                    } else {
                                        nufgyqmvbuVar2 = nufgyqmvbuVar2;
                                        f19 = f19;
                                        i13 = i13;
                                        size = size;
                                        if (!(nufgyqmvbuVar2 instanceof nufgyqmvbu.iobyxmoadg)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        nufgyqmvbu.iobyxmoadg iobyxmoadgVar = (nufgyqmvbu.iobyxmoadg) nufgyqmvbuVar2;
                                        zoijcleaow(mhtqkkgtqmVar, fPpxfxbqfkf3, fWkgbmnqykc5, iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.lqeggnwhkg(), iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.dxjokdxxww());
                                        fPpxfxbqfkf3 = iobyxmoadgVar.ppxfxbqfkf();
                                        fWkgbmnqykc4 = iobyxmoadgVar.wkgbmnqykc();
                                        fWkgbmnqykc5 = fWkgbmnqykc4;
                                        fPpxfxbqfkf2 = fPpxfxbqfkf3;
                                    }
                                    fPpxfxbqfkf3 = fWkgbmnqykc3;
                                    fWkgbmnqykc5 = fGxszxtbevo3;
                                    fWkgbmnqykc4 = fEablkybsjg2;
                                    fPpxfxbqfkf2 = fPpxfxbqfkf;
                                }
                                fWkgbmnqykc5 += fWkgbmnqykc;
                                fWkgbmnqykc4 = fEablkybsjg;
                                fPpxfxbqfkf2 = fPpxfxbqfkf;
                            }
                            nufgyqmvbuVar2 = nufgyqmvbuVar2;
                            f19 = f19;
                            i13 = i13;
                            size = size;
                        }
                        fWkgbmnqykc5 = fGxszxtbevo;
                        fPpxfxbqfkf3 = fWkgbmnqykc2;
                        nufgyqmvbuVar2 = nufgyqmvbuVar2;
                        f19 = f19;
                        i13 = i13;
                        size = size;
                    }
                    fWkgbmnqykc5 += fGxszxtbevo2;
                    nufgyqmvbuVar2 = nufgyqmvbuVar2;
                    f19 = f19;
                    i13 = i13;
                    size = size;
                }
                f24 = fWkgbmnqykc5;
                nufgyqmvbuVar2 = nufgyqmvbuVar2;
                f19 = f19;
                i13 = i13;
                size = size;
            }
            i13++;
            mhtqkkgtqmVar2 = mhtqkkgtqmVar;
            nufgyqmvbuVar = nufgyqmvbuVar2;
            f19 = f19;
            size = size;
            list2 = list;
        }
        return mhtqkkgtqmVar;
    }

    private static final void zoijcleaow(mhtqkkgtqm mhtqkkgtqmVar, double d13, double d14, double d15, double d16, double d17, double d18, double d19, boolean z13, boolean z14) {
        double d23;
        double d24;
        double d25 = (d19 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d25);
        double dSin = Math.sin(d25);
        double d26 = ((d13 * dCos) + (d14 * dSin)) / d17;
        double d27 = (((-d13) * dSin) + (d14 * dCos)) / d18;
        double d28 = ((d15 * dCos) + (d16 * dSin)) / d17;
        double d29 = (((-d15) * dSin) + (d16 * dCos)) / d18;
        double d33 = d26 - d28;
        double d34 = d27 - d29;
        double d35 = 2;
        double d36 = (d26 + d28) / d35;
        double d37 = (d27 + d29) / d35;
        double d38 = (d33 * d33) + (d34 * d34);
        if (d38 == 0.0d) {
            return;
        }
        double d39 = (1.0d / d38) - 0.25d;
        if (d39 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d38) / 1.99999d);
            zoijcleaow(mhtqkkgtqmVar, d13, d14, d15, d16, d17 * dSqrt, d18 * dSqrt, d19, z13, z14);
            return;
        }
        double dSqrt2 = Math.sqrt(d39);
        double d43 = d33 * dSqrt2;
        double d44 = dSqrt2 * d34;
        if (z13 == z14) {
            d23 = d36 - d44;
            d24 = d37 + d43;
        } else {
            d23 = d36 + d44;
            d24 = d37 - d43;
        }
        double dAtan2 = Math.atan2(d27 - d24, d26 - d23);
        double dAtan3 = Math.atan2(d29 - d24, d28 - d23) - dAtan2;
        if (z14 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d45 = d23 * d17;
        double d46 = d24 * d18;
        iobyxmoadg(mhtqkkgtqmVar, (d45 * dCos) - (d46 * dSin), (d45 * dSin) + (d46 * dCos), d17, d18, d13, d14, d25, dAtan2, dAtan3);
    }
}
