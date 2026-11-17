package bz;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class roivzttewh extends metgxyhuhe {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final t6.zdlpuopuiu f17618eablkybsjg;

    roivzttewh(t6.zdlpuopuiu zdlpuopuiuVar) {
        super(kc2.lqeggnwhkg.OSFontsNumber);
        this.f17618eablkybsjg = zdlpuopuiuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: cdpycssgdh, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        File[] fileArrListFiles = new File(t6.iwizpuwonk.iobyxmoadg(new byte[]{108, 52, -8, -128, 111, -18, 100, 29, -19, -84, -71, -18, 55, 65, 35, -126})).listFiles();
        if (fileArrListFiles == null) {
            return String.valueOf(0);
        }
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (File file : fileArrListFiles) {
            arrayList.add(String.valueOf(file).replace(t6.iwizpuwonk.iobyxmoadg(new byte[]{44, 21, 2, -93, 70, -21, 13, 67, 12, 6, 95, -89, 33, 23, 35, 12}), t6.iwizpuwonk.iobyxmoadg(new byte[]{57, 113, -35, -27, -115, -45, -57, -75, -111, 90, -74, 36, -56, 66, 57, -73})));
            i13++;
            t6.iwizpuwonk.iobyxmoadg(new byte[]{91, -119, -16, -117, -91, -64, 2, 25, 94, -21, -40, -106, -36, 105, -23, -34});
        }
        this.f17618eablkybsjg.ppxfxbqfkf(kc2.lqeggnwhkg.OSFontsHash, Integer.valueOf(arrayList.hashCode()));
        return String.valueOf(i13);
    }
}
