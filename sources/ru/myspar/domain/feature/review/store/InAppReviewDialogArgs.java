package ru.myspar.domain.feature.review.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/myspar/domain/feature/review/store/InAppReviewDialogArgs;", "Landroid/os/Parcelable;", "Lru/myspar/domain/feature/review/store/InAppReviewDialogArgs$zoijcleaow;", "flow", "<init>", "(Lru/myspar/domain/feature/review/store/InAppReviewDialogArgs$zoijcleaow;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/domain/feature/review/store/InAppReviewDialogArgs$zoijcleaow;", "zoijcleaow", "()Lru/myspar/domain/feature/review/store/InAppReviewDialogArgs$zoijcleaow;", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InAppReviewDialogArgs implements Parcelable {
    public static final Parcelable.Creator<InAppReviewDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final zoijcleaow flow;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final InAppReviewDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new InAppReviewDialogArgs(zoijcleaow.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final InAppReviewDialogArgs[] newArray(int i13) {
            return new InAppReviewDialogArgs[i13];
        }
    }

    public enum zoijcleaow {
        DEFAULT,
        RATE_ORDER;


        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private static final /* synthetic */ ng.iobyxmoadg f87824iwizpuwonk = ng.zoijcleaow.iobyxmoadg(iobyxmoadg());
    }

    public InAppReviewDialogArgs(zoijcleaow flow) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        this.flow = flow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InAppReviewDialogArgs) && this.flow == ((InAppReviewDialogArgs) other).flow;
    }

    public int hashCode() {
        return this.flow.hashCode();
    }

    public String toString() {
        return "InAppReviewDialogArgs(flow=" + this.flow + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final zoijcleaow getFlow() {
        return this.flow;
    }

    public /* synthetic */ InAppReviewDialogArgs(zoijcleaow zoijcleaowVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? zoijcleaow.DEFAULT : zoijcleaowVar);
    }
}
