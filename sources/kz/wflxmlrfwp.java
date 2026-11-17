package kz;

import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes4.dex */
final class wflxmlrfwp extends gk.nufgyqmvbu {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final wflxmlrfwp f61153ppxfxbqfkf = new wflxmlrfwp();

    private wflxmlrfwp() {
        super(cllcsxoeiz.zoijcleaow(lqeggnwhkg.class));
    }

    @Override // gk.nufgyqmvbu
    protected bk.iobyxmoadg gxszxtbevo(gk.btonecajqb element) {
        zdlpuopuiu.btonecajqb(element, "element");
        throw new SerializationException("Класс ChangeCartRequest используется только для запросов и не может быть десериализован");
    }
}
