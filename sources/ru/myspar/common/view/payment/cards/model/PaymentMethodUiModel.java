package ru.myspar.common.view.payment.cards.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/myspar/common/view/payment/cards/model/PaymentMethodUiModel;", "Landroid/os/Parcelable;", "", "id", "iconUrl", ExternalMetricsManagerImpl.NAME, "", "isSelected", "Ldu/iobyxmoadg;", "textStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdu/iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getId", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "getName", "iwizpuwonk", "Z", "wkgbmnqykc", "()Z", "cqumvgiudr", "Ldu/iobyxmoadg;", "ppxfxbqfkf", "()Ldu/iobyxmoadg;", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaymentMethodUiModel implements Parcelable {
    public static final Parcelable.Creator<PaymentMethodUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final du.iobyxmoadg textStyle;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String iconUrl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new PaymentMethodUiModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, du.iobyxmoadg.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final PaymentMethodUiModel[] newArray(int i13) {
            return new PaymentMethodUiModel[i13];
        }
    }

    public PaymentMethodUiModel(String id2, String iconUrl, String name, boolean z13, du.iobyxmoadg textStyle) {
        zdlpuopuiu.btonecajqb(id2, "id");
        zdlpuopuiu.btonecajqb(iconUrl, "iconUrl");
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(textStyle, "textStyle");
        this.id = id2;
        this.iconUrl = iconUrl;
        this.name = name;
        this.isSelected = z13;
        this.textStyle = textStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodUiModel)) {
            return false;
        }
        PaymentMethodUiModel paymentMethodUiModel = (PaymentMethodUiModel) other;
        return zdlpuopuiu.eablkybsjg(this.id, paymentMethodUiModel.id) && zdlpuopuiu.eablkybsjg(this.iconUrl, paymentMethodUiModel.iconUrl) && zdlpuopuiu.eablkybsjg(this.name, paymentMethodUiModel.name) && this.isSelected == paymentMethodUiModel.isSelected && this.textStyle == paymentMethodUiModel.textStyle;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.textStyle.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final du.iobyxmoadg getTextStyle() {
        return this.textStyle;
    }

    public String toString() {
        return "PaymentMethodUiModel(id=" + this.id + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", isSelected=" + this.isSelected + ", textStyle=" + this.textStyle + ")";
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.iconUrl);
        dest.writeString(this.name);
        dest.writeInt(this.isSelected ? 1 : 0);
        dest.writeString(this.textStyle.name());
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }
}
