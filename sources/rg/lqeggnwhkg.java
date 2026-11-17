package rg;

import java.io.File;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
abstract class lqeggnwhkg {
    private static final int iobyxmoadg(String str) {
        int iYfnezrywwk;
        char c13 = File.separatorChar;
        int iYfnezrywwk2 = kcexrzcfyt.yfnezrywwk(str, c13, 0, false, 4, null);
        if (iYfnezrywwk2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c13 || (iYfnezrywwk = kcexrzcfyt.yfnezrywwk(str, c13, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iYfnezrywwk3 = kcexrzcfyt.yfnezrywwk(str, c13, iYfnezrywwk + 1, false, 4, null);
            return iYfnezrywwk3 >= 0 ? iYfnezrywwk3 + 1 : str.length();
        }
        if (iYfnezrywwk2 > 0 && str.charAt(iYfnezrywwk2 - 1) == ':') {
            return iYfnezrywwk2 + 1;
        }
        if (iYfnezrywwk2 == -1 && kcexrzcfyt.jhduphickx(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean zoijcleaow(File file) {
        zdlpuopuiu.btonecajqb(file, "<this>");
        String path = file.getPath();
        zdlpuopuiu.dxjokdxxww(path, "getPath(...)");
        return iobyxmoadg(path) > 0;
    }
}
