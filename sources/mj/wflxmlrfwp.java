package mj;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
final class wflxmlrfwp implements draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Matcher f67312iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f67313ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private List f67314wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CharSequence f67315zoijcleaow;

    public static final class iobyxmoadg extends hg.wkgbmnqykc {
        iobyxmoadg() {
        }

        public /* bridge */ int agtfadlqog(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ boolean btonecajqb(String str) {
            return super.contains(str);
        }

        @Override // hg.zoijcleaow, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return btonecajqb((String) obj);
            }
            return false;
        }

        @Override // hg.wkgbmnqykc, java.util.List
        /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
        public String get(int i13) {
            String strGroup = wflxmlrfwp.this.gxszxtbevo().group(i13);
            return strGroup == null ? "" : strGroup;
        }

        @Override // hg.wkgbmnqykc, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return agtfadlqog((String) obj);
            }
            return -1;
        }

        @Override // hg.wkgbmnqykc, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return ojitshcjhn((String) obj);
            }
            return -1;
        }

        public /* bridge */ int ojitshcjhn(String str) {
            return super.lastIndexOf(str);
        }

        @Override // hg.zoijcleaow
        public int wkgbmnqykc() {
            return wflxmlrfwp.this.gxszxtbevo().groupCount() + 1;
        }
    }

    public static final class zoijcleaow extends hg.zoijcleaow implements gtknphoqwx {
        zoijcleaow() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final btonecajqb agtfadlqog(zoijcleaow zoijcleaowVar, int i13) {
            return zoijcleaowVar.get(i13);
        }

        @Override // hg.zoijcleaow, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof btonecajqb) {
                return draadjrbmk((btonecajqb) obj);
            }
            return false;
        }

        public /* bridge */ boolean draadjrbmk(btonecajqb btonecajqbVar) {
            return super.contains(btonecajqbVar);
        }

        @Override // mj.gtknphoqwx
        public btonecajqb get(int i13) {
            zg.btonecajqb btonecajqbVarNufgyqmvbu = vdvldrhtss.nufgyqmvbu(wflxmlrfwp.this.gxszxtbevo(), i13);
            if (btonecajqbVarNufgyqmvbu.wflxmlrfwp().intValue() < 0) {
                return null;
            }
            String strGroup = wflxmlrfwp.this.gxszxtbevo().group(i13);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGroup, "group(...)");
            return new btonecajqb(strGroup, btonecajqbVarNufgyqmvbu);
        }

        @Override // hg.zoijcleaow, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return lj.wflxmlrfwp.dsvhmnatus(hg.jyumaefscl.ikoacuggdj(hg.jyumaefscl.agtfadlqog(this)), new tg.draadjrbmk() { // from class: mj.agtfadlqog
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return wflxmlrfwp.zoijcleaow.agtfadlqog(this.f67247zdlpuopuiu, ((Integer) obj).intValue());
                }
            }).iterator();
        }

        @Override // hg.zoijcleaow
        public int wkgbmnqykc() {
            return wflxmlrfwp.this.gxszxtbevo().groupCount() + 1;
        }
    }

    public wflxmlrfwp(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(matcher, "matcher");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(input, "input");
        this.f67312iobyxmoadg = matcher;
        this.f67315zoijcleaow = input;
        this.f67313ppxfxbqfkf = new zoijcleaow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult gxszxtbevo() {
        return this.f67312iobyxmoadg;
    }

    @Override // mj.draadjrbmk
    public String getValue() {
        String strGroup = gxszxtbevo().group();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strGroup, "group(...)");
        return strGroup;
    }

    @Override // mj.draadjrbmk
    public draadjrbmk.zoijcleaow iobyxmoadg() {
        return draadjrbmk.iobyxmoadg.iobyxmoadg(this);
    }

    @Override // mj.draadjrbmk
    public draadjrbmk next() {
        int iEnd = gxszxtbevo().end() + (gxszxtbevo().end() == gxszxtbevo().start() ? 1 : 0);
        if (iEnd > this.f67315zoijcleaow.length()) {
            return null;
        }
        Matcher matcher = this.f67312iobyxmoadg.pattern().matcher(this.f67315zoijcleaow);
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(matcher, "matcher(...)");
        return vdvldrhtss.eablkybsjg(matcher, iEnd, this.f67315zoijcleaow);
    }

    @Override // mj.draadjrbmk
    public zg.btonecajqb ppxfxbqfkf() {
        return vdvldrhtss.lqeggnwhkg(gxszxtbevo());
    }

    @Override // mj.draadjrbmk
    public gtknphoqwx wkgbmnqykc() {
        return this.f67313ppxfxbqfkf;
    }

    @Override // mj.draadjrbmk
    public List zoijcleaow() {
        if (this.f67314wkgbmnqykc == null) {
            this.f67314wkgbmnqykc = new iobyxmoadg();
        }
        List list = this.f67314wkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(list);
        return list;
    }
}
