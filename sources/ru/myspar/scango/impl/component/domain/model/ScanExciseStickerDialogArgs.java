package ru.myspar.scango.impl.component.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H×\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rH×\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/myspar/scango/impl/component/domain/model/ScanExciseStickerDialogArgs;", "Landroid/os/Parcelable;", "", "isRemove", "isWeightProduct", "Lru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;", "product", "Lf22/iobyxmoadg;", "scanGoAmountMode", "<init>", "(ZZLru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;Lf22/iobyxmoadg;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Z", "eablkybsjg", "()Z", "yggfygwlhe", "gxszxtbevo", "jyumaefscl", "Lru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;", "zoijcleaow", "()Lru/myspar/scango/impl/component/domain/model/product/ScanGoProductModel;", "iwizpuwonk", "Lf22/iobyxmoadg;", "ppxfxbqfkf", "()Lf22/iobyxmoadg;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ScanExciseStickerDialogArgs implements Parcelable {
    public static final Parcelable.Creator<ScanExciseStickerDialogArgs> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final f22.iobyxmoadg scanGoAmountMode;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final ScanGoProductModel product;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isWeightProduct;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRemove;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ScanExciseStickerDialogArgs createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ScanExciseStickerDialogArgs(parcel.readInt() != 0, parcel.readInt() != 0, ScanGoProductModel.CREATOR.createFromParcel(parcel), f22.iobyxmoadg.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ScanExciseStickerDialogArgs[] newArray(int i13) {
            return new ScanExciseStickerDialogArgs[i13];
        }
    }

    public ScanExciseStickerDialogArgs(boolean z13, boolean z14, ScanGoProductModel product, f22.iobyxmoadg scanGoAmountMode) {
        zdlpuopuiu.btonecajqb(product, "product");
        zdlpuopuiu.btonecajqb(scanGoAmountMode, "scanGoAmountMode");
        this.isRemove = z13;
        this.isWeightProduct = z14;
        this.product = product;
        this.scanGoAmountMode = scanGoAmountMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final boolean getIsRemove() {
        return this.isRemove;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScanExciseStickerDialogArgs)) {
            return false;
        }
        ScanExciseStickerDialogArgs scanExciseStickerDialogArgs = (ScanExciseStickerDialogArgs) other;
        return this.isRemove == scanExciseStickerDialogArgs.isRemove && this.isWeightProduct == scanExciseStickerDialogArgs.isWeightProduct && zdlpuopuiu.eablkybsjg(this.product, scanExciseStickerDialogArgs.product) && this.scanGoAmountMode == scanExciseStickerDialogArgs.scanGoAmountMode;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final boolean getIsWeightProduct() {
        return this.isWeightProduct;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isRemove) * 31) + Boolean.hashCode(this.isWeightProduct)) * 31) + this.product.hashCode()) * 31) + this.scanGoAmountMode.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final f22.iobyxmoadg getScanGoAmountMode() {
        return this.scanGoAmountMode;
    }

    public String toString() {
        return "ScanExciseStickerDialogArgs(isRemove=" + this.isRemove + ", isWeightProduct=" + this.isWeightProduct + ", product=" + this.product + ", scanGoAmountMode=" + this.scanGoAmountMode + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeInt(this.isRemove ? 1 : 0);
        dest.writeInt(this.isWeightProduct ? 1 : 0);
        this.product.writeToParcel(dest, flags);
        dest.writeString(this.scanGoAmountMode.name());
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final ScanGoProductModel getProduct() {
        return this.product;
    }

    public /* synthetic */ ScanExciseStickerDialogArgs(boolean z13, boolean z14, ScanGoProductModel scanGoProductModel, f22.iobyxmoadg iobyxmoadgVar, int i13, gtknphoqwx gtknphoqwxVar) {
        this(z13, (i13 & 2) != 0 ? false : z14, scanGoProductModel, iobyxmoadgVar);
    }
}
