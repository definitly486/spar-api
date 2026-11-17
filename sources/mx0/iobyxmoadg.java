package mx0;

import kotlin.jvm.internal.zdlpuopuiu;
import qy0.SbpRecurringBankDto;
import ru.myspar.proloyalty.components.payment.api.models.SbpRecurringBankAppModel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    public static final SbpRecurringBankAppModel iobyxmoadg(SbpRecurringBankDto sbpRecurringBankDto) {
        zdlpuopuiu.btonecajqb(sbpRecurringBankDto, "<this>");
        return new SbpRecurringBankAppModel(sbpRecurringBankDto.getBankName(), sbpRecurringBankDto.getLogoUrl(), sbpRecurringBankDto.getSchema(), sbpRecurringBankDto.getPackageName());
    }
}
