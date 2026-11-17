package jpowsppfya;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class stevsuqkhv {
    public static String iobyxmoadg(int i13) {
        ArrayList arrayList = new ArrayList();
        if ((i13 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i13 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i13 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return String.join("|", arrayList);
    }

    public static boolean zoijcleaow(int i13, int i14) {
        return (i13 & i14) == i14;
    }
}
