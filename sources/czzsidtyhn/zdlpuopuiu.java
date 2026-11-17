package czzsidtyhn;

/* JADX INFO: loaded from: classes.dex */
public abstract class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f26517iobyxmoadg = new zoijcleaow(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final zdlpuopuiu f26520zoijcleaow = iobyxmoadg.f26523eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final zdlpuopuiu f26518ppxfxbqfkf = eablkybsjg.f26521eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final zdlpuopuiu f26519wkgbmnqykc = ppxfxbqfkf.f26524eablkybsjg;

    private static final class eablkybsjg extends zdlpuopuiu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final eablkybsjg f26521eablkybsjg = new eablkybsjg();

        private eablkybsjg() {
            super(null);
        }

        @Override // czzsidtyhn.zdlpuopuiu
        public int iobyxmoadg(int i13, w0.zdlpuopuiu zdlpuopuiuVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i14) {
            if (zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) {
                return 0;
            }
            return i13;
        }
    }

    private static final class gxszxtbevo extends zdlpuopuiu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final a.eablkybsjg.ppxfxbqfkf f26522eablkybsjg;

        public gxszxtbevo(a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
            super(null);
            this.f26522eablkybsjg = ppxfxbqfkfVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f26522eablkybsjg, ((gxszxtbevo) obj).f26522eablkybsjg);
        }

        public int hashCode() {
            return this.f26522eablkybsjg.hashCode();
        }

        @Override // czzsidtyhn.zdlpuopuiu
        public int iobyxmoadg(int i13, w0.zdlpuopuiu zdlpuopuiuVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i14) {
            return this.f26522eablkybsjg.iobyxmoadg(0, i13);
        }

        public String toString() {
            return "VerticalCrossAxisAlignment(vertical=" + this.f26522eablkybsjg + ')';
        }
    }

    private static final class iobyxmoadg extends zdlpuopuiu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final iobyxmoadg f26523eablkybsjg = new iobyxmoadg();

        private iobyxmoadg() {
            super(null);
        }

        @Override // czzsidtyhn.zdlpuopuiu
        public int iobyxmoadg(int i13, w0.zdlpuopuiu zdlpuopuiuVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i14) {
            return i13 / 2;
        }
    }

    private static final class ppxfxbqfkf extends zdlpuopuiu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public static final ppxfxbqfkf f26524eablkybsjg = new ppxfxbqfkf();

        private ppxfxbqfkf() {
            super(null);
        }

        @Override // czzsidtyhn.zdlpuopuiu
        public int iobyxmoadg(int i13, w0.zdlpuopuiu zdlpuopuiuVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i14) {
            if (zdlpuopuiuVar == w0.zdlpuopuiu.Ltr) {
                return i13;
            }
            return 0;
        }
    }

    private static final class wkgbmnqykc extends zdlpuopuiu {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final a.eablkybsjg.zoijcleaow f26525eablkybsjg;

        public wkgbmnqykc(a.eablkybsjg.zoijcleaow zoijcleaowVar) {
            super(null);
            this.f26525eablkybsjg = zoijcleaowVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f26525eablkybsjg, ((wkgbmnqykc) obj).f26525eablkybsjg);
        }

        public int hashCode() {
            return this.f26525eablkybsjg.hashCode();
        }

        @Override // czzsidtyhn.zdlpuopuiu
        public int iobyxmoadg(int i13, w0.zdlpuopuiu zdlpuopuiuVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i14) {
            return this.f26525eablkybsjg.iobyxmoadg(0, i13, zdlpuopuiuVar);
        }

        public String toString() {
            return "HorizontalCrossAxisAlignment(horizontal=" + this.f26525eablkybsjg + ')';
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final zdlpuopuiu iobyxmoadg(a.eablkybsjg.zoijcleaow zoijcleaowVar) {
            return new wkgbmnqykc(zoijcleaowVar);
        }

        public final zdlpuopuiu zoijcleaow(a.eablkybsjg.ppxfxbqfkf ppxfxbqfkfVar) {
            return new gxszxtbevo(ppxfxbqfkfVar);
        }

        private zoijcleaow() {
        }
    }

    public /* synthetic */ zdlpuopuiu(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract int iobyxmoadg(int i13, w0.zdlpuopuiu zdlpuopuiuVar, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i14);

    public boolean ppxfxbqfkf() {
        return false;
    }

    public Integer zoijcleaow(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar) {
        return null;
    }

    private zdlpuopuiu() {
    }
}
