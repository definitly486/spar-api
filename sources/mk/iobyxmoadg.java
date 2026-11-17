package mk;

import gg.vdvldrhtss;
import java.nio.charset.Charset;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cqumvgiudr;

/* JADX INFO: loaded from: classes3.dex */
public abstract class iobyxmoadg {
    public static final Charset iobyxmoadg(cqumvgiudr cqumvgiudrVar, Charset defaultValue) {
        Charset charsetIobyxmoadg;
        zdlpuopuiu.btonecajqb(defaultValue, "defaultValue");
        return (cqumvgiudrVar == null || (charsetIobyxmoadg = cqumvgiudrVar.iobyxmoadg(defaultValue)) == null) ? mj.wkgbmnqykc.f67326zoijcleaow : charsetIobyxmoadg;
    }

    public static final vdvldrhtss ppxfxbqfkf(cqumvgiudr cqumvgiudrVar) {
        Charset charset = mj.wkgbmnqykc.f67326zoijcleaow;
        if (cqumvgiudrVar != null) {
            Charset charsetZoijcleaow = cqumvgiudr.zoijcleaow(cqumvgiudrVar, null, 1, null);
            if (charsetZoijcleaow == null) {
                cqumvgiudrVar = cqumvgiudr.f62887eablkybsjg.zoijcleaow(cqumvgiudrVar + "; charset=utf-8");
            } else {
                charset = charsetZoijcleaow;
            }
        }
        return gg.cqumvgiudr.iobyxmoadg(charset, cqumvgiudrVar);
    }

    public static final String[] wkgbmnqykc(lk.draadjrbmk draadjrbmkVar, String[] socketEnabledCipherSuites) {
        zdlpuopuiu.btonecajqb(draadjrbmkVar, "<this>");
        zdlpuopuiu.btonecajqb(socketEnabledCipherSuites, "socketEnabledCipherSuites");
        return draadjrbmkVar.wkgbmnqykc() != null ? wflxmlrfwp.cqumvgiudr(socketEnabledCipherSuites, draadjrbmkVar.wkgbmnqykc(), lk.dxjokdxxww.f63027zoijcleaow.ppxfxbqfkf()) : socketEnabledCipherSuites;
    }

    public static /* synthetic */ Charset zoijcleaow(cqumvgiudr cqumvgiudrVar, Charset charset, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            charset = mj.wkgbmnqykc.f67326zoijcleaow;
        }
        return iobyxmoadg(cqumvgiudrVar, charset);
    }
}
