package uw0;

import android.os.Build;
import fk.gxszxtbevo;
import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import gk.eablkybsjg;
import gk.jyumaefscl;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.config.model.ApiVersionConfig;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final String eablkybsjg(ppxfxbqfkf ppxfxbqfkfVar, String versionName, int i13) throws IOException {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
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

    public static final List ppxfxbqfkf(ppxfxbqfkf ppxfxbqfkfVar, String config) {
        Object objWkgbmnqykc;
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(config, "config");
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            gk.zoijcleaow zoijcleaowVarZoijcleaow = jyumaefscl.zoijcleaow(null, new draadjrbmk() { // from class: uw0.iobyxmoadg
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return zoijcleaow.wkgbmnqykc((eablkybsjg) obj);
                }
            }, 1, null);
            zoijcleaowVarZoijcleaow.iobyxmoadg();
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((List) zoijcleaowVarZoijcleaow.ppxfxbqfkf(new gxszxtbevo(ApiVersionConfig.INSTANCE.serializer()), config));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        List listWflxmlrfwp = hg.jyumaefscl.wflxmlrfwp();
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = listWflxmlrfwp;
        }
        return (List) objWkgbmnqykc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(eablkybsjg Json) {
        zdlpuopuiu.btonecajqb(Json, "$this$Json");
        Json.wkgbmnqykc(true);
        Json.eablkybsjg(true);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final ApiVersionConfig zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar, String config) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(config, "config");
        return new ApiVersionConfig(config, "DEFAULT", hg.jyumaefscl.wflxmlrfwp());
    }
}
