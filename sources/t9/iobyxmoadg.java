package t9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q9.wflxmlrfwp;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final iobyxmoadg f110074eablkybsjg = new C2702iobyxmoadg().zoijcleaow();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final gxszxtbevo f110075iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final zoijcleaow f110076ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final String f110077wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f110078zoijcleaow;

    /* JADX INFO: renamed from: t9.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C2702iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private gxszxtbevo f110079iobyxmoadg = null;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private List f110082zoijcleaow = new ArrayList();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private zoijcleaow f110080ppxfxbqfkf = null;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f110081wkgbmnqykc = "";

        C2702iobyxmoadg() {
        }

        public C2702iobyxmoadg eablkybsjg(gxszxtbevo gxszxtbevoVar) {
            this.f110079iobyxmoadg = gxszxtbevoVar;
            return this;
        }

        public C2702iobyxmoadg iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            this.f110082zoijcleaow.add(wkgbmnqykcVar);
            return this;
        }

        public C2702iobyxmoadg ppxfxbqfkf(String str) {
            this.f110081wkgbmnqykc = str;
            return this;
        }

        public C2702iobyxmoadg wkgbmnqykc(zoijcleaow zoijcleaowVar) {
            this.f110080ppxfxbqfkf = zoijcleaowVar;
            return this;
        }

        public iobyxmoadg zoijcleaow() {
            return new iobyxmoadg(this.f110079iobyxmoadg, Collections.unmodifiableList(this.f110082zoijcleaow), this.f110080ppxfxbqfkf, this.f110081wkgbmnqykc);
        }
    }

    iobyxmoadg(gxszxtbevo gxszxtbevoVar, List list, zoijcleaow zoijcleaowVar, String str) {
        this.f110075iobyxmoadg = gxszxtbevoVar;
        this.f110078zoijcleaow = list;
        this.f110076ppxfxbqfkf = zoijcleaowVar;
        this.f110077wkgbmnqykc = str;
    }

    public static C2702iobyxmoadg eablkybsjg() {
        return new C2702iobyxmoadg();
    }

    public byte[] gxszxtbevo() {
        return wflxmlrfwp.iobyxmoadg(this);
    }

    public String iobyxmoadg() {
        return this.f110077wkgbmnqykc;
    }

    public List ppxfxbqfkf() {
        return this.f110078zoijcleaow;
    }

    public gxszxtbevo wkgbmnqykc() {
        return this.f110075iobyxmoadg;
    }

    public zoijcleaow zoijcleaow() {
        return this.f110076ppxfxbqfkf;
    }
}
