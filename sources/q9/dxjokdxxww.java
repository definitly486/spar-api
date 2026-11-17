package q9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    public static abstract class iobyxmoadg {
        public abstract iobyxmoadg agtfadlqog(String str);

        public abstract iobyxmoadg btonecajqb(byte[] bArr);

        public abstract iobyxmoadg draadjrbmk(Integer num);

        public abstract iobyxmoadg dxjokdxxww(long j13);

        protected abstract Map eablkybsjg();

        public abstract iobyxmoadg gtknphoqwx(byte[] bArr);

        protected abstract iobyxmoadg gxszxtbevo(Map map);

        public final iobyxmoadg iobyxmoadg(String str, int i13) {
            eablkybsjg().put(str, String.valueOf(i13));
            return this;
        }

        public abstract iobyxmoadg lqeggnwhkg(Integer num);

        public abstract iobyxmoadg nufgyqmvbu(nufgyqmvbu nufgyqmvbuVar);

        public abstract iobyxmoadg ojitshcjhn(long j13);

        public final iobyxmoadg ppxfxbqfkf(String str, String str2) {
            eablkybsjg().put(str, str2);
            return this;
        }

        public abstract iobyxmoadg wflxmlrfwp(String str);

        public abstract dxjokdxxww wkgbmnqykc();

        public final iobyxmoadg zoijcleaow(String str, long j13) {
            eablkybsjg().put(str, String.valueOf(j13));
            return this;
        }
    }

    public static iobyxmoadg iobyxmoadg() {
        return new zoijcleaow.C1754zoijcleaow().gxszxtbevo(new HashMap());
    }

    public abstract String agtfadlqog();

    public final long btonecajqb(String str) {
        String str2 = (String) ppxfxbqfkf().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public abstract Integer draadjrbmk();

    public final int dxjokdxxww(String str) {
        String str2 = (String) ppxfxbqfkf().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract nufgyqmvbu eablkybsjg();

    public final Map gtknphoqwx() {
        return Collections.unmodifiableMap(ppxfxbqfkf());
    }

    public abstract long gxszxtbevo();

    public abstract byte[] lqeggnwhkg();

    public abstract byte[] nufgyqmvbu();

    public abstract long ojitshcjhn();

    protected abstract Map ppxfxbqfkf();

    public iobyxmoadg rgvfuqvkyq() {
        return new zoijcleaow.C1754zoijcleaow().agtfadlqog(agtfadlqog()).lqeggnwhkg(wkgbmnqykc()).draadjrbmk(draadjrbmk()).wflxmlrfwp(wflxmlrfwp()).btonecajqb(lqeggnwhkg()).gtknphoqwx(nufgyqmvbu()).nufgyqmvbu(eablkybsjg()).dxjokdxxww(gxszxtbevo()).ojitshcjhn(ojitshcjhn()).gxszxtbevo(new HashMap(ppxfxbqfkf()));
    }

    public abstract String wflxmlrfwp();

    public abstract Integer wkgbmnqykc();

    public final String zoijcleaow(String str) {
        String str2 = (String) ppxfxbqfkf().get(str);
        return str2 == null ? "" : str2;
    }
}
