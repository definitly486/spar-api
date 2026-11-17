package mj;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final lqeggnwhkg f67275eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final lqeggnwhkg f67276gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final zoijcleaow f67277wkgbmnqykc = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final boolean f67278iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ppxfxbqfkf f67279ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f67280zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public static final C1389iobyxmoadg f67281btonecajqb = new C1389iobyxmoadg(null);

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private static final iobyxmoadg f67282gtknphoqwx = new iobyxmoadg(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private final boolean f67283dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final String f67284eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final String f67285gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f67286iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final boolean f67287lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final boolean f67288nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final String f67289ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f67290wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f67291zoijcleaow;

        /* JADX INFO: renamed from: mj.lqeggnwhkg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1389iobyxmoadg {
            public /* synthetic */ C1389iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final iobyxmoadg iobyxmoadg() {
                return iobyxmoadg.f67282gtknphoqwx;
            }

            private C1389iobyxmoadg() {
            }
        }

        public iobyxmoadg(int i13, int i14, String groupSeparator, String byteSeparator, String bytePrefix, String byteSuffix) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(groupSeparator, "groupSeparator");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(byteSeparator, "byteSeparator");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytePrefix, "bytePrefix");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(byteSuffix, "byteSuffix");
            this.f67286iobyxmoadg = i13;
            this.f67291zoijcleaow = i14;
            this.f67289ppxfxbqfkf = groupSeparator;
            this.f67290wkgbmnqykc = byteSeparator;
            this.f67284eablkybsjg = bytePrefix;
            this.f67285gxszxtbevo = byteSuffix;
            this.f67287lqeggnwhkg = i13 == Integer.MAX_VALUE && i14 == Integer.MAX_VALUE;
            this.f67288nufgyqmvbu = bytePrefix.length() == 0 && byteSuffix.length() == 0 && byteSeparator.length() <= 1;
            this.f67283dxjokdxxww = nufgyqmvbu.zoijcleaow(groupSeparator) || nufgyqmvbu.zoijcleaow(byteSeparator) || nufgyqmvbu.zoijcleaow(bytePrefix) || nufgyqmvbu.zoijcleaow(byteSuffix);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("BytesHexFormat(");
            sb3.append('\n');
            zoijcleaow(sb3, "    ").append('\n');
            sb3.append(")");
            return sb3.toString();
        }

        public final StringBuilder zoijcleaow(StringBuilder sb3, String indent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sb3, "sb");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(indent, "indent");
            sb3.append(indent);
            sb3.append("bytesPerLine = ");
            sb3.append(this.f67286iobyxmoadg);
            sb3.append(StringUtils.COMMA);
            sb3.append('\n');
            sb3.append(indent);
            sb3.append("bytesPerGroup = ");
            sb3.append(this.f67291zoijcleaow);
            sb3.append(StringUtils.COMMA);
            sb3.append('\n');
            sb3.append(indent);
            sb3.append("groupSeparator = \"");
            sb3.append(this.f67289ppxfxbqfkf);
            sb3.append("\",");
            sb3.append('\n');
            sb3.append(indent);
            sb3.append("byteSeparator = \"");
            sb3.append(this.f67290wkgbmnqykc);
            sb3.append("\",");
            sb3.append('\n');
            sb3.append(indent);
            sb3.append("bytePrefix = \"");
            sb3.append(this.f67284eablkybsjg);
            sb3.append("\",");
            sb3.append('\n');
            sb3.append(indent);
            sb3.append("byteSuffix = \"");
            sb3.append(this.f67285gxszxtbevo);
            sb3.append("\"");
            return sb3;
        }
    }

    public static final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final boolean f67294eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final boolean f67295gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f67296iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final boolean f67297lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean f67298ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f67299wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final String f67300zoijcleaow;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        public static final iobyxmoadg f67293nufgyqmvbu = new iobyxmoadg(null);

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private static final ppxfxbqfkf f67292dxjokdxxww = new ppxfxbqfkf("", "", false, 1);

        public static final class iobyxmoadg {
            public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
                this();
            }

            public final ppxfxbqfkf iobyxmoadg() {
                return ppxfxbqfkf.f67292dxjokdxxww;
            }

            private iobyxmoadg() {
            }
        }

        public ppxfxbqfkf(String prefix, String suffix, boolean z13, int i13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(prefix, "prefix");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(suffix, "suffix");
            this.f67296iobyxmoadg = prefix;
            this.f67300zoijcleaow = suffix;
            this.f67298ppxfxbqfkf = z13;
            this.f67299wkgbmnqykc = i13;
            boolean z14 = prefix.length() == 0 && suffix.length() == 0;
            this.f67294eablkybsjg = z14;
            this.f67295gxszxtbevo = z14 && i13 == 1;
            this.f67297lqeggnwhkg = nufgyqmvbu.zoijcleaow(prefix) || nufgyqmvbu.zoijcleaow(suffix);
        }

        public final String eablkybsjg() {
            return this.f67300zoijcleaow;
        }

        public final boolean gxszxtbevo() {
            return this.f67294eablkybsjg;
        }

        public final boolean ppxfxbqfkf() {
            return this.f67297lqeggnwhkg;
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("NumberHexFormat(");
            sb3.append('\n');
            zoijcleaow(sb3, "    ").append('\n');
            sb3.append(")");
            return sb3.toString();
        }

        public final String wkgbmnqykc() {
            return this.f67296iobyxmoadg;
        }

        public final StringBuilder zoijcleaow(StringBuilder sb3, String indent) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sb3, "sb");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(indent, "indent");
            sb3.append(indent);
            sb3.append("prefix = \"");
            sb3.append(this.f67296iobyxmoadg);
            sb3.append("\",");
            sb3.append('\n');
            sb3.append(indent);
            sb3.append("suffix = \"");
            sb3.append(this.f67300zoijcleaow);
            sb3.append("\",");
            sb3.append('\n');
            sb3.append(indent);
            sb3.append("removeLeadingZeros = ");
            sb3.append(this.f67298ppxfxbqfkf);
            sb3.append(',');
            sb3.append('\n');
            sb3.append(indent);
            sb3.append("minLength = ");
            sb3.append(this.f67299wkgbmnqykc);
            return sb3;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final lqeggnwhkg iobyxmoadg() {
            return lqeggnwhkg.f67275eablkybsjg;
        }

        private zoijcleaow() {
        }
    }

    static {
        iobyxmoadg.C1389iobyxmoadg c1389iobyxmoadg = iobyxmoadg.f67281btonecajqb;
        iobyxmoadg iobyxmoadgVarIobyxmoadg = c1389iobyxmoadg.iobyxmoadg();
        ppxfxbqfkf.iobyxmoadg iobyxmoadgVar = ppxfxbqfkf.f67293nufgyqmvbu;
        f67275eablkybsjg = new lqeggnwhkg(false, iobyxmoadgVarIobyxmoadg, iobyxmoadgVar.iobyxmoadg());
        f67276gxszxtbevo = new lqeggnwhkg(true, c1389iobyxmoadg.iobyxmoadg(), iobyxmoadgVar.iobyxmoadg());
    }

    public lqeggnwhkg(boolean z13, iobyxmoadg bytes, ppxfxbqfkf number) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(number, "number");
        this.f67278iobyxmoadg = z13;
        this.f67280zoijcleaow = bytes;
        this.f67279ppxfxbqfkf = number;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("HexFormat(");
        sb3.append('\n');
        sb3.append("    upperCase = ");
        sb3.append(this.f67278iobyxmoadg);
        sb3.append(StringUtils.COMMA);
        sb3.append('\n');
        sb3.append("    bytes = BytesHexFormat(");
        sb3.append('\n');
        this.f67280zoijcleaow.zoijcleaow(sb3, "        ").append('\n');
        sb3.append("    ),");
        sb3.append('\n');
        sb3.append("    number = NumberHexFormat(");
        sb3.append('\n');
        this.f67279ppxfxbqfkf.zoijcleaow(sb3, "        ").append('\n');
        sb3.append("    )");
        sb3.append('\n');
        sb3.append(")");
        return sb3.toString();
    }

    public final ppxfxbqfkf zoijcleaow() {
        return this.f67279ppxfxbqfkf;
    }
}
