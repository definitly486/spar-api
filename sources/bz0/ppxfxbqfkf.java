package bz0;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends bz0.iobyxmoadg {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f17721wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f17722ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j01.zoijcleaow f17723zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(j01.zoijcleaow sharedPreferencesRepository, pkzmftpjix dispatcher) {
        super(dispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f17723zoijcleaow = sharedPreferencesRepository;
    }

    public final void agtfadlqog(boolean z13) {
        this.f17723zoijcleaow.dsvhmnatus(z13);
    }

    public final boolean btonecajqb() {
        return this.f17723zoijcleaow.btonecajqb();
    }

    public final boolean draadjrbmk() {
        return this.f17722ppxfxbqfkf;
    }

    public final boolean dxjokdxxww(String promoId) {
        zdlpuopuiu.btonecajqb(promoId, "promoId");
        if (promoId.length() <= 0 || zdlpuopuiu.eablkybsjg(this.f17723zoijcleaow.rgvfuqvkyq(), promoId)) {
            return false;
        }
        this.f17723zoijcleaow.lmojexxdyd(promoId);
        return true;
    }

    public final boolean gtknphoqwx() {
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateNufgyqmvbu = nufgyqmvbu();
        if (localDateNufgyqmvbu == null) {
            localDateNufgyqmvbu = LocalDate.now();
        }
        return localDateNow.compareTo((ChronoLocalDate) localDateNufgyqmvbu) >= 0;
    }

    public final LocalDate nufgyqmvbu() {
        return this.f17723zoijcleaow.yggfygwlhe();
    }

    public final void ojitshcjhn(boolean z13) {
        this.f17722ppxfxbqfkf = z13;
    }

    public final void rgvfuqvkyq() {
        this.f17723zoijcleaow.zdlpuopuiu(LocalDate.now().plusMonths(1L));
    }

    public final void vdvldrhtss() {
        wflxmlrfwp(LocalDate.now().plusWeeks(1L));
    }

    public final void wflxmlrfwp(LocalDate localDate) {
        this.f17723zoijcleaow.hcddaimhww(localDate);
    }
}
