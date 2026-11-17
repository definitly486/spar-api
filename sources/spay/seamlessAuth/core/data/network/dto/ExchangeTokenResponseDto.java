package spay.seamlessAuth.core.data.network.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.zm;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.data.dto.response.DataDtoInterface;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B=\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b,\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Lspay/seamlessAuth/core/data/network/dto/ExchangeTokenResponseDto;", "Landroid/os/Parcelable;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lkk/zm;", "", "exchangeToken", "", "Lspay/seamlessAuth/core/data/network/dto/ScopeItemDto;", "scope", "tokenType", "", "expiresIn", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "toModel", "()Lkk/zm;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lspay/seamlessAuth/core/data/network/dto/ExchangeTokenResponseDto;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getExchangeToken", "Ljava/util/List;", "getScope", "getTokenType", "Ljava/lang/Integer;", "getExpiresIn", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ExchangeTokenResponseDto implements Parcelable, DataDtoInterface<zm> {
    public static final Parcelable.Creator<ExchangeTokenResponseDto> CREATOR = new Creator();

    @ppxfxbqfkf("access_token")
    private final String exchangeToken;

    @ppxfxbqfkf("expires_in")
    private final Integer expiresIn;

    @ppxfxbqfkf("scope")
    private final List<ScopeItemDto> scope;

    @ppxfxbqfkf("token_type")
    private final String tokenType;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExchangeTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ExchangeTokenResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList.add(ScopeItemDto.CREATOR.createFromParcel(parcel));
                }
            }
            return new ExchangeTokenResponseDto(string, arrayList, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ExchangeTokenResponseDto[] newArray(int i13) {
            return new ExchangeTokenResponseDto[i13];
        }
    }

    public ExchangeTokenResponseDto() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExchangeTokenResponseDto copy$default(ExchangeTokenResponseDto exchangeTokenResponseDto, String str, List list, String str2, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exchangeTokenResponseDto.exchangeToken;
        }
        if ((i13 & 2) != 0) {
            list = exchangeTokenResponseDto.scope;
        }
        if ((i13 & 4) != 0) {
            str2 = exchangeTokenResponseDto.tokenType;
        }
        if ((i13 & 8) != 0) {
            num = exchangeTokenResponseDto.expiresIn;
        }
        return exchangeTokenResponseDto.copy(str, list, str2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExchangeToken() {
        return this.exchangeToken;
    }

    public final List<ScopeItemDto> component2() {
        return this.scope;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final ExchangeTokenResponseDto copy(String exchangeToken, List<ScopeItemDto> scope, String tokenType, Integer expiresIn) {
        return new ExchangeTokenResponseDto(exchangeToken, scope, tokenType, expiresIn);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeTokenResponseDto)) {
            return false;
        }
        ExchangeTokenResponseDto exchangeTokenResponseDto = (ExchangeTokenResponseDto) other;
        return zdlpuopuiu.eablkybsjg(this.exchangeToken, exchangeTokenResponseDto.exchangeToken) && zdlpuopuiu.eablkybsjg(this.scope, exchangeTokenResponseDto.scope) && zdlpuopuiu.eablkybsjg(this.tokenType, exchangeTokenResponseDto.tokenType) && zdlpuopuiu.eablkybsjg(this.expiresIn, exchangeTokenResponseDto.expiresIn);
    }

    public final String getExchangeToken() {
        return this.exchangeToken;
    }

    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final List<ScopeItemDto> getScope() {
        return this.scope;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public int hashCode() {
        String str = this.exchangeToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ScopeItemDto> list = this.scope;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.tokenType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.expiresIn;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ExchangeTokenResponseDto(exchangeToken=" + this.exchangeToken + ", scope=" + this.scope + ", tokenType=" + this.tokenType + ", expiresIn=" + this.expiresIn + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.exchangeToken);
        List<ScopeItemDto> list = this.scope;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ScopeItemDto> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.tokenType);
        Integer num = this.expiresIn;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public ExchangeTokenResponseDto(String str, List<ScopeItemDto> list, String str2, Integer num) {
        this.exchangeToken = str;
        this.scope = list;
        this.tokenType = str2;
        this.expiresIn = num;
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public zm toModel() {
        return new zm(this.exchangeToken, ScopeItemDtoKt.toModelList(this.scope), this.tokenType, this.expiresIn);
    }

    public /* synthetic */ ExchangeTokenResponseDto(String str, List list, String str2, Integer num, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : num);
    }
}
