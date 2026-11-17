package ru.myspar.proloyalty.rate.rate_product.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import gg.pmvmpeiblj;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/myspar/proloyalty/rate/rate_product/api/model/RateType;", "Landroid/os/Parcelable;", "<init>", "()V", "Single", "List", "Lru/myspar/proloyalty/rate/rate_product/api/model/RateType$List;", "Lru/myspar/proloyalty/rate/rate_product/api/model/RateType$Single;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RateType implements Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/myspar/proloyalty/rate/rate_product/api/model/RateType$List;", "Lru/myspar/proloyalty/rate/rate_product/api/model/RateType;", "", "previousPageType", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getPreviousPageType", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class List extends RateType {
        public static final Parcelable.Creator<List> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousPageType;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final List createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new List(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final List[] newArray(int i13) {
                return new List[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public List(String previousPageType) {
            super(null);
            zdlpuopuiu.btonecajqb(previousPageType, "previousPageType");
            this.previousPageType = previousPageType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof List) && zdlpuopuiu.eablkybsjg(this.previousPageType, ((List) other).previousPageType);
        }

        public int hashCode() {
            return this.previousPageType.hashCode();
        }

        public String toString() {
            return "List(previousPageType=" + this.previousPageType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.previousPageType);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/myspar/proloyalty/rate/rate_product/api/model/RateType$Single;", "Lru/myspar/proloyalty/rate/rate_product/api/model/RateType;", "", "previousPageType", "productArticle", "productName", "Lgg/pmvmpeiblj;", "selectedRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgg/pmvmpeiblj;Lkotlin/jvm/internal/gtknphoqwx;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getPreviousPageType", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "getProductName", "iwizpuwonk", "Lgg/pmvmpeiblj;", "ppxfxbqfkf", "()Lgg/pmvmpeiblj;", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Single extends RateType {
        public static final Parcelable.Creator<Single> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final pmvmpeiblj selectedRate;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productName;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String productArticle;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String previousPageType;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Single createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Single(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : pmvmpeiblj.iobyxmoadg(parcel.readInt()), null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Single[] newArray(int i13) {
                return new Single[i13];
            }
        }

        public /* synthetic */ Single(String str, String str2, String str3, pmvmpeiblj pmvmpeibljVar, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3, pmvmpeibljVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Single)) {
                return false;
            }
            Single single = (Single) other;
            return zdlpuopuiu.eablkybsjg(this.previousPageType, single.previousPageType) && zdlpuopuiu.eablkybsjg(this.productArticle, single.productArticle) && zdlpuopuiu.eablkybsjg(this.productName, single.productName) && zdlpuopuiu.eablkybsjg(this.selectedRate, single.selectedRate);
        }

        public int hashCode() {
            int iHashCode = ((((this.previousPageType.hashCode() * 31) + this.productArticle.hashCode()) * 31) + this.productName.hashCode()) * 31;
            pmvmpeiblj pmvmpeibljVar = this.selectedRate;
            return iHashCode + (pmvmpeibljVar == null ? 0 : pmvmpeiblj.wkgbmnqykc(pmvmpeibljVar.gxszxtbevo()));
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final pmvmpeiblj getSelectedRate() {
            return this.selectedRate;
        }

        public String toString() {
            return "Single(previousPageType=" + this.previousPageType + ", productArticle=" + this.productArticle + ", productName=" + this.productName + ", selectedRate=" + this.selectedRate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iGxszxtbevo;
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.previousPageType);
            dest.writeString(this.productArticle);
            dest.writeString(this.productName);
            pmvmpeiblj pmvmpeibljVar = this.selectedRate;
            if (pmvmpeibljVar == null) {
                iGxszxtbevo = 0;
            } else {
                dest.writeInt(1);
                iGxszxtbevo = pmvmpeibljVar.gxszxtbevo();
            }
            dest.writeInt(iGxszxtbevo);
        }

        /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
        public final String getProductArticle() {
            return this.productArticle;
        }

        public /* synthetic */ Single(String str, String str2, String str3, pmvmpeiblj pmvmpeibljVar, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, str2, str3, (i13 & 8) != 0 ? null : pmvmpeibljVar, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private Single(String previousPageType, String productArticle, String productName, pmvmpeiblj pmvmpeibljVar) {
            super(null);
            zdlpuopuiu.btonecajqb(previousPageType, "previousPageType");
            zdlpuopuiu.btonecajqb(productArticle, "productArticle");
            zdlpuopuiu.btonecajqb(productName, "productName");
            this.previousPageType = previousPageType;
            this.productArticle = productArticle;
            this.productName = productName;
            this.selectedRate = pmvmpeibljVar;
        }
    }

    public /* synthetic */ RateType(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    private RateType() {
    }
}
