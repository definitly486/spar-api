package id1;

import gg.wwaezpbzkn;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.esjtqupxsv;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final esjtqupxsv f42438ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j01.zoijcleaow f42439zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final iobyxmoadg f42437wkgbmnqykc = new iobyxmoadg(null);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final int f42436eablkybsjg = 8;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(j01.zoijcleaow sharedPreferencesRepository, esjtqupxsv isAuthUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f42439zoijcleaow = sharedPreferencesRepository;
        this.f42438ppxfxbqfkf = isAuthUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        boolean z13 = false;
        if (!((Boolean) this.f42438ppxfxbqfkf.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
            return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        }
        LocalDate localDateNow = LocalDate.now();
        LocalDate localDateYadqdtsiqt = this.f42439zoijcleaow.yadqdtsiqt();
        if (localDateYadqdtsiqt == null) {
            this.f42439zoijcleaow.zdlpuopuiu(localDateNow.plusMonths(1L));
        } else if (localDateNow.compareTo((ChronoLocalDate) localDateYadqdtsiqt) >= 0) {
            z13 = true;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(z13);
    }
}
