package nf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.pandulapeter.beagle.common.configuration.Text;
import gg.wwaezpbzkn;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog implements jf.iobyxmoadg {

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public static final zoijcleaow f69848wflxmlrfwp = new zoijcleaow(null);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final String f69849btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final tg.draadjrbmk f69850draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final tg.draadjrbmk f69851dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f69852eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f69853gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final boolean f69854gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.draadjrbmk f69855iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final boolean f69856lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final String f69857nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f69858ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f69859wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f69860zoijcleaow;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f69861zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((p002if.zoijcleaow) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(p002if.zoijcleaow zoijcleaowVar) {
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.draadjrbmk {
        ppxfxbqfkf() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void invoke(String newValue) {
            zdlpuopuiu.btonecajqb(newValue, "newValue");
            agtfadlqog.this.zoijcleaow().invoke(agtfadlqog.this.wkgbmnqykc(newValue));
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.draadjrbmk {
        wkgbmnqykc() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Text invoke(String it) {
            zdlpuopuiu.btonecajqb(it, "it");
            return (Text) agtfadlqog.this.ppxfxbqfkf().invoke(agtfadlqog.this.wkgbmnqykc(it));
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private zoijcleaow() {
        }
    }

    public agtfadlqog(tg.draadjrbmk title, List items, String str, boolean z13, boolean z14, boolean z15, boolean z16, String id2, tg.draadjrbmk onSelectionChanged) {
        zdlpuopuiu.btonecajqb(title, "title");
        zdlpuopuiu.btonecajqb(items, "items");
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(onSelectionChanged, "onSelectionChanged");
        this.f69855iobyxmoadg = title;
        this.f69860zoijcleaow = items;
        this.f69858ppxfxbqfkf = str;
        this.f69859wkgbmnqykc = z13;
        this.f69852eablkybsjg = z14;
        this.f69854gxszxtbevo = z15;
        this.f69856lqeggnwhkg = z16;
        this.f69857nufgyqmvbu = id2;
        this.f69851dxjokdxxww = onSelectionChanged;
        this.f69849btonecajqb = str == null ? "" : str;
        this.f69853gtknphoqwx = new ppxfxbqfkf();
        this.f69850draadjrbmk = new wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p002if.zoijcleaow wkgbmnqykc(String str) {
        Object next;
        Iterator it = this.f69860zoijcleaow.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (zdlpuopuiu.eablkybsjg(((p002if.zoijcleaow) next).getId(), str)) {
                return (p002if.zoijcleaow) next;
            }
        }
        next = null;
        return (p002if.zoijcleaow) next;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtfadlqog)) {
            return false;
        }
        agtfadlqog agtfadlqogVar = (agtfadlqog) obj;
        return zdlpuopuiu.eablkybsjg(this.f69855iobyxmoadg, agtfadlqogVar.f69855iobyxmoadg) && zdlpuopuiu.eablkybsjg(this.f69860zoijcleaow, agtfadlqogVar.f69860zoijcleaow) && zdlpuopuiu.eablkybsjg(this.f69858ppxfxbqfkf, agtfadlqogVar.f69858ppxfxbqfkf) && this.f69859wkgbmnqykc == agtfadlqogVar.f69859wkgbmnqykc && this.f69852eablkybsjg == agtfadlqogVar.f69852eablkybsjg && this.f69854gxszxtbevo == agtfadlqogVar.f69854gxszxtbevo && this.f69856lqeggnwhkg == agtfadlqogVar.f69856lqeggnwhkg && zdlpuopuiu.eablkybsjg(this.f69857nufgyqmvbu, agtfadlqogVar.f69857nufgyqmvbu) && zdlpuopuiu.eablkybsjg(this.f69851dxjokdxxww, agtfadlqogVar.f69851dxjokdxxww);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.f69855iobyxmoadg.hashCode() * 31) + this.f69860zoijcleaow.hashCode()) * 31;
        String str = this.f69858ppxfxbqfkf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z13 = this.f69859wkgbmnqykc;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (iHashCode2 + r13) * 31;
        boolean z14 = this.f69852eablkybsjg;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (i13 + r14) * 31;
        boolean z15 = this.f69854gxszxtbevo;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (i14 + r15) * 31;
        boolean z16 = this.f69856lqeggnwhkg;
        return ((((i15 + (z16 ? 1 : z16)) * 31) + this.f69857nufgyqmvbu.hashCode()) * 31) + this.f69851dxjokdxxww.hashCode();
    }

    public final tg.draadjrbmk ppxfxbqfkf() {
        return this.f69855iobyxmoadg;
    }

    public String toString() {
        return "SingleSelectionListModule(title=" + this.f69855iobyxmoadg + ", items=" + this.f69860zoijcleaow + ", initiallySelectedItemId=" + this.f69858ppxfxbqfkf + ", isEnabled=" + this.f69859wkgbmnqykc + ", isValuePersisted=" + this.f69852eablkybsjg + ", shouldRequireConfirmation=" + this.f69854gxszxtbevo + ", isExpandedInitially=" + this.f69856lqeggnwhkg + ", id=" + this.f69857nufgyqmvbu + ", onSelectionChanged=" + this.f69851dxjokdxxww + ")";
    }

    public final tg.draadjrbmk zoijcleaow() {
        return this.f69851dxjokdxxww;
    }

    public /* synthetic */ agtfadlqog(tg.draadjrbmk draadjrbmkVar, List list, String str, boolean z13, boolean z14, boolean z15, boolean z16, String str2, tg.draadjrbmk draadjrbmkVar2, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(draadjrbmkVar, list, str, (i13 & 8) != 0 ? true : z13, (i13 & 16) != 0 ? false : z14, (i13 & 32) != 0 ? false : z15, (i13 & 64) != 0 ? false : z16, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? kf.ppxfxbqfkf.zoijcleaow() : str2, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? iobyxmoadg.f69861zdlpuopuiu : draadjrbmkVar2);
    }
}
