package hh1;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f40367iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f40368zoijcleaow;

    public static final class eablkybsjg extends gtknphoqwx {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(String reference) {
            super("catalog_lvl2", reference, null);
            zdlpuopuiu.btonecajqb(reference, "reference");
        }
    }

    public static final class gxszxtbevo extends gtknphoqwx {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(String reference) {
            super("item", reference, null);
            zdlpuopuiu.btonecajqb(reference, "reference");
        }
    }

    public static final class iobyxmoadg extends gtknphoqwx {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final iobyxmoadg f40369ppxfxbqfkf = new iobyxmoadg();

        /* JADX WARN: Multi-variable type inference failed */
        private iobyxmoadg() {
            super("app_login", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof iobyxmoadg);
        }

        public int hashCode() {
            return -1900802553;
        }

        public String toString() {
            return "LoggedIn";
        }
    }

    public static final class ppxfxbqfkf extends gtknphoqwx {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f40370ppxfxbqfkf = new ppxfxbqfkf();

        /* JADX WARN: Multi-variable type inference failed */
        private ppxfxbqfkf() {
            super("catalog", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return -479556945;
        }

        public String toString() {
            return "OpenCatalog";
        }
    }

    public static final class wkgbmnqykc extends gtknphoqwx {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(String reference) {
            super("catalog_lvl1", reference, null);
            zdlpuopuiu.btonecajqb(reference, "reference");
        }
    }

    public static final class zoijcleaow extends gtknphoqwx {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final zoijcleaow f40371ppxfxbqfkf = new zoijcleaow();

        /* JADX WARN: Multi-variable type inference failed */
        private zoijcleaow() {
            super("app_open", null, 2, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof zoijcleaow);
        }

        public int hashCode() {
            return 411393975;
        }

        public String toString() {
            return "OpenApp";
        }
    }

    public /* synthetic */ gtknphoqwx(String str, String str2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, str2);
    }

    public final String iobyxmoadg() {
        return this.f40368zoijcleaow;
    }

    public final String zoijcleaow() {
        return this.f40367iobyxmoadg;
    }

    private gtknphoqwx(String str, String str2) {
        this.f40367iobyxmoadg = str;
        this.f40368zoijcleaow = str2;
    }

    public /* synthetic */ gtknphoqwx(String str, String str2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(str, (i13 & 2) != 0 ? null : str2, null);
    }
}
