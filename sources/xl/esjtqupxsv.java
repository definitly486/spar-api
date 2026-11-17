package xl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class esjtqupxsv {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final zoijcleaow f122660ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    static final esjtqupxsv f122661wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f122662iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final zoijcleaow f122663zoijcleaow;

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final iobyxmoadg f122664ppxfxbqfkf;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final esjtqupxsv f122665iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final esjtqupxsv f122666zoijcleaow;

        static {
            esjtqupxsv esjtqupxsvVar = esjtqupxsv.f122661wkgbmnqykc;
            f122664ppxfxbqfkf = new iobyxmoadg(esjtqupxsvVar, esjtqupxsvVar);
        }

        public iobyxmoadg(esjtqupxsv esjtqupxsvVar, esjtqupxsv esjtqupxsvVar2) {
            this.f122665iobyxmoadg = esjtqupxsvVar;
            this.f122666zoijcleaow = esjtqupxsvVar2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            if (this.f122665iobyxmoadg.equals(iobyxmoadgVar.f122665iobyxmoadg)) {
                return this.f122666zoijcleaow.equals(iobyxmoadgVar.f122666zoijcleaow);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f122665iobyxmoadg, this.f122666zoijcleaow);
        }

        public esjtqupxsv iobyxmoadg() {
            return this.f122665iobyxmoadg;
        }

        public String toString() {
            StringBuilder sbEablkybsjg = wl.kcexrzcfyt.eablkybsjg();
            sbEablkybsjg.append(this.f122665iobyxmoadg);
            sbEablkybsjg.append('=');
            sbEablkybsjg.append(this.f122666zoijcleaow);
            return wl.kcexrzcfyt.esjtqupxsv(sbEablkybsjg);
        }
    }

    public static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f122667iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f122668ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int f122669zoijcleaow;

        public zoijcleaow(int i13, int i14, int i15) {
            this.f122667iobyxmoadg = i13;
            this.f122669zoijcleaow = i14;
            this.f122668ppxfxbqfkf = i15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
            return this.f122667iobyxmoadg == zoijcleaowVar.f122667iobyxmoadg && this.f122669zoijcleaow == zoijcleaowVar.f122669zoijcleaow && this.f122668ppxfxbqfkf == zoijcleaowVar.f122668ppxfxbqfkf;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f122667iobyxmoadg), Integer.valueOf(this.f122669zoijcleaow), Integer.valueOf(this.f122668ppxfxbqfkf));
        }

        public String toString() {
            return this.f122669zoijcleaow + StringUtils.COMMA + this.f122668ppxfxbqfkf + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f122667iobyxmoadg;
        }
    }

    static {
        zoijcleaow zoijcleaowVar = new zoijcleaow(-1, -1, -1);
        f122660ppxfxbqfkf = zoijcleaowVar;
        f122661wkgbmnqykc = new esjtqupxsv(zoijcleaowVar, zoijcleaowVar);
    }

    public esjtqupxsv(zoijcleaow zoijcleaowVar, zoijcleaow zoijcleaowVar2) {
        this.f122662iobyxmoadg = zoijcleaowVar;
        this.f122663zoijcleaow = zoijcleaowVar2;
    }

    static esjtqupxsv zoijcleaow(zdlpuopuiu zdlpuopuiuVar, boolean z13) {
        Object objLmojexxdyd;
        String str = z13 ? "jsoup.start" : "jsoup.end";
        if (zdlpuopuiuVar.iwizpuwonk() && (objLmojexxdyd = zdlpuopuiuVar.eablkybsjg().lmojexxdyd(str)) != null) {
            return (esjtqupxsv) objLmojexxdyd;
        }
        return f122661wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        esjtqupxsv esjtqupxsvVar = (esjtqupxsv) obj;
        if (this.f122662iobyxmoadg.equals(esjtqupxsvVar.f122662iobyxmoadg)) {
            return this.f122663zoijcleaow.equals(esjtqupxsvVar.f122663zoijcleaow);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f122662iobyxmoadg, this.f122663zoijcleaow);
    }

    public boolean iobyxmoadg() {
        return this != f122661wkgbmnqykc;
    }

    public String toString() {
        return this.f122662iobyxmoadg + "-" + this.f122663zoijcleaow;
    }
}
