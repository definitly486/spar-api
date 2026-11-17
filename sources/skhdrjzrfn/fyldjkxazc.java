package skhdrjzrfn;

import androidx.compose.runtime.a0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.NoWhenBranchMatchedException;
import opjhrmiecq.p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class fyldjkxazc {

    static final class iobyxmoadg implements vdvldrhtss {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ skhdrjzrfn f107417iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ boolean f107418zoijcleaow;

        iobyxmoadg(skhdrjzrfn skhdrjzrfnVar, boolean z13) {
            this.f107417iobyxmoadg = skhdrjzrfnVar;
            this.f107418zoijcleaow = z13;
        }

        @Override // skhdrjzrfn.vdvldrhtss
        public final long iobyxmoadg() {
            return this.f107417iobyxmoadg.sopmlzcsov(this.f107418zoijcleaow);
        }
    }

    public /* synthetic */ class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f107419iobyxmoadg;

        static {
            int[] iArr = new int[opjhrmiecq.ydmasvzmpa.values().length];
            try {
                iArr[opjhrmiecq.ydmasvzmpa.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[opjhrmiecq.ydmasvzmpa.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[opjhrmiecq.ydmasvzmpa.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f107419iobyxmoadg = iArr;
        }
    }

    static final class zoijcleaow implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ opjhrmiecq.c f107420iobyxmoadg;

        zoijcleaow(opjhrmiecq.c cVar) {
            this.f107420iobyxmoadg = cVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(t.ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objLqeggnwhkg = opjhrmiecq.grlcpdaxtj.lqeggnwhkg(ylkuphrtabVar, this.f107420iobyxmoadg, gxszxtbevoVar);
            return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public static final boolean eablkybsjg(skhdrjzrfn skhdrjzrfnVar, boolean z13) {
        x.rgvfuqvkyq rgvfuqvkyqVarWflxmlrfwp;
        g.lqeggnwhkg lqeggnwhkgVarZoijcleaow;
        opjhrmiecq.igdgnonuha igdgnonuhaVarJztzpxfvev = skhdrjzrfnVar.jztzpxfvev();
        if (igdgnonuhaVarJztzpxfvev == null || (rgvfuqvkyqVarWflxmlrfwp = igdgnonuhaVarJztzpxfvev.wflxmlrfwp()) == null || (lqeggnwhkgVarZoijcleaow = ydmasvzmpa.zoijcleaow(rgvfuqvkyqVarWflxmlrfwp)) == null) {
            return false;
        }
        return ydmasvzmpa.iobyxmoadg(lqeggnwhkgVarZoijcleaow, skhdrjzrfnVar.sopmlzcsov(z13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn ppxfxbqfkf(boolean z13, v0.dxjokdxxww dxjokdxxwwVar, skhdrjzrfn skhdrjzrfnVar, int i13, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i14) {
        zoijcleaow(z13, dxjokdxxwwVar, skhdrjzrfnVar, draadjrbmkVar, androidx.compose.runtime.f.iobyxmoadg(i13 | 1));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final long wkgbmnqykc(skhdrjzrfn skhdrjzrfnVar, long j13) {
        int iAgtfadlqog;
        p0 p0VarAgtfadlqog;
        opjhrmiecq.a aVarLereixgezr;
        j0.eablkybsjg eablkybsjgVarGtknphoqwx;
        g.eablkybsjg eablkybsjgVarWypolnanlu = skhdrjzrfnVar.wypolnanlu();
        if (eablkybsjgVarWypolnanlu == null) {
            return g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        }
        long jZdlpuopuiu = eablkybsjgVarWypolnanlu.zdlpuopuiu();
        j0.eablkybsjg eablkybsjgVarCzzsidtyhn = skhdrjzrfnVar.czzsidtyhn();
        if (eablkybsjgVarCzzsidtyhn == null || eablkybsjgVarCzzsidtyhn.length() == 0) {
            return g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        }
        opjhrmiecq.ydmasvzmpa ydmasvzmpaVarKegysxyocb = skhdrjzrfnVar.kegysxyocb();
        int i13 = ydmasvzmpaVarKegysxyocb == null ? -1 : ppxfxbqfkf.f107419iobyxmoadg[ydmasvzmpaVarKegysxyocb.ordinal()];
        if (i13 == -1) {
            return g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        }
        if (i13 == 1 || i13 == 2) {
            iAgtfadlqog = j0.l.agtfadlqog(skhdrjzrfnVar.yfnezrywwk().gtknphoqwx());
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iAgtfadlqog = j0.l.dxjokdxxww(skhdrjzrfnVar.yfnezrywwk().gtknphoqwx());
        }
        opjhrmiecq.igdgnonuha igdgnonuhaVarJztzpxfvev = skhdrjzrfnVar.jztzpxfvev();
        if (igdgnonuhaVarJztzpxfvev == null || (p0VarAgtfadlqog = igdgnonuhaVarJztzpxfvev.agtfadlqog()) == null) {
            return g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        }
        opjhrmiecq.igdgnonuha igdgnonuhaVarJztzpxfvev2 = skhdrjzrfnVar.jztzpxfvev();
        if (igdgnonuhaVarJztzpxfvev2 == null || (aVarLereixgezr = igdgnonuhaVarJztzpxfvev2.lereixgezr()) == null || (eablkybsjgVarGtknphoqwx = aVarLereixgezr.gtknphoqwx()) == null) {
            return g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        }
        int iAgtfadlqog2 = zg.gtknphoqwx.agtfadlqog(skhdrjzrfnVar.jhduphickx().zoijcleaow(iAgtfadlqog), 0, eablkybsjgVarGtknphoqwx.length());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0VarAgtfadlqog.btonecajqb(jZdlpuopuiu) >> 32));
        j0.f fVarGxszxtbevo = p0VarAgtfadlqog.gxszxtbevo();
        int iVdvldrhtss = fVarGxszxtbevo.vdvldrhtss(iAgtfadlqog2);
        float fKcexrzcfyt = fVarGxszxtbevo.kcexrzcfyt(iVdvldrhtss);
        float fZdlpuopuiu = fVarGxszxtbevo.zdlpuopuiu(iVdvldrhtss);
        float fWflxmlrfwp = zg.gtknphoqwx.wflxmlrfwp(fIntBitsToFloat, Math.min(fKcexrzcfyt, fZdlpuopuiu), Math.max(fKcexrzcfyt, fZdlpuopuiu));
        if (!w0.oxmwwwfdhm.eablkybsjg(j13, w0.oxmwwwfdhm.f118270zoijcleaow.iobyxmoadg()) && Math.abs(fIntBitsToFloat - fWflxmlrfwp) > ((int) (j13 >> 32)) / 2) {
            return g.eablkybsjg.f35584zoijcleaow.zoijcleaow();
        }
        float fJyumaefscl = fVarGxszxtbevo.jyumaefscl(iVdvldrhtss);
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fWflxmlrfwp)) << 32) | (((long) Float.floatToRawIntBits(((fVarGxszxtbevo.wflxmlrfwp(iVdvldrhtss) - fJyumaefscl) / 2) + fJyumaefscl)) & 4294967295L));
    }

    public static final void zoijcleaow(final boolean z13, final v0.dxjokdxxww dxjokdxxwwVar, final skhdrjzrfn skhdrjzrfnVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, final int i13) {
        int i14;
        androidx.compose.runtime.draadjrbmk draadjrbmkVarBtonecajqb = draadjrbmkVar.btonecajqb(-1344558920);
        if ((i13 & 6) == 0) {
            i14 = (draadjrbmkVarBtonecajqb.iobyxmoadg(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.ppxfxbqfkf(dxjokdxxwwVar.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= draadjrbmkVarBtonecajqb.lmojexxdyd(skhdrjzrfnVar) ? UserVerificationMethods.USER_VERIFY_HANDPRINT : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (draadjrbmkVarBtonecajqb.vdvldrhtss((i14 & 147) != 146, i14 & 1)) {
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.ntlheqmsrt(-1344558920, i14, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1249)");
            }
            int i15 = i14 & 14;
            boolean zUlzqkzuiru = (i15 == 4) | draadjrbmkVarBtonecajqb.ulzqkzuiru(skhdrjzrfnVar);
            Object objYadqdtsiqt = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zUlzqkzuiru || objYadqdtsiqt == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt = skhdrjzrfnVar.ydmasvzmpa(z13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt);
            }
            opjhrmiecq.c cVar = (opjhrmiecq.c) objYadqdtsiqt;
            boolean zLmojexxdyd = draadjrbmkVarBtonecajqb.lmojexxdyd(skhdrjzrfnVar) | (i15 == 4);
            Object objYadqdtsiqt2 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd || objYadqdtsiqt2 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt2 = new iobyxmoadg(skhdrjzrfnVar, z13);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt2);
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) objYadqdtsiqt2;
            boolean zWflxmlrfwp = j0.l.wflxmlrfwp(skhdrjzrfnVar.yfnezrywwk().gtknphoqwx());
            float fUlzqkzuiru = skhdrjzrfnVar.ulzqkzuiru(z13);
            androidx.compose.ui.wkgbmnqykc.iobyxmoadg iobyxmoadgVar = androidx.compose.ui.wkgbmnqykc.f7471iobyxmoadg;
            boolean zLmojexxdyd2 = draadjrbmkVarBtonecajqb.lmojexxdyd(cVar);
            Object objYadqdtsiqt3 = draadjrbmkVarBtonecajqb.yadqdtsiqt();
            if (zLmojexxdyd2 || objYadqdtsiqt3 == androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
                objYadqdtsiqt3 = new zoijcleaow(cVar);
                draadjrbmkVarBtonecajqb.jyumaefscl(objYadqdtsiqt3);
            }
            lqeggnwhkg.lqeggnwhkg(vdvldrhtssVar, z13, dxjokdxxwwVar, zWflxmlrfwp, 0L, fUlzqkzuiru, t.tzroggbefp.ppxfxbqfkf(iobyxmoadgVar, cVar, (PointerInputEventHandler) objYadqdtsiqt3), draadjrbmkVarBtonecajqb, (i14 << 3) & 1008, 16);
            if (androidx.compose.runtime.jyumaefscl.jpowsppfya()) {
                androidx.compose.runtime.jyumaefscl.mbcevpiqjq();
            }
        } else {
            draadjrbmkVarBtonecajqb.hkdspvbjdz();
        }
        a0 a0VarWflxmlrfwp = draadjrbmkVarBtonecajqb.wflxmlrfwp();
        if (a0VarWflxmlrfwp != null) {
            a0VarWflxmlrfwp.iobyxmoadg(new tg.rgvfuqvkyq() { // from class: skhdrjzrfn.ageimvtcrz
                @Override // tg.rgvfuqvkyq
                public final Object invoke(Object obj, Object obj2) {
                    return fyldjkxazc.ppxfxbqfkf(z13, dxjokdxxwwVar, skhdrjzrfnVar, i13, (androidx.compose.runtime.draadjrbmk) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
