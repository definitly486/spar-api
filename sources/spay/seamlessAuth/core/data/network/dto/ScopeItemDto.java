package spay.seamlessAuth.core.data.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.seamlessAuth.core.data.network.request.ScopeItem;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lspay/seamlessAuth/core/data/network/dto/ScopeItemDto;", "Landroid/os/Parcelable;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/seamlessAuth/core/data/network/request/ScopeItem;", "", "type", "<init>", "(Ljava/lang/String;)V", "toModel", "()Lspay/seamlessAuth/core/data/network/request/ScopeItem;", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lspay/seamlessAuth/core/data/network/dto/ScopeItemDto;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScopeItemDto implements Parcelable, DataDtoInterface<ScopeItem> {
    public static final Parcelable.Creator<ScopeItemDto> CREATOR = new Creator();

    @ppxfxbqfkf("type")
    private final String type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScopeItemDto> {
        @Override // android.os.Parcelable.Creator
        public final ScopeItemDto createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new ScopeItemDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ScopeItemDto[] newArray(int i13) {
            return new ScopeItemDto[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeItemDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ScopeItemDto copy$default(ScopeItemDto scopeItemDto, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = scopeItemDto.type;
        }
        return scopeItemDto.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final ScopeItemDto copy(String type) {
        return new ScopeItemDto(type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ScopeItemDto) && zdlpuopuiu.eablkybsjg(this.type, ((ScopeItemDto) other).type);
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ScopeItemDto(type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.type);
    }

    public ScopeItemDto(String str) {
        this.type = str;
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public ScopeItem toModel() {
        return new ScopeItem(this.type);
    }

    public /* synthetic */ ScopeItemDto(String str, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str);
    }
}
