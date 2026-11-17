package ru.myspar.proloyalty.user.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lru/myspar/proloyalty/user/domain/model/TokenInfo;", "Landroid/os/Parcelable;", "", "token", "refreshToken", "Ljava/time/LocalDateTime;", "tokenEndTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "ppxfxbqfkf", "yggfygwlhe", "zoijcleaow", "jyumaefscl", "Ljava/time/LocalDateTime;", "eablkybsjg", "()Ljava/time/LocalDateTime;", "iwizpuwonk", "iobyxmoadg", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TokenInfo implements Parcelable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime tokenEndTime;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String refreshToken;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<TokenInfo> CREATOR = new zoijcleaow();

    /* JADX INFO: renamed from: ru.myspar.proloyalty.user.domain.model.TokenInfo$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final boolean iobyxmoadg(LocalDateTime tokenEndTime) {
            zdlpuopuiu.btonecajqb(tokenEndTime, "tokenEndTime");
            return LocalDateTime.now().plusMinutes(1L).isAfter(tokenEndTime);
        }

        private Companion() {
        }
    }

    public static final class zoijcleaow implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final TokenInfo createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new TokenInfo(parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final TokenInfo[] newArray(int i13) {
            return new TokenInfo[i13];
        }
    }

    public TokenInfo(String token, String refreshToken, LocalDateTime tokenEndTime) {
        zdlpuopuiu.btonecajqb(token, "token");
        zdlpuopuiu.btonecajqb(refreshToken, "refreshToken");
        zdlpuopuiu.btonecajqb(tokenEndTime, "tokenEndTime");
        this.token = token;
        this.refreshToken = refreshToken;
        this.tokenEndTime = tokenEndTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
    public final LocalDateTime getTokenEndTime() {
        return this.tokenEndTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) other;
        return zdlpuopuiu.eablkybsjg(this.token, tokenInfo.token) && zdlpuopuiu.eablkybsjg(this.refreshToken, tokenInfo.refreshToken) && zdlpuopuiu.eablkybsjg(this.tokenEndTime, tokenInfo.tokenEndTime);
    }

    public int hashCode() {
        return (((this.token.hashCode() * 31) + this.refreshToken.hashCode()) * 31) + this.tokenEndTime.hashCode();
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public String toString() {
        return "TokenInfo(token=" + this.token + ", refreshToken=" + this.refreshToken + ", tokenEndTime=" + this.tokenEndTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.token);
        dest.writeString(this.refreshToken);
        dest.writeSerializable(this.tokenEndTime);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }
}
