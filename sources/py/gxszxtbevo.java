package py;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.cart.CartReceiver;
import zy.CartReceiverDto;
import zy.CartSetReceiverResultDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gxszxtbevo {
    public static final CartReceiver iobyxmoadg(CartReceiverDto cartReceiverDto) {
        zdlpuopuiu.btonecajqb(cartReceiverDto, "<this>");
        String name = cartReceiverDto.getName();
        if (name == null) {
            name = "";
        }
        String phone = cartReceiverDto.getPhone();
        return new CartReceiver(name, phone != null ? phone : "");
    }

    public static final CartReceiverDto ppxfxbqfkf(CartReceiver cartReceiver) {
        zdlpuopuiu.btonecajqb(cartReceiver, "<this>");
        return new CartReceiverDto(cartReceiver.getName(), cartReceiver.getPhone());
    }

    public static final CartReceiver zoijcleaow(CartSetReceiverResultDto cartSetReceiverResultDto) {
        zdlpuopuiu.btonecajqb(cartSetReceiverResultDto, "<this>");
        String name = cartSetReceiverResultDto.getReceiver().getName();
        if (name == null) {
            name = "";
        }
        String phone = cartSetReceiverResultDto.getReceiver().getPhone();
        return new CartReceiver(name, phone != null ? phone : "");
    }
}
