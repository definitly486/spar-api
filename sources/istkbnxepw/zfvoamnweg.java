package istkbnxepw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zfvoamnweg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f49448iobyxmoadg = new ArrayList();

    private List ppxfxbqfkf(int i13) {
        ArrayList arrayList = new ArrayList();
        zoijcleaow(arrayList, i13, new int[i13], 0);
        return arrayList;
    }

    private static void zoijcleaow(List list, int i13, int[] iArr, int i14) {
        if (i14 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = 0;
            while (true) {
                if (i16 >= i14) {
                    iArr[i14] = i15;
                    zoijcleaow(list, i13, iArr, i14 + 1);
                    break;
                } else if (i15 == iArr[i16]) {
                    break;
                } else {
                    i16++;
                }
            }
        }
    }

    public boolean iobyxmoadg(oipsdeybqn oipsdeybqnVar) {
        return this.f49448iobyxmoadg.add(oipsdeybqnVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    public List wkgbmnqykc(List list) {
        int i13;
        boolean zLqeggnwhkg;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f49448iobyxmoadg.size()) {
            return null;
        }
        List listPpxfxbqfkf = ppxfxbqfkf(this.f49448iobyxmoadg.size());
        oipsdeybqn[] oipsdeybqnVarArr = new oipsdeybqn[list.size()];
        Iterator it = listPpxfxbqfkf.iterator();
        do {
            i13 = 0;
            if (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                zLqeggnwhkg = true;
                while (i13 < this.f49448iobyxmoadg.size()) {
                    if (iArr[i13] < list.size()) {
                        zLqeggnwhkg &= ((oipsdeybqn) this.f49448iobyxmoadg.get(i13)).lqeggnwhkg((oipsdeybqn) list.get(iArr[i13]));
                        if (!zLqeggnwhkg) {
                            break;
                        }
                        oipsdeybqnVarArr[iArr[i13]] = (oipsdeybqn) this.f49448iobyxmoadg.get(i13);
                    }
                    i13++;
                }
            }
            if (i13 != 0) {
                return Arrays.asList(oipsdeybqnVarArr);
            }
            return null;
        } while (!zLqeggnwhkg);
        i13 = 1;
        if (i13 != 0) {
            return Arrays.asList(oipsdeybqnVarArr);
        }
        return null;
    }
}
