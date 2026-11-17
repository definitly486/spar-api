package v2;

import java.util.Objects;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f115682iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f115683ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final String f115684wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f115685zoijcleaow;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final wflxmlrfwp f115678eablkybsjg = new zoijcleaow(0).eablkybsjg();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final String f115679gxszxtbevo = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final String f115680lqeggnwhkg = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final String f115681nufgyqmvbu = stevsuqkhv.uawqvzlxes(2);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final String f115677dxjokdxxww = stevsuqkhv.uawqvzlxes(3);

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f115686iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f115687ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f115688wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f115689zoijcleaow;

        public zoijcleaow(int i13) {
            this.f115686iobyxmoadg = i13;
        }

        public wflxmlrfwp eablkybsjg() {
            y2.iobyxmoadg.iobyxmoadg(this.f115689zoijcleaow <= this.f115687ppxfxbqfkf);
            return new wflxmlrfwp(this);
        }

        public zoijcleaow gxszxtbevo(int i13) {
            this.f115687ppxfxbqfkf = i13;
            return this;
        }

        public zoijcleaow lqeggnwhkg(int i13) {
            this.f115689zoijcleaow = i13;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wflxmlrfwp)) {
            return false;
        }
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) obj;
        return this.f115682iobyxmoadg == wflxmlrfwpVar.f115682iobyxmoadg && this.f115685zoijcleaow == wflxmlrfwpVar.f115685zoijcleaow && this.f115683ppxfxbqfkf == wflxmlrfwpVar.f115683ppxfxbqfkf && Objects.equals(this.f115684wkgbmnqykc, wflxmlrfwpVar.f115684wkgbmnqykc);
    }

    public int hashCode() {
        int i13 = (((((527 + this.f115682iobyxmoadg) * 31) + this.f115685zoijcleaow) * 31) + this.f115683ppxfxbqfkf) * 31;
        String str = this.f115684wkgbmnqykc;
        return i13 + (str == null ? 0 : str.hashCode());
    }

    private wflxmlrfwp(zoijcleaow zoijcleaowVar) {
        this.f115682iobyxmoadg = zoijcleaowVar.f115686iobyxmoadg;
        this.f115685zoijcleaow = zoijcleaowVar.f115689zoijcleaow;
        this.f115683ppxfxbqfkf = zoijcleaowVar.f115687ppxfxbqfkf;
        this.f115684wkgbmnqykc = zoijcleaowVar.f115688wkgbmnqykc;
    }
}
