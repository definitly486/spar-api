package t6;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface agtfadlqog {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final long f109770zoijcleaow = TimeUnit.DAYS.toMillis(999);

    default void btonecajqb(Serializable serializable) {
        jyumaefscl().ppxfxbqfkf(iwizpuwonk(), serializable);
    }

    kc2.lqeggnwhkg iwizpuwonk();

    zdlpuopuiu jyumaefscl();

    default Serializable ppxfxbqfkf() {
        return yggfygwlhe(f109770zoijcleaow);
    }

    default Serializable yggfygwlhe(long j13) {
        return jyumaefscl().iobyxmoadg(iwizpuwonk(), j13);
    }
}
