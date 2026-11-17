package ru.myspar.catalog.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import v00.ppxfxbqfkf;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010&\u001a\u0004\b1\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0011\u0010;\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b:\u00109¨\u0006<"}, d2 = {"Lru/myspar/catalog/api/model/ProductListPayload;", "Landroid/os/Parcelable;", "Lv00/iobyxmoadg;", "flow", "", "orderEditId", "sectionId", "catalogId", "brandId", "productsTitle", "selectionId", "Lv00/ppxfxbqfkf;", "selectedSort", "", "wasOpenedViaNavLink", "<init>", "(Lv00/iobyxmoadg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv00/ppxfxbqfkf;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Lv00/iobyxmoadg;", "eablkybsjg", "()Lv00/iobyxmoadg;", "yggfygwlhe", "Ljava/lang/String;", "gxszxtbevo", "jyumaefscl", "nufgyqmvbu", "iwizpuwonk", "ppxfxbqfkf", "cqumvgiudr", "zoijcleaow", "esjtqupxsv", "lqeggnwhkg", "lereixgezr", "btonecajqb", "pmvmpeiblj", "Lv00/ppxfxbqfkf;", "dxjokdxxww", "()Lv00/ppxfxbqfkf;", "zynmafqrjb", "Z", "gtknphoqwx", "()Z", "wflxmlrfwp", "isEditOrderMode", "api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductListPayload implements Parcelable {
    public static final Parcelable.Creator<ProductListPayload> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String brandId;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productsTitle;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String catalogId;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sectionId;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String selectionId;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata and from toString */
    private final ppxfxbqfkf selectedSort;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderEditId;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final v00.iobyxmoadg flow;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean wasOpenedViaNavLink;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ProductListPayload createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ProductListPayload(v00.iobyxmoadg.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ppxfxbqfkf.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final ProductListPayload[] newArray(int i13) {
            return new ProductListPayload[i13];
        }
    }

    public ProductListPayload(v00.iobyxmoadg flow, String str, String str2, String str3, String str4, String str5, String str6, ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        zdlpuopuiu.btonecajqb(flow, "flow");
        this.flow = flow;
        this.orderEditId = str;
        this.sectionId = str2;
        this.catalogId = str3;
        this.brandId = str4;
        this.productsTitle = str5;
        this.selectionId = str6;
        this.selectedSort = ppxfxbqfkfVar;
        this.wasOpenedViaNavLink = z13;
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getSelectionId() {
        return this.selectionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: dxjokdxxww, reason: from getter */
    public final ppxfxbqfkf getSelectedSort() {
        return this.selectedSort;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final v00.iobyxmoadg getFlow() {
        return this.flow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductListPayload)) {
            return false;
        }
        ProductListPayload productListPayload = (ProductListPayload) other;
        return this.flow == productListPayload.flow && zdlpuopuiu.eablkybsjg(this.orderEditId, productListPayload.orderEditId) && zdlpuopuiu.eablkybsjg(this.sectionId, productListPayload.sectionId) && zdlpuopuiu.eablkybsjg(this.catalogId, productListPayload.catalogId) && zdlpuopuiu.eablkybsjg(this.brandId, productListPayload.brandId) && zdlpuopuiu.eablkybsjg(this.productsTitle, productListPayload.productsTitle) && zdlpuopuiu.eablkybsjg(this.selectionId, productListPayload.selectionId) && this.selectedSort == productListPayload.selectedSort && this.wasOpenedViaNavLink == productListPayload.wasOpenedViaNavLink;
    }

    /* JADX INFO: renamed from: gtknphoqwx, reason: from getter */
    public final boolean getWasOpenedViaNavLink() {
        return this.wasOpenedViaNavLink;
    }

    /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
    public final String getOrderEditId() {
        return this.orderEditId;
    }

    public int hashCode() {
        int iHashCode = this.flow.hashCode() * 31;
        String str = this.orderEditId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sectionId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.catalogId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.brandId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.productsTitle;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.selectionId;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ppxfxbqfkf ppxfxbqfkfVar = this.selectedSort;
        return ((iHashCode7 + (ppxfxbqfkfVar != null ? ppxfxbqfkfVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.wasOpenedViaNavLink);
    }

    /* JADX INFO: renamed from: lqeggnwhkg, reason: from getter */
    public final String getProductsTitle() {
        return this.productsTitle;
    }

    /* JADX INFO: renamed from: nufgyqmvbu, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getCatalogId() {
        return this.catalogId;
    }

    public String toString() {
        return "ProductListPayload(flow=" + this.flow + ", orderEditId=" + this.orderEditId + ", sectionId=" + this.sectionId + ", catalogId=" + this.catalogId + ", brandId=" + this.brandId + ", productsTitle=" + this.productsTitle + ", selectionId=" + this.selectionId + ", selectedSort=" + this.selectedSort + ", wasOpenedViaNavLink=" + this.wasOpenedViaNavLink + ")";
    }

    public final boolean wflxmlrfwp() {
        return this.flow == v00.iobyxmoadg.ORDER_EDIT;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.flow.name());
        dest.writeString(this.orderEditId);
        dest.writeString(this.sectionId);
        dest.writeString(this.catalogId);
        dest.writeString(this.brandId);
        dest.writeString(this.productsTitle);
        dest.writeString(this.selectionId);
        ppxfxbqfkf ppxfxbqfkfVar = this.selectedSort;
        if (ppxfxbqfkfVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(ppxfxbqfkfVar.name());
        }
        dest.writeInt(this.wasOpenedViaNavLink ? 1 : 0);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    public /* synthetic */ ProductListPayload(v00.iobyxmoadg iobyxmoadgVar, String str, String str2, String str3, String str4, String str5, String str6, ppxfxbqfkf ppxfxbqfkfVar, boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? v00.iobyxmoadg.DEFAULT : iobyxmoadgVar, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? ppxfxbqfkfVar : null, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z13);
    }
}
