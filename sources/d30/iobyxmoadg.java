package d30;

import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg extends ft.zoijcleaow {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final C0489iobyxmoadg f26887zoijcleaow = new C0489iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v10.zoijcleaow f26888iobyxmoadg;

    /* JADX INFO: renamed from: d30.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0489iobyxmoadg {
        public /* synthetic */ C0489iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0489iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f26889iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f26889iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f26889iobyxmoadg == ((zoijcleaow) obj).f26889iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f26889iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f26889iobyxmoadg;
        }

        public String toString() {
            return "Params(isRegistration=" + this.f26889iobyxmoadg + ")";
        }
    }

    public iobyxmoadg(v10.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f26888iobyxmoadg = sharedPreferencesRepository;
    }

    private final void btonecajqb(int i13) {
        this.f26888iobyxmoadg.cdpycssgdh(i13);
    }

    private final void dxjokdxxww(LocalDateTime localDateTime) {
        this.f26888iobyxmoadg.jyumaefscl(localDateTime);
    }

    private final LocalDateTime eablkybsjg() {
        return this.f26888iobyxmoadg.jpowsppfya();
    }

    private final void gtknphoqwx() {
        btonecajqb(gxszxtbevo() + 1);
        dxjokdxxww(LocalDateTime.now().plusDays(2L));
    }

    private final int gxszxtbevo() {
        return this.f26888iobyxmoadg.lereixgezr();
    }

    private final boolean lqeggnwhkg() {
        return gxszxtbevo() <= 2;
    }

    private final boolean nufgyqmvbu() {
        return lqeggnwhkg() && eablkybsjg() == null;
    }

    private final void ppxfxbqfkf() {
        btonecajqb(3);
        dxjokdxxww(null);
    }

    @Override // ft.zoijcleaow
    public /* bridge */ /* synthetic */ Object iobyxmoadg(Object obj) {
        wkgbmnqykc((zoijcleaow) obj);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    protected void wkgbmnqykc(zoijcleaow parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        if (nufgyqmvbu()) {
            if (parameters.iobyxmoadg()) {
                dxjokdxxww(LocalDateTime.now().plusMinutes(30L));
                return;
            } else {
                gtknphoqwx();
                return;
            }
        }
        if (gxszxtbevo() < 2) {
            gtknphoqwx();
        } else {
            ppxfxbqfkf();
        }
    }
}
