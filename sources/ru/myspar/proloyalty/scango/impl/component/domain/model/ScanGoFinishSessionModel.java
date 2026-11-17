package ru.myspar.proloyalty.scango.impl.component.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import bo1.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.scango.api.model.ScanGoCardPaymentArgs;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eH×\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0005\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0016¨\u0006*"}, d2 = {"Lru/myspar/proloyalty/scango/impl/component/domain/model/ScanGoFinishSessionModel;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/scango/api/model/ScanGoCardPaymentArgs;", "payload", "", "isSuccessful", "Lbo1/zoijcleaow;", "error", "", "errorMessage", "<init>", "(Lru/myspar/proloyalty/scango/api/model/ScanGoCardPaymentArgs;ZLbo1/zoijcleaow;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/scango/api/model/ScanGoCardPaymentArgs;", "getPayload", "()Lru/myspar/proloyalty/scango/api/model/ScanGoCardPaymentArgs;", "yggfygwlhe", "Z", "()Z", "jyumaefscl", "Lbo1/zoijcleaow;", "getError", "()Lbo1/zoijcleaow;", "iwizpuwonk", "Ljava/lang/String;", "getErrorMessage", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScanGoFinishSessionModel implements Parcelable {
    public static final Parcelable.Creator<ScanGoFinishSessionModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow error;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccessful;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScanGoCardPaymentArgs payload;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ScanGoFinishSessionModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ScanGoFinishSessionModel((ScanGoCardPaymentArgs) parcel.readParcelable(ScanGoFinishSessionModel.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : zoijcleaow.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ScanGoFinishSessionModel[] newArray(int i13) {
            return new ScanGoFinishSessionModel[i13];
        }
    }

    public ScanGoFinishSessionModel(ScanGoCardPaymentArgs scanGoCardPaymentArgs, boolean z13, zoijcleaow zoijcleaowVar, String str) {
        this.payload = scanGoCardPaymentArgs;
        this.isSuccessful = z13;
        this.error = zoijcleaowVar;
        this.errorMessage = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanGoFinishSessionModel)) {
            return false;
        }
        ScanGoFinishSessionModel scanGoFinishSessionModel = (ScanGoFinishSessionModel) other;
        return zdlpuopuiu.eablkybsjg(this.payload, scanGoFinishSessionModel.payload) && this.isSuccessful == scanGoFinishSessionModel.isSuccessful && this.error == scanGoFinishSessionModel.error && zdlpuopuiu.eablkybsjg(this.errorMessage, scanGoFinishSessionModel.errorMessage);
    }

    public int hashCode() {
        ScanGoCardPaymentArgs scanGoCardPaymentArgs = this.payload;
        int iHashCode = (((scanGoCardPaymentArgs == null ? 0 : scanGoCardPaymentArgs.hashCode()) * 31) + Boolean.hashCode(this.isSuccessful)) * 31;
        zoijcleaow zoijcleaowVar = this.error;
        int iHashCode2 = (iHashCode + (zoijcleaowVar == null ? 0 : zoijcleaowVar.hashCode())) * 31;
        String str = this.errorMessage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ScanGoFinishSessionModel(payload=" + this.payload + ", isSuccessful=" + this.isSuccessful + ", error=" + this.error + ", errorMessage=" + this.errorMessage + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.payload, flags);
        dest.writeInt(this.isSuccessful ? 1 : 0);
        zoijcleaow zoijcleaowVar = this.error;
        if (zoijcleaowVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(zoijcleaowVar.name());
        }
        dest.writeString(this.errorMessage);
    }
}
