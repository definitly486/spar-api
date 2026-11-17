package ss;

import android.content.Context;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final zoijcleaow f108487zoijcleaow = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final AbstractC2665wkgbmnqykc f108488iobyxmoadg;

    public static final class dxjokdxxww extends wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final iobyxmoadg f108489eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AbstractC2665wkgbmnqykc f108490ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final nufgyqmvbu f108491wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(AbstractC2665wkgbmnqykc content, nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
            super(content, null);
            zdlpuopuiu.btonecajqb(content, "content");
            this.f108490ppxfxbqfkf = content;
            this.f108491wkgbmnqykc = nufgyqmvbuVar;
            this.f108489eablkybsjg = iobyxmoadgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f108490ppxfxbqfkf, dxjokdxxwwVar.f108490ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f108491wkgbmnqykc, dxjokdxxwwVar.f108491wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f108489eablkybsjg, dxjokdxxwwVar.f108489eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = this.f108490ppxfxbqfkf.hashCode() * 31;
            nufgyqmvbu nufgyqmvbuVar = this.f108491wkgbmnqykc;
            int iHashCode2 = (iHashCode + (nufgyqmvbuVar == null ? 0 : nufgyqmvbuVar.hashCode())) * 31;
            iobyxmoadg iobyxmoadgVar = this.f108489eablkybsjg;
            return iHashCode2 + (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
        }

        @Override // ss.wkgbmnqykc
        public AbstractC2665wkgbmnqykc iobyxmoadg() {
            return this.f108490ppxfxbqfkf;
        }

        public final nufgyqmvbu ppxfxbqfkf() {
            return this.f108491wkgbmnqykc;
        }

        public String toString() {
            return "Warning(content=" + this.f108490ppxfxbqfkf + ", title=" + this.f108491wkgbmnqykc + ", action=" + this.f108489eablkybsjg + ")";
        }

        public final iobyxmoadg zoijcleaow() {
            return this.f108489eablkybsjg;
        }
    }

    public static final class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final gxszxtbevo f108492eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AbstractC2665wkgbmnqykc f108493ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final nufgyqmvbu f108494wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(AbstractC2665wkgbmnqykc content, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo errorType) {
            super(content, null);
            zdlpuopuiu.btonecajqb(content, "content");
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            this.f108493ppxfxbqfkf = content;
            this.f108494wkgbmnqykc = nufgyqmvbuVar;
            this.f108492eablkybsjg = errorType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f108493ppxfxbqfkf, eablkybsjgVar.f108493ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f108494wkgbmnqykc, eablkybsjgVar.f108494wkgbmnqykc) && this.f108492eablkybsjg == eablkybsjgVar.f108492eablkybsjg;
        }

        public int hashCode() {
            int iHashCode = this.f108493ppxfxbqfkf.hashCode() * 31;
            nufgyqmvbu nufgyqmvbuVar = this.f108494wkgbmnqykc;
            return ((iHashCode + (nufgyqmvbuVar == null ? 0 : nufgyqmvbuVar.hashCode())) * 31) + this.f108492eablkybsjg.hashCode();
        }

        @Override // ss.wkgbmnqykc
        public AbstractC2665wkgbmnqykc iobyxmoadg() {
            return this.f108493ppxfxbqfkf;
        }

        public final nufgyqmvbu ppxfxbqfkf() {
            return this.f108494wkgbmnqykc;
        }

        public String toString() {
            return "Error(content=" + this.f108493ppxfxbqfkf + ", title=" + this.f108494wkgbmnqykc + ", errorType=" + this.f108492eablkybsjg + ")";
        }

        public final gxszxtbevo zoijcleaow() {
            return this.f108492eablkybsjg;
        }
    }

    public enum gxszxtbevo {
        Fatal,
        NonFatal;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f108495iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: ss.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C2664iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C2664iobyxmoadg f108499iobyxmoadg = new C2664iobyxmoadg();

            private C2664iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2664iobyxmoadg);
            }

            public int hashCode() {
                return 63221398;
            }

            public String toString() {
                return "Close";
            }
        }

        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f108500iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return 65099243;
            }

            public String toString() {
                return "Empty";
            }
        }
    }

    public static final class lqeggnwhkg extends wkgbmnqykc {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final AbstractC2665wkgbmnqykc f108501ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(AbstractC2665wkgbmnqykc content) {
            super(content, null);
            zdlpuopuiu.btonecajqb(content, "content");
            this.f108501ppxfxbqfkf = content;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f108501ppxfxbqfkf, ((lqeggnwhkg) obj).f108501ppxfxbqfkf);
        }

        public int hashCode() {
            return this.f108501ppxfxbqfkf.hashCode();
        }

        @Override // ss.wkgbmnqykc
        public AbstractC2665wkgbmnqykc iobyxmoadg() {
            return this.f108501ppxfxbqfkf;
        }

        public String toString() {
            return "Info(content=" + this.f108501ppxfxbqfkf + ")";
        }
    }

    public interface nufgyqmvbu {

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f108502iobyxmoadg;

            public iobyxmoadg(int i13) {
                this.f108502iobyxmoadg = i13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && this.f108502iobyxmoadg == ((iobyxmoadg) obj).f108502iobyxmoadg;
            }

            public int hashCode() {
                return Integer.hashCode(this.f108502iobyxmoadg);
            }

            public final int iobyxmoadg() {
                return this.f108502iobyxmoadg;
            }

            public String toString() {
                return "Res(resId=" + this.f108502iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow implements nufgyqmvbu {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f108503iobyxmoadg;

            public zoijcleaow(String title) {
                zdlpuopuiu.btonecajqb(title, "title");
                this.f108503iobyxmoadg = title;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f108503iobyxmoadg, ((zoijcleaow) obj).f108503iobyxmoadg);
            }

            public int hashCode() {
                return this.f108503iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f108503iobyxmoadg;
            }

            public String toString() {
                return "Str(title=" + this.f108503iobyxmoadg + ")";
            }
        }
    }

    public static final class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f108504ppxfxbqfkf = new ppxfxbqfkf();

        /* JADX WARN: Multi-variable type inference failed */
        private ppxfxbqfkf() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 363657940;
        }

        public String toString() {
            return "Connection";
        }
    }

    /* JADX INFO: renamed from: ss.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    public static abstract class AbstractC2665wkgbmnqykc {

        /* JADX INFO: renamed from: ss.wkgbmnqykc$wkgbmnqykc$iobyxmoadg */
        public static final class iobyxmoadg extends AbstractC2665wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f108505iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f108506zoijcleaow;

            public iobyxmoadg(int i13, String str) {
                super(null);
                this.f108505iobyxmoadg = i13;
                this.f108506zoijcleaow = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof iobyxmoadg)) {
                    return false;
                }
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
                return this.f108505iobyxmoadg == iobyxmoadgVar.f108505iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f108506zoijcleaow, iobyxmoadgVar.f108506zoijcleaow);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f108505iobyxmoadg) * 31;
                String str = this.f108506zoijcleaow;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // ss.wkgbmnqykc.AbstractC2665wkgbmnqykc
            public String iobyxmoadg() {
                return this.f108506zoijcleaow;
            }

            public final int ppxfxbqfkf() {
                return this.f108505iobyxmoadg;
            }

            public String toString() {
                return "Res(id=" + this.f108505iobyxmoadg + ", errorId=" + this.f108506zoijcleaow + ")";
            }

            public /* synthetic */ iobyxmoadg(int i13, String str, int i14, gtknphoqwx gtknphoqwxVar) {
                this(i13, (i14 & 2) != 0 ? null : str);
            }
        }

        /* JADX INFO: renamed from: ss.wkgbmnqykc$wkgbmnqykc$zoijcleaow */
        public static final class zoijcleaow extends AbstractC2665wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f108507iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f108508zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(String text, String str) {
                super(null);
                zdlpuopuiu.btonecajqb(text, "text");
                this.f108507iobyxmoadg = text;
                this.f108508zoijcleaow = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f108507iobyxmoadg, zoijcleaowVar.f108507iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f108508zoijcleaow, zoijcleaowVar.f108508zoijcleaow);
            }

            public int hashCode() {
                int iHashCode = this.f108507iobyxmoadg.hashCode() * 31;
                String str = this.f108508zoijcleaow;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // ss.wkgbmnqykc.AbstractC2665wkgbmnqykc
            public String iobyxmoadg() {
                return this.f108508zoijcleaow;
            }

            public final String ppxfxbqfkf() {
                return this.f108507iobyxmoadg;
            }

            public String toString() {
                return "Str(text=" + this.f108507iobyxmoadg + ", errorId=" + this.f108508zoijcleaow + ")";
            }

            public /* synthetic */ zoijcleaow(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
                this(str, (i13 & 2) != 0 ? null : str2);
            }
        }

        public /* synthetic */ AbstractC2665wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public abstract String iobyxmoadg();

        public final vdvldrhtss zoijcleaow(Context context) {
            String string;
            zdlpuopuiu.btonecajqb(context, "context");
            if (this instanceof iobyxmoadg) {
                string = context.getString(((iobyxmoadg) this).ppxfxbqfkf());
            } else {
                if (!(this instanceof zoijcleaow)) {
                    throw new NoWhenBranchMatchedException();
                }
                string = kcexrzcfyt.p(((zoijcleaow) this).ppxfxbqfkf()).toString();
            }
            zdlpuopuiu.lqeggnwhkg(string);
            String string2 = context.getString(ss.ppxfxbqfkf.error_id, iobyxmoadg());
            String strIobyxmoadg = iobyxmoadg();
            if (strIobyxmoadg == null || strIobyxmoadg.length() == 0) {
                string2 = null;
            }
            return cqumvgiudr.iobyxmoadg(string, string2);
        }

        private AbstractC2665wkgbmnqykc() {
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public static /* synthetic */ dxjokdxxww dxjokdxxww(zoijcleaow zoijcleaowVar, String str, nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                nufgyqmvbuVar = null;
            }
            if ((i13 & 4) != 0) {
                iobyxmoadgVar = iobyxmoadg.C2664iobyxmoadg.f108499iobyxmoadg;
            }
            return zoijcleaowVar.nufgyqmvbu(str, nufgyqmvbuVar, iobyxmoadgVar);
        }

        public static /* synthetic */ eablkybsjg ppxfxbqfkf(zoijcleaow zoijcleaowVar, int i13, String str, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str = null;
            }
            if ((i14 & 4) != 0) {
                nufgyqmvbuVar = null;
            }
            return zoijcleaowVar.iobyxmoadg(i13, str, nufgyqmvbuVar, gxszxtbevoVar);
        }

        public static /* synthetic */ eablkybsjg wkgbmnqykc(zoijcleaow zoijcleaowVar, String str, String str2, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str2 = null;
            }
            if ((i13 & 4) != 0) {
                nufgyqmvbuVar = null;
            }
            return zoijcleaowVar.zoijcleaow(str, str2, nufgyqmvbuVar, gxszxtbevoVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final lqeggnwhkg eablkybsjg(int i13) {
            return new lqeggnwhkg(new AbstractC2665wkgbmnqykc.iobyxmoadg(i13, null, 2, 0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final lqeggnwhkg gxszxtbevo(String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            return new lqeggnwhkg(new AbstractC2665wkgbmnqykc.zoijcleaow(text, null, 2, 0 == true ? 1 : 0));
        }

        public final eablkybsjg iobyxmoadg(int i13, String str, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo errorType) {
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            return new eablkybsjg(new AbstractC2665wkgbmnqykc.iobyxmoadg(i13, str), nufgyqmvbuVar, errorType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final dxjokdxxww lqeggnwhkg(int i13, nufgyqmvbu nufgyqmvbuVar, iobyxmoadg action) {
            zdlpuopuiu.btonecajqb(action, "action");
            return new dxjokdxxww(new AbstractC2665wkgbmnqykc.iobyxmoadg(i13, null, 2, 0 == true ? 1 : 0), nufgyqmvbuVar, action);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final dxjokdxxww nufgyqmvbu(String text, nufgyqmvbu nufgyqmvbuVar, iobyxmoadg action) {
            zdlpuopuiu.btonecajqb(text, "text");
            zdlpuopuiu.btonecajqb(action, "action");
            return new dxjokdxxww(new AbstractC2665wkgbmnqykc.zoijcleaow(text, null, 2, 0 == true ? 1 : 0), nufgyqmvbuVar, action);
        }

        public final eablkybsjg zoijcleaow(String text, String str, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo errorType) {
            zdlpuopuiu.btonecajqb(text, "text");
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            return new eablkybsjg(new AbstractC2665wkgbmnqykc.zoijcleaow(text, str), nufgyqmvbuVar, errorType);
        }

        private zoijcleaow() {
        }
    }

    public /* synthetic */ wkgbmnqykc(AbstractC2665wkgbmnqykc abstractC2665wkgbmnqykc, gtknphoqwx gtknphoqwxVar) {
        this(abstractC2665wkgbmnqykc);
    }

    public AbstractC2665wkgbmnqykc iobyxmoadg() {
        return this.f108488iobyxmoadg;
    }

    private wkgbmnqykc(AbstractC2665wkgbmnqykc abstractC2665wkgbmnqykc) {
        this.f108488iobyxmoadg = abstractC2665wkgbmnqykc;
    }

    public /* synthetic */ wkgbmnqykc(AbstractC2665wkgbmnqykc abstractC2665wkgbmnqykc, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : abstractC2665wkgbmnqykc, null);
    }
}
