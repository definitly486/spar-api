package s6;

import g6.yggfygwlhe;
import hg.jyumaefscl;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import p6.btonecajqb;
import p6.dxjokdxxww;
import p6.lereixgezr;
import p6.ojitshcjhn;
import p6.zynmafqrjb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f105600iobyxmoadg;

    static {
        String strDxjokdxxww = yggfygwlhe.dxjokdxxww("DiagnosticsWrkr");
        zdlpuopuiu.dxjokdxxww(strDxjokdxxww, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f105600iobyxmoadg = strDxjokdxxww;
    }

    private static final String ppxfxbqfkf(p6.yggfygwlhe yggfygwlheVar, String str, Integer num, String str2) {
        return '\n' + yggfygwlheVar.f75796iobyxmoadg + "\t " + yggfygwlheVar.f75804ppxfxbqfkf + "\t " + num + "\t " + yggfygwlheVar.f75811zoijcleaow.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String wkgbmnqykc(ojitshcjhn ojitshcjhnVar, zynmafqrjb zynmafqrjbVar, btonecajqb btonecajqbVar, List list) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p6.yggfygwlhe yggfygwlheVar = (p6.yggfygwlhe) it.next();
            dxjokdxxww dxjokdxxwwVarIobyxmoadg = btonecajqbVar.iobyxmoadg(lereixgezr.iobyxmoadg(yggfygwlheVar));
            sb3.append(ppxfxbqfkf(yggfygwlheVar, jyumaefscl.iwxlajgraz(ojitshcjhnVar.iobyxmoadg(yggfygwlheVar.f75796iobyxmoadg), StringUtils.COMMA, null, null, 0, null, null, 62, null), dxjokdxxwwVarIobyxmoadg != null ? Integer.valueOf(dxjokdxxwwVarIobyxmoadg.f75705ppxfxbqfkf) : null, jyumaefscl.iwxlajgraz(zynmafqrjbVar.iobyxmoadg(yggfygwlheVar.f75796iobyxmoadg), StringUtils.COMMA, null, null, 0, null, null, 62, null)));
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
