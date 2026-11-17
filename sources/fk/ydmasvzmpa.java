package fk;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ydmasvzmpa {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final dk.gxszxtbevo[] f34252iobyxmoadg = new dk.gxszxtbevo[0];

    public static final Void eablkybsjg(ah.wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        throw new SerializationException(ppxfxbqfkf(wkgbmnqykcVar));
    }

    public static final Set iobyxmoadg(dk.gxszxtbevo gxszxtbevoVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        if (gxszxtbevoVar instanceof wflxmlrfwp) {
            return ((wflxmlrfwp) gxszxtbevoVar).iobyxmoadg();
        }
        HashSet hashSet = new HashSet(gxszxtbevoVar.wkgbmnqykc());
        int iWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
        for (int i13 = 0; i13 < iWkgbmnqykc; i13++) {
            hashSet.add(gxszxtbevoVar.eablkybsjg(i13));
        }
        return hashSet;
    }

    public static final String ppxfxbqfkf(ah.wkgbmnqykc wkgbmnqykcVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        String strJyumaefscl = wkgbmnqykcVar.jyumaefscl();
        if (strJyumaefscl == null) {
            strJyumaefscl = "<local class name not available>";
        }
        return wkgbmnqykc(strJyumaefscl);
    }

    public static final String wkgbmnqykc(String className) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final dk.gxszxtbevo[] zoijcleaow(List list) {
        dk.gxszxtbevo[] gxszxtbevoVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (gxszxtbevoVarArr = (dk.gxszxtbevo[]) list.toArray(new dk.gxszxtbevo[0])) == null) ? f34252iobyxmoadg : gxszxtbevoVarArr;
    }
}
