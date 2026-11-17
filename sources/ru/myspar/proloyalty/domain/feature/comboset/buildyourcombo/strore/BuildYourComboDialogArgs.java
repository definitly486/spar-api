package ru.myspar.proloyalty.domain.feature.comboset.buildyourcombo.strore;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.domain.models.comboset.ComboSet;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bH×\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"Lru/myspar/proloyalty/domain/feature/comboset/buildyourcombo/strore/BuildYourComboDialogArgs;", "Landroid/os/Parcelable;", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "comboSet", "", "selectedProductFirstId", "selectedProductSecondId", "<init>", "(Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "zoijcleaow", "()Lru/myspar/proloyalty/core/domain/models/comboset/ComboSet;", "yggfygwlhe", "Ljava/lang/String;", "getSelectedProductFirstId", "jyumaefscl", "getSelectedProductSecondId", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BuildYourComboDialogArgs implements Parcelable {
    public static final Parcelable.Creator<BuildYourComboDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f95481iwizpuwonk = 8;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedProductSecondId;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectedProductFirstId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboSet comboSet;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final BuildYourComboDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new BuildYourComboDialogArgs((ComboSet) parcel.readParcelable(BuildYourComboDialogArgs.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final BuildYourComboDialogArgs[] newArray(int i13) {
            return new BuildYourComboDialogArgs[i13];
        }
    }

    public BuildYourComboDialogArgs(ComboSet comboSet, String selectedProductFirstId, String selectedProductSecondId) {
        zdlpuopuiu.btonecajqb(comboSet, "comboSet");
        zdlpuopuiu.btonecajqb(selectedProductFirstId, "selectedProductFirstId");
        zdlpuopuiu.btonecajqb(selectedProductSecondId, "selectedProductSecondId");
        this.comboSet = comboSet;
        this.selectedProductFirstId = selectedProductFirstId;
        this.selectedProductSecondId = selectedProductSecondId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildYourComboDialogArgs)) {
            return false;
        }
        BuildYourComboDialogArgs buildYourComboDialogArgs = (BuildYourComboDialogArgs) other;
        return zdlpuopuiu.eablkybsjg(this.comboSet, buildYourComboDialogArgs.comboSet) && zdlpuopuiu.eablkybsjg(this.selectedProductFirstId, buildYourComboDialogArgs.selectedProductFirstId) && zdlpuopuiu.eablkybsjg(this.selectedProductSecondId, buildYourComboDialogArgs.selectedProductSecondId);
    }

    public int hashCode() {
        return (((this.comboSet.hashCode() * 31) + this.selectedProductFirstId.hashCode()) * 31) + this.selectedProductSecondId.hashCode();
    }

    public String toString() {
        return "BuildYourComboDialogArgs(comboSet=" + this.comboSet + ", selectedProductFirstId=" + this.selectedProductFirstId + ", selectedProductSecondId=" + this.selectedProductSecondId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.comboSet, flags);
        dest.writeString(this.selectedProductFirstId);
        dest.writeString(this.selectedProductSecondId);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final ComboSet getComboSet() {
        return this.comboSet;
    }
}
