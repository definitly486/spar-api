package fk;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sflfametgt {
    public static final void iobyxmoadg(int[] seenArray, int[] goldenMaskArray, dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(seenArray, "seenArray");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(goldenMaskArray, "goldenMaskArray");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = goldenMaskArray[i13] & (~seenArray[i13]);
            if (i14 != 0) {
                for (int i15 = 0; i15 < 32; i15++) {
                    if ((i14 & 1) != 0) {
                        arrayList.add(descriptor.eablkybsjg((i13 * 32) + i15));
                    }
                    i14 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, descriptor.nufgyqmvbu());
    }

    public static final void zoijcleaow(int i13, int i14, dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i15 = (~i13) & i14;
        for (int i16 = 0; i16 < 32; i16++) {
            if ((i15 & 1) != 0) {
                arrayList.add(descriptor.eablkybsjg(i16));
            }
            i15 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.nufgyqmvbu());
    }
}
