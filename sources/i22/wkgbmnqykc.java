package i22;

import gg.wwaezpbzkn;
import java.time.LocalDateTime;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
public final class wkgbmnqykc extends ft.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v10.zoijcleaow f41814iobyxmoadg;

    public wkgbmnqykc(v10.zoijcleaow sharedPreferencesRepository) {
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        this.f41814iobyxmoadg = sharedPreferencesRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ft.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Boolean iobyxmoadg(wwaezpbzkn parameters) {
        zdlpuopuiu.btonecajqb(parameters, "parameters");
        LocalDateTime localDateTimeIwizpuwonk = this.f41814iobyxmoadg.iwizpuwonk();
        return Boolean.valueOf(localDateTimeIwizpuwonk != null ? localDateTimeIwizpuwonk.isBefore(LocalDateTime.now()) : true);
    }
}
