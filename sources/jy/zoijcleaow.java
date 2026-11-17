package jy;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.error_handler.exceptions.AvailableOnlyForPickupException;
import ru.myspar.core.error_handler.exceptions.DeliveryIntervalNotValidException;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.core.error_handler.exceptions.NoDeliveryAddressException;
import ru.myspar.core.error_handler.exceptions.ProductDailyLimitException;
import ru.myspar.core.network.model.ErrorResponse;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow {
    public final Exception iobyxmoadg(ErrorResponse error) {
        zdlpuopuiu.btonecajqb(error, "error");
        n40.iobyxmoadg.zoijcleaow zoijcleaowVar = n40.iobyxmoadg.f68764iobyxmoadg;
        String code = error.getCode();
        if (code == null) {
            code = "";
        }
        n40.iobyxmoadg.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg = zoijcleaowVar.iobyxmoadg(code);
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, n40.iobyxmoadg.wkgbmnqykc.f68780zoijcleaow)) {
            String message = error.getMessage();
            return new DeliveryIntervalNotValidException(message != null ? message : "");
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, n40.iobyxmoadg.eablkybsjg.f68770zoijcleaow)) {
            String message2 = error.getMessage();
            return new NoDeliveryAddressException(message2 != null ? message2 : "");
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, n40.iobyxmoadg.gxszxtbevo.f68772zoijcleaow)) {
            return new DomainException(error.getMessage(), error.getCode());
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, n40.iobyxmoadg.nufgyqmvbu.f68778zoijcleaow)) {
            String message3 = error.getMessage();
            return new ProductDailyLimitException(message3 != null ? message3 : "");
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, n40.iobyxmoadg.C1479iobyxmoadg.f68774zoijcleaow)) {
            String message4 = error.getMessage();
            return new AvailableOnlyForPickupException(message4 != null ? message4 : "");
        }
        if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarIobyxmoadg, n40.iobyxmoadg.btonecajqb.f68766zoijcleaow)) {
            return new DomainException(error.getMessage(), error.getCode());
        }
        throw new NoWhenBranchMatchedException();
    }
}
