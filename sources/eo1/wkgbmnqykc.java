package eo1;

import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final j01.zoijcleaow f31660iobyxmoadg;

    public wkgbmnqykc(j01.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f31660iobyxmoadg = sharedPreferencesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Boolean iobyxmoadg(wwaezpbzkn parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        LocalDateTime localDateTimeIwizpuwonk = this.f31660iobyxmoadg.iwizpuwonk();
        return Boolean.valueOf(localDateTimeIwizpuwonk != null ? localDateTimeIwizpuwonk.isBefore(LocalDateTime.now()) : true);
    }
}
