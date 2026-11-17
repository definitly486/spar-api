package uj;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import pj.ageimvtcrz;

/* JADX INFO: loaded from: classes3.dex */
public final class oxmwwwfdhm {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final oxmwwwfdhm f113661iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final ageimvtcrz f113662zoijcleaow;

    static {
        oxmwwwfdhm oxmwwwfdhmVar = new oxmwwwfdhm();
        f113661iobyxmoadg = oxmwwwfdhmVar;
        cdpycssgdh.gxszxtbevo("kotlinx.coroutines.fast.service.loader", true);
        f113662zoijcleaow = oxmwwwfdhmVar.iobyxmoadg();
    }

    private oxmwwwfdhm() {
    }

    private final ageimvtcrz iobyxmoadg() {
        Object next;
        ageimvtcrz ageimvtcrzVarEablkybsjg;
        try {
            List listCrxdokpmqz = lj.wflxmlrfwp.crxdokpmqz(lj.wflxmlrfwp.lqeggnwhkg(ServiceLoader.load(vdvldrhtss.class, vdvldrhtss.class.getClassLoader()).iterator()));
            Iterator it = listCrxdokpmqz.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((vdvldrhtss) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((vdvldrhtss) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            vdvldrhtss vdvldrhtssVar = (vdvldrhtss) next;
            if (vdvldrhtssVar != null && (ageimvtcrzVarEablkybsjg = kcexrzcfyt.eablkybsjg(vdvldrhtssVar, listCrxdokpmqz)) != null) {
                return ageimvtcrzVarEablkybsjg;
            }
            kcexrzcfyt.zoijcleaow(null, null, 3, null);
            return null;
        } catch (Throwable th2) {
            kcexrzcfyt.zoijcleaow(th2, null, 2, null);
            return null;
        }
    }
}
