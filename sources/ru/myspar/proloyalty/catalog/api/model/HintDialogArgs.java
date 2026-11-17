package ru.myspar.proloyalty.catalog.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.common.view.hint.model.HintDialogAnalyticsInfo;
import ru.myspar.proloyalty.common.view.hint.model.HintUiModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/myspar/proloyalty/catalog/api/model/HintDialogArgs;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;", "hint", "Lru/myspar/proloyalty/common/view/hint/model/HintDialogAnalyticsInfo;", "analyticsInfo", "<init>", "(Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;Lru/myspar/proloyalty/common/view/hint/model/HintDialogAnalyticsInfo;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/common/view/hint/model/HintUiModel;", "yggfygwlhe", "Lru/myspar/proloyalty/common/view/hint/model/HintDialogAnalyticsInfo;", "zoijcleaow", "()Lru/myspar/proloyalty/common/view/hint/model/HintDialogAnalyticsInfo;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HintDialogArgs implements Parcelable {
    public static final Parcelable.Creator<HintDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final HintDialogAnalyticsInfo analyticsInfo;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final HintUiModel hint;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final HintDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new HintDialogArgs((HintUiModel) parcel.readParcelable(HintDialogArgs.class.getClassLoader()), (HintDialogAnalyticsInfo) parcel.readParcelable(HintDialogArgs.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final HintDialogArgs[] newArray(int i13) {
            return new HintDialogArgs[i13];
        }
    }

    public HintDialogArgs(HintUiModel hint, HintDialogAnalyticsInfo analyticsInfo) {
        zdlpuopuiu.btonecajqb(hint, "hint");
        zdlpuopuiu.btonecajqb(analyticsInfo, "analyticsInfo");
        this.hint = hint;
        this.analyticsInfo = analyticsInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HintDialogArgs)) {
            return false;
        }
        HintDialogArgs hintDialogArgs = (HintDialogArgs) other;
        return zdlpuopuiu.eablkybsjg(this.hint, hintDialogArgs.hint) && zdlpuopuiu.eablkybsjg(this.analyticsInfo, hintDialogArgs.analyticsInfo);
    }

    public int hashCode() {
        return (this.hint.hashCode() * 31) + this.analyticsInfo.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final HintUiModel getHint() {
        return this.hint;
    }

    public String toString() {
        return "HintDialogArgs(hint=" + this.hint + ", analyticsInfo=" + this.analyticsInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.hint, flags);
        dest.writeParcelable(this.analyticsInfo, flags);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final HintDialogAnalyticsInfo getAnalyticsInfo() {
        return this.analyticsInfo;
    }
}
