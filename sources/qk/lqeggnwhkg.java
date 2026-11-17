package qk;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {
    public static final List iobyxmoadg(List addresses) {
        zdlpuopuiu.btonecajqb(addresses, "addresses");
        if (addresses.size() < 2) {
            return addresses;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : addresses) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        gg.vdvldrhtss vdvldrhtssVar = new gg.vdvldrhtss(arrayList, arrayList2);
        List list = (List) vdvldrhtssVar.iobyxmoadg();
        List list2 = (List) vdvldrhtssVar.wkgbmnqykc();
        return (list.isEmpty() || list2.isEmpty()) ? addresses : mk.wflxmlrfwp.iwizpuwonk(list, list2);
    }
}
