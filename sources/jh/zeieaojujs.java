package jh;

import com.google.android.gms.common.internal.ImagesContract;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zeieaojujs {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zeieaojujs f51367iobyxmoadg = new zeieaojujs();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final nufgyqmvbu f51368ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Map f51369zoijcleaow;

    public static final class dxjokdxxww extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final dxjokdxxww f51370ppxfxbqfkf = new dxjokdxxww();

        private dxjokdxxww() {
            super(CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE, false);
        }
    }

    public static final class eablkybsjg extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final eablkybsjg f51371ppxfxbqfkf = new eablkybsjg();

        private eablkybsjg() {
            super("private", false);
        }
    }

    public static final class gxszxtbevo extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final gxszxtbevo f51372ppxfxbqfkf = new gxszxtbevo();

        private gxszxtbevo() {
            super("private_to_this", false);
        }

        @Override // jh.nuxfzjnpeb
        public String zoijcleaow() {
            return "private/*private to this*/";
        }
    }

    public static final class iobyxmoadg extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final iobyxmoadg f51373ppxfxbqfkf = new iobyxmoadg();

        private iobyxmoadg() {
            super("inherited", false);
        }
    }

    public static final class lqeggnwhkg extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final lqeggnwhkg f51374ppxfxbqfkf = new lqeggnwhkg();

        private lqeggnwhkg() {
            super("protected", true);
        }
    }

    public static final class nufgyqmvbu extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final nufgyqmvbu f51375ppxfxbqfkf = new nufgyqmvbu();

        private nufgyqmvbu() {
            super(BuildConfig.SDK_BUILD_FLAVOR, true);
        }
    }

    public static final class ppxfxbqfkf extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f51376ppxfxbqfkf = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super("invisible_fake", false);
        }
    }

    public static final class wkgbmnqykc extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final wkgbmnqykc f51377ppxfxbqfkf = new wkgbmnqykc();

        private wkgbmnqykc() {
            super(ImagesContract.LOCAL, false);
        }
    }

    public static final class zoijcleaow extends nuxfzjnpeb {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final zoijcleaow f51378ppxfxbqfkf = new zoijcleaow();

        private zoijcleaow() {
            super("internal", false);
        }
    }

    static {
        Map mapPpxfxbqfkf = hg.tzroggbefp.ppxfxbqfkf();
        mapPpxfxbqfkf.put(gxszxtbevo.f51372ppxfxbqfkf, 0);
        mapPpxfxbqfkf.put(eablkybsjg.f51371ppxfxbqfkf, 0);
        mapPpxfxbqfkf.put(zoijcleaow.f51378ppxfxbqfkf, 1);
        mapPpxfxbqfkf.put(lqeggnwhkg.f51374ppxfxbqfkf, 1);
        nufgyqmvbu nufgyqmvbuVar = nufgyqmvbu.f51375ppxfxbqfkf;
        mapPpxfxbqfkf.put(nufgyqmvbuVar, 2);
        f51369zoijcleaow = hg.tzroggbefp.zoijcleaow(mapPpxfxbqfkf);
        f51368ppxfxbqfkf = nufgyqmvbuVar;
    }

    private zeieaojujs() {
    }

    public final Integer iobyxmoadg(nuxfzjnpeb first, nuxfzjnpeb second) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(first, "first");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(second, "second");
        if (first == second) {
            return 0;
        }
        Map map = f51369zoijcleaow;
        Integer num = (Integer) map.get(first);
        Integer num2 = (Integer) map.get(second);
        if (num == null || num2 == null || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean zoijcleaow(nuxfzjnpeb visibility) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(visibility, "visibility");
        return visibility == eablkybsjg.f51371ppxfxbqfkf || visibility == gxszxtbevo.f51372ppxfxbqfkf;
    }
}
