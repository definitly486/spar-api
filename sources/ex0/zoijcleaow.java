package ex0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.error_handler.exceptions.DeliveryIntervalNotValidException;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.core.error_handler.exceptions.NoDeliveryAddressException;
import ru.myspar.proloyalty.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow {
    public final Exception iobyxmoadg(ErrorResponse error) {
        zdlpuopuiu.btonecajqb(error, "error");
        w21.iobyxmoadg.zoijcleaow zoijcleaowVar = w21.iobyxmoadg.f118588iobyxmoadg;
        String code = error.getCode();
        if (code == null) {
            code = "";
        }
        w21.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = zoijcleaowVar.iobyxmoadg(code);
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, w21.iobyxmoadg.wkgbmnqykc.f118606zoijcleaow)) {
            String message = error.getMessage();
            return new DeliveryIntervalNotValidException(message != null ? message : "");
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, w21.iobyxmoadg.eablkybsjg.f118594zoijcleaow)) {
            String message2 = error.getMessage();
            return new NoDeliveryAddressException(message2 != null ? message2 : "");
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, w21.iobyxmoadg.dxjokdxxww.f118592zoijcleaow)) {
            String message3 = error.getMessage();
            return new ProductDailyLimitException(message3 != null ? message3 : "");
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, w21.iobyxmoadg.lqeggnwhkg.f118602zoijcleaow) || zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, w21.iobyxmoadg.C2949iobyxmoadg.f118600zoijcleaow) || zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, w21.iobyxmoadg.gxszxtbevo.f118598zoijcleaow) || zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, w21.iobyxmoadg.gtknphoqwx.f118596zoijcleaow)) {
            return new DomainException(error.getMessage(), error.getCode());
        }
        throw new NoWhenBranchMatchedException();
    }
}
