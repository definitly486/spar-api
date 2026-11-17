package iwxlajgraz;

import android.graphics.PointF;
import androidx.compose.ui.platform.w;
import j0.c;
import j0.eslsurpljm;
import j0.f;
import j0.l;
import j0.m;
import opjhrmiecq.p0;

/* JADX INFO: loaded from: classes.dex */
public abstract class uawqvzlxes {

    public static final class iobyxmoadg implements p0.dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ p0.dxjokdxxww[] f49932iobyxmoadg;

        iobyxmoadg(p0.dxjokdxxww[] dxjokdxxwwVarArr) {
            this.f49932iobyxmoadg = dxjokdxxwwVarArr;
        }

        @Override // p0.dxjokdxxww
        public void iobyxmoadg(p0.wflxmlrfwp wflxmlrfwpVar) {
            for (p0.dxjokdxxww dxjokdxxwwVar : this.f49932iobyxmoadg) {
                dxjokdxxwwVar.iobyxmoadg(wflxmlrfwpVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int agtfadlqog(opjhrmiecq.igdgnonuha igdgnonuhaVar, long j13, w wVar) {
        f fVarGxszxtbevo;
        j0.yggfygwlhe yggfygwlheVarIwizpuwonk;
        p0 p0VarAgtfadlqog = igdgnonuhaVar.agtfadlqog();
        if (p0VarAgtfadlqog == null || (fVarGxszxtbevo = p0VarAgtfadlqog.gxszxtbevo()) == null || (yggfygwlheVarIwizpuwonk = fVarGxszxtbevo.iwizpuwonk()) == null) {
            return -1;
        }
        return ojitshcjhn(yggfygwlheVarIwizpuwonk, j13, igdgnonuhaVar.wflxmlrfwp(), wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long btonecajqb(long j13, CharSequence charSequence) {
        int iAgtfadlqog = l.agtfadlqog(j13);
        int iDxjokdxxww = l.dxjokdxxww(j13);
        int iCodePointBefore = iAgtfadlqog > 0 ? Character.codePointBefore(charSequence, iAgtfadlqog) : 10;
        int iCodePointAt = iDxjokdxxww < charSequence.length() ? Character.codePointAt(charSequence, iDxjokdxxww) : 10;
        if (cqumvgiudr(iCodePointBefore) && (iwizpuwonk(iCodePointAt) || jyumaefscl(iCodePointAt))) {
            do {
                iAgtfadlqog -= Character.charCount(iCodePointBefore);
                if (iAgtfadlqog == 0) {
                    break;
                }
                iCodePointBefore = Character.codePointBefore(charSequence, iAgtfadlqog);
            } while (cqumvgiudr(iCodePointBefore));
            return m.zoijcleaow(iAgtfadlqog, iDxjokdxxww);
        }
        if (!cqumvgiudr(iCodePointAt)) {
            return j13;
        }
        if (!iwizpuwonk(iCodePointBefore) && !jyumaefscl(iCodePointBefore)) {
            return j13;
        }
        do {
            iDxjokdxxww += Character.charCount(iCodePointAt);
            if (iDxjokdxxww == charSequence.length()) {
                break;
            }
            iCodePointAt = Character.codePointAt(charSequence, iDxjokdxxww);
        } while (cqumvgiudr(iCodePointAt));
        return m.zoijcleaow(iAgtfadlqog, iDxjokdxxww);
    }

    private static final boolean cqumvgiudr(int i13) {
        return iwizpuwonk(i13) && !yggfygwlhe(i13);
    }

    private static final long draadjrbmk(long j13, long j14) {
        return m.zoijcleaow(Math.min(l.agtfadlqog(j13), l.agtfadlqog(j13)), Math.max(l.dxjokdxxww(j14), l.dxjokdxxww(j14)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long esjtqupxsv(CharSequence charSequence, int i13) {
        int iCharCount = i13;
        while (iCharCount > 0) {
            int iPpxfxbqfkf = nufgyqmvbu.ppxfxbqfkf(charSequence, iCharCount);
            if (!iwizpuwonk(iPpxfxbqfkf)) {
                break;
            }
            iCharCount -= Character.charCount(iPpxfxbqfkf);
        }
        while (i13 < charSequence.length()) {
            int iZoijcleaow = nufgyqmvbu.zoijcleaow(charSequence, i13);
            if (!iwizpuwonk(iZoijcleaow)) {
                break;
            }
            i13 += nufgyqmvbu.iobyxmoadg(iZoijcleaow);
        }
        return m.zoijcleaow(iCharCount, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p0.dxjokdxxww gtknphoqwx(p0.dxjokdxxww... dxjokdxxwwVarArr) {
        return new iobyxmoadg(dxjokdxxwwVarArr);
    }

    private static final boolean iwizpuwonk(int i13) {
        return Character.isWhitespace(i13) || i13 == 160;
    }

    private static final boolean jyumaefscl(int i13) {
        int type = Character.getType(i13);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long kcexrzcfyt(opjhrmiecq.igdgnonuha igdgnonuhaVar, g.lqeggnwhkg lqeggnwhkgVar, g.lqeggnwhkg lqeggnwhkgVar2, int i13, c cVar) {
        long jOxmwwwfdhm = oxmwwwfdhm(igdgnonuhaVar, lqeggnwhkgVar, i13, cVar);
        if (l.nufgyqmvbu(jOxmwwwfdhm)) {
            return l.f50289zoijcleaow.iobyxmoadg();
        }
        long jOxmwwwfdhm2 = oxmwwwfdhm(igdgnonuhaVar, lqeggnwhkgVar2, i13, cVar);
        return l.nufgyqmvbu(jOxmwwwfdhm2) ? l.f50289zoijcleaow.iobyxmoadg() : draadjrbmk(jOxmwwwfdhm, jOxmwwwfdhm2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long lereixgezr(PointF pointF) {
        float f13 = pointF.x;
        float f14 = pointF.y;
        return g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
    }

    private static final int ojitshcjhn(j0.yggfygwlhe yggfygwlheVar, long j13, x.rgvfuqvkyq rgvfuqvkyqVar, w wVar) {
        long jWflxmlrfwp;
        int iWflxmlrfwp;
        if (rgvfuqvkyqVar == null || (iWflxmlrfwp = wflxmlrfwp(yggfygwlheVar, (jWflxmlrfwp = rgvfuqvkyqVar.wflxmlrfwp(j13)), wVar)) == -1) {
            return -1;
        }
        return yggfygwlheVar.pmvmpeiblj(g.eablkybsjg.lqeggnwhkg(jWflxmlrfwp, 0.0f, (yggfygwlheVar.esjtqupxsv(iWflxmlrfwp) + yggfygwlheVar.ojitshcjhn(iWflxmlrfwp)) / 2.0f, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long oxmwwwfdhm(opjhrmiecq.igdgnonuha igdgnonuhaVar, g.lqeggnwhkg lqeggnwhkgVar, int i13, c cVar) {
        f fVarGxszxtbevo;
        p0 p0VarAgtfadlqog = igdgnonuhaVar.agtfadlqog();
        return vdvldrhtss((p0VarAgtfadlqog == null || (fVarGxszxtbevo = p0VarAgtfadlqog.gxszxtbevo()) == null) ? null : fVarGxszxtbevo.iwizpuwonk(), lqeggnwhkgVar, igdgnonuhaVar.wflxmlrfwp(), i13, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long rgvfuqvkyq(f fVar, long j13, long j14, x.rgvfuqvkyq rgvfuqvkyqVar, w wVar) {
        if (fVar == null || rgvfuqvkyqVar == null) {
            return l.f50289zoijcleaow.iobyxmoadg();
        }
        long jWflxmlrfwp = rgvfuqvkyqVar.wflxmlrfwp(j13);
        long jWflxmlrfwp2 = rgvfuqvkyqVar.wflxmlrfwp(j14);
        int iWflxmlrfwp = wflxmlrfwp(fVar.iwizpuwonk(), jWflxmlrfwp, wVar);
        int iWflxmlrfwp2 = wflxmlrfwp(fVar.iwizpuwonk(), jWflxmlrfwp2, wVar);
        if (iWflxmlrfwp != -1) {
            if (iWflxmlrfwp2 != -1) {
                iWflxmlrfwp = Math.min(iWflxmlrfwp, iWflxmlrfwp2);
            }
            iWflxmlrfwp2 = iWflxmlrfwp;
        } else if (iWflxmlrfwp2 == -1) {
            return l.f50289zoijcleaow.iobyxmoadg();
        }
        float fJyumaefscl = (fVar.jyumaefscl(iWflxmlrfwp2) + fVar.wflxmlrfwp(iWflxmlrfwp2)) / 2;
        int i13 = (int) (jWflxmlrfwp >> 32);
        int i14 = (int) (jWflxmlrfwp2 >> 32);
        return fVar.iwizpuwonk().lmojexxdyd(new g.lqeggnwhkg(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), fJyumaefscl - 0.1f, Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), fJyumaefscl + 0.1f), eslsurpljm.f50188iobyxmoadg.iobyxmoadg(), c.f50129iobyxmoadg.lqeggnwhkg());
    }

    private static final long vdvldrhtss(j0.yggfygwlhe yggfygwlheVar, g.lqeggnwhkg lqeggnwhkgVar, x.rgvfuqvkyq rgvfuqvkyqVar, int i13, c cVar) {
        return (yggfygwlheVar == null || rgvfuqvkyqVar == null) ? l.f50289zoijcleaow.iobyxmoadg() : yggfygwlheVar.lmojexxdyd(lqeggnwhkgVar.oxmwwwfdhm(rgvfuqvkyqVar.wflxmlrfwp(g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf())), i13, cVar);
    }

    private static final int wflxmlrfwp(j0.yggfygwlhe yggfygwlheVar, long j13, w wVar) {
        float fDxjokdxxww = wVar != null ? wVar.dxjokdxxww() : 0.0f;
        int i13 = (int) (4294967295L & j13);
        int iZdlpuopuiu = yggfygwlheVar.zdlpuopuiu(Float.intBitsToFloat(i13));
        if (Float.intBitsToFloat(i13) >= yggfygwlheVar.esjtqupxsv(iZdlpuopuiu) - fDxjokdxxww && Float.intBitsToFloat(i13) <= yggfygwlheVar.ojitshcjhn(iZdlpuopuiu) + fDxjokdxxww) {
            int i14 = (int) (j13 >> 32);
            if (Float.intBitsToFloat(i14) >= (-fDxjokdxxww) && Float.intBitsToFloat(i14) <= yggfygwlheVar.wwaezpbzkn() + fDxjokdxxww) {
                return iZdlpuopuiu;
            }
        }
        return -1;
    }

    private static final boolean yggfygwlhe(int i13) {
        int type = Character.getType(i13);
        return type == 14 || type == 13 || i13 == 10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zdlpuopuiu(f fVar, int i13) {
        int iVdvldrhtss = fVar.vdvldrhtss(i13);
        if (i13 == fVar.yggfygwlhe(iVdvldrhtss) || i13 == f.rgvfuqvkyq(fVar, iVdvldrhtss, false, 2, null)) {
            return fVar.esjtqupxsv(i13) != fVar.ppxfxbqfkf(i13);
        }
        return fVar.ppxfxbqfkf(i13) != fVar.ppxfxbqfkf(i13 - 1);
    }
}
