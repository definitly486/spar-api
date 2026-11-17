package th;

import gg.cqumvgiudr;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh.iyctptxqzt;
import jh.lmojexxdyd;
import kh.oxmwwwfdhm;
import kh.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final gxszxtbevo f110491iobyxmoadg = new gxszxtbevo();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f110493zoijcleaow = tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("PACKAGE", EnumSet.noneOf(oxmwwwfdhm.class)), cqumvgiudr.iobyxmoadg("TYPE", EnumSet.of(oxmwwwfdhm.f55428hkdspvbjdz, oxmwwwfdhm.f55455ribwqtqdhb)), cqumvgiudr.iobyxmoadg("ANNOTATION_TYPE", EnumSet.of(oxmwwwfdhm.f55420cllcsxoeiz)), cqumvgiudr.iobyxmoadg("TYPE_PARAMETER", EnumSet.of(oxmwwwfdhm.f55424dsvhmnatus)), cqumvgiudr.iobyxmoadg("FIELD", EnumSet.of(oxmwwwfdhm.f55461stevsuqkhv)), cqumvgiudr.iobyxmoadg("LOCAL_VARIABLE", EnumSet.of(oxmwwwfdhm.f55441kegysxyocb)), cqumvgiudr.iobyxmoadg("PARAMETER", EnumSet.of(oxmwwwfdhm.f55463tzroggbefp)), cqumvgiudr.iobyxmoadg("CONSTRUCTOR", EnumSet.of(oxmwwwfdhm.f55446mbcevpiqjq)), cqumvgiudr.iobyxmoadg("METHOD", EnumSet.of(oxmwwwfdhm.f55448ntlheqmsrt, oxmwwwfdhm.f55465ulzqkzuiru, oxmwwwfdhm.f55460sopmlzcsov)), cqumvgiudr.iobyxmoadg("TYPE_USE", EnumSet.of(oxmwwwfdhm.f55422crxdokpmqz)));

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final Map f110492ppxfxbqfkf = tzroggbefp.draadjrbmk(cqumvgiudr.iobyxmoadg("RUNTIME", vdvldrhtss.RUNTIME), cqumvgiudr.iobyxmoadg("CLASS", vdvldrhtss.BINARY), cqumvgiudr.iobyxmoadg("SOURCE", vdvldrhtss.SOURCE));

    private gxszxtbevo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kegysxyocb eablkybsjg(lmojexxdyd module) {
        kegysxyocb type;
        zdlpuopuiu.btonecajqb(module, "module");
        iyctptxqzt iyctptxqztVarZoijcleaow = iobyxmoadg.zoijcleaow(wkgbmnqykc.f110516iobyxmoadg.wkgbmnqykc(), module.wflxmlrfwp().ojitshcjhn(gh.ojitshcjhn.iobyxmoadg.f37353wwaezpbzkn));
        return (iyctptxqztVarZoijcleaow == null || (type = iyctptxqztVarZoijcleaow.getType()) == null) ? bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16430b, new String[0]) : type;
    }

    public final Set ppxfxbqfkf(String str) {
        EnumSet enumSet = (EnumSet) f110493zoijcleaow.get(str);
        return enumSet != null ? enumSet : ikoacuggdj.eablkybsjg();
    }

    public final ni.lqeggnwhkg wkgbmnqykc(List arguments) {
        zdlpuopuiu.btonecajqb(arguments, "arguments");
        ArrayList<zh.wflxmlrfwp> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof zh.wflxmlrfwp) {
                arrayList.add(obj);
            }
        }
        ArrayList<oxmwwwfdhm> arrayList2 = new ArrayList();
        for (zh.wflxmlrfwp wflxmlrfwpVar : arrayList) {
            gxszxtbevo gxszxtbevoVar = f110491iobyxmoadg;
            ii.gxszxtbevo gxszxtbevoVarEablkybsjg = wflxmlrfwpVar.eablkybsjg();
            jyumaefscl.istkbnxepw(arrayList2, gxszxtbevoVar.ppxfxbqfkf(gxszxtbevoVarEablkybsjg != null ? gxszxtbevoVarEablkybsjg.zoijcleaow() : null));
        }
        ArrayList arrayList3 = new ArrayList(jyumaefscl.cqumvgiudr(arrayList2, 10));
        for (oxmwwwfdhm oxmwwwfdhmVar : arrayList2) {
            ii.zoijcleaow zoijcleaowVarPpxfxbqfkf = ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(gh.ojitshcjhn.iobyxmoadg.f37331pkzmftpjix);
            ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(oxmwwwfdhmVar.name());
            zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
            arrayList3.add(new ni.gtknphoqwx(zoijcleaowVarPpxfxbqfkf, gxszxtbevoVarGxszxtbevo));
        }
        return new ni.zoijcleaow(arrayList3, eablkybsjg.f110489zdlpuopuiu);
    }

    public final ni.lqeggnwhkg zoijcleaow(zh.zoijcleaow zoijcleaowVar) {
        zh.wflxmlrfwp wflxmlrfwpVar = zoijcleaowVar instanceof zh.wflxmlrfwp ? (zh.wflxmlrfwp) zoijcleaowVar : null;
        if (wflxmlrfwpVar == null) {
            return null;
        }
        Map map = f110492ppxfxbqfkf;
        ii.gxszxtbevo gxszxtbevoVarEablkybsjg = wflxmlrfwpVar.eablkybsjg();
        vdvldrhtss vdvldrhtssVar = (vdvldrhtss) map.get(gxszxtbevoVarEablkybsjg != null ? gxszxtbevoVarEablkybsjg.zoijcleaow() : null);
        if (vdvldrhtssVar == null) {
            return null;
        }
        ii.zoijcleaow zoijcleaowVarPpxfxbqfkf = ii.zoijcleaow.f44488wkgbmnqykc.ppxfxbqfkf(gh.ojitshcjhn.iobyxmoadg.f37294hcddaimhww);
        ii.gxszxtbevo gxszxtbevoVarGxszxtbevo = ii.gxszxtbevo.gxszxtbevo(vdvldrhtssVar.name());
        zdlpuopuiu.dxjokdxxww(gxszxtbevoVarGxszxtbevo, "identifier(...)");
        return new ni.gtknphoqwx(zoijcleaowVarPpxfxbqfkf, gxszxtbevoVarGxszxtbevo);
    }
}
