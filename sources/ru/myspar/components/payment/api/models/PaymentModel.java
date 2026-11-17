package ru.myspar.components.payment.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/myspar/components/payment/api/models/PaymentModel;", "Landroid/os/Parcelable;", "", "code", ExternalMetricsManagerImpl.NAME, "description", "additionalInfo", "", "supportedInput", "Lru/myspar/components/payment/api/models/BenefitModel;", "benefitModel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLru/myspar/components/payment/api/models/BenefitModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "getName", "jyumaefscl", "gxszxtbevo", "iwizpuwonk", "zoijcleaow", "cqumvgiudr", "Z", "lqeggnwhkg", "()Z", "esjtqupxsv", "Lru/myspar/components/payment/api/models/BenefitModel;", "ppxfxbqfkf", "()Lru/myspar/components/payment/api/models/BenefitModel;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentModel implements Parcelable {
    public static final Parcelable.Creator<PaymentModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean supportedInput;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final BenefitModel benefitModel;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String additionalInfo;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PaymentModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PaymentModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : BenefitModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PaymentModel[] newArray(int i13) {
            return new PaymentModel[i13];
        }
    }

    public PaymentModel(String code, String name, String description, String additionalInfo, boolean z13, BenefitModel benefitModel) {
        zdlpuopuiu.btonecajqb(code, "code");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(description, "description");
        zdlpuopuiu.btonecajqb(additionalInfo, "additionalInfo");
        this.code = code;
        this.name = name;
        this.description = description;
        this.additionalInfo = additionalInfo;
        this.supportedInput = z13;
        this.benefitModel = benefitModel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentModel)) {
            return false;
        }
        PaymentModel paymentModel = (PaymentModel) other;
        return zdlpuopuiu.eablkybsjg(this.code, paymentModel.code) && zdlpuopuiu.eablkybsjg(this.name, paymentModel.name) && zdlpuopuiu.eablkybsjg(this.description, paymentModel.description) && zdlpuopuiu.eablkybsjg(this.additionalInfo, paymentModel.additionalInfo) && this.supportedInput == paymentModel.supportedInput && zdlpuopuiu.eablkybsjg(this.benefitModel, paymentModel.benefitModel);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.additionalInfo.hashCode()) * 31) + Boolean.hashCode(this.supportedInput)) * 31;
        BenefitModel benefitModel = this.benefitModel;
        return iHashCode + (benefitModel == null ? 0 : benefitModel.hashCode());
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final boolean getSupportedInput() {
        return this.supportedInput;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final BenefitModel getBenefitModel() {
        return this.benefitModel;
    }

    public String toString() {
        return "PaymentModel(code=" + this.code + ", name=" + this.name + ", description=" + this.description + ", additionalInfo=" + this.additionalInfo + ", supportedInput=" + this.supportedInput + ", benefitModel=" + this.benefitModel + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.additionalInfo);
        dest.writeInt(this.supportedInput ? 1 : 0);
        BenefitModel benefitModel = this.benefitModel;
        if (benefitModel == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            benefitModel.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }
}
