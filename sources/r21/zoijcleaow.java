package r21;

import gg.kcexrzcfyt;
import hg.agtfadlqog;
import hg.jyumaefscl;
import java.net.InetAddress;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.vdvldrhtss;
import org.xbill.DNS.c0;
import org.xbill.DNS.dsvhmnatus;
import org.xbill.DNS.gxszxtbevo;
import org.xbill.DNS.xrmfcynszj;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List ppxfxbqfkf(String hostname) {
        Object objWkgbmnqykc;
        Object objWkgbmnqykc2;
        zdlpuopuiu.btonecajqb(hostname, "hostname");
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(vdvldrhtss.f63198zoijcleaow.iobyxmoadg(hostname));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        List list = (List) objWkgbmnqykc;
        if (list != null) {
            return list;
        }
        try {
            InetAddress[] inetAddressArrWkgbmnqykc = gxszxtbevo.wkgbmnqykc(hostname);
            zdlpuopuiu.dxjokdxxww(inetAddressArrWkgbmnqykc, "getAllByName(...)");
            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(agtfadlqog.i(inetAddressArrWkgbmnqykc));
        } catch (Throwable th3) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc2 = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th3));
        }
        List list2 = (List) (kcexrzcfyt.draadjrbmk(objWkgbmnqykc2) ? null : objWkgbmnqykc2);
        return list2 == null ? jyumaefscl.wflxmlrfwp() : list2;
    }

    public static final vdvldrhtss zoijcleaow() {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            dsvhmnatus dsvhmnatusVar = new dsvhmnatus(jyumaefscl.eablkybsjg(new c0("176.67.241.157")));
            xrmfcynszj.rgvfuqvkyq(dsvhmnatusVar);
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(dsvhmnatusVar);
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        return kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) == null ? new vdvldrhtss() { // from class: r21.iobyxmoadg
            @Override // lk.vdvldrhtss
            public final List iobyxmoadg(String str) {
                return zoijcleaow.ppxfxbqfkf(str);
            }
        } : vdvldrhtss.f63198zoijcleaow;
    }
}
