package x9;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gxszxtbevo {

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private aa.iobyxmoadg f121762iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private Map f121763zoijcleaow = new HashMap();

        public iobyxmoadg iobyxmoadg(o9.gxszxtbevo gxszxtbevoVar, zoijcleaow zoijcleaowVar) {
            this.f121763zoijcleaow.put(gxszxtbevoVar, zoijcleaowVar);
            return this;
        }

        public iobyxmoadg ppxfxbqfkf(aa.iobyxmoadg iobyxmoadgVar) {
            this.f121762iobyxmoadg = iobyxmoadgVar;
            return this;
        }

        public gxszxtbevo zoijcleaow() {
            if (this.f121762iobyxmoadg == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f121763zoijcleaow.keySet().size() < o9.gxszxtbevo.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f121763zoijcleaow;
            this.f121763zoijcleaow = new HashMap();
            return gxszxtbevo.wkgbmnqykc(this.f121762iobyxmoadg, map);
        }
    }

    public enum ppxfxbqfkf {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static abstract class zoijcleaow {

        public static abstract class iobyxmoadg {
            public abstract zoijcleaow iobyxmoadg();

            public abstract iobyxmoadg ppxfxbqfkf(Set set);

            public abstract iobyxmoadg wkgbmnqykc(long j13);

            public abstract iobyxmoadg zoijcleaow(long j13);
        }

        public static iobyxmoadg iobyxmoadg() {
            return new x9.ppxfxbqfkf.zoijcleaow().ppxfxbqfkf(Collections.emptySet());
        }

        abstract Set ppxfxbqfkf();

        abstract long wkgbmnqykc();

        abstract long zoijcleaow();
    }

    private void btonecajqb(JobInfo.Builder builder, Set set) {
        if (set.contains(ppxfxbqfkf.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(ppxfxbqfkf.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(ppxfxbqfkf.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    private static Set dxjokdxxww(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public static gxszxtbevo gxszxtbevo(aa.iobyxmoadg iobyxmoadgVar) {
        return zoijcleaow().iobyxmoadg(o9.gxszxtbevo.DEFAULT, zoijcleaow.iobyxmoadg().zoijcleaow(30000L).wkgbmnqykc(86400000L).iobyxmoadg()).iobyxmoadg(o9.gxszxtbevo.HIGHEST, zoijcleaow.iobyxmoadg().zoijcleaow(1000L).wkgbmnqykc(86400000L).iobyxmoadg()).iobyxmoadg(o9.gxszxtbevo.VERY_LOW, zoijcleaow.iobyxmoadg().zoijcleaow(86400000L).wkgbmnqykc(86400000L).ppxfxbqfkf(dxjokdxxww(ppxfxbqfkf.DEVICE_IDLE)).iobyxmoadg()).ppxfxbqfkf(iobyxmoadgVar).zoijcleaow();
    }

    private long iobyxmoadg(int i13, long j13) {
        int i14 = i13 - 1;
        return (long) (Math.pow(3.0d, i14) * j13 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j13 > 1 ? j13 : 2L) * ((long) i14))));
    }

    static gxszxtbevo wkgbmnqykc(aa.iobyxmoadg iobyxmoadgVar, Map map) {
        return new x9.zoijcleaow(iobyxmoadgVar, map);
    }

    public static iobyxmoadg zoijcleaow() {
        return new iobyxmoadg();
    }

    abstract aa.iobyxmoadg eablkybsjg();

    public long lqeggnwhkg(o9.gxszxtbevo gxszxtbevoVar, long j13, int i13) {
        long jWflxmlrfwp = j13 - eablkybsjg().wflxmlrfwp();
        zoijcleaow zoijcleaowVar = (zoijcleaow) nufgyqmvbu().get(gxszxtbevoVar);
        return Math.min(Math.max(iobyxmoadg(i13, zoijcleaowVar.zoijcleaow()), jWflxmlrfwp), zoijcleaowVar.wkgbmnqykc());
    }

    abstract Map nufgyqmvbu();

    public JobInfo.Builder ppxfxbqfkf(JobInfo.Builder builder, o9.gxszxtbevo gxszxtbevoVar, long j13, int i13) {
        builder.setMinimumLatency(lqeggnwhkg(gxszxtbevoVar, j13, i13));
        btonecajqb(builder, ((zoijcleaow) nufgyqmvbu().get(gxszxtbevoVar)).ppxfxbqfkf());
        return builder;
    }
}
