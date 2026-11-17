package fk;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class weqkydbzbr {
    public static final int iobyxmoadg(dk.gxszxtbevo gxszxtbevoVar, dk.gxszxtbevo[] typeParams) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(typeParams, "typeParams");
        int iHashCode = (gxszxtbevoVar.nufgyqmvbu().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable iterableIobyxmoadg = dk.btonecajqb.iobyxmoadg(gxszxtbevoVar);
        Iterator it = iterableIobyxmoadg.iterator();
        int iHashCode2 = 1;
        int i13 = 1;
        while (true) {
            int iHashCode3 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i14 = i13 * 31;
            String strNufgyqmvbu = ((dk.gxszxtbevo) it.next()).nufgyqmvbu();
            if (strNufgyqmvbu != null) {
                iHashCode3 = strNufgyqmvbu.hashCode();
            }
            i13 = i14 + iHashCode3;
        }
        Iterator it2 = iterableIobyxmoadg.iterator();
        while (it2.hasNext()) {
            int i15 = iHashCode2 * 31;
            dk.agtfadlqog kind = ((dk.gxszxtbevo) it2.next()).getKind();
            iHashCode2 = i15 + (kind != null ? kind.hashCode() : 0);
        }
        return (((iHashCode * 31) + i13) * 31) + iHashCode2;
    }
}
