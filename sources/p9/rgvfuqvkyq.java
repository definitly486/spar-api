package p9;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rgvfuqvkyq {

    public static abstract class iobyxmoadg {
        public abstract rgvfuqvkyq iobyxmoadg();

        public abstract iobyxmoadg ppxfxbqfkf(zoijcleaow zoijcleaowVar);

        public abstract iobyxmoadg zoijcleaow(kcexrzcfyt kcexrzcfytVar);
    }

    public enum zoijcleaow {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final SparseArray f76155iwizpuwonk;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final int f76158zdlpuopuiu;

        static {
            zoijcleaow zoijcleaowVar = NOT_SET;
            zoijcleaow zoijcleaowVar2 = EVENT_OVERRIDE;
            SparseArray sparseArray = new SparseArray();
            f76155iwizpuwonk = sparseArray;
            sparseArray.put(0, zoijcleaowVar);
            sparseArray.put(5, zoijcleaowVar2);
        }

        zoijcleaow(int i13) {
            this.f76158zdlpuopuiu = i13;
        }
    }

    public static iobyxmoadg iobyxmoadg() {
        return new gxszxtbevo.zoijcleaow();
    }

    public abstract zoijcleaow ppxfxbqfkf();

    public abstract kcexrzcfyt zoijcleaow();
}
