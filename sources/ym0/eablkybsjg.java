package ym0;

import com.google.android.gms.common.internal.ImagesContract;
import gg.cqumvgiudr;
import hg.tzroggbefp;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg extends sp1.iobyxmoadg {

    public static final class iobyxmoadg extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final iobyxmoadg f125930gxszxtbevo = new iobyxmoadg();

        /* JADX WARN: Multi-variable type inference failed */
        private iobyxmoadg() {
            super("app_load_time", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -2120958367;
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final iobyxmoadg f125931gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final Map f125932lqeggnwhkg;

        public enum iobyxmoadg {
            BRANDS("brands"),
            INDEX("index"),
            STORIES("stories"),
            COMBO("combo"),
            BANNERS("banners");


            /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
            private static final /* synthetic */ ng.iobyxmoadg f125938pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            private final String f125940zdlpuopuiu;

            iobyxmoadg(String str) {
                this.f125940zdlpuopuiu = str;
            }

            public final String wkgbmnqykc() {
                return this.f125940zdlpuopuiu;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ppxfxbqfkf(iobyxmoadg type) {
            super("main_screen_network_request", type.wkgbmnqykc(), null);
            zdlpuopuiu.btonecajqb(type, "type");
            this.f125931gxszxtbevo = type;
            this.f125932lqeggnwhkg = tzroggbefp.gxszxtbevo(cqumvgiudr.iobyxmoadg(ImagesContract.URL, type.wkgbmnqykc()));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ppxfxbqfkf) && this.f125931gxszxtbevo == ((ppxfxbqfkf) obj).f125931gxszxtbevo;
        }

        public int hashCode() {
            return this.f125931gxszxtbevo.hashCode();
        }

        @Override // sp1.iobyxmoadg
        protected Map wkgbmnqykc() {
            return this.f125932lqeggnwhkg;
        }
    }

    public static final class wkgbmnqykc extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final wkgbmnqykc f125941gxszxtbevo = new wkgbmnqykc();

        /* JADX WARN: Multi-variable type inference failed */
        private wkgbmnqykc() {
            super("main_screen_full_load_time (visible)", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof wkgbmnqykc);
        }

        public int hashCode() {
            return 1556047154;
        }
    }

    public static final class zoijcleaow extends eablkybsjg {

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public static final zoijcleaow f125942gxszxtbevo = new zoijcleaow();

        /* JADX WARN: Multi-variable type inference failed */
        private zoijcleaow() {
            super("main_screen_full_load_time (all)", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 602034645;
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
