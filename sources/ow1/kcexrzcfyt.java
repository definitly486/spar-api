package ow1;

import ru.myspar.proloyalty.user.domain.model.TokenInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class kcexrzcfyt extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iw1.iobyxmoadg f74931iobyxmoadg;

    public kcexrzcfyt(iw1.iobyxmoadg userRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        this.f74931iobyxmoadg = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public String iobyxmoadg(gg.wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        TokenInfo tokenInfoPmvmpeiblj = this.f74931iobyxmoadg.pmvmpeiblj();
        if (tokenInfoPmvmpeiblj != null) {
            return tokenInfoPmvmpeiblj.getToken();
        }
        return null;
    }
}
