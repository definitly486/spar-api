package i11;

import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final C0976iobyxmoadg f41702zoijcleaow = new C0976iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j01.zoijcleaow f41703iobyxmoadg;

    /* JADX INFO: renamed from: i11.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C0976iobyxmoadg {
        public /* synthetic */ C0976iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C0976iobyxmoadg() {
        }
    }

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f41704iobyxmoadg;

        public zoijcleaow(boolean z13) {
            this.f41704iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof zoijcleaow) && this.f41704iobyxmoadg == ((zoijcleaow) obj).f41704iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f41704iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f41704iobyxmoadg;
        }

        public String toString() {
            return "Params(isRegistration=" + this.f41704iobyxmoadg + ")";
        }
    }

    public iobyxmoadg(j01.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f41703iobyxmoadg = sharedPreferencesRepository;
    }

    private final void btonecajqb(int i13) {
        this.f41703iobyxmoadg.cdpycssgdh(i13);
    }

    private final void dxjokdxxww(LocalDateTime localDateTime) {
        this.f41703iobyxmoadg.jyumaefscl(localDateTime);
    }

    private final LocalDateTime eablkybsjg() {
        return this.f41703iobyxmoadg.jpowsppfya();
    }

    private final void gtknphoqwx() {
        btonecajqb(gxszxtbevo() + 1);
        dxjokdxxww(LocalDateTime.now().plusDays(2L));
    }

    private final int gxszxtbevo() {
        return this.f41703iobyxmoadg.lereixgezr();
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

    @Override // zr0.zoijcleaow
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
