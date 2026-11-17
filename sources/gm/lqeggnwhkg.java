package gm;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lqeggnwhkg {

    private static final class zoijcleaow implements gxszxtbevo {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final int f37848yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f37849zdlpuopuiu;

        @Override // gm.gxszxtbevo
        public wkgbmnqykc dxjokdxxww(wkgbmnqykc wkgbmnqykcVar) {
            int iOjitshcjhn = wkgbmnqykcVar.ojitshcjhn(gm.iobyxmoadg.f37820hkdspvbjdz);
            int i13 = this.f37849zdlpuopuiu;
            if (i13 < 2 && iOjitshcjhn == this.f37848yggfygwlhe) {
                return wkgbmnqykcVar;
            }
            if ((i13 & 1) == 0) {
                int i14 = iOjitshcjhn - this.f37848yggfygwlhe;
                return wkgbmnqykcVar.wkgbmnqykc(i14 >= 0 ? 7 - i14 : -i14, gm.zoijcleaow.DAYS);
            }
            int i15 = this.f37848yggfygwlhe - iOjitshcjhn;
            return wkgbmnqykcVar.nufgyqmvbu(i15 >= 0 ? 7 - i15 : -i15, gm.zoijcleaow.DAYS);
        }

        private zoijcleaow(int i13, cm.zoijcleaow zoijcleaowVar) {
            fm.ppxfxbqfkf.dxjokdxxww(zoijcleaowVar, "dayOfWeek");
            this.f37849zdlpuopuiu = i13;
            this.f37848yggfygwlhe = zoijcleaowVar.kcexrzcfyt();
        }
    }

    public static gxszxtbevo iobyxmoadg(cm.zoijcleaow zoijcleaowVar) {
        return new zoijcleaow(0, zoijcleaowVar);
    }

    public static gxszxtbevo zoijcleaow(cm.zoijcleaow zoijcleaowVar) {
        return new zoijcleaow(1, zoijcleaowVar);
    }
}
