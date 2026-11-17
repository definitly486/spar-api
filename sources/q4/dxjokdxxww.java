package q4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dxjokdxxww {
    private static int iobyxmoadg(gtknphoqwx gtknphoqwxVar, long j13) {
        if (j13 == -9223372036854775807L) {
            return 0;
        }
        int iIobyxmoadg = gtknphoqwxVar.iobyxmoadg(j13);
        if (iIobyxmoadg == -1) {
            iIobyxmoadg = gtknphoqwxVar.wkgbmnqykc();
        }
        return (iIobyxmoadg <= 0 || gtknphoqwxVar.ppxfxbqfkf(iIobyxmoadg + (-1)) != j13) ? iIobyxmoadg : iIobyxmoadg - 1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    public static void ppxfxbqfkf(gtknphoqwx gtknphoqwxVar, oxmwwwfdhm.zoijcleaow zoijcleaowVar, y2.wflxmlrfwp wflxmlrfwpVar) {
        boolean z13;
        int iIobyxmoadg = iobyxmoadg(gtknphoqwxVar, zoijcleaowVar.f77833iobyxmoadg);
        if (zoijcleaowVar.f77833iobyxmoadg == -9223372036854775807L || iIobyxmoadg >= gtknphoqwxVar.wkgbmnqykc()) {
            z13 = false;
        } else {
            List listZoijcleaow = gtknphoqwxVar.zoijcleaow(zoijcleaowVar.f77833iobyxmoadg);
            long jPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf(iIobyxmoadg);
            if (listZoijcleaow.isEmpty()) {
                z13 = false;
            } else {
                long j13 = zoijcleaowVar.f77833iobyxmoadg;
                if (j13 < jPpxfxbqfkf) {
                    wflxmlrfwpVar.accept(new eablkybsjg(listZoijcleaow, j13, jPpxfxbqfkf - j13));
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
        }
        for (int i13 = iIobyxmoadg; i13 < gtknphoqwxVar.wkgbmnqykc(); i13++) {
            zoijcleaow(gtknphoqwxVar, i13, wflxmlrfwpVar);
        }
        if (zoijcleaowVar.f77834zoijcleaow) {
            if (z13) {
                iIobyxmoadg--;
            }
            for (int i14 = 0; i14 < iIobyxmoadg; i14++) {
                zoijcleaow(gtknphoqwxVar, i14, wflxmlrfwpVar);
            }
            if (z13) {
                wflxmlrfwpVar.accept(new eablkybsjg(gtknphoqwxVar.zoijcleaow(zoijcleaowVar.f77833iobyxmoadg), gtknphoqwxVar.ppxfxbqfkf(iIobyxmoadg), zoijcleaowVar.f77833iobyxmoadg - gtknphoqwxVar.ppxfxbqfkf(iIobyxmoadg)));
            }
        }
    }

    private static void zoijcleaow(gtknphoqwx gtknphoqwxVar, int i13, y2.wflxmlrfwp wflxmlrfwpVar) {
        long jPpxfxbqfkf = gtknphoqwxVar.ppxfxbqfkf(i13);
        List listZoijcleaow = gtknphoqwxVar.zoijcleaow(jPpxfxbqfkf);
        if (listZoijcleaow.isEmpty()) {
            return;
        }
        if (i13 == gtknphoqwxVar.wkgbmnqykc() - 1) {
            throw new IllegalStateException();
        }
        long jPpxfxbqfkf2 = gtknphoqwxVar.ppxfxbqfkf(i13 + 1) - gtknphoqwxVar.ppxfxbqfkf(i13);
        if (jPpxfxbqfkf2 > 0) {
            wflxmlrfwpVar.accept(new eablkybsjg(listZoijcleaow, jPpxfxbqfkf, jPpxfxbqfkf2));
        }
    }
}
