package lb2;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import zg.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {
    public static final ComponentName iobyxmoadg(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        return zoijcleaow(list, "ru.vk.store", "ru.vk.store.qa");
    }

    public static final ComponentName zoijcleaow(List list, String releasePackage, String debugPackage) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        zdlpuopuiu.btonecajqb(releasePackage, "releasePackage");
        zdlpuopuiu.btonecajqb(debugPackage, "debugPackage");
        LinkedHashMap linkedHashMap = new LinkedHashMap(gtknphoqwx.gxszxtbevo(tzroggbefp.eablkybsjg(jyumaefscl.cqumvgiudr(list, 10)), 16));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            vdvldrhtss vdvldrhtssVarIobyxmoadg = cqumvgiudr.iobyxmoadg(resolveInfo.serviceInfo.packageName, resolveInfo);
            linkedHashMap.put(vdvldrhtssVarIobyxmoadg.lqeggnwhkg(), vdvldrhtssVarIobyxmoadg.nufgyqmvbu());
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) linkedHashMap.get(debugPackage);
        if (resolveInfo2 == null) {
            resolveInfo2 = (ResolveInfo) linkedHashMap.get(releasePackage);
        }
        if (resolveInfo2 == null) {
            return null;
        }
        ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }
}
