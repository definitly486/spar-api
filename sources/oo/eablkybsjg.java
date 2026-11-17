package oo;

import com.google.android.gms.common.internal.ImagesContract;
import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg extends w32.iobyxmoadg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final iobyxmoadg f73268gxszxtbevo = new iobyxmoadg();

        /* JADX WARN: Multi-variable type inference failed */
        private iobyxmoadg() {
            super("app_load_time", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return 2103205604;
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final iobyxmoadg f73269gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final Map f73270lqeggnwhkg;

        public enum iobyxmoadg {
            BRANDS("brands"),
            INDEX("index"),
            STORIES("stories"),
            COMBO("combo"),
            BANNERS("banners");


            /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
            private static final /* synthetic */ ng.iobyxmoadg f73276pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final String f73278zdlpuopuiu;

            iobyxmoadg(String str) {
                this.f73278zdlpuopuiu = str;
            }

            public final String wkgbmnqykc() {
                return this.f73278zdlpuopuiu;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(iobyxmoadg type) {
            super("main_screen_network_request", type.wkgbmnqykc(), null);
            zdlpuopuiu.btonecajqb(type, "type");
            this.f73269gxszxtbevo = type;
            this.f73270lqeggnwhkg = tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(ImagesContract.URL, type.wkgbmnqykc()));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f73269gxszxtbevo == ((ppxfxbqfkf) obj).f73269gxszxtbevo;
        }

        public int hashCode() {
            return this.f73269gxszxtbevo.hashCode();
        }

        @Override // w32.iobyxmoadg
        protected Map wkgbmnqykc() {
            return this.f73270lqeggnwhkg;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final wkgbmnqykc f73279gxszxtbevo = new wkgbmnqykc();

        /* JADX WARN: Multi-variable type inference failed */
        private wkgbmnqykc() {
            super("main_screen_full_load_time (visible)", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return -219345867;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final zoijcleaow f73280gxszxtbevo = new zoijcleaow();

        /* JADX WARN: Multi-variable type inference failed */
        private zoijcleaow() {
            super("main_screen_full_load_time (all)", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return -1592868430;
        }
    }

    public /* synthetic */ eablkybsjg(String str, String str2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, str2);
    }

    public /* synthetic */ eablkybsjg(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? "" : str2, null);
    }

    private eablkybsjg(String str, String str2) {
        super(str, str2);
    }
}
