package ow1;

import ru.myspar.proloyalty.user.domain.model.UserNews;

/* JADX INFO: loaded from: classes6.dex */
public final class yggfygwlhe extends zr0.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final iw1.iobyxmoadg f74995iobyxmoadg;

    public yggfygwlhe(iw1.iobyxmoadg userRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        this.f74995iobyxmoadg = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zr0.zoijcleaow
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public UserNews iobyxmoadg(gg.wwaezpbzkn parameters) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parameters, "parameters");
        UserNews userNewsCllcsxoeiz = this.f74995iobyxmoadg.cllcsxoeiz();
        return userNewsCllcsxoeiz == null ? UserNews.INSTANCE.iobyxmoadg() : userNewsCllcsxoeiz;
    }
}
