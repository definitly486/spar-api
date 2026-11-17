package dg0;

import gg.wwaezpbzkn;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class wkgbmnqykc extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f28135ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f28136zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f28134wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f28133eablkybsjg = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(v10.zoijcleaow sharedPreferencesRepository, ca2.wkgbmnqykc userSharedPreferences, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f28136zoijcleaow = sharedPreferencesRepository;
        this.f28135ppxfxbqfkf = userSharedPreferences;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        boolean z13 = false;
        if (!this.f28135ppxfxbqfkf.nufgyqmvbu()) {
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        }
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateYadqdtsiqt = this.f28136zoijcleaow.yadqdtsiqt();
        if (localDateYadqdtsiqt == null) {
            this.f28136zoijcleaow.zdlpuopuiu(localDateNow.plusMonths(1L));
        } else if (localDateNow.compareTo((ChronoLocalDate) localDateYadqdtsiqt) >= 0) {
            z13 = true;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
