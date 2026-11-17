package a1;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    HashMap f268iobyxmoadg = new HashMap();

    public float iobyxmoadg(Object obj, String str, int i13) {
        HashMap map;
        float[] fArr;
        if (this.f268iobyxmoadg.containsKey(obj) && (map = (HashMap) this.f268iobyxmoadg.get(obj)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > i13) {
            return fArr[i13];
        }
        return Float.NaN;
    }

    public void zoijcleaow(Object obj, String str, int i13, float f13) {
        if (!this.f268iobyxmoadg.containsKey(obj)) {
            HashMap map = new HashMap();
            float[] fArr = new float[i13 + 1];
            fArr[i13] = f13;
            map.put(str, fArr);
            this.f268iobyxmoadg.put(obj, map);
            return;
        }
        HashMap map2 = (HashMap) this.f268iobyxmoadg.get(obj);
        if (map2 == null) {
            map2 = new HashMap();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i13 + 1];
            fArr2[i13] = f13;
            map2.put(str, fArr2);
            this.f268iobyxmoadg.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = (float[]) map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i13) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i13 + 1);
        }
        fArrCopyOf[i13] = f13;
        map2.put(str, fArrCopyOf);
    }
}
