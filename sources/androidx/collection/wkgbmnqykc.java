package androidx.collection;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class wkgbmnqykc {
    public static final void iobyxmoadg(zoijcleaow zoijcleaowVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        zoijcleaowVar.btonecajqb(new int[i13]);
        zoijcleaowVar.dxjokdxxww(new Object[i13]);
    }

    public static final int ppxfxbqfkf(zoijcleaow zoijcleaowVar, Object obj, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        int iEablkybsjg = zoijcleaowVar.eablkybsjg();
        if (iEablkybsjg == 0) {
            return -1;
        }
        int iZoijcleaow = zoijcleaow(zoijcleaowVar, i13);
        if (iZoijcleaow < 0 || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zoijcleaowVar.zoijcleaow()[iZoijcleaow])) {
            return iZoijcleaow;
        }
        int i14 = iZoijcleaow + 1;
        while (i14 < iEablkybsjg && zoijcleaowVar.ppxfxbqfkf()[i14] == i13) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zoijcleaowVar.zoijcleaow()[i14])) {
                return i14;
            }
            i14++;
        }
        for (int i15 = iZoijcleaow - 1; i15 >= 0 && zoijcleaowVar.ppxfxbqfkf()[i15] == i13; i15--) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, zoijcleaowVar.zoijcleaow()[i15])) {
                return i15;
            }
        }
        return ~i14;
    }

    public static final int wkgbmnqykc(zoijcleaow zoijcleaowVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        return ppxfxbqfkf(zoijcleaowVar, null, 0);
    }

    public static final int zoijcleaow(zoijcleaow zoijcleaowVar, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(zoijcleaowVar, "<this>");
        try {
            return jlmebxxoox.iobyxmoadg.iobyxmoadg(zoijcleaowVar.ppxfxbqfkf(), zoijcleaowVar.eablkybsjg(), i13);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
