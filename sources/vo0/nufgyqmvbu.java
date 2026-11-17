package vo0;

import ru.myspar.proloyalty.core.domain.models.cart.CartReceiver;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements tg.draadjrbmk {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final iobyxmoadg f117594zdlpuopuiu = new iobyxmoadg(null);

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public wo0.eablkybsjg invoke(CartReceiver cartReceiver) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cartReceiver, "cartReceiver");
        String name = cartReceiver.getName();
        String phone = cartReceiver.getPhone();
        String str = null;
        if (mj.kcexrzcfyt.zfvoamnweg(phone)) {
            phone = null;
        }
        if (phone != null) {
            if (!mj.kcexrzcfyt.stevsuqkhv(phone, "+", false, 2, null)) {
                phone = "+" + phone;
            }
            str = phone;
        }
        if (str == null) {
            str = "";
        }
        return new wo0.eablkybsjg(name, str);
    }
}
