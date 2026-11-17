package ixidwrxhsl;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class cqumvgiudr {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] btonecajqb(Object[] objArr, int i13, int i14, zdlpuopuiu zdlpuopuiuVar) {
        Object[] objArr2 = new Object[objArr.length - 1];
        hg.agtfadlqog.kcexrzcfyt(objArr, objArr2, 0, 0, i13, 6, null);
        hg.agtfadlqog.agtfadlqog(objArr, objArr2, i13, i13 + 2, i14);
        objArr2[i14 - 2] = zdlpuopuiuVar;
        hg.agtfadlqog.agtfadlqog(objArr, objArr2, i14 - 1, i14, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] dxjokdxxww(Object[] objArr, int i13) {
        Object[] objArr2 = new Object[objArr.length - 1];
        hg.agtfadlqog.kcexrzcfyt(objArr, objArr2, 0, 0, i13, 6, null);
        hg.agtfadlqog.agtfadlqog(objArr, objArr2, i13, i13 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] gtknphoqwx(Object[] objArr, int i13, int i14, Object obj, Object obj2) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
        hg.agtfadlqog.agtfadlqog(objArrCopyOf, objArrCopyOf, i13 + 2, i13 + 1, objArr.length);
        hg.agtfadlqog.agtfadlqog(objArrCopyOf, objArrCopyOf, i14 + 2, i14, i13);
        objArrCopyOf[i14] = obj;
        objArrCopyOf[i14 + 1] = obj2;
        return objArrCopyOf;
    }

    public static final int gxszxtbevo(int i13, int i14) {
        return (i13 >> i14) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] lqeggnwhkg(Object[] objArr, int i13, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        hg.agtfadlqog.kcexrzcfyt(objArr, objArr2, 0, 0, i13, 6, null);
        hg.agtfadlqog.agtfadlqog(objArr, objArr2, i13 + 2, i13, objArr.length);
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object[] nufgyqmvbu(Object[] objArr, int i13) {
        Object[] objArr2 = new Object[objArr.length - 2];
        hg.agtfadlqog.kcexrzcfyt(objArr, objArr2, 0, 0, i13, 6, null);
        hg.agtfadlqog.agtfadlqog(objArr, objArr2, i13, i13 + 2, objArr.length);
        return objArr2;
    }
}
