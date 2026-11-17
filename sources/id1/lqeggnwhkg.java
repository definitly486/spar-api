package id1;

import gg.wwaezpbzkn;
import java.time.LocalDate;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes5.dex */
public final class lqeggnwhkg extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f42433ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f42434wkgbmnqykc = 8;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final j01.zoijcleaow f42435zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(j01.zoijcleaow sharedPreferencesRepository, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f42435zoijcleaow = sharedPreferencesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        j01.zoijcleaow zoijcleaowVar = this.f42435zoijcleaow;
        LocalDate localDateNow = LocalDate.now();
        zoijcleaowVar.zdlpuopuiu(localDateNow.plusMonths(1L));
        zoijcleaowVar.hcddaimhww(localDateNow.plusWeeks(1L));
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
