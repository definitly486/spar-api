package s0;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.jrbgnlbqoe;
import j0.p;
import j0.q;
import java.util.List;
import n0.lereixgezr;
import n0.pmvmpeiblj;
import n0.yadqdtsiqt;
import n0.ylkuphrtab;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    private static final void iobyxmoadg(SpannableString spannableString, jrbgnlbqoe jrbgnlbqoeVar, int i13, int i14, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar) {
        t0.wkgbmnqykc.agtfadlqog(spannableString, jrbgnlbqoeVar.lqeggnwhkg(), i13, i14);
        t0.wkgbmnqykc.kcexrzcfyt(spannableString, jrbgnlbqoeVar.gtknphoqwx(), wkgbmnqykcVar, i13, i14);
        if (jrbgnlbqoeVar.agtfadlqog() != null || jrbgnlbqoeVar.draadjrbmk() != null) {
            yadqdtsiqt yadqdtsiqtVarAgtfadlqog = jrbgnlbqoeVar.agtfadlqog();
            if (yadqdtsiqtVarAgtfadlqog == null) {
                yadqdtsiqtVarAgtfadlqog = yadqdtsiqt.f68367yggfygwlhe.wkgbmnqykc();
            }
            lereixgezr lereixgezrVarDraadjrbmk = jrbgnlbqoeVar.draadjrbmk();
            spannableString.setSpan(new StyleSpan(n0.gxszxtbevo.ppxfxbqfkf(yadqdtsiqtVarAgtfadlqog, lereixgezrVarDraadjrbmk != null ? lereixgezrVarDraadjrbmk.dxjokdxxww() : lereixgezr.f68283zoijcleaow.zoijcleaow())), i13, i14, 33);
        }
        if (jrbgnlbqoeVar.dxjokdxxww() != null) {
            if (jrbgnlbqoeVar.dxjokdxxww() instanceof ylkuphrtab) {
                spannableString.setSpan(new TypefaceSpan(((ylkuphrtab) jrbgnlbqoeVar.dxjokdxxww()).gxszxtbevo()), i13, i14, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                n0.wflxmlrfwp wflxmlrfwpVarDxjokdxxww = jrbgnlbqoeVar.dxjokdxxww();
                pmvmpeiblj pmvmpeibljVarWflxmlrfwp = jrbgnlbqoeVar.wflxmlrfwp();
                Object value = n0.wflxmlrfwp.zoijcleaow.iobyxmoadg(zoijcleaowVar, wflxmlrfwpVarDxjokdxxww, null, 0, pmvmpeibljVarWflxmlrfwp != null ? pmvmpeibljVarWflxmlrfwp.wflxmlrfwp() : pmvmpeiblj.f68323zoijcleaow.iobyxmoadg(), 6, null).getValue();
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(wflxmlrfwp.f105146iobyxmoadg.iobyxmoadg((Typeface) value), i13, i14, 33);
            }
        }
        if (jrbgnlbqoeVar.kcexrzcfyt() != null) {
            v0.gtknphoqwx gtknphoqwxVarKcexrzcfyt = jrbgnlbqoeVar.kcexrzcfyt();
            v0.gtknphoqwx.iobyxmoadg iobyxmoadgVar = v0.gtknphoqwx.f114956zoijcleaow;
            if (gtknphoqwxVarKcexrzcfyt.wkgbmnqykc(iobyxmoadgVar.wkgbmnqykc())) {
                spannableString.setSpan(new UnderlineSpan(), i13, i14, 33);
            }
            if (jrbgnlbqoeVar.kcexrzcfyt().wkgbmnqykc(iobyxmoadgVar.zoijcleaow())) {
                spannableString.setSpan(new StrikethroughSpan(), i13, i14, 33);
            }
        }
        if (jrbgnlbqoeVar.yggfygwlhe() != null) {
            spannableString.setSpan(new ScaleXSpan(jrbgnlbqoeVar.yggfygwlhe().zoijcleaow()), i13, i14, 33);
        }
        t0.wkgbmnqykc.iwizpuwonk(spannableString, jrbgnlbqoeVar.rgvfuqvkyq(), i13, i14);
        t0.wkgbmnqykc.btonecajqb(spannableString, jrbgnlbqoeVar.wkgbmnqykc(), i13, i14);
    }

    private static final j0.eablkybsjg.wkgbmnqykc ppxfxbqfkf(j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar) {
        Object objLqeggnwhkg = wkgbmnqykcVar.lqeggnwhkg();
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(objLqeggnwhkg, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new j0.eablkybsjg.wkgbmnqykc((j0.vdvldrhtss.zoijcleaow) objLqeggnwhkg, wkgbmnqykcVar.nufgyqmvbu(), wkgbmnqykcVar.gxszxtbevo());
    }

    public static final SpannableString zoijcleaow(j0.eablkybsjg eablkybsjgVar, w0.wkgbmnqykc wkgbmnqykcVar, n0.wflxmlrfwp.zoijcleaow zoijcleaowVar, iwizpuwonk iwizpuwonkVar) {
        SpannableString spannableString = new SpannableString(eablkybsjgVar.btonecajqb());
        List listNufgyqmvbu = eablkybsjgVar.nufgyqmvbu();
        if (listNufgyqmvbu != null) {
            int size = listNufgyqmvbu.size();
            for (int i13 = 0; i13 < size; i13++) {
                j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar2 = (j0.eablkybsjg.wkgbmnqykc) listNufgyqmvbu.get(i13);
                jrbgnlbqoe jrbgnlbqoeVar = (jrbgnlbqoe) wkgbmnqykcVar2.iobyxmoadg();
                iobyxmoadg(spannableString, jrbgnlbqoeVar.iobyxmoadg((65534 & 1) != 0 ? jrbgnlbqoeVar.lqeggnwhkg() : 0L, (65534 & 2) != 0 ? jrbgnlbqoeVar.f50281zoijcleaow : 0L, (65534 & 4) != 0 ? jrbgnlbqoeVar.f50277ppxfxbqfkf : null, (65534 & 8) != 0 ? jrbgnlbqoeVar.f50280wkgbmnqykc : null, (65534 & 16) != 0 ? jrbgnlbqoeVar.f50270eablkybsjg : null, (65534 & 32) != 0 ? jrbgnlbqoeVar.f50272gxszxtbevo : null, (65534 & 64) != 0 ? jrbgnlbqoeVar.f50274lqeggnwhkg : null, (65534 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? jrbgnlbqoeVar.f50275nufgyqmvbu : 0L, (65534 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? jrbgnlbqoeVar.f50269dxjokdxxww : null, (65534 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? jrbgnlbqoeVar.f50267btonecajqb : null, (65534 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? jrbgnlbqoeVar.f50271gtknphoqwx : null, (65534 & 2048) != 0 ? jrbgnlbqoeVar.f50268draadjrbmk : 0L, (65534 & 4096) != 0 ? jrbgnlbqoeVar.f50279wflxmlrfwp : null, (65534 & 8192) != 0 ? jrbgnlbqoeVar.f50266agtfadlqog : null, (65534 & 16384) != 0 ? jrbgnlbqoeVar.f50276ojitshcjhn : null, (65534 & 32768) != 0 ? jrbgnlbqoeVar.f50278rgvfuqvkyq : null), wkgbmnqykcVar2.zoijcleaow(), wkgbmnqykcVar2.ppxfxbqfkf(), wkgbmnqykcVar, zoijcleaowVar);
            }
        }
        List listGtknphoqwx = eablkybsjgVar.gtknphoqwx(0, eablkybsjgVar.length());
        int size2 = listGtknphoqwx.size();
        for (int i14 = 0; i14 < size2; i14++) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar3 = (j0.eablkybsjg.wkgbmnqykc) listGtknphoqwx.get(i14);
            spannableString.setSpan(t0.gxszxtbevo.iobyxmoadg((p) wkgbmnqykcVar3.iobyxmoadg()), wkgbmnqykcVar3.zoijcleaow(), wkgbmnqykcVar3.ppxfxbqfkf(), 33);
        }
        List listDraadjrbmk = eablkybsjgVar.draadjrbmk(0, eablkybsjgVar.length());
        int size3 = listDraadjrbmk.size();
        for (int i15 = 0; i15 < size3; i15++) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar4 = (j0.eablkybsjg.wkgbmnqykc) listDraadjrbmk.get(i15);
            spannableString.setSpan(iwizpuwonkVar.ppxfxbqfkf((q) wkgbmnqykcVar4.iobyxmoadg()), wkgbmnqykcVar4.zoijcleaow(), wkgbmnqykcVar4.ppxfxbqfkf(), 33);
        }
        List listEablkybsjg = eablkybsjgVar.eablkybsjg(0, eablkybsjgVar.length());
        int size4 = listEablkybsjg.size();
        for (int i16 = 0; i16 < size4; i16++) {
            j0.eablkybsjg.wkgbmnqykc wkgbmnqykcVar5 = (j0.eablkybsjg.wkgbmnqykc) listEablkybsjg.get(i16);
            if (wkgbmnqykcVar5.nufgyqmvbu() != wkgbmnqykcVar5.gxszxtbevo()) {
                j0.vdvldrhtss vdvldrhtssVar = (j0.vdvldrhtss) wkgbmnqykcVar5.lqeggnwhkg();
                if (vdvldrhtssVar instanceof j0.vdvldrhtss.zoijcleaow) {
                    ((j0.vdvldrhtss.zoijcleaow) vdvldrhtssVar).iobyxmoadg();
                    spannableString.setSpan(iwizpuwonkVar.zoijcleaow(ppxfxbqfkf(wkgbmnqykcVar5)), wkgbmnqykcVar5.nufgyqmvbu(), wkgbmnqykcVar5.gxszxtbevo(), 33);
                } else {
                    spannableString.setSpan(iwizpuwonkVar.iobyxmoadg(wkgbmnqykcVar5), wkgbmnqykcVar5.nufgyqmvbu(), wkgbmnqykcVar5.gxszxtbevo(), 33);
                }
            }
        }
        return spannableString;
    }
}
