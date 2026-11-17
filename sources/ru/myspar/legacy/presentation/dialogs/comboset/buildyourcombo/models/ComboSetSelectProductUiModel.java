package ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.comboset.ComboSetProduct;
import s40.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H×\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H×\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0011\u0010\"\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010¨\u0006#"}, d2 = {"Lru/myspar/legacy/presentation/dialogs/comboset/buildyourcombo/models/ComboSetSelectProductUiModel;", "Landroid/os/Parcelable;", "Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "product", "", "isSelected", "<init>", "(Lru/myspar/core/domain/models/comboset/ComboSetProduct;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "ppxfxbqfkf", "()Lru/myspar/core/domain/models/comboset/ComboSetProduct;", "yggfygwlhe", "Z", "wkgbmnqykc", "()Z", "zoijcleaow", "checkedImageRes", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ComboSetSelectProductUiModel implements Parcelable {
    public static final Parcelable.Creator<ComboSetSelectProductUiModel> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final ComboSetProduct product;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ComboSetSelectProductUiModel createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ComboSetSelectProductUiModel((ComboSetProduct) parcel.readParcelable(ComboSetSelectProductUiModel.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ComboSetSelectProductUiModel[] newArray(int i13) {
            return new ComboSetSelectProductUiModel[i13];
        }
    }

    public ComboSetSelectProductUiModel(ComboSetProduct product, boolean z13) {
        zdlpuopuiu.btonecajqb(product, "product");
        this.product = product;
        this.isSelected = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComboSetSelectProductUiModel)) {
            return false;
        }
        ComboSetSelectProductUiModel comboSetSelectProductUiModel = (ComboSetSelectProductUiModel) other;
        return zdlpuopuiu.eablkybsjg(this.product, comboSetSelectProductUiModel.product) && this.isSelected == comboSetSelectProductUiModel.isSelected;
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final ComboSetProduct getProduct() {
        return this.product;
    }

    public String toString() {
        return "ComboSetSelectProductUiModel(product=" + this.product + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX INFO: renamed from: wkgbmnqykc, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeParcelable(this.product, flags);
        dest.writeInt(this.isSelected ? 1 : 0);
    }

    public final int zoijcleaow() {
        return this.isSelected ? gxszxtbevo.ic_radio_true_24 : gxszxtbevo.ic_radio_false_24;
    }
}
