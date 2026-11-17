package ru.myspar.components.payment.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0015¨\u0006%"}, d2 = {"Lru/myspar/components/payment/api/models/SbpRecurringBankAppModel;", "Landroid/os/Parcelable;", "", "bankName", "logoUrl", "schema", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/myspar/components/payment/api/models/SbpRecurringBankAppModel;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "eablkybsjg", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "nufgyqmvbu", "iwizpuwonk", "lqeggnwhkg", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SbpRecurringBankAppModel implements Parcelable {
    public static final Parcelable.Creator<SbpRecurringBankAppModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String packageName;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String schema;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String logoUrl;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bankName;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final SbpRecurringBankAppModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new SbpRecurringBankAppModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final SbpRecurringBankAppModel[] newArray(int i13) {
            return new SbpRecurringBankAppModel[i13];
        }
    }

    public SbpRecurringBankAppModel(String bankName, String logoUrl, String schema, String packageName) {
        zdlpuopuiu.btonecajqb(bankName, "bankName");
        zdlpuopuiu.btonecajqb(logoUrl, "logoUrl");
        zdlpuopuiu.btonecajqb(schema, "schema");
        zdlpuopuiu.btonecajqb(packageName, "packageName");
        this.bankName = bankName;
        this.logoUrl = logoUrl;
        this.schema = schema;
        this.packageName = packageName;
    }

    public static /* synthetic */ SbpRecurringBankAppModel ppxfxbqfkf(SbpRecurringBankAppModel sbpRecurringBankAppModel, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sbpRecurringBankAppModel.bankName;
        }
        if ((i13 & 2) != 0) {
            str2 = sbpRecurringBankAppModel.logoUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = sbpRecurringBankAppModel.schema;
        }
        if ((i13 & 8) != 0) {
            str4 = sbpRecurringBankAppModel.packageName;
        }
        return sbpRecurringBankAppModel.zoijcleaow(str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbpRecurringBankAppModel)) {
            return false;
        }
        SbpRecurringBankAppModel sbpRecurringBankAppModel = (SbpRecurringBankAppModel) other;
        return zdlpuopuiu.eablkybsjg(this.bankName, sbpRecurringBankAppModel.bankName) && zdlpuopuiu.eablkybsjg(this.logoUrl, sbpRecurringBankAppModel.logoUrl) && zdlpuopuiu.eablkybsjg(this.schema, sbpRecurringBankAppModel.schema) && zdlpuopuiu.eablkybsjg(this.packageName, sbpRecurringBankAppModel.packageName);
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public int hashCode() {
        return (((((this.bankName.hashCode() * 31) + this.logoUrl.hashCode()) * 31) + this.schema.hashCode()) * 31) + this.packageName.hashCode();
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getSchema() {
        return this.schema;
    }

    public String toString() {
        return "SbpRecurringBankAppModel(bankName=" + this.bankName + ", logoUrl=" + this.logoUrl + ", schema=" + this.schema + ", packageName=" + this.packageName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.bankName);
        dest.writeString(this.logoUrl);
        dest.writeString(this.schema);
        dest.writeString(this.packageName);
    }

    public final SbpRecurringBankAppModel zoijcleaow(String bankName, String logoUrl, String schema, String packageName) {
        zdlpuopuiu.btonecajqb(bankName, "bankName");
        zdlpuopuiu.btonecajqb(logoUrl, "logoUrl");
        zdlpuopuiu.btonecajqb(schema, "schema");
        zdlpuopuiu.btonecajqb(packageName, "packageName");
        return new SbpRecurringBankAppModel(bankName, logoUrl, schema, packageName);
    }
}
