package t9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final wkgbmnqykc f110097ppxfxbqfkf = new iobyxmoadg().iobyxmoadg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f110098iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f110099zoijcleaow;

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private String f110100iobyxmoadg = "";

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private List f110101zoijcleaow = new ArrayList();

        iobyxmoadg() {
        }

        public wkgbmnqykc iobyxmoadg() {
            return new wkgbmnqykc(this.f110100iobyxmoadg, Collections.unmodifiableList(this.f110101zoijcleaow));
        }

        public iobyxmoadg ppxfxbqfkf(String str) {
            this.f110100iobyxmoadg = str;
            return this;
        }

        public iobyxmoadg zoijcleaow(List list) {
            this.f110101zoijcleaow = list;
            return this;
        }
    }

    wkgbmnqykc(String str, List list) {
        this.f110098iobyxmoadg = str;
        this.f110099zoijcleaow = list;
    }

    public static iobyxmoadg ppxfxbqfkf() {
        return new iobyxmoadg();
    }

    public List iobyxmoadg() {
        return this.f110099zoijcleaow;
    }

    public String zoijcleaow() {
        return this.f110098iobyxmoadg;
    }
}
