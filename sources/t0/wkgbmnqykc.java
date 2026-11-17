package t0;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import gg.wwaezpbzkn;
import h.a;
import h.bfopjjpdmp;
import h.c;
import h.f;
import h.jztzpxfvev;
import hg.agtfadlqog;
import j0.gtknphoqwx;
import j0.jrbgnlbqoe;
import j0.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import m0.draadjrbmk;
import m0.ojitshcjhn;
import n0.lereixgezr;
import n0.pmvmpeiblj;
import n0.wflxmlrfwp;
import n0.yadqdtsiqt;
import tg.oxmwwwfdhm;
import tg.vdvldrhtss;
import u0.lqeggnwhkg;
import v0.kcexrzcfyt;
import v0.nufgyqmvbu;
import w0.cqumvgiudr;
import w0.iwizpuwonk;
import w0.jyumaefscl;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static final void agtfadlqog(Spannable spannable, long j13, int i13, int i14) {
        if (j13 != 16) {
            esjtqupxsv(spannable, new ForegroundColorSpan(bfopjjpdmp.nufgyqmvbu(j13)), i13, i14);
        }
    }

    public static final void btonecajqb(Spannable spannable, long j13, int i13, int i14) {
        if (j13 != 16) {
            esjtqupxsv(spannable, new BackgroundColorSpan(bfopjjpdmp.nufgyqmvbu(j13)), i13, i14);
        }
    }

    private static final void cqumvgiudr(Spannable spannable, c cVar, int i13, int i14) {
        if (cVar != null) {
            esjtqupxsv(spannable, new draadjrbmk(bfopjjpdmp.nufgyqmvbu(cVar.ppxfxbqfkf()), Float.intBitsToFloat((int) (cVar.wkgbmnqykc() >> 32)), Float.intBitsToFloat((int) (cVar.wkgbmnqykc() & 4294967295L)), eablkybsjg.zoijcleaow(cVar.zoijcleaow())), i13, i14);
        }
    }

    private static final void draadjrbmk(Spannable spannable, jztzpxfvev jztzpxfvevVar, float f13, int i13, int i14) {
        if (jztzpxfvevVar != null) {
            if (jztzpxfvevVar instanceof f) {
                agtfadlqog(spannable, ((f) jztzpxfvevVar).zoijcleaow(), i13, i14);
            } else {
                if (!(jztzpxfvevVar instanceof a)) {
                    throw new NoWhenBranchMatchedException();
                }
                esjtqupxsv(spannable, new lqeggnwhkg((a) jztzpxfvevVar, f13), i13, i14);
            }
        }
    }

    private static final float dxjokdxxww(long j13, float f13, w0.wkgbmnqykc wkgbmnqykcVar) {
        float fNufgyqmvbu;
        long jLqeggnwhkg = jyumaefscl.lqeggnwhkg(j13);
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
        if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.zoijcleaow())) {
            if (!gxszxtbevo(wkgbmnqykcVar)) {
                return wkgbmnqykcVar.mhtqkkgtqm(j13);
            }
            fNufgyqmvbu = jyumaefscl.nufgyqmvbu(j13) / jyumaefscl.nufgyqmvbu(wkgbmnqykcVar.uwvvkdfqfp(f13));
        } else {
            if (!cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.iobyxmoadg())) {
                return Float.NaN;
            }
            fNufgyqmvbu = jyumaefscl.nufgyqmvbu(j13);
        }
        return fNufgyqmvbu * f13;
    }

    private static final boolean eablkybsjg(n nVar) {
        return eablkybsjg.wkgbmnqykc(nVar.cllcsxoeiz()) || nVar.agtfadlqog() != null;
    }

    public static final void esjtqupxsv(Spannable spannable, Object obj, int i13, int i14) {
        spannable.setSpan(obj, i13, i14, 33);
    }

    private static final void gtknphoqwx(Spannable spannable, v0.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
        if (iobyxmoadgVar != null) {
            esjtqupxsv(spannable, new m0.iobyxmoadg(iobyxmoadgVar.btonecajqb()), i13, i14);
        }
    }

    private static final boolean gxszxtbevo(w0.wkgbmnqykc wkgbmnqykcVar) {
        return ((double) wkgbmnqykcVar.F()) > 1.05d;
    }

    public static final void istkbnxepw(Spannable spannable, kcexrzcfyt kcexrzcfytVar, float f13, w0.wkgbmnqykc wkgbmnqykcVar) {
        float fNufgyqmvbu;
        if (kcexrzcfytVar != null) {
            if ((jyumaefscl.eablkybsjg(kcexrzcfytVar.zoijcleaow(), iwizpuwonk.dxjokdxxww(0)) && jyumaefscl.eablkybsjg(kcexrzcfytVar.ppxfxbqfkf(), iwizpuwonk.dxjokdxxww(0))) || jyumaefscl.gxszxtbevo(kcexrzcfytVar.zoijcleaow()) == 0 || jyumaefscl.gxszxtbevo(kcexrzcfytVar.ppxfxbqfkf()) == 0) {
                return;
            }
            long jLqeggnwhkg = jyumaefscl.lqeggnwhkg(kcexrzcfytVar.zoijcleaow());
            cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
            float fNufgyqmvbu2 = 0.0f;
            if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.zoijcleaow())) {
                fNufgyqmvbu = wkgbmnqykcVar.mhtqkkgtqm(kcexrzcfytVar.zoijcleaow());
            } else {
                fNufgyqmvbu = cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.iobyxmoadg()) ? jyumaefscl.nufgyqmvbu(kcexrzcfytVar.zoijcleaow()) * f13 : 0.0f;
            }
            long jLqeggnwhkg2 = jyumaefscl.lqeggnwhkg(kcexrzcfytVar.ppxfxbqfkf());
            if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg2, iobyxmoadgVar.zoijcleaow())) {
                fNufgyqmvbu2 = wkgbmnqykcVar.mhtqkkgtqm(kcexrzcfytVar.ppxfxbqfkf());
            } else if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg2, iobyxmoadgVar.iobyxmoadg())) {
                fNufgyqmvbu2 = jyumaefscl.nufgyqmvbu(kcexrzcfytVar.ppxfxbqfkf()) * f13;
            }
            esjtqupxsv(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fNufgyqmvbu), (int) Math.ceil(fNufgyqmvbu2)), 0, spannable.length());
        }
    }

    public static final void iwizpuwonk(Spannable spannable, r0.eablkybsjg eablkybsjgVar, int i13, int i14) {
        if (eablkybsjgVar != null) {
            esjtqupxsv(spannable, iobyxmoadg.f109212iobyxmoadg.iobyxmoadg(eablkybsjgVar), i13, i14);
        }
    }

    public static final void jyumaefscl(Spannable spannable, long j13, float f13, w0.wkgbmnqykc wkgbmnqykcVar) {
        float fDxjokdxxww = dxjokdxxww(j13, f13, wkgbmnqykcVar);
        if (Float.isNaN(fDxjokdxxww)) {
            return;
        }
        esjtqupxsv(spannable, new m0.lqeggnwhkg(fDxjokdxxww), 0, spannable.length());
    }

    public static final void kcexrzcfyt(Spannable spannable, long j13, w0.wkgbmnqykc wkgbmnqykcVar, int i13, int i14) {
        long jLqeggnwhkg = jyumaefscl.lqeggnwhkg(j13);
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
        if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.zoijcleaow())) {
            esjtqupxsv(spannable, new AbsoluteSizeSpan(vg.iobyxmoadg.wkgbmnqykc(wkgbmnqykcVar.mhtqkkgtqm(j13)), false), i13, i14);
        } else if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.iobyxmoadg())) {
            esjtqupxsv(spannable, new RelativeSizeSpan(jyumaefscl.nufgyqmvbu(j13)), i13, i14);
        }
    }

    private static final void lereixgezr(Spannable spannable, jrbgnlbqoe jrbgnlbqoeVar, int i13, int i14, w0.wkgbmnqykc wkgbmnqykcVar) {
        gtknphoqwx(spannable, jrbgnlbqoeVar.eablkybsjg(), i13, i14);
        agtfadlqog(spannable, jrbgnlbqoeVar.lqeggnwhkg(), i13, i14);
        draadjrbmk(spannable, jrbgnlbqoeVar.gxszxtbevo(), jrbgnlbqoeVar.ppxfxbqfkf(), i13, i14);
        zynmafqrjb(spannable, jrbgnlbqoeVar.kcexrzcfyt(), i13, i14);
        kcexrzcfyt(spannable, jrbgnlbqoeVar.gtknphoqwx(), wkgbmnqykcVar, i13, i14);
        oxmwwwfdhm(spannable, jrbgnlbqoeVar.btonecajqb(), i13, i14);
        zdlpuopuiu(spannable, jrbgnlbqoeVar.yggfygwlhe(), i13, i14);
        iwizpuwonk(spannable, jrbgnlbqoeVar.rgvfuqvkyq(), i13, i14);
        btonecajqb(spannable, jrbgnlbqoeVar.wkgbmnqykc(), i13, i14);
        cqumvgiudr(spannable, jrbgnlbqoeVar.oxmwwwfdhm(), i13, i14);
        ojitshcjhn(spannable, jrbgnlbqoeVar.nufgyqmvbu(), i13, i14);
    }

    private static final jrbgnlbqoe lqeggnwhkg(jrbgnlbqoe jrbgnlbqoeVar, jrbgnlbqoe jrbgnlbqoeVar2) {
        return jrbgnlbqoeVar == null ? jrbgnlbqoeVar2 : jrbgnlbqoeVar.esjtqupxsv(jrbgnlbqoeVar2);
    }

    private static final float nufgyqmvbu(long j13, float f13, w0.wkgbmnqykc wkgbmnqykcVar) {
        if (jyumaefscl.eablkybsjg(j13, jyumaefscl.f118259zoijcleaow.iobyxmoadg())) {
            return f13;
        }
        long jLqeggnwhkg = jyumaefscl.lqeggnwhkg(j13);
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
        if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.zoijcleaow())) {
            return wkgbmnqykcVar.mhtqkkgtqm(j13);
        }
        if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.iobyxmoadg())) {
            return jyumaefscl.nufgyqmvbu(j13) * f13;
        }
        return Float.NaN;
    }

    private static final void ojitshcjhn(Spannable spannable, j.lqeggnwhkg lqeggnwhkgVar, int i13, int i14) {
        if (lqeggnwhkgVar != null) {
            esjtqupxsv(spannable, new u0.wkgbmnqykc(lqeggnwhkgVar), i13, i14);
        }
    }

    private static final void oxmwwwfdhm(Spannable spannable, String str, int i13, int i14) {
        if (str != null) {
            esjtqupxsv(spannable, new m0.zoijcleaow(str), i13, i14);
        }
    }

    public static final void pmvmpeiblj(Spannable spannable, n nVar, List list, w0.wkgbmnqykc wkgbmnqykcVar, oxmwwwfdhm oxmwwwfdhmVar) {
        MetricAffectingSpan metricAffectingSpanZoijcleaow;
        rgvfuqvkyq(spannable, nVar, list, oxmwwwfdhmVar);
        int size = list.size();
        boolean z13 = false;
        for (int i13 = 0; i13 < size; i13++) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2 = (j0.eablkybsjg.wkgbmnqykc) list.get(i13);
            if (wkgbmnqykcVar2.lqeggnwhkg() instanceof jrbgnlbqoe) {
                int iNufgyqmvbu = wkgbmnqykcVar2.nufgyqmvbu();
                int iGxszxtbevo = wkgbmnqykcVar2.gxszxtbevo();
                if (iNufgyqmvbu >= 0 && iNufgyqmvbu < spannable.length() && iGxszxtbevo > iNufgyqmvbu && iGxszxtbevo <= spannable.length()) {
                    lereixgezr(spannable, (jrbgnlbqoe) wkgbmnqykcVar2.lqeggnwhkg(), iNufgyqmvbu, iGxszxtbevo, wkgbmnqykcVar);
                    if (wkgbmnqykc((jrbgnlbqoe) wkgbmnqykcVar2.lqeggnwhkg())) {
                        z13 = true;
                    }
                }
            }
        }
        if (z13) {
            int size2 = list.size();
            for (int i14 = 0; i14 < size2; i14++) {
                j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar3 = (j0.eablkybsjg.wkgbmnqykc) list.get(i14);
                j0.eablkybsjg.iobyxmoadg iobyxmoadgVar = (j0.eablkybsjg.iobyxmoadg) wkgbmnqykcVar3.lqeggnwhkg();
                if (iobyxmoadgVar instanceof jrbgnlbqoe) {
                    int iNufgyqmvbu2 = wkgbmnqykcVar3.nufgyqmvbu();
                    int iGxszxtbevo2 = wkgbmnqykcVar3.gxszxtbevo();
                    if (iNufgyqmvbu2 >= 0 && iNufgyqmvbu2 < spannable.length() && iGxszxtbevo2 > iNufgyqmvbu2 && iGxszxtbevo2 <= spannable.length() && (metricAffectingSpanZoijcleaow = zoijcleaow(((jrbgnlbqoe) iobyxmoadgVar).ojitshcjhn(), wkgbmnqykcVar)) != null) {
                        esjtqupxsv(spannable, metricAffectingSpanZoijcleaow, iNufgyqmvbu2, iGxszxtbevo2);
                    }
                }
            }
        }
    }

    public static final void ppxfxbqfkf(jrbgnlbqoe jrbgnlbqoeVar, List list, vdvldrhtss vdvldrhtssVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            vdvldrhtssVar.invoke(lqeggnwhkg(jrbgnlbqoeVar, (jrbgnlbqoe) ((j0.eablkybsjg.wkgbmnqykc) list.get(0)).lqeggnwhkg()), Integer.valueOf(((j0.eablkybsjg.wkgbmnqykc) list.get(0)).nufgyqmvbu()), Integer.valueOf(((j0.eablkybsjg.wkgbmnqykc) list.get(0)).gxszxtbevo()));
            return;
        }
        int size = list.size();
        int i13 = size * 2;
        int[] iArr = new int[i13];
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (j0.eablkybsjg.wkgbmnqykc) list.get(i14);
            iArr[i14] = wkgbmnqykcVar.nufgyqmvbu();
            iArr[i14 + size] = wkgbmnqykcVar.gxszxtbevo();
        }
        agtfadlqog.hkdspvbjdz(iArr);
        int iUwvvkdfqfp = agtfadlqog.uwvvkdfqfp(iArr);
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = iArr[i15];
            if (i16 != iUwvvkdfqfp) {
                int size3 = list.size();
                jrbgnlbqoe jrbgnlbqoeVarLqeggnwhkg = jrbgnlbqoeVar;
                for (int i17 = 0; i17 < size3; i17++) {
                    j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2 = (j0.eablkybsjg.wkgbmnqykc) list.get(i17);
                    if (wkgbmnqykcVar2.nufgyqmvbu() != wkgbmnqykcVar2.gxszxtbevo() && j0.lqeggnwhkg.btonecajqb(iUwvvkdfqfp, i16, wkgbmnqykcVar2.nufgyqmvbu(), wkgbmnqykcVar2.gxszxtbevo())) {
                        jrbgnlbqoeVarLqeggnwhkg = lqeggnwhkg(jrbgnlbqoeVarLqeggnwhkg, (jrbgnlbqoe) wkgbmnqykcVar2.lqeggnwhkg());
                    }
                }
                if (jrbgnlbqoeVarLqeggnwhkg != null) {
                    vdvldrhtssVar.invoke(jrbgnlbqoeVarLqeggnwhkg, Integer.valueOf(iUwvvkdfqfp), Integer.valueOf(i16));
                }
                iUwvvkdfqfp = i16;
            }
        }
    }

    private static final void rgvfuqvkyq(final Spannable spannable, n nVar, List list, final oxmwwwfdhm oxmwwwfdhmVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar = (j0.eablkybsjg.wkgbmnqykc) list.get(i13);
            if ((wkgbmnqykcVar.lqeggnwhkg() instanceof jrbgnlbqoe) && (eablkybsjg.wkgbmnqykc((jrbgnlbqoe) wkgbmnqykcVar.lqeggnwhkg()) || ((jrbgnlbqoe) wkgbmnqykcVar.lqeggnwhkg()).wflxmlrfwp() != null)) {
                zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                arrayList.add(wkgbmnqykcVar);
            }
        }
        ppxfxbqfkf(eablkybsjg(nVar) ? new jrbgnlbqoe(0L, 0L, nVar.ojitshcjhn(), nVar.wflxmlrfwp(), nVar.agtfadlqog(), nVar.btonecajqb(), null, 0L, null, null, null, 0L, null, null, null, null, 65475, null) : null, arrayList, new vdvldrhtss() { // from class: t0.ppxfxbqfkf
            @Override // tg.vdvldrhtss
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return wkgbmnqykc.vdvldrhtss(spannable, oxmwwwfdhmVar, (jrbgnlbqoe) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn vdvldrhtss(Spannable spannable, oxmwwwfdhm oxmwwwfdhmVar, jrbgnlbqoe jrbgnlbqoeVar, int i13, int i14) {
        wflxmlrfwp wflxmlrfwpVarDxjokdxxww = jrbgnlbqoeVar.dxjokdxxww();
        yadqdtsiqt yadqdtsiqtVarAgtfadlqog = jrbgnlbqoeVar.agtfadlqog();
        if (yadqdtsiqtVarAgtfadlqog == null) {
            yadqdtsiqtVarAgtfadlqog = yadqdtsiqt.f68367yggfygwlhe.wkgbmnqykc();
        }
        lereixgezr lereixgezrVarDraadjrbmk = jrbgnlbqoeVar.draadjrbmk();
        lereixgezr lereixgezrVarPpxfxbqfkf = lereixgezr.ppxfxbqfkf(lereixgezrVarDraadjrbmk != null ? lereixgezrVarDraadjrbmk.dxjokdxxww() : lereixgezr.f68283zoijcleaow.zoijcleaow());
        pmvmpeiblj pmvmpeibljVarWflxmlrfwp = jrbgnlbqoeVar.wflxmlrfwp();
        spannable.setSpan(new ojitshcjhn((Typeface) oxmwwwfdhmVar.invoke(wflxmlrfwpVarDxjokdxxww, yadqdtsiqtVarAgtfadlqog, lereixgezrVarPpxfxbqfkf, pmvmpeiblj.eablkybsjg(pmvmpeibljVarWflxmlrfwp != null ? pmvmpeibljVarWflxmlrfwp.wflxmlrfwp() : pmvmpeiblj.f68323zoijcleaow.iobyxmoadg()))), i13, i14, 33);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00aa  */
    public static final void wflxmlrfwp(Spannable spannable, List list, float f13, w0.wkgbmnqykc wkgbmnqykcVar, kcexrzcfyt kcexrzcfytVar) {
        float f14 = f13;
        float fNufgyqmvbu = 0.0f;
        if (kcexrzcfytVar != null) {
            long jLqeggnwhkg = jyumaefscl.lqeggnwhkg(kcexrzcfytVar.zoijcleaow());
            cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
            if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.zoijcleaow())) {
                fNufgyqmvbu = wkgbmnqykcVar.mhtqkkgtqm(kcexrzcfytVar.zoijcleaow());
            } else if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.iobyxmoadg())) {
                fNufgyqmvbu = jyumaefscl.nufgyqmvbu(kcexrzcfytVar.zoijcleaow()) * f14;
            }
        }
        float f15 = fNufgyqmvbu;
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2 = (j0.eablkybsjg.wkgbmnqykc) list.get(i13);
            Object objLqeggnwhkg = wkgbmnqykcVar2.lqeggnwhkg();
            gtknphoqwx gtknphoqwxVar = objLqeggnwhkg instanceof gtknphoqwx ? (gtknphoqwx) objLqeggnwhkg : null;
            if (gtknphoqwxVar != null) {
                float fNufgyqmvbu2 = nufgyqmvbu(gtknphoqwxVar.dxjokdxxww(), f14, wkgbmnqykcVar);
                float fNufgyqmvbu3 = nufgyqmvbu(gtknphoqwxVar.gxszxtbevo(), f14, wkgbmnqykcVar);
                float fNufgyqmvbu4 = nufgyqmvbu(gtknphoqwxVar.lqeggnwhkg(), f14, wkgbmnqykcVar);
                if (!Float.isNaN(fNufgyqmvbu2) && !Float.isNaN(fNufgyqmvbu3) && !Float.isNaN(fNufgyqmvbu4)) {
                    esjtqupxsv(spannable, new u0.ppxfxbqfkf(gtknphoqwxVar.nufgyqmvbu(), fNufgyqmvbu2, fNufgyqmvbu3, fNufgyqmvbu4, gtknphoqwxVar.wkgbmnqykc(), gtknphoqwxVar.ppxfxbqfkf(), gtknphoqwxVar.eablkybsjg(), wkgbmnqykcVar, f15), wkgbmnqykcVar2.nufgyqmvbu(), wkgbmnqykcVar2.gxszxtbevo());
                }
            }
            i13++;
            f14 = f13;
        }
    }

    private static final boolean wkgbmnqykc(jrbgnlbqoe jrbgnlbqoeVar) {
        long jLqeggnwhkg = jyumaefscl.lqeggnwhkg(jrbgnlbqoeVar.ojitshcjhn());
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
        return cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.zoijcleaow()) || cqumvgiudr.lqeggnwhkg(jyumaefscl.lqeggnwhkg(jrbgnlbqoeVar.ojitshcjhn()), iobyxmoadgVar.iobyxmoadg());
    }

    public static final void yggfygwlhe(Spannable spannable, long j13, float f13, w0.wkgbmnqykc wkgbmnqykcVar, nufgyqmvbu nufgyqmvbuVar) {
        float fDxjokdxxww = dxjokdxxww(j13, f13, wkgbmnqykcVar);
        if (Float.isNaN(fDxjokdxxww)) {
            return;
        }
        esjtqupxsv(spannable, new m0.nufgyqmvbu(fDxjokdxxww, 0, (spannable.length() == 0 || mj.kcexrzcfyt.v(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), nufgyqmvbu.wkgbmnqykc.dxjokdxxww(nufgyqmvbuVar.wkgbmnqykc()), nufgyqmvbu.wkgbmnqykc.btonecajqb(nufgyqmvbuVar.wkgbmnqykc()), nufgyqmvbuVar.zoijcleaow(), nufgyqmvbu.ppxfxbqfkf.gxszxtbevo(nufgyqmvbuVar.ppxfxbqfkf(), nufgyqmvbu.ppxfxbqfkf.f115007zoijcleaow.zoijcleaow())), 0, spannable.length());
    }

    private static final void zdlpuopuiu(Spannable spannable, v0.vdvldrhtss vdvldrhtssVar, int i13, int i14) {
        if (vdvldrhtssVar != null) {
            esjtqupxsv(spannable, new ScaleXSpan(vdvldrhtssVar.zoijcleaow()), i13, i14);
            esjtqupxsv(spannable, new m0.wflxmlrfwp(vdvldrhtssVar.ppxfxbqfkf()), i13, i14);
        }
    }

    private static final MetricAffectingSpan zoijcleaow(long j13, w0.wkgbmnqykc wkgbmnqykcVar) {
        long jLqeggnwhkg = jyumaefscl.lqeggnwhkg(j13);
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = cqumvgiudr.f118246zoijcleaow;
        if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.zoijcleaow())) {
            return new m0.gxszxtbevo(wkgbmnqykcVar.mhtqkkgtqm(j13));
        }
        if (cqumvgiudr.lqeggnwhkg(jLqeggnwhkg, iobyxmoadgVar.iobyxmoadg())) {
            return new m0.eablkybsjg(jyumaefscl.nufgyqmvbu(j13));
        }
        return null;
    }

    public static final void zynmafqrjb(Spannable spannable, v0.gtknphoqwx gtknphoqwxVar, int i13, int i14) {
        if (gtknphoqwxVar != null) {
            v0.gtknphoqwx.iobyxmoadg iobyxmoadgVar = v0.gtknphoqwx.f114956zoijcleaow;
            esjtqupxsv(spannable, new m0.agtfadlqog(gtknphoqwxVar.wkgbmnqykc(iobyxmoadgVar.wkgbmnqykc()), gtknphoqwxVar.wkgbmnqykc(iobyxmoadgVar.zoijcleaow())), i13, i14);
        }
    }
}
