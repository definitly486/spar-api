package d31;

import hg.jyumaefscl;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(tg.iobyxmoadg iobyxmoadgVar, draadjrbmk draadjrbmkVar, Map map) {
        zdlpuopuiu.lqeggnwhkg(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            iobyxmoadgVar.invoke();
        } else if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(jyumaefscl.m(linkedHashMap.keySet()));
        }
    }

    public static final void zoijcleaow(eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar, String screenTag, final tg.iobyxmoadg onPermissionSuccess, final draadjrbmk draadjrbmkVar, String[] permissionsArray) {
        zdlpuopuiu.btonecajqb(ppxfxbqfkfVar, "<this>");
        zdlpuopuiu.btonecajqb(screenTag, "screenTag");
        zdlpuopuiu.btonecajqb(onPermissionSuccess, "onPermissionSuccess");
        zdlpuopuiu.btonecajqb(permissionsArray, "permissionsArray");
        ppxfxbqfkfVar.btonecajqb("PermissionsLauncher_" + screenTag, new gxszxtbevo.gxszxtbevo(), new eablkybsjg.iobyxmoadg() { // from class: d31.iobyxmoadg
            @Override // eablkybsjg.iobyxmoadg
            public final void iobyxmoadg(Object obj) {
                zoijcleaow.ppxfxbqfkf(onPermissionSuccess, draadjrbmkVar, (Map) obj);
            }
        }).iobyxmoadg(permissionsArray);
    }
}
