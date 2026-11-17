package czzsidtyhn;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vipkmwdibw {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final vipkmwdibw f26488iobyxmoadg = new vipkmwdibw();

    private vipkmwdibw() {
    }

    public final int eablkybsjg(List list, int i13, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i15 = 0;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) list.get(i16);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar));
            int iYggfygwlhe = draadjrbmkVar.yggfygwlhe(i13);
            if (fEablkybsjg == 0.0f) {
                i15 += iYggfygwlhe;
            } else if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
                iMax = Math.max(iMax, Math.round(iYggfygwlhe / fEablkybsjg));
            }
        }
        return Math.round(iMax * f13) + i15 + ((list.size() - 1) * i14);
    }

    public final int gxszxtbevo(List list, int i13, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i14, i13);
        int size = list.size();
        int iMax = 0;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) list.get(i15);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar));
            if (fEablkybsjg == 0.0f) {
                int iMin2 = Math.min(draadjrbmkVar.yggfygwlhe(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, draadjrbmkVar.ydmasvzmpa(iMin2));
            } else if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
            }
        }
        int iRound = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - iMin, 0) / f13);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            x.draadjrbmk draadjrbmkVar2 = (x.draadjrbmk) list.get(i16);
            float fEablkybsjg2 = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar2));
            if (fEablkybsjg2 > 0.0f) {
                iMax = Math.max(iMax, draadjrbmkVar2.ydmasvzmpa(iRound != Integer.MAX_VALUE ? Math.round(iRound * fEablkybsjg2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int iobyxmoadg(List list, int i13, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i14, i13);
        int size = list.size();
        int iMax = 0;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) list.get(i15);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar));
            if (fEablkybsjg == 0.0f) {
                int iMin2 = Math.min(draadjrbmkVar.ydmasvzmpa(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, draadjrbmkVar.yggfygwlhe(iMin2));
            } else if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
            }
        }
        int iRound = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - iMin, 0) / f13);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            x.draadjrbmk draadjrbmkVar2 = (x.draadjrbmk) list.get(i16);
            float fEablkybsjg2 = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar2));
            if (fEablkybsjg2 > 0.0f) {
                iMax = Math.max(iMax, draadjrbmkVar2.yggfygwlhe(iRound != Integer.MAX_VALUE ? Math.round(iRound * fEablkybsjg2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int lqeggnwhkg(List list, int i13, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i15 = 0;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) list.get(i16);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar));
            int iWypolnanlu = draadjrbmkVar.wypolnanlu(i13);
            if (fEablkybsjg == 0.0f) {
                i15 += iWypolnanlu;
            } else if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
                iMax = Math.max(iMax, Math.round(iWypolnanlu / fEablkybsjg));
            }
        }
        return Math.round(iMax * f13) + i15 + ((list.size() - 1) * i14);
    }

    public final int nufgyqmvbu(List list, int i13, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i14, i13);
        int size = list.size();
        int iMax = 0;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) list.get(i15);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar));
            if (fEablkybsjg == 0.0f) {
                int iMin2 = Math.min(draadjrbmkVar.yggfygwlhe(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, draadjrbmkVar.czzsidtyhn(iMin2));
            } else if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
            }
        }
        int iRound = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - iMin, 0) / f13);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            x.draadjrbmk draadjrbmkVar2 = (x.draadjrbmk) list.get(i16);
            float fEablkybsjg2 = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar2));
            if (fEablkybsjg2 > 0.0f) {
                iMax = Math.max(iMax, draadjrbmkVar2.czzsidtyhn(iRound != Integer.MAX_VALUE ? Math.round(iRound * fEablkybsjg2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int ppxfxbqfkf(List list, int i13, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * i14, i13);
        int size = list.size();
        int iMax = 0;
        float f13 = 0.0f;
        for (int i15 = 0; i15 < size; i15++) {
            x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) list.get(i15);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar));
            if (fEablkybsjg == 0.0f) {
                int iMin2 = Math.min(draadjrbmkVar.ydmasvzmpa(Integer.MAX_VALUE), i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i13 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, draadjrbmkVar.wypolnanlu(iMin2));
            } else if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
            }
        }
        int iRound = f13 == 0.0f ? 0 : i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i13 - iMin, 0) / f13);
        int size2 = list.size();
        for (int i16 = 0; i16 < size2; i16++) {
            x.draadjrbmk draadjrbmkVar2 = (x.draadjrbmk) list.get(i16);
            float fEablkybsjg2 = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar2));
            if (fEablkybsjg2 > 0.0f) {
                iMax = Math.max(iMax, draadjrbmkVar2.wypolnanlu(iRound != Integer.MAX_VALUE ? Math.round(iRound * fEablkybsjg2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int wkgbmnqykc(List list, int i13, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i15 = 0;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) list.get(i16);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar));
            int iCzzsidtyhn = draadjrbmkVar.czzsidtyhn(i13);
            if (fEablkybsjg == 0.0f) {
                i15 += iCzzsidtyhn;
            } else if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
                iMax = Math.max(iMax, Math.round(iCzzsidtyhn / fEablkybsjg));
            }
        }
        return Math.round(iMax * f13) + i15 + ((list.size() - 1) * i14);
    }

    public final int zoijcleaow(List list, int i13, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i15 = 0;
        float f13 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            x.draadjrbmk draadjrbmkVar = (x.draadjrbmk) list.get(i16);
            float fEablkybsjg = bfopjjpdmp.eablkybsjg(bfopjjpdmp.wkgbmnqykc(draadjrbmkVar));
            int iYdmasvzmpa = draadjrbmkVar.ydmasvzmpa(i13);
            if (fEablkybsjg == 0.0f) {
                i15 += iYdmasvzmpa;
            } else if (fEablkybsjg > 0.0f) {
                f13 += fEablkybsjg;
                iMax = Math.max(iMax, Math.round(iYdmasvzmpa / fEablkybsjg));
            }
        }
        return Math.round(iMax * f13) + i15 + ((list.size() - 1) * i14);
    }
}
