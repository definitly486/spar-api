package ow1;

import ru.myspar.proloyalty.user.domain.model.UserInfo;
import ru.myspar.proloyalty.user.domain.model.UserState;

/* JADX INFO: loaded from: classes6.dex */
public final class jpowsppfya extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iw1.iobyxmoadg f74925iobyxmoadg;

    public jpowsppfya(iw1.iobyxmoadg userRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        this.f74925iobyxmoadg = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String eablkybsjg(UserState it) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
        UserInfo userInfoAgeimvtcrz = it.ageimvtcrz();
        if (userInfoAgeimvtcrz != null) {
            return userInfoAgeimvtcrz.getPhone();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public sj.lqeggnwhkg iobyxmoadg(gg.wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        return sj.dxjokdxxww.kcexrzcfyt(this.f74925iobyxmoadg.tzroggbefp(), new tg.draadjrbmk() { // from class: ow1.hcddaimhww
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return jpowsppfya.eablkybsjg((UserState) obj);
            }
        });
    }
}
