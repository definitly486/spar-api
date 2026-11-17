package androidx.collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class metgxyhuhe {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Object f4346iobyxmoadg = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void eablkybsjg(xrmfcynszj xrmfcynszjVar) {
        int i13 = xrmfcynszjVar.f4403iwizpuwonk;
        int[] iArr = xrmfcynszjVar.f4405yggfygwlhe;
        Object[] objArr = xrmfcynszjVar.f4404jyumaefscl;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[i15];
            if (obj != f4346iobyxmoadg) {
                if (i15 != i14) {
                    iArr[i14] = iArr[i15];
                    objArr[i14] = obj;
                    objArr[i15] = null;
                }
                i14++;
            }
        }
        xrmfcynszjVar.f4406zdlpuopuiu = false;
        xrmfcynszjVar.f4403iwizpuwonk = i14;
    }

    public static final Object ppxfxbqfkf(xrmfcynszj xrmfcynszjVar, int i13) {
        Object obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(xrmfcynszjVar, "<this>");
        int iIobyxmoadg = jlmebxxoox.iobyxmoadg.iobyxmoadg(xrmfcynszjVar.f4405yggfygwlhe, xrmfcynszjVar.f4403iwizpuwonk, i13);
        if (iIobyxmoadg < 0 || (obj = xrmfcynszjVar.f4404jyumaefscl[iIobyxmoadg]) == f4346iobyxmoadg) {
            return null;
        }
        return obj;
    }

    public static final Object wkgbmnqykc(xrmfcynszj xrmfcynszjVar, int i13, Object obj) {
        Object obj2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(xrmfcynszjVar, "<this>");
        int iIobyxmoadg = jlmebxxoox.iobyxmoadg.iobyxmoadg(xrmfcynszjVar.f4405yggfygwlhe, xrmfcynszjVar.f4403iwizpuwonk, i13);
        return (iIobyxmoadg < 0 || (obj2 = xrmfcynszjVar.f4404jyumaefscl[iIobyxmoadg]) == f4346iobyxmoadg) ? obj : obj2;
    }
}
