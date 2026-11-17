package xu0;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.proloyalty.components.payment.api.models.BenefitModel;
import ru.myspar.proloyalty.components.payment.api.models.PaymentModel;
import yu0.BenefitDto;
import yu0.BenefitModelEntity;
import yu0.PaymentModelDto;
import yu0.PaymentsModelEntity;

/* JADX INFO: loaded from: classes5.dex */
public abstract class iobyxmoadg {
    private static final PaymentModel eablkybsjg(PaymentModelDto paymentModelDto) {
        String code = paymentModelDto.getCode();
        String str = code == null ? "" : code;
        String name = paymentModelDto.getName();
        String str2 = name == null ? "" : name;
        String description = paymentModelDto.getDescription();
        String str3 = description == null ? "" : description;
        String additionalInfo = paymentModelDto.getAdditionalInfo();
        String str4 = additionalInfo == null ? "" : additionalInfo;
        Boolean supportedInput = paymentModelDto.getSupportedInput();
        boolean zBooleanValue = supportedInput != null ? supportedInput.booleanValue() : false;
        BenefitDto benefitModel = paymentModelDto.getBenefitModel();
        return new PaymentModel(str, str2, str3, str4, zBooleanValue, benefitModel != null ? ppxfxbqfkf(benefitModel) : null);
    }

    private static final BenefitModelEntity gxszxtbevo(BenefitModel benefitModel) {
        return new BenefitModelEntity(benefitModel.getLabelText(), benefitModel.getDescription());
    }

    public static final List iobyxmoadg(List list) {
        String name;
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentModelDto paymentModelDto = (PaymentModelDto) it.next();
            String code = paymentModelDto.getCode();
            if (code == null || kcexrzcfyt.zfvoamnweg(code) || (name = paymentModelDto.getName()) == null || kcexrzcfyt.zfvoamnweg(name)) {
                paymentModelDto = null;
            }
            PaymentModel paymentModelEablkybsjg = paymentModelDto != null ? eablkybsjg(paymentModelDto) : null;
            if (paymentModelEablkybsjg != null) {
                arrayList.add(paymentModelEablkybsjg);
            }
        }
        return arrayList;
    }

    public static final List lqeggnwhkg(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentModel paymentModel = (PaymentModel) it.next();
            String code = paymentModel.getCode();
            String name = paymentModel.getName();
            String description = paymentModel.getDescription();
            String additionalInfo = paymentModel.getAdditionalInfo();
            boolean supportedInput = paymentModel.getSupportedInput();
            BenefitModel benefitModel = paymentModel.getBenefitModel();
            arrayList.add(new PaymentsModelEntity(code, name, description, additionalInfo, supportedInput, benefitModel != null ? gxszxtbevo(benefitModel) : null));
        }
        return arrayList;
    }

    private static final BenefitModel ppxfxbqfkf(BenefitDto benefitDto) {
        String labelText = benefitDto.getLabelText();
        if (labelText == null) {
            labelText = "";
        }
        String description = benefitDto.getDescription();
        return new BenefitModel(labelText, description != null ? description : "");
    }

    private static final BenefitModel wkgbmnqykc(BenefitModelEntity benefitModelEntity) {
        return new BenefitModel(benefitModelEntity.getLabelText(), benefitModelEntity.getDescription());
    }

    public static final List zoijcleaow(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PaymentsModelEntity paymentsModelEntity = (PaymentsModelEntity) it.next();
            String code = paymentsModelEntity.getCode();
            String name = paymentsModelEntity.getName();
            String description = paymentsModelEntity.getDescription();
            String additionalInfo = paymentsModelEntity.getAdditionalInfo();
            boolean supportedInput = paymentsModelEntity.getSupportedInput();
            BenefitModelEntity benefitModel = paymentsModelEntity.getBenefitModel();
            arrayList.add(new PaymentModel(code, name, description, additionalInfo, supportedInput, benefitModel != null ? wkgbmnqykc(benefitModel) : null));
        }
        return arrayList;
    }
}
