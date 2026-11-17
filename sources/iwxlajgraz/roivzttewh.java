package iwxlajgraz;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.w;
import h.yzdjzghtvl;
import j0.c;
import j0.e;
import j0.eslsurpljm;
import j0.f;
import j0.l;
import j0.m;
import opjhrmiecq.p0;

/* JADX INFO: loaded from: classes.dex */
public final class roivzttewh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final roivzttewh f49927iobyxmoadg = new roivzttewh();

    private roivzttewh() {
    }

    private final int agtfadlqog(opjhrmiecq.igdgnonuha igdgnonuhaVar, SelectRangeGesture selectRangeGesture, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, tg.draadjrbmk draadjrbmkVar) {
        long jKcexrzcfyt = uawqvzlxes.kcexrzcfyt(igdgnonuhaVar, yzdjzghtvl.gxszxtbevo(selectRangeGesture.getSelectionStartArea()), yzdjzghtvl.gxszxtbevo(selectRangeGesture.getSelectionEndArea()), jyumaefscl(selectRangeGesture.getGranularity()), c.f50129iobyxmoadg.nufgyqmvbu());
        if (l.nufgyqmvbu(jKcexrzcfyt)) {
            return f49927iobyxmoadg.ppxfxbqfkf(jlmebxxoox.iobyxmoadg(selectRangeGesture), draadjrbmkVar);
        }
        ojitshcjhn(jKcexrzcfyt, skhdrjzrfnVar, draadjrbmkVar);
        return 1;
    }

    private final int btonecajqb(opjhrmiecq.igdgnonuha igdgnonuhaVar, JoinOrSplitGesture joinOrSplitGesture, j0.eablkybsjg eablkybsjgVar, w wVar, tg.draadjrbmk draadjrbmkVar) {
        p0 p0VarAgtfadlqog;
        f fVarGxszxtbevo;
        if (wVar == null) {
            return ppxfxbqfkf(jlmebxxoox.iobyxmoadg(joinOrSplitGesture), draadjrbmkVar);
        }
        int iAgtfadlqog = uawqvzlxes.agtfadlqog(igdgnonuhaVar, uawqvzlxes.lereixgezr(joinOrSplitGesture.getJoinOrSplitPoint()), wVar);
        if (iAgtfadlqog == -1 || !((p0VarAgtfadlqog = igdgnonuhaVar.agtfadlqog()) == null || (fVarGxszxtbevo = p0VarAgtfadlqog.gxszxtbevo()) == null || !uawqvzlxes.zdlpuopuiu(fVarGxszxtbevo, iAgtfadlqog))) {
            return ppxfxbqfkf(jlmebxxoox.iobyxmoadg(joinOrSplitGesture), draadjrbmkVar);
        }
        long jEsjtqupxsv = uawqvzlxes.esjtqupxsv(eablkybsjgVar, iAgtfadlqog);
        if (l.nufgyqmvbu(jEsjtqupxsv)) {
            dxjokdxxww(l.agtfadlqog(jEsjtqupxsv), " ", draadjrbmkVar);
        } else {
            gxszxtbevo(jEsjtqupxsv, eablkybsjgVar, false, draadjrbmkVar);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence draadjrbmk(kotlin.jvm.internal.hcddaimhww hcddaimhwwVar, kotlin.jvm.internal.hcddaimhww hcddaimhwwVar2, mj.draadjrbmk draadjrbmkVar) {
        if (hcddaimhwwVar.f60014zdlpuopuiu == -1) {
            hcddaimhwwVar.f60014zdlpuopuiu = draadjrbmkVar.ppxfxbqfkf().wkgbmnqykc();
        }
        hcddaimhwwVar2.f60014zdlpuopuiu = draadjrbmkVar.ppxfxbqfkf().eablkybsjg() + 1;
        return "";
    }

    private final void dxjokdxxww(int i13, String str, tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(uawqvzlxes.gtknphoqwx(new p0.wypolnanlu(i13, i13), new p0.iobyxmoadg(str, 1)));
    }

    private final int eablkybsjg(opjhrmiecq.igdgnonuha igdgnonuhaVar, DeleteRangeGesture deleteRangeGesture, j0.eablkybsjg eablkybsjgVar, tg.draadjrbmk draadjrbmkVar) {
        int iJyumaefscl = jyumaefscl(deleteRangeGesture.getGranularity());
        long jKcexrzcfyt = uawqvzlxes.kcexrzcfyt(igdgnonuhaVar, yzdjzghtvl.gxszxtbevo(deleteRangeGesture.getDeletionStartArea()), yzdjzghtvl.gxszxtbevo(deleteRangeGesture.getDeletionEndArea()), iJyumaefscl, c.f50129iobyxmoadg.nufgyqmvbu());
        if (l.nufgyqmvbu(jKcexrzcfyt)) {
            return f49927iobyxmoadg.ppxfxbqfkf(jlmebxxoox.iobyxmoadg(deleteRangeGesture), draadjrbmkVar);
        }
        gxszxtbevo(jKcexrzcfyt, eablkybsjgVar, eslsurpljm.wkgbmnqykc(iJyumaefscl, eslsurpljm.f50188iobyxmoadg.zoijcleaow()), draadjrbmkVar);
        return 1;
    }

    private final int gtknphoqwx(opjhrmiecq.igdgnonuha igdgnonuhaVar, RemoveSpaceGesture removeSpaceGesture, j0.eablkybsjg eablkybsjgVar, w wVar, tg.draadjrbmk draadjrbmkVar) {
        p0 p0VarAgtfadlqog = igdgnonuhaVar.agtfadlqog();
        long jRgvfuqvkyq = uawqvzlxes.rgvfuqvkyq(p0VarAgtfadlqog != null ? p0VarAgtfadlqog.gxszxtbevo() : null, uawqvzlxes.lereixgezr(removeSpaceGesture.getStartPoint()), uawqvzlxes.lereixgezr(removeSpaceGesture.getEndPoint()), igdgnonuhaVar.wflxmlrfwp(), wVar);
        if (l.nufgyqmvbu(jRgvfuqvkyq)) {
            return f49927iobyxmoadg.ppxfxbqfkf(jlmebxxoox.iobyxmoadg(removeSpaceGesture), draadjrbmkVar);
        }
        final kotlin.jvm.internal.hcddaimhww hcddaimhwwVar = new kotlin.jvm.internal.hcddaimhww();
        hcddaimhwwVar.f60014zdlpuopuiu = -1;
        final kotlin.jvm.internal.hcddaimhww hcddaimhwwVar2 = new kotlin.jvm.internal.hcddaimhww();
        hcddaimhwwVar2.f60014zdlpuopuiu = -1;
        String strVdvldrhtss = new mj.rgvfuqvkyq("\\s+").vdvldrhtss(m.eablkybsjg(eablkybsjgVar, jRgvfuqvkyq), new tg.draadjrbmk() { // from class: iwxlajgraz.nuxfzjnpeb
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return roivzttewh.draadjrbmk(hcddaimhwwVar, hcddaimhwwVar2, (mj.draadjrbmk) obj);
            }
        });
        if (hcddaimhwwVar.f60014zdlpuopuiu == -1 || hcddaimhwwVar2.f60014zdlpuopuiu == -1) {
            return ppxfxbqfkf(jlmebxxoox.iobyxmoadg(removeSpaceGesture), draadjrbmkVar);
        }
        int iAgtfadlqog = l.agtfadlqog(jRgvfuqvkyq) + hcddaimhwwVar.f60014zdlpuopuiu;
        int iAgtfadlqog2 = l.agtfadlqog(jRgvfuqvkyq) + hcddaimhwwVar2.f60014zdlpuopuiu;
        String strSubstring = strVdvldrhtss.substring(hcddaimhwwVar.f60014zdlpuopuiu, strVdvldrhtss.length() - (l.btonecajqb(jRgvfuqvkyq) - hcddaimhwwVar2.f60014zdlpuopuiu));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        draadjrbmkVar.invoke(uawqvzlxes.gtknphoqwx(new p0.wypolnanlu(iAgtfadlqog, iAgtfadlqog2), new p0.iobyxmoadg(strSubstring, 1)));
        return 1;
    }

    private final void gxszxtbevo(long j13, j0.eablkybsjg eablkybsjgVar, boolean z13, tg.draadjrbmk draadjrbmkVar) {
        if (z13) {
            j13 = uawqvzlxes.btonecajqb(j13, eablkybsjgVar);
        }
        draadjrbmkVar.invoke(uawqvzlxes.gtknphoqwx(new p0.wypolnanlu(l.dxjokdxxww(j13), l.dxjokdxxww(j13)), new p0.lqeggnwhkg(l.btonecajqb(j13), 0)));
    }

    private final int jyumaefscl(int i13) {
        if (i13 != 1) {
            return i13 != 2 ? eslsurpljm.f50188iobyxmoadg.iobyxmoadg() : eslsurpljm.f50188iobyxmoadg.iobyxmoadg();
        }
        return eslsurpljm.f50188iobyxmoadg.zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void kcexrzcfyt(skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar) {
        if (skhdrjzrfnVar != null) {
            skhdrjzrfnVar.lereixgezr();
        }
    }

    private final int nufgyqmvbu(opjhrmiecq.igdgnonuha igdgnonuhaVar, InsertGesture insertGesture, w wVar, tg.draadjrbmk draadjrbmkVar) {
        p0 p0VarAgtfadlqog;
        f fVarGxszxtbevo;
        if (wVar == null) {
            return ppxfxbqfkf(jlmebxxoox.iobyxmoadg(insertGesture), draadjrbmkVar);
        }
        int iAgtfadlqog = uawqvzlxes.agtfadlqog(igdgnonuhaVar, uawqvzlxes.lereixgezr(insertGesture.getInsertionPoint()), wVar);
        if (iAgtfadlqog == -1 || !((p0VarAgtfadlqog = igdgnonuhaVar.agtfadlqog()) == null || (fVarGxszxtbevo = p0VarAgtfadlqog.gxszxtbevo()) == null || !uawqvzlxes.zdlpuopuiu(fVarGxszxtbevo, iAgtfadlqog))) {
            return ppxfxbqfkf(jlmebxxoox.iobyxmoadg(insertGesture), draadjrbmkVar);
        }
        dxjokdxxww(iAgtfadlqog, insertGesture.getTextToInsert(), draadjrbmkVar);
        return 1;
    }

    private final void ojitshcjhn(long j13, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, tg.draadjrbmk draadjrbmkVar) {
        draadjrbmkVar.invoke(new p0.wypolnanlu(l.agtfadlqog(j13), l.dxjokdxxww(j13)));
        if (skhdrjzrfnVar != null) {
            skhdrjzrfnVar.wwaezpbzkn(true);
        }
    }

    private final int ppxfxbqfkf(HandwritingGesture handwritingGesture, tg.draadjrbmk draadjrbmkVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        draadjrbmkVar.invoke(new p0.iobyxmoadg(fallbackText, 1));
        return 5;
    }

    private final void rgvfuqvkyq(opjhrmiecq.igdgnonuha igdgnonuhaVar, DeleteGesture deleteGesture, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar) {
        if (skhdrjzrfnVar != null) {
            skhdrjzrfnVar.uawqvzlxes(uawqvzlxes.oxmwwwfdhm(igdgnonuhaVar, yzdjzghtvl.gxszxtbevo(deleteGesture.getDeletionArea()), jyumaefscl(deleteGesture.getGranularity()), c.f50129iobyxmoadg.nufgyqmvbu()));
        }
    }

    private final void vdvldrhtss(opjhrmiecq.igdgnonuha igdgnonuhaVar, DeleteRangeGesture deleteRangeGesture, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar) {
        if (skhdrjzrfnVar != null) {
            skhdrjzrfnVar.uawqvzlxes(uawqvzlxes.kcexrzcfyt(igdgnonuhaVar, yzdjzghtvl.gxszxtbevo(deleteRangeGesture.getDeletionStartArea()), yzdjzghtvl.gxszxtbevo(deleteRangeGesture.getDeletionEndArea()), jyumaefscl(deleteRangeGesture.getGranularity()), c.f50129iobyxmoadg.nufgyqmvbu()));
        }
    }

    private final int wflxmlrfwp(opjhrmiecq.igdgnonuha igdgnonuhaVar, SelectGesture selectGesture, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, tg.draadjrbmk draadjrbmkVar) {
        long jOxmwwwfdhm = uawqvzlxes.oxmwwwfdhm(igdgnonuhaVar, yzdjzghtvl.gxszxtbevo(selectGesture.getSelectionArea()), jyumaefscl(selectGesture.getGranularity()), c.f50129iobyxmoadg.nufgyqmvbu());
        if (l.nufgyqmvbu(jOxmwwwfdhm)) {
            return f49927iobyxmoadg.ppxfxbqfkf(jlmebxxoox.iobyxmoadg(selectGesture), draadjrbmkVar);
        }
        ojitshcjhn(jOxmwwwfdhm, skhdrjzrfnVar, draadjrbmkVar);
        return 1;
    }

    private final int wkgbmnqykc(opjhrmiecq.igdgnonuha igdgnonuhaVar, DeleteGesture deleteGesture, j0.eablkybsjg eablkybsjgVar, tg.draadjrbmk draadjrbmkVar) {
        int iJyumaefscl = jyumaefscl(deleteGesture.getGranularity());
        long jOxmwwwfdhm = uawqvzlxes.oxmwwwfdhm(igdgnonuhaVar, yzdjzghtvl.gxszxtbevo(deleteGesture.getDeletionArea()), iJyumaefscl, c.f50129iobyxmoadg.nufgyqmvbu());
        if (l.nufgyqmvbu(jOxmwwwfdhm)) {
            return f49927iobyxmoadg.ppxfxbqfkf(jlmebxxoox.iobyxmoadg(deleteGesture), draadjrbmkVar);
        }
        gxszxtbevo(jOxmwwwfdhm, eablkybsjgVar, eslsurpljm.wkgbmnqykc(iJyumaefscl, eslsurpljm.f50188iobyxmoadg.zoijcleaow()), draadjrbmkVar);
        return 1;
    }

    private final void yggfygwlhe(opjhrmiecq.igdgnonuha igdgnonuhaVar, SelectRangeGesture selectRangeGesture, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar) {
        if (skhdrjzrfnVar != null) {
            skhdrjzrfnVar.ipoelvxyzq(uawqvzlxes.kcexrzcfyt(igdgnonuhaVar, yzdjzghtvl.gxszxtbevo(selectRangeGesture.getSelectionStartArea()), yzdjzghtvl.gxszxtbevo(selectRangeGesture.getSelectionEndArea()), jyumaefscl(selectRangeGesture.getGranularity()), c.f50129iobyxmoadg.nufgyqmvbu()));
        }
    }

    private final void zdlpuopuiu(opjhrmiecq.igdgnonuha igdgnonuhaVar, SelectGesture selectGesture, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar) {
        if (skhdrjzrfnVar != null) {
            skhdrjzrfnVar.ipoelvxyzq(uawqvzlxes.oxmwwwfdhm(igdgnonuhaVar, yzdjzghtvl.gxszxtbevo(selectGesture.getSelectionArea()), jyumaefscl(selectGesture.getGranularity()), c.f50129iobyxmoadg.nufgyqmvbu()));
        }
    }

    public final int lqeggnwhkg(opjhrmiecq.igdgnonuha igdgnonuhaVar, HandwritingGesture handwritingGesture, skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, w wVar, tg.draadjrbmk draadjrbmkVar) {
        f fVarGxszxtbevo;
        e eVarDraadjrbmk;
        j0.eablkybsjg eablkybsjgVarPmvmpeiblj = igdgnonuhaVar.pmvmpeiblj();
        if (eablkybsjgVarPmvmpeiblj == null) {
            return 3;
        }
        p0 p0VarAgtfadlqog = igdgnonuhaVar.agtfadlqog();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVarPmvmpeiblj, (p0VarAgtfadlqog == null || (fVarGxszxtbevo = p0VarAgtfadlqog.gxszxtbevo()) == null || (eVarDraadjrbmk = fVarGxszxtbevo.draadjrbmk()) == null) ? null : eVarDraadjrbmk.btonecajqb())) {
            return 3;
        }
        if (stevsuqkhv.iobyxmoadg(handwritingGesture)) {
            return wflxmlrfwp(igdgnonuhaVar, opjhrmiecq.iobyxmoadg(handwritingGesture), skhdrjzrfnVar, draadjrbmkVar);
        }
        if (iyctptxqzt.iobyxmoadg(handwritingGesture)) {
            return wkgbmnqykc(igdgnonuhaVar, weqkydbzbr.iobyxmoadg(handwritingGesture), eablkybsjgVarPmvmpeiblj, draadjrbmkVar);
        }
        if (lrnfpwlwnk.iobyxmoadg(handwritingGesture)) {
            return agtfadlqog(igdgnonuhaVar, zeieaojujs.iobyxmoadg(handwritingGesture), skhdrjzrfnVar, draadjrbmkVar);
        }
        if (kegysxyocb.iobyxmoadg(handwritingGesture)) {
            return eablkybsjg(igdgnonuhaVar, tzroggbefp.iobyxmoadg(handwritingGesture), eablkybsjgVarPmvmpeiblj, draadjrbmkVar);
        }
        if (mbcevpiqjq.iobyxmoadg(handwritingGesture)) {
            return btonecajqb(igdgnonuhaVar, ntlheqmsrt.iobyxmoadg(handwritingGesture), eablkybsjgVarPmvmpeiblj, wVar, draadjrbmkVar);
        }
        if (jhduphickx.iobyxmoadg(handwritingGesture)) {
            return nufgyqmvbu(igdgnonuhaVar, sflfametgt.iobyxmoadg(handwritingGesture), wVar, draadjrbmkVar);
        }
        if (oipsdeybqn.iobyxmoadg(handwritingGesture)) {
            return gtknphoqwx(igdgnonuhaVar, bfopjjpdmp.iobyxmoadg(handwritingGesture), eablkybsjgVarPmvmpeiblj, wVar, draadjrbmkVar);
        }
        return 2;
    }

    public final boolean oxmwwwfdhm(opjhrmiecq.igdgnonuha igdgnonuhaVar, PreviewableHandwritingGesture previewableHandwritingGesture, final skhdrjzrfn.skhdrjzrfn skhdrjzrfnVar, CancellationSignal cancellationSignal) {
        f fVarGxszxtbevo;
        e eVarDraadjrbmk;
        j0.eablkybsjg eablkybsjgVarPmvmpeiblj = igdgnonuhaVar.pmvmpeiblj();
        if (eablkybsjgVarPmvmpeiblj == null) {
            return false;
        }
        p0 p0VarAgtfadlqog = igdgnonuhaVar.agtfadlqog();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(eablkybsjgVarPmvmpeiblj, (p0VarAgtfadlqog == null || (fVarGxszxtbevo = p0VarAgtfadlqog.gxszxtbevo()) == null || (eVarDraadjrbmk = fVarGxszxtbevo.draadjrbmk()) == null) ? null : eVarDraadjrbmk.btonecajqb())) {
            return false;
        }
        if (stevsuqkhv.iobyxmoadg(previewableHandwritingGesture)) {
            zdlpuopuiu(igdgnonuhaVar, opjhrmiecq.iobyxmoadg(previewableHandwritingGesture), skhdrjzrfnVar);
        } else if (iyctptxqzt.iobyxmoadg(previewableHandwritingGesture)) {
            rgvfuqvkyq(igdgnonuhaVar, weqkydbzbr.iobyxmoadg(previewableHandwritingGesture), skhdrjzrfnVar);
        } else if (lrnfpwlwnk.iobyxmoadg(previewableHandwritingGesture)) {
            yggfygwlhe(igdgnonuhaVar, zeieaojujs.iobyxmoadg(previewableHandwritingGesture), skhdrjzrfnVar);
        } else {
            if (!kegysxyocb.iobyxmoadg(previewableHandwritingGesture)) {
                return false;
            }
            vdvldrhtss(igdgnonuhaVar, tzroggbefp.iobyxmoadg(previewableHandwritingGesture), skhdrjzrfnVar);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: iwxlajgraz.tbqsvytpvh
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                roivzttewh.kcexrzcfyt(skhdrjzrfnVar);
            }
        });
        return true;
    }
}
