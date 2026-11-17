package n4;

import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public abstract class oxmwwwfdhm {
    private static int iobyxmoadg(int i13, yadqdtsiqt yadqdtsiqtVar, int i14) {
        if (i13 == 12) {
            return 240;
        }
        if (i13 == 13) {
            return 120;
        }
        if (i13 == 21 && yadqdtsiqtVar.iobyxmoadg() >= 8 && yadqdtsiqtVar.gxszxtbevo() + 8 <= i14) {
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            int iVdvldrhtss2 = yadqdtsiqtVar.vdvldrhtss();
            if (iVdvldrhtss >= 12 && iVdvldrhtss2 == 1936877170) {
                return yadqdtsiqtVar.ylkuphrtab();
            }
        }
        return -2147483647;
    }

    public static v2.jyumaefscl zoijcleaow(yadqdtsiqt yadqdtsiqtVar, int i13) {
        yadqdtsiqtVar.crxdokpmqz(12);
        while (yadqdtsiqtVar.gxszxtbevo() < i13) {
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            int iVdvldrhtss = yadqdtsiqtVar.vdvldrhtss();
            if (yadqdtsiqtVar.vdvldrhtss() == 1935766900) {
                if (iVdvldrhtss < 16) {
                    return null;
                }
                yadqdtsiqtVar.crxdokpmqz(4);
                int i14 = -1;
                int i15 = 0;
                for (int i16 = 0; i16 < 2; i16++) {
                    int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                    int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                    if (iWwaezpbzkn == 0) {
                        i14 = iWwaezpbzkn2;
                    } else if (iWwaezpbzkn == 1) {
                        i15 = iWwaezpbzkn2;
                    }
                }
                int iIobyxmoadg = iobyxmoadg(i14, yadqdtsiqtVar, i13);
                if (iIobyxmoadg == -2147483647) {
                    return null;
                }
                return new v2.jyumaefscl(new i4.wkgbmnqykc(iIobyxmoadg, i15));
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo + iVdvldrhtss);
        }
        return null;
    }
}
