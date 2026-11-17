package ru.myspar.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cB\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/auth/api/model/NonAuthorizedPayload;", "Landroid/os/Parcelable;", "Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "errorType", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "result", "<init>", "(Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;Lru/myspar/auth/api/model/AuthorizationFlowResult;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "zoijcleaow", "()Lru/myspar/auth/api/model/NonAuthorizedPayload$zoijcleaow;", "yggfygwlhe", "Lru/myspar/auth/api/model/AuthorizationFlowResult;", "ppxfxbqfkf", "()Lru/myspar/auth/api/model/AuthorizationFlowResult;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NonAuthorizedPayload implements Parcelable {
    public static final Parcelable.Creator<NonAuthorizedPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final AuthorizationFlowResult result;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow errorType;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final NonAuthorizedPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new NonAuthorizedPayload(zoijcleaow.valueOf(parcel.readString()), (AuthorizationFlowResult) parcel.readParcelable(NonAuthorizedPayload.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final NonAuthorizedPayload[] newArray(int i13) {
            return new NonAuthorizedPayload[i13];
        }
    }

    public enum zoijcleaow {
        FAST_DELIVERY,
        PROMO,
        BUY,
        FAVORITE,
        PROFILE,
        DEFAULT,
        CATALOG;


        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f84387zynmafqrjb = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public NonAuthorizedPayload(zoijcleaow errorType, AuthorizationFlowResult authorizationFlowResult) {
        zdlpuopuiu.btonecajqb(errorType, "errorType");
        this.errorType = errorType;
        this.result = authorizationFlowResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonAuthorizedPayload)) {
            return false;
        }
        NonAuthorizedPayload nonAuthorizedPayload = (NonAuthorizedPayload) other;
        return this.errorType == nonAuthorizedPayload.errorType && zdlpuopuiu.eablkybsjg(this.result, nonAuthorizedPayload.result);
    }

    public int hashCode() {
        int iHashCode = this.errorType.hashCode() * 31;
        AuthorizationFlowResult authorizationFlowResult = this.result;
        return iHashCode + (authorizationFlowResult == null ? 0 : authorizationFlowResult.hashCode());
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final AuthorizationFlowResult getResult() {
        return this.result;
    }

    public String toString() {
        return "NonAuthorizedPayload(errorType=" + this.errorType + ", result=" + this.result + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.errorType.name());
        dest.writeParcelable(this.result, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final zoijcleaow getErrorType() {
        return this.errorType;
    }

    public /* synthetic */ NonAuthorizedPayload(zoijcleaow zoijcleaowVar, AuthorizationFlowResult authorizationFlowResult, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? zoijcleaow.DEFAULT : zoijcleaowVar, (i13 & 2) != 0 ? null : authorizationFlowResult);
    }
}
