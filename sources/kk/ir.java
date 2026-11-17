package kk;

import android.util.Base64;
import android.util.Patterns;
import java.util.List;
import java.util.Locale;
import modern.payments.ecomAndroid.presentation.fragment.paymentSbp.EcomSbpViewModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ir {
    public static int eablkybsjg(String str) {
        String strHcddaimhww;
        Integer numVdvldrhtss;
        if (str == null || (strHcddaimhww = mj.kcexrzcfyt.hcddaimhww(str, " ", "", false, 4, null)) == null || (numVdvldrhtss = mj.kcexrzcfyt.vdvldrhtss(strHcddaimhww)) == null) {
            return 0;
        }
        return numVdvldrhtss.intValue();
    }

    public static final ro gxszxtbevo(String str) {
        zg.btonecajqb btonecajqbVarPpxfxbqfkf;
        zg.btonecajqb btonecajqbVarPpxfxbqfkf2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        hkdspvbjdzVar.f60015zdlpuopuiu = new ro("", hg.jyumaefscl.wflxmlrfwp(), hg.jyumaefscl.wflxmlrfwp());
        String string = Patterns.WEB_URL.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "WEB_URL.toString()");
        String strVdvldrhtss = new mj.rgvfuqvkyq(string).vdvldrhtss(str, new eq(hkdspvbjdzVar));
        while (mj.kcexrzcfyt.sopmlzcsov(strVdvldrhtss, "<url=>", false, 2, null) && mj.kcexrzcfyt.sopmlzcsov(strVdvldrhtss, "</url>", false, 2, null)) {
            mj.draadjrbmk draadjrbmkVarNufgyqmvbu = mj.rgvfuqvkyq.nufgyqmvbu(new mj.rgvfuqvkyq("<url=>"), strVdvldrhtss, 0, 2, null);
            Integer numValueOf = (draadjrbmkVarNufgyqmvbu == null || (btonecajqbVarPpxfxbqfkf2 = draadjrbmkVarNufgyqmvbu.ppxfxbqfkf()) == null) ? null : Integer.valueOf(btonecajqbVarPpxfxbqfkf2.wkgbmnqykc());
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(numValueOf);
            int iIntValue = numValueOf.intValue();
            mj.draadjrbmk draadjrbmkVarNufgyqmvbu2 = mj.rgvfuqvkyq.nufgyqmvbu(new mj.rgvfuqvkyq("</url>"), strVdvldrhtss, 0, 2, null);
            Integer numValueOf2 = (draadjrbmkVarNufgyqmvbu2 == null || (btonecajqbVarPpxfxbqfkf = draadjrbmkVarNufgyqmvbu2.ppxfxbqfkf()) == null) ? null : Integer.valueOf(btonecajqbVarPpxfxbqfkf.wkgbmnqykc() - 6);
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(numValueOf2);
            int iIntValue2 = numValueOf2.intValue();
            strVdvldrhtss = mj.kcexrzcfyt.hkdspvbjdz(mj.kcexrzcfyt.hkdspvbjdz(strVdvldrhtss, "<url=>", "", false, 4, null), "</url>", "", false, 4, null);
            ro roVar = (ro) hkdspvbjdzVar.f60015zdlpuopuiu;
            List listP = hg.jyumaefscl.p(roVar.f58459ppxfxbqfkf);
            listP.add(new mn(iIntValue, iIntValue2));
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            hkdspvbjdzVar.f60015zdlpuopuiu = ro.iobyxmoadg(roVar, null, null, listP, 3);
        }
        ro roVarIobyxmoadg = ro.iobyxmoadg((ro) hkdspvbjdzVar.f60015zdlpuopuiu, strVdvldrhtss, null, null, 6);
        hkdspvbjdzVar.f60015zdlpuopuiu = roVarIobyxmoadg;
        return roVarIobyxmoadg;
    }

    public static final String iobyxmoadg(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(upperCase, "RUB") ? "₽" : "";
    }

    public static final String lqeggnwhkg(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        return EcomSbpViewModel.HTTPS_PATTERN + str;
    }

    public static final String ppxfxbqfkf(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        byte[] decoded = Base64.decode(str, 0);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(decoded, "decoded");
        return new String(decoded, mj.wkgbmnqykc.f67326zoijcleaow);
    }

    public static final String wkgbmnqykc(String str) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "-1")) {
            return null;
        }
        return str;
    }

    public static final String zoijcleaow(String str, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        if (!z13) {
            return str;
        }
        return "-" + str;
    }
}
