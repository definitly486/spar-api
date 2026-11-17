package xx;

import android.os.Build;
import fk.gxszxtbevo;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gk.eablkybsjg;
import hg.jyumaefscl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import yx.ApiVersionConfig;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn eablkybsjg(eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final String gxszxtbevo(iobyxmoadg iobyxmoadgVar, String versionName, int i13) throws IOException {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(versionName, "versionName");
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        Locale locale = Locale.US;
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < versionName.length(); i14++) {
            char cCharAt = versionName.charAt(i14);
            if (!mj.iobyxmoadg.ppxfxbqfkf(cCharAt)) {
                sb3.append(cCharAt);
            }
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        String str = String.format(locale, "Spar/Android/version-%s/build-%d/sdk-%d", Arrays.copyOf(new Object[]{string, Integer.valueOf(i13), Integer.valueOf(Build.VERSION.SDK_INT)}, 3));
        zdlpuopuiu.dxjokdxxww(str, "format(...)");
        return str;
    }

    public static final ApiVersionConfig ppxfxbqfkf(iobyxmoadg iobyxmoadgVar, String config) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(config, "config");
        return new ApiVersionConfig(config, "DEFAULT", jyumaefscl.wflxmlrfwp());
    }

    public static final List wkgbmnqykc(iobyxmoadg iobyxmoadgVar, String config) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        zdlpuopuiu.btonecajqb(config, "config");
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            gk.zoijcleaow zoijcleaowVarZoijcleaow = gk.jyumaefscl.zoijcleaow(null, new draadjrbmk() { // from class: xx.zoijcleaow
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return ppxfxbqfkf.eablkybsjg((eablkybsjg) obj);
                }
            }, 1, null);
            zoijcleaowVarZoijcleaow.iobyxmoadg();
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) zoijcleaowVarZoijcleaow.ppxfxbqfkf(new gxszxtbevo(ApiVersionConfig.INSTANCE.serializer()), config));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        List listWflxmlrfwp = jyumaefscl.wflxmlrfwp();
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = listWflxmlrfwp;
        }
        return (List) objWkgbmnqykc;
    }

    public static final List zoijcleaow(iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        List listJrbgnlbqoe = jyumaefscl.jrbgnlbqoe(iobyxmoadgVar.lmojexxdyd(), iobyxmoadgVar.rgvfuqvkyq());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJrbgnlbqoe) {
            if (hashSet.add(((ApiVersionConfig) obj).getVersion())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
