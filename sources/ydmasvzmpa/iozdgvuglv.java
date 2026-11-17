package ydmasvzmpa;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class iozdgvuglv {
    public static final int iobyxmoadg(yadqdtsiqt yadqdtsiqtVar) {
        boolean z13 = yadqdtsiqtVar.getOrientation() == jztzpxfvev.jlmebxxoox.Vertical;
        List listNufgyqmvbu = yadqdtsiqtVar.nufgyqmvbu();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < listNufgyqmvbu.size()) {
            int iZoijcleaow = zoijcleaow(z13, yadqdtsiqtVar, i13);
            if (iZoijcleaow == -1) {
                i13++;
            } else {
                int iMax = 0;
                while (i13 < listNufgyqmvbu.size() && zoijcleaow(z13, yadqdtsiqtVar, i13) == iZoijcleaow) {
                    iMax = Math.max(iMax, (int) (z13 ? ((rgvfuqvkyq) listNufgyqmvbu.get(i13)).iobyxmoadg() & 4294967295L : ((rgvfuqvkyq) listNufgyqmvbu.get(i13)).iobyxmoadg() >> 32));
                    i13++;
                }
                i14 += iMax;
                i15++;
            }
        }
        return (i14 / i15) + yadqdtsiqtVar.lqeggnwhkg();
    }

    private static final int zoijcleaow(boolean z13, yadqdtsiqt yadqdtsiqtVar, int i13) {
        return z13 ? ((rgvfuqvkyq) yadqdtsiqtVar.nufgyqmvbu().get(i13)).lqeggnwhkg() : ((rgvfuqvkyq) yadqdtsiqtVar.nufgyqmvbu().get(i13)).dxjokdxxww();
    }
}
