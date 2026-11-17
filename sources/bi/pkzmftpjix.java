package bi;

import ai.yfnezrywwk;
import java.util.Iterator;
import java.util.List;
import zi.hszhottldk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pkzmftpjix {
    public static final Object iobyxmoadg(zdlpuopuiu zdlpuopuiuVar, Object possiblyPrimitiveType, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zdlpuopuiuVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z13 ? zdlpuopuiuVar.zoijcleaow(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final Object zoijcleaow(hszhottldk hszhottldkVar, dj.dxjokdxxww type, zdlpuopuiu typeFactory, ylkuphrtab mode) {
        List listDxjokdxxww;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hszhottldkVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(type, "type");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeFactory, "typeFactory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(mode, "mode");
        dj.wflxmlrfwp wflxmlrfwpVarCrxdokpmqz = hszhottldkVar.crxdokpmqz(type);
        if (!hszhottldkVar.wypolnanlu(wflxmlrfwpVarCrxdokpmqz)) {
            return null;
        }
        gh.draadjrbmk draadjrbmkVarOkpsazkaxt = hszhottldkVar.okpsazkaxt(wflxmlrfwpVarCrxdokpmqz);
        if (draadjrbmkVarOkpsazkaxt != null) {
            return iobyxmoadg(typeFactory, typeFactory.wkgbmnqykc(draadjrbmkVarOkpsazkaxt), hszhottldkVar.dvvnrvtcbc(type) || yfnezrywwk.ppxfxbqfkf(hszhottldkVar, type));
        }
        gh.draadjrbmk draadjrbmkVarJyumaefscl = hszhottldkVar.jyumaefscl(wflxmlrfwpVarCrxdokpmqz);
        if (draadjrbmkVarJyumaefscl != null) {
            return typeFactory.iobyxmoadg('[' + qi.eablkybsjg.wkgbmnqykc(draadjrbmkVarJyumaefscl).nufgyqmvbu());
        }
        if (hszhottldkVar.pkzmftpjix(wflxmlrfwpVarCrxdokpmqz)) {
            ii.wkgbmnqykc wkgbmnqykcVarZynmafqrjb = hszhottldkVar.zynmafqrjb(wflxmlrfwpVarCrxdokpmqz);
            ii.zoijcleaow zoijcleaowVarAgtfadlqog = wkgbmnqykcVarZynmafqrjb != null ? ih.ppxfxbqfkf.f44265iobyxmoadg.agtfadlqog(wkgbmnqykcVarZynmafqrjb) : null;
            if (zoijcleaowVarAgtfadlqog != null) {
                if (!mode.iobyxmoadg() && ((listDxjokdxxww = ih.ppxfxbqfkf.f44265iobyxmoadg.dxjokdxxww()) == null || !listDxjokdxxww.isEmpty())) {
                    Iterator it = listDxjokdxxww.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ih.ppxfxbqfkf.iobyxmoadg) it.next()).wkgbmnqykc(), zoijcleaowVarAgtfadlqog)) {
                            return null;
                        }
                    }
                }
                String strNufgyqmvbu = qi.wkgbmnqykc.nufgyqmvbu(zoijcleaowVarAgtfadlqog);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strNufgyqmvbu, "internalNameByClassId(...)");
                return typeFactory.eablkybsjg(strNufgyqmvbu);
            }
        }
        return null;
    }
}
