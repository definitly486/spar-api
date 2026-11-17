package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int[] f117224iobyxmoadg = new int[0];

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final float[] f117226zoijcleaow = new float[0];

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final iwizpuwonk f117225ppxfxbqfkf = new iwizpuwonk(new int[2], new float[2], new float[][]{new float[2], new float[2]});

    public static final class iobyxmoadg implements yggfygwlhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hcddaimhww[] f117227iobyxmoadg;

        iobyxmoadg(kcexrzcfyt kcexrzcfytVar, float f13, float f14) {
            int iZoijcleaow = kcexrzcfytVar.zoijcleaow();
            hcddaimhww[] hcddaimhwwVarArr = new hcddaimhww[iZoijcleaow];
            for (int i13 = 0; i13 < iZoijcleaow; i13++) {
                hcddaimhwwVarArr[i13] = new hcddaimhww(f13, f14, kcexrzcfytVar.iobyxmoadg(i13));
            }
            this.f117227iobyxmoadg = hcddaimhwwVarArr;
        }

        @Override // vipkmwdibw.yggfygwlhe
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public hcddaimhww get(int i13) {
            return this.f117227iobyxmoadg[i13];
        }
    }

    public static final class zoijcleaow implements yggfygwlhe {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final hcddaimhww f117228iobyxmoadg;

        zoijcleaow(float f13, float f14) {
            this.f117228iobyxmoadg = new hcddaimhww(f13, f14, 0.0f, 4, null);
        }

        @Override // vipkmwdibw.yggfygwlhe
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public hcddaimhww get(int i13) {
            return this.f117228iobyxmoadg;
        }
    }

    public static final long eablkybsjg(t tVar, long j13) {
        long jEablkybsjg = j13 - ((long) tVar.eablkybsjg());
        long jWkgbmnqykc = tVar.wkgbmnqykc();
        if (jEablkybsjg < 0) {
            jEablkybsjg = 0;
        }
        return jEablkybsjg > jWkgbmnqykc ? jWkgbmnqykc : jEablkybsjg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yggfygwlhe gxszxtbevo(kcexrzcfyt kcexrzcfytVar, float f13, float f14) {
        return kcexrzcfytVar != null ? new iobyxmoadg(kcexrzcfytVar, f13, f14) : new zoijcleaow(f13, f14);
    }

    public static final kcexrzcfyt lqeggnwhkg(q qVar, long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        return qVar.lqeggnwhkg(j13 * 1000000, kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3);
    }
}
