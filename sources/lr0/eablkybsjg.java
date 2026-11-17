package lr0;

import android.content.Context;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class eablkybsjg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final zoijcleaow f63889zoijcleaow = new zoijcleaow(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wkgbmnqykc f63890iobyxmoadg;

    public static final class btonecajqb extends eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final int f63891eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final wkgbmnqykc f63892ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final iobyxmoadg.ppxfxbqfkf f63893wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public btonecajqb(wkgbmnqykc content, iobyxmoadg.ppxfxbqfkf action, int i13) {
            super(null, 1, 0 == true ? 1 : 0);
            zdlpuopuiu.btonecajqb(content, "content");
            zdlpuopuiu.btonecajqb(action, "action");
            this.f63892ppxfxbqfkf = content;
            this.f63893wkgbmnqykc = action;
            this.f63891eablkybsjg = i13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof btonecajqb)) {
                return false;
            }
            btonecajqb btonecajqbVar = (btonecajqb) obj;
            return zdlpuopuiu.eablkybsjg(this.f63892ppxfxbqfkf, btonecajqbVar.f63892ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f63893wkgbmnqykc, btonecajqbVar.f63893wkgbmnqykc) && this.f63891eablkybsjg == btonecajqbVar.f63891eablkybsjg;
        }

        public int hashCode() {
            return (((this.f63892ppxfxbqfkf.hashCode() * 31) + this.f63893wkgbmnqykc.hashCode()) * 31) + Integer.hashCode(this.f63891eablkybsjg);
        }

        @Override // lr0.eablkybsjg
        public wkgbmnqykc iobyxmoadg() {
            return this.f63892ppxfxbqfkf;
        }

        public final Long ppxfxbqfkf() {
            Integer numValueOf = Integer.valueOf(this.f63891eablkybsjg);
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return Long.valueOf(((long) numValueOf.intValue()) * 1000);
            }
            return null;
        }

        public String toString() {
            return "WithButton(content=" + this.f63892ppxfxbqfkf + ", action=" + this.f63893wkgbmnqykc + ", durationInSeconds=" + this.f63891eablkybsjg + ")";
        }

        public final iobyxmoadg.ppxfxbqfkf zoijcleaow() {
            return this.f63893wkgbmnqykc;
        }
    }

    public static final class dxjokdxxww extends eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final iobyxmoadg f63894eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final wkgbmnqykc f63895ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final nufgyqmvbu f63896wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dxjokdxxww(wkgbmnqykc content, nufgyqmvbu nufgyqmvbuVar, iobyxmoadg iobyxmoadgVar) {
            super(content, null);
            zdlpuopuiu.btonecajqb(content, "content");
            this.f63895ppxfxbqfkf = content;
            this.f63896wkgbmnqykc = nufgyqmvbuVar;
            this.f63894eablkybsjg = iobyxmoadgVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof dxjokdxxww)) {
                return false;
            }
            dxjokdxxww dxjokdxxwwVar = (dxjokdxxww) obj;
            return zdlpuopuiu.eablkybsjg(this.f63895ppxfxbqfkf, dxjokdxxwwVar.f63895ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f63896wkgbmnqykc, dxjokdxxwwVar.f63896wkgbmnqykc) && zdlpuopuiu.eablkybsjg(this.f63894eablkybsjg, dxjokdxxwwVar.f63894eablkybsjg);
        }

        public int hashCode() {
            int iHashCode = this.f63895ppxfxbqfkf.hashCode() * 31;
            nufgyqmvbu nufgyqmvbuVar = this.f63896wkgbmnqykc;
            int iHashCode2 = (iHashCode + (nufgyqmvbuVar == null ? 0 : nufgyqmvbuVar.hashCode())) * 31;
            iobyxmoadg iobyxmoadgVar = this.f63894eablkybsjg;
            return iHashCode2 + (iobyxmoadgVar != null ? iobyxmoadgVar.hashCode() : 0);
        }

        @Override // lr0.eablkybsjg
        public wkgbmnqykc iobyxmoadg() {
            return this.f63895ppxfxbqfkf;
        }

        public final nufgyqmvbu ppxfxbqfkf() {
            return this.f63896wkgbmnqykc;
        }

        public String toString() {
            return "Warning(content=" + this.f63895ppxfxbqfkf + ", title=" + this.f63896wkgbmnqykc + ", action=" + this.f63894eablkybsjg + ")";
        }

        public final iobyxmoadg zoijcleaow() {
            return this.f63894eablkybsjg;
        }
    }

    /* JADX INFO: renamed from: lr0.eablkybsjg$eablkybsjg, reason: collision with other inner class name */
    public static final class C1313eablkybsjg extends eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final gxszxtbevo f63897eablkybsjg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final wkgbmnqykc f63898ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final nufgyqmvbu f63899wkgbmnqykc;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1313eablkybsjg(wkgbmnqykc content, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo errorType) {
            super(content, null);
            zdlpuopuiu.btonecajqb(content, "content");
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            this.f63898ppxfxbqfkf = content;
            this.f63899wkgbmnqykc = nufgyqmvbuVar;
            this.f63897eablkybsjg = errorType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1313eablkybsjg)) {
                return false;
            }
            C1313eablkybsjg c1313eablkybsjg = (C1313eablkybsjg) obj;
            return zdlpuopuiu.eablkybsjg(this.f63898ppxfxbqfkf, c1313eablkybsjg.f63898ppxfxbqfkf) && zdlpuopuiu.eablkybsjg(this.f63899wkgbmnqykc, c1313eablkybsjg.f63899wkgbmnqykc) && this.f63897eablkybsjg == c1313eablkybsjg.f63897eablkybsjg;
        }

        public int hashCode() {
            int iHashCode = this.f63898ppxfxbqfkf.hashCode() * 31;
            nufgyqmvbu nufgyqmvbuVar = this.f63899wkgbmnqykc;
            return ((iHashCode + (nufgyqmvbuVar == null ? 0 : nufgyqmvbuVar.hashCode())) * 31) + this.f63897eablkybsjg.hashCode();
        }

        @Override // lr0.eablkybsjg
        public wkgbmnqykc iobyxmoadg() {
            return this.f63898ppxfxbqfkf;
        }

        public final nufgyqmvbu ppxfxbqfkf() {
            return this.f63899wkgbmnqykc;
        }

        public String toString() {
            return "Error(content=" + this.f63898ppxfxbqfkf + ", title=" + this.f63899wkgbmnqykc + ", errorType=" + this.f63897eablkybsjg + ")";
        }

        public final gxszxtbevo zoijcleaow() {
            return this.f63897eablkybsjg;
        }
    }

    public enum gxszxtbevo {
        Fatal,
        NonFatal;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f63900iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public interface iobyxmoadg {

        /* JADX INFO: renamed from: lr0.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1314iobyxmoadg implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final C1314iobyxmoadg f63904iobyxmoadg = new C1314iobyxmoadg();

            private C1314iobyxmoadg() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1314iobyxmoadg);
            }

            public int hashCode() {
                return -557642247;
            }

            public String toString() {
                return "Close";
            }
        }

        public static final class ppxfxbqfkf implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f63905iobyxmoadg;

            /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
            private final String f63906ppxfxbqfkf;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f63907zoijcleaow;

            public ppxfxbqfkf(String buttonText, String navLink, String str) {
                zdlpuopuiu.btonecajqb(buttonText, "buttonText");
                zdlpuopuiu.btonecajqb(navLink, "navLink");
                this.f63905iobyxmoadg = buttonText;
                this.f63907zoijcleaow = navLink;
                this.f63906ppxfxbqfkf = str;
            }

            public final String iobyxmoadg() {
                return this.f63905iobyxmoadg;
            }

            public final String ppxfxbqfkf() {
                return this.f63906ppxfxbqfkf;
            }

            public final String zoijcleaow() {
                return this.f63907zoijcleaow;
            }
        }

        public static final class zoijcleaow implements iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            public static final zoijcleaow f63908iobyxmoadg = new zoijcleaow();

            private zoijcleaow() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof zoijcleaow);
            }

            public int hashCode() {
                return -555764402;
            }

            public String toString() {
                return "Empty";
            }
        }
    }

    public static final class lqeggnwhkg extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final wkgbmnqykc f63909ppxfxbqfkf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(wkgbmnqykc content) {
            super(content, null);
            zdlpuopuiu.btonecajqb(content, "content");
            this.f63909ppxfxbqfkf = content;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof lqeggnwhkg) && zdlpuopuiu.eablkybsjg(this.f63909ppxfxbqfkf, ((lqeggnwhkg) obj).f63909ppxfxbqfkf);
        }

        public int hashCode() {
            return this.f63909ppxfxbqfkf.hashCode();
        }

        @Override // lr0.eablkybsjg
        public wkgbmnqykc iobyxmoadg() {
            return this.f63909ppxfxbqfkf;
        }

        public String toString() {
            return "Info(content=" + this.f63909ppxfxbqfkf + ")";
        }
    }

    public interface nufgyqmvbu {

        public static final class iobyxmoadg implements nufgyqmvbu {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f63910iobyxmoadg;

            public iobyxmoadg(int i13) {
                this.f63910iobyxmoadg = i13;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof iobyxmoadg) && this.f63910iobyxmoadg == ((iobyxmoadg) obj).f63910iobyxmoadg;
            }

            public int hashCode() {
                return Integer.hashCode(this.f63910iobyxmoadg);
            }

            public final int iobyxmoadg() {
                return this.f63910iobyxmoadg;
            }

            public String toString() {
                return "Res(resId=" + this.f63910iobyxmoadg + ")";
            }
        }

        public static final class zoijcleaow implements nufgyqmvbu {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f63911iobyxmoadg;

            public zoijcleaow(String title) {
                zdlpuopuiu.btonecajqb(title, "title");
                this.f63911iobyxmoadg = title;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f63911iobyxmoadg, ((zoijcleaow) obj).f63911iobyxmoadg);
            }

            public int hashCode() {
                return this.f63911iobyxmoadg.hashCode();
            }

            public final String iobyxmoadg() {
                return this.f63911iobyxmoadg;
            }

            public String toString() {
                return "Str(title=" + this.f63911iobyxmoadg + ")";
            }
        }
    }

    public static final class ppxfxbqfkf extends eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final ppxfxbqfkf f63912ppxfxbqfkf = new ppxfxbqfkf();

        /* JADX WARN: Multi-variable type inference failed */
        private ppxfxbqfkf() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ppxfxbqfkf);
        }

        public int hashCode() {
            return 242341623;
        }

        public String toString() {
            return "Connection";
        }
    }

    public static abstract class wkgbmnqykc {

        public static final class iobyxmoadg extends wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final int f63913iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f63914zoijcleaow;

            public iobyxmoadg(int i13, String str) {
                super(null);
                this.f63913iobyxmoadg = i13;
                this.f63914zoijcleaow = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof iobyxmoadg)) {
                    return false;
                }
                iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
                return this.f63913iobyxmoadg == iobyxmoadgVar.f63913iobyxmoadg && zdlpuopuiu.eablkybsjg(this.f63914zoijcleaow, iobyxmoadgVar.f63914zoijcleaow);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.f63913iobyxmoadg) * 31;
                String str = this.f63914zoijcleaow;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // lr0.eablkybsjg.wkgbmnqykc
            public String iobyxmoadg() {
                return this.f63914zoijcleaow;
            }

            public final int ppxfxbqfkf() {
                return this.f63913iobyxmoadg;
            }

            public String toString() {
                return "Res(id=" + this.f63913iobyxmoadg + ", errorId=" + this.f63914zoijcleaow + ")";
            }

            public /* synthetic */ iobyxmoadg(int i13, String str, int i14, gtknphoqwx gtknphoqwxVar) {
                this(i13, (i14 & 2) != 0 ? null : str);
            }
        }

        public static final class zoijcleaow extends wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final String f63915iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            private final String f63916zoijcleaow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public zoijcleaow(String text, String str) {
                super(null);
                zdlpuopuiu.btonecajqb(text, "text");
                this.f63915iobyxmoadg = text;
                this.f63916zoijcleaow = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof zoijcleaow)) {
                    return false;
                }
                zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
                return zdlpuopuiu.eablkybsjg(this.f63915iobyxmoadg, zoijcleaowVar.f63915iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f63916zoijcleaow, zoijcleaowVar.f63916zoijcleaow);
            }

            public int hashCode() {
                int iHashCode = this.f63915iobyxmoadg.hashCode() * 31;
                String str = this.f63916zoijcleaow;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // lr0.eablkybsjg.wkgbmnqykc
            public String iobyxmoadg() {
                return this.f63916zoijcleaow;
            }

            public final String ppxfxbqfkf() {
                return this.f63915iobyxmoadg;
            }

            public String toString() {
                return "Str(text=" + this.f63915iobyxmoadg + ", errorId=" + this.f63916zoijcleaow + ")";
            }

            public /* synthetic */ zoijcleaow(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
                this(str, (i13 & 2) != 0 ? null : str2);
            }
        }

        public /* synthetic */ wkgbmnqykc(gtknphoqwx gtknphoqwxVar) {
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
            String string2 = context.getString(lr0.wkgbmnqykc.proloyalty_error_id, iobyxmoadg());
            String strIobyxmoadg = iobyxmoadg();
            if (strIobyxmoadg == null || strIobyxmoadg.length() == 0) {
                string2 = null;
            }
            return cqumvgiudr.iobyxmoadg(string, string2);
        }

        private wkgbmnqykc() {
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
                iobyxmoadgVar = iobyxmoadg.C1314iobyxmoadg.f63904iobyxmoadg;
            }
            return zoijcleaowVar.nufgyqmvbu(str, nufgyqmvbuVar, iobyxmoadgVar);
        }

        public static /* synthetic */ C1313eablkybsjg ppxfxbqfkf(zoijcleaow zoijcleaowVar, int i13, String str, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar, int i14, Object obj) {
            if ((i14 & 2) != 0) {
                str = null;
            }
            if ((i14 & 4) != 0) {
                nufgyqmvbuVar = null;
            }
            return zoijcleaowVar.iobyxmoadg(i13, str, nufgyqmvbuVar, gxszxtbevoVar);
        }

        public static /* synthetic */ C1313eablkybsjg wkgbmnqykc(zoijcleaow zoijcleaowVar, String str, String str2, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str2 = null;
            }
            if ((i13 & 4) != 0) {
                nufgyqmvbuVar = null;
            }
            return zoijcleaowVar.zoijcleaow(str, str2, nufgyqmvbuVar, gxszxtbevoVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final btonecajqb btonecajqb(String message, int i13, String buttonText, String navLink, String str) {
            zdlpuopuiu.btonecajqb(message, "message");
            zdlpuopuiu.btonecajqb(buttonText, "buttonText");
            zdlpuopuiu.btonecajqb(navLink, "navLink");
            return new btonecajqb(new wkgbmnqykc.zoijcleaow(message, null, 2, 0 == true ? 1 : 0), new iobyxmoadg.ppxfxbqfkf(buttonText, navLink, str), i13);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final lqeggnwhkg eablkybsjg(int i13) {
            return new lqeggnwhkg(new wkgbmnqykc.iobyxmoadg(i13, null, 2, 0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final lqeggnwhkg gxszxtbevo(String text) {
            zdlpuopuiu.btonecajqb(text, "text");
            return new lqeggnwhkg(new wkgbmnqykc.zoijcleaow(text, null, 2, 0 == true ? 1 : 0));
        }

        public final C1313eablkybsjg iobyxmoadg(int i13, String str, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo errorType) {
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            return new C1313eablkybsjg(new wkgbmnqykc.iobyxmoadg(i13, str), nufgyqmvbuVar, errorType);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final dxjokdxxww lqeggnwhkg(int i13, nufgyqmvbu nufgyqmvbuVar, iobyxmoadg action) {
            zdlpuopuiu.btonecajqb(action, "action");
            return new dxjokdxxww(new wkgbmnqykc.iobyxmoadg(i13, null, 2, 0 == true ? 1 : 0), nufgyqmvbuVar, action);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final dxjokdxxww nufgyqmvbu(String text, nufgyqmvbu nufgyqmvbuVar, iobyxmoadg action) {
            zdlpuopuiu.btonecajqb(text, "text");
            zdlpuopuiu.btonecajqb(action, "action");
            return new dxjokdxxww(new wkgbmnqykc.zoijcleaow(text, null, 2, 0 == true ? 1 : 0), nufgyqmvbuVar, action);
        }

        public final C1313eablkybsjg zoijcleaow(String text, String str, nufgyqmvbu nufgyqmvbuVar, gxszxtbevo errorType) {
            zdlpuopuiu.btonecajqb(text, "text");
            zdlpuopuiu.btonecajqb(errorType, "errorType");
            return new C1313eablkybsjg(new wkgbmnqykc.zoijcleaow(text, str), nufgyqmvbuVar, errorType);
        }

        private zoijcleaow() {
        }
    }

    public /* synthetic */ eablkybsjg(wkgbmnqykc wkgbmnqykcVar, gtknphoqwx gtknphoqwxVar) {
        this(wkgbmnqykcVar);
    }

    public wkgbmnqykc iobyxmoadg() {
        return this.f63890iobyxmoadg;
    }

    private eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
        this.f63890iobyxmoadg = wkgbmnqykcVar;
    }

    public /* synthetic */ eablkybsjg(wkgbmnqykc wkgbmnqykcVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : wkgbmnqykcVar, null);
    }
}
