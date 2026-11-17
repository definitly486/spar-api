package ry;

import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.components.payment.api.models.SbpRecurringBankAppModel;
import yz.SbpRecurringBankDto;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {
    public static final SbpRecurringBankAppModel iobyxmoadg(SbpRecurringBankDto sbpRecurringBankDto) {
        zdlpuopuiu.btonecajqb(sbpRecurringBankDto, "<this>");
        return new SbpRecurringBankAppModel(sbpRecurringBankDto.getBankName(), sbpRecurringBankDto.getLogoUrl(), sbpRecurringBankDto.getSchema(), sbpRecurringBankDto.getPackageName());
    }
}
