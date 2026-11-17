package t3;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {
    public static void iobyxmoadg(long j13, y2.yadqdtsiqt yadqdtsiqtVar, dsvhmnatus[] dsvhmnatusVarArr) {
        while (true) {
            if (yadqdtsiqtVar.iobyxmoadg() <= 1) {
                return;
            }
            int iPpxfxbqfkf = ppxfxbqfkf(yadqdtsiqtVar);
            int iPpxfxbqfkf2 = ppxfxbqfkf(yadqdtsiqtVar);
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo() + iPpxfxbqfkf2;
            if (iPpxfxbqfkf2 == -1 || iPpxfxbqfkf2 > yadqdtsiqtVar.iobyxmoadg()) {
                y2.kcexrzcfyt.nufgyqmvbu("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iGxszxtbevo = yadqdtsiqtVar.lqeggnwhkg();
            } else if (iPpxfxbqfkf == 4 && iPpxfxbqfkf2 >= 8) {
                int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
                int iVdvldrhtss = iWypolnanlu == 49 ? yadqdtsiqtVar.vdvldrhtss() : 0;
                int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                if (iWypolnanlu == 47) {
                    yadqdtsiqtVar.crxdokpmqz(1);
                }
                boolean z13 = iWwaezpbzkn == 181 && (iWypolnanlu == 49 || iWypolnanlu == 47) && iWwaezpbzkn2 == 3;
                if (iWypolnanlu == 49) {
                    z13 &= iVdvldrhtss == 1195456820;
                }
                if (z13) {
                    zoijcleaow(j13, yadqdtsiqtVar, dsvhmnatusVarArr);
                }
            }
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        }
    }

    private static int ppxfxbqfkf(y2.yadqdtsiqt yadqdtsiqtVar) {
        int i13 = 0;
        while (yadqdtsiqtVar.iobyxmoadg() != 0) {
            int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            i13 += iWwaezpbzkn;
            if (iWwaezpbzkn != 255) {
                return i13;
            }
        }
        return -1;
    }

    public static void zoijcleaow(long j13, y2.yadqdtsiqt yadqdtsiqtVar, dsvhmnatus[] dsvhmnatusVarArr) {
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        if ((iWwaezpbzkn & 64) != 0) {
            yadqdtsiqtVar.crxdokpmqz(1);
            int i13 = (iWwaezpbzkn & 31) * 3;
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            for (dsvhmnatus dsvhmnatusVar : dsvhmnatusVarArr) {
                yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
                dsvhmnatusVar.lqeggnwhkg(yadqdtsiqtVar, i13);
                y2.iobyxmoadg.lqeggnwhkg(j13 != -9223372036854775807L);
                dsvhmnatusVar.zoijcleaow(j13, 1, i13, 0, null);
            }
        }
    }
}
