package q6;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String f77929iobyxmoadg = g6.yggfygwlhe.dxjokdxxww("EnqueueRunnable");

    private static boolean eablkybsjg(h6.iozdgvuglv iozdgvuglvVar) {
        List<h6.iozdgvuglv> listGxszxtbevo = iozdgvuglvVar.gxszxtbevo();
        boolean zEablkybsjg = false;
        if (listGxszxtbevo != null) {
            for (h6.iozdgvuglv iozdgvuglvVar2 : listGxszxtbevo) {
                if (iozdgvuglvVar2.gtknphoqwx()) {
                    g6.yggfygwlhe.eablkybsjg().gtknphoqwx(f77929iobyxmoadg, "Already enqueued work ids (" + TextUtils.join(", ", iozdgvuglvVar2.wkgbmnqykc()) + ")");
                } else {
                    zEablkybsjg |= eablkybsjg(iozdgvuglvVar2);
                }
            }
        }
        return ppxfxbqfkf(iozdgvuglvVar) | zEablkybsjg;
    }

    public static void gxszxtbevo(h6.iozdgvuglv iozdgvuglvVar) {
        h6.dsvhmnatus dsvhmnatusVarNufgyqmvbu = iozdgvuglvVar.nufgyqmvbu();
        androidx.work.impl.iobyxmoadg.nufgyqmvbu(dsvhmnatusVarNufgyqmvbu.agtfadlqog(), dsvhmnatusVarNufgyqmvbu.yggfygwlhe(), dsvhmnatusVarNufgyqmvbu.kcexrzcfyt());
    }

    public static boolean iobyxmoadg(h6.iozdgvuglv iozdgvuglvVar) {
        h6.dsvhmnatus dsvhmnatusVarNufgyqmvbu = iozdgvuglvVar.nufgyqmvbu();
        WorkDatabase workDatabaseYggfygwlhe = dsvhmnatusVarNufgyqmvbu.yggfygwlhe();
        workDatabaseYggfygwlhe.ojitshcjhn();
        try {
            lqeggnwhkg.iobyxmoadg(workDatabaseYggfygwlhe, dsvhmnatusVarNufgyqmvbu.agtfadlqog(), iozdgvuglvVar);
            boolean zEablkybsjg = eablkybsjg(iozdgvuglvVar);
            workDatabaseYggfygwlhe.dsvhmnatus();
            return zEablkybsjg;
        } finally {
            workDatabaseYggfygwlhe.kcexrzcfyt();
        }
    }

    private static boolean ppxfxbqfkf(h6.iozdgvuglv iozdgvuglvVar) {
        boolean zWkgbmnqykc = wkgbmnqykc(iozdgvuglvVar.nufgyqmvbu(), iozdgvuglvVar.lqeggnwhkg(), (String[]) h6.iozdgvuglv.agtfadlqog(iozdgvuglvVar).toArray(new String[0]), iozdgvuglvVar.eablkybsjg(), iozdgvuglvVar.ppxfxbqfkf());
        iozdgvuglvVar.wflxmlrfwp();
        return zWkgbmnqykc;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    private static boolean wkgbmnqykc(h6.dsvhmnatus dsvhmnatusVar, List list, String[] strArr, String str, g6.dxjokdxxww dxjokdxxwwVar) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        String[] strArr2 = strArr;
        long jCurrentTimeMillis = dsvhmnatusVar.agtfadlqog().iobyxmoadg().currentTimeMillis();
        WorkDatabase workDatabaseYggfygwlhe = dsvhmnatusVar.yggfygwlhe();
        boolean z17 = strArr2 != null && strArr2.length > 0;
        if (z17) {
            z13 = false;
            z14 = false;
            z15 = true;
            for (String str2 : strArr2) {
                p6.yggfygwlhe yggfygwlheVarDxjokdxxww = workDatabaseYggfygwlhe.ulzqkzuiru().dxjokdxxww(str2);
                if (yggfygwlheVarDxjokdxxww == null) {
                    g6.yggfygwlhe.eablkybsjg().ppxfxbqfkf(f77929iobyxmoadg, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                g6.hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVar = yggfygwlheVarDxjokdxxww.f75811zoijcleaow;
                z15 &= ppxfxbqfkfVar == g6.hkdspvbjdz.ppxfxbqfkf.SUCCEEDED;
                if (ppxfxbqfkfVar == g6.hkdspvbjdz.ppxfxbqfkf.FAILED) {
                    z14 = true;
                } else if (ppxfxbqfkfVar == g6.hkdspvbjdz.ppxfxbqfkf.CANCELLED) {
                    z13 = true;
                }
            }
        } else {
            z13 = false;
            z14 = false;
            z15 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z17) {
            z16 = false;
        } else {
            List<p6.yggfygwlhe.zoijcleaow> listRgvfuqvkyq = workDatabaseYggfygwlhe.ulzqkzuiru().rgvfuqvkyq(str);
            if (!listRgvfuqvkyq.isEmpty()) {
                if (dxjokdxxwwVar == g6.dxjokdxxww.APPEND || dxjokdxxwwVar == g6.dxjokdxxww.APPEND_OR_REPLACE) {
                    p6.zoijcleaow zoijcleaowVarStevsuqkhv = workDatabaseYggfygwlhe.stevsuqkhv();
                    List arrayList = new ArrayList();
                    for (p6.yggfygwlhe.zoijcleaow zoijcleaowVar : listRgvfuqvkyq) {
                        if (!zoijcleaowVarStevsuqkhv.wkgbmnqykc(zoijcleaowVar.f75829iobyxmoadg)) {
                            g6.hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVar2 = zoijcleaowVar.f75830zoijcleaow;
                            boolean z18 = (ppxfxbqfkfVar2 == g6.hkdspvbjdz.ppxfxbqfkf.SUCCEEDED) & z15;
                            if (ppxfxbqfkfVar2 == g6.hkdspvbjdz.ppxfxbqfkf.FAILED) {
                                z14 = true;
                            } else if (ppxfxbqfkfVar2 == g6.hkdspvbjdz.ppxfxbqfkf.CANCELLED) {
                                z13 = true;
                            }
                            arrayList.add(zoijcleaowVar.f75829iobyxmoadg);
                            z15 = z18;
                        }
                        zoijcleaowVarStevsuqkhv = zoijcleaowVarStevsuqkhv;
                    }
                    if (dxjokdxxwwVar == g6.dxjokdxxww.APPEND_OR_REPLACE && (z13 || z14)) {
                        p6.jyumaefscl jyumaefsclVarUlzqkzuiru = workDatabaseYggfygwlhe.ulzqkzuiru();
                        Iterator it = jyumaefsclVarUlzqkzuiru.rgvfuqvkyq(str).iterator();
                        while (it.hasNext()) {
                            jyumaefsclVarUlzqkzuiru.iobyxmoadg(((p6.yggfygwlhe.zoijcleaow) it.next()).f75829iobyxmoadg);
                        }
                        arrayList = Collections.emptyList();
                        z13 = false;
                        z14 = false;
                    }
                    strArr2 = (String[]) arrayList.toArray(strArr2);
                    z17 = strArr2.length > 0;
                } else {
                    if (dxjokdxxwwVar == g6.dxjokdxxww.KEEP) {
                        Iterator it2 = listRgvfuqvkyq.iterator();
                        while (it2.hasNext()) {
                            g6.hkdspvbjdz.ppxfxbqfkf ppxfxbqfkfVar3 = ((p6.yggfygwlhe.zoijcleaow) it2.next()).f75830zoijcleaow;
                            if (ppxfxbqfkfVar3 == g6.hkdspvbjdz.ppxfxbqfkf.ENQUEUED || ppxfxbqfkfVar3 == g6.hkdspvbjdz.ppxfxbqfkf.RUNNING) {
                                return false;
                            }
                        }
                    }
                    wkgbmnqykc.lqeggnwhkg(str, dsvhmnatusVar);
                    p6.jyumaefscl jyumaefsclVarUlzqkzuiru2 = workDatabaseYggfygwlhe.ulzqkzuiru();
                    Iterator it3 = listRgvfuqvkyq.iterator();
                    while (it3.hasNext()) {
                        jyumaefsclVarUlzqkzuiru2.iobyxmoadg(((p6.yggfygwlhe.zoijcleaow) it3.next()).f75829iobyxmoadg);
                    }
                    z16 = true;
                }
            }
            z16 = false;
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            g6.dsvhmnatus dsvhmnatusVar2 = (g6.dsvhmnatus) it4.next();
            p6.yggfygwlhe yggfygwlheVarWkgbmnqykc = dsvhmnatusVar2.wkgbmnqykc();
            if (!z17 || z15) {
                yggfygwlheVarWkgbmnqykc.f75788agtfadlqog = jCurrentTimeMillis;
            } else if (z14) {
                yggfygwlheVarWkgbmnqykc.f75811zoijcleaow = g6.hkdspvbjdz.ppxfxbqfkf.FAILED;
            } else if (z13) {
                yggfygwlheVarWkgbmnqykc.f75811zoijcleaow = g6.hkdspvbjdz.ppxfxbqfkf.CANCELLED;
            } else {
                yggfygwlheVarWkgbmnqykc.f75811zoijcleaow = g6.hkdspvbjdz.ppxfxbqfkf.BLOCKED;
            }
            Iterator it5 = it4;
            if (yggfygwlheVarWkgbmnqykc.f75811zoijcleaow == g6.hkdspvbjdz.ppxfxbqfkf.ENQUEUED) {
                z16 = true;
            }
            workDatabaseYggfygwlhe.ulzqkzuiru().ppxfxbqfkf(lqeggnwhkg.ppxfxbqfkf(dsvhmnatusVar.kcexrzcfyt(), yggfygwlheVarWkgbmnqykc));
            if (z17) {
                int length = strArr2.length;
                int i13 = 0;
                while (i13 < length) {
                    workDatabaseYggfygwlhe.stevsuqkhv().iobyxmoadg(new p6.iobyxmoadg(dsvhmnatusVar2.zoijcleaow(), strArr2[i13]));
                    i13++;
                    length = length;
                    strArr2 = strArr2;
                }
            }
            String[] strArr3 = strArr2;
            workDatabaseYggfygwlhe.sopmlzcsov().wkgbmnqykc(dsvhmnatusVar2.zoijcleaow(), dsvhmnatusVar2.ppxfxbqfkf());
            if (!zIsEmpty) {
                workDatabaseYggfygwlhe.mbcevpiqjq().zoijcleaow(new p6.agtfadlqog(str, dsvhmnatusVar2.zoijcleaow()));
            }
            it4 = it5;
            strArr2 = strArr3;
        }
        return z16;
    }

    public static void zoijcleaow(h6.iozdgvuglv iozdgvuglvVar) {
        if (!iozdgvuglvVar.dxjokdxxww()) {
            if (iobyxmoadg(iozdgvuglvVar)) {
                gxszxtbevo(iozdgvuglvVar);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + iozdgvuglvVar + ")");
        }
    }
}
