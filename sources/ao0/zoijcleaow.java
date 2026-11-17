package ao0;

import gg.kcexrzcfyt;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.card.domain.model.UserBalance;
import ru.myspar.proloyalty.card.domain.model.UserBalanceBreakDown;
import ru.myspar.proloyalty.card.domain.model.UserCardData;
import xn0.UserBalanceBreakDownEntity;
import xn0.UserBalanceEntity;
import zn0.PersonalCardBalanceResponse;
import zn0.PersonalCardDataDtoResponse;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zoijcleaow {
    public static final UserCardData eablkybsjg(PersonalCardDataDtoResponse personalCardDataDtoResponse) {
        zdlpuopuiu.btonecajqb(personalCardDataDtoResponse, "<this>");
        return new UserCardData(personalCardDataDtoResponse.getPhoneNumber(), personalCardDataDtoResponse.getCardNumber(), personalCardDataDtoResponse.getConditions());
    }

    public static final UserBalance gxszxtbevo(List list) throws iobyxmoadg {
        Object next;
        zdlpuopuiu.btonecajqb(list, "<this>");
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((PersonalCardBalanceResponse) next).getCode(), "BNS"));
        PersonalCardBalanceResponse personalCardBalanceResponse = (PersonalCardBalanceResponse) next;
        if (personalCardBalanceResponse == null) {
            throw new iobyxmoadg();
        }
        String amount = personalCardBalanceResponse.getAmount();
        String str = amount == null ? "" : amount;
        String form = personalCardBalanceResponse.getForm();
        String str2 = form == null ? "" : form;
        String description = personalCardBalanceResponse.getDescription();
        String str3 = description == null ? "" : description;
        String rules = personalCardBalanceResponse.getRules();
        String str4 = rules == null ? "" : rules;
        PersonalCardBalanceResponse.BreakdownDto breakdown = personalCardBalanceResponse.getBreakdown();
        return new UserBalance(str, str2, str3, str4, breakdown != null ? wkgbmnqykc(breakdown) : null);
    }

    private static final LocalDate iobyxmoadg(String str) {
        Object objWkgbmnqykc;
        try {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar2 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
            objWkgbmnqykc = null;
        }
        return (LocalDate) objWkgbmnqykc;
    }

    private static final UserBalanceBreakDownEntity lqeggnwhkg(UserBalanceBreakDown userBalanceBreakDown) {
        return new UserBalanceBreakDownEntity(userBalanceBreakDown.getAmount(), userBalanceBreakDown.getDate());
    }

    public static final UserBalanceEntity nufgyqmvbu(UserBalance userBalance) {
        zdlpuopuiu.btonecajqb(userBalance, "<this>");
        String bonuses = userBalance.getBonuses();
        String form = userBalance.getForm();
        String desc = userBalance.getDesc();
        String rules = userBalance.getRules();
        UserBalanceBreakDown breakdown = userBalance.getBreakdown();
        return new UserBalanceEntity(bonuses, form, desc, rules, breakdown != null ? lqeggnwhkg(breakdown) : null);
    }

    private static final UserBalanceBreakDown ppxfxbqfkf(UserBalanceBreakDownEntity userBalanceBreakDownEntity) {
        return new UserBalanceBreakDown(userBalanceBreakDownEntity.getAmount(), userBalanceBreakDownEntity.getDate());
    }

    private static final UserBalanceBreakDown wkgbmnqykc(PersonalCardBalanceResponse.BreakdownDto breakdownDto) {
        String date = breakdownDto.getDate();
        LocalDate localDateIobyxmoadg = date != null ? iobyxmoadg(date) : null;
        if (localDateIobyxmoadg == null || breakdownDto.getAmount() == null || breakdownDto.getAmount().intValue() <= 0) {
            return null;
        }
        return new UserBalanceBreakDown(breakdownDto.getAmount().intValue(), localDateIobyxmoadg);
    }

    public static final UserBalance zoijcleaow(UserBalanceEntity userBalanceEntity) {
        zdlpuopuiu.btonecajqb(userBalanceEntity, "<this>");
        String bonuses = userBalanceEntity.getBonuses();
        String form = userBalanceEntity.getForm();
        String desc = userBalanceEntity.getDesc();
        String rules = userBalanceEntity.getRules();
        UserBalanceBreakDownEntity breakdown = userBalanceEntity.getBreakdown();
        return new UserBalance(bonuses, form, desc, rules, breakdown != null ? ppxfxbqfkf(breakdown) : null);
    }
}
