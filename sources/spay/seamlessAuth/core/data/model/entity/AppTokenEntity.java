package spay.seamlessAuth.core.data.model.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kk.t3;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lspay/seamlessAuth/core/data/model/entity/AppTokenEntity;", "Landroid/os/Parcelable;", "", "token", "", "expiresTime", "Lkk/t3;", "typeAuth", "<init>", "(Ljava/lang/String;JLkk/t3;)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "()Lkk/t3;", "copy", "(Ljava/lang/String;JLkk/t3;)Lspay/seamlessAuth/core/data/model/entity/AppTokenEntity;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getToken", "J", "getExpiresTime", "Lkk/t3;", "getTypeAuth", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppTokenEntity implements Parcelable {
    public static final Parcelable.Creator<AppTokenEntity> CREATOR = new Creator();

    @ppxfxbqfkf("expiresTime")
    private final long expiresTime;

    @ppxfxbqfkf("token")
    private final String token;

    @ppxfxbqfkf("typeAuth")
    private final t3 typeAuth;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AppTokenEntity> {
        @Override // android.os.Parcelable.Creator
        public final AppTokenEntity createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new AppTokenEntity(parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : t3.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppTokenEntity[] newArray(int i13) {
            return new AppTokenEntity[i13];
        }
    }

    public AppTokenEntity(String token, long j13, t3 t3Var) {
        zdlpuopuiu.btonecajqb(token, "token");
        this.token = token;
        this.expiresTime = j13;
        this.typeAuth = t3Var;
    }

    public static /* synthetic */ AppTokenEntity copy$default(AppTokenEntity appTokenEntity, String str, long j13, t3 t3Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = appTokenEntity.token;
        }
        if ((i13 & 2) != 0) {
            j13 = appTokenEntity.expiresTime;
        }
        if ((i13 & 4) != 0) {
            t3Var = appTokenEntity.typeAuth;
        }
        return appTokenEntity.copy(str, j13, t3Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExpiresTime() {
        return this.expiresTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final t3 getTypeAuth() {
        return this.typeAuth;
    }

    public final AppTokenEntity copy(String token, long expiresTime, t3 typeAuth) {
        zdlpuopuiu.btonecajqb(token, "token");
        return new AppTokenEntity(token, expiresTime, typeAuth);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTokenEntity)) {
            return false;
        }
        AppTokenEntity appTokenEntity = (AppTokenEntity) other;
        return zdlpuopuiu.eablkybsjg(this.token, appTokenEntity.token) && this.expiresTime == appTokenEntity.expiresTime && this.typeAuth == appTokenEntity.typeAuth;
    }

    public final long getExpiresTime() {
        return this.expiresTime;
    }

    public final String getToken() {
        return this.token;
    }

    public final t3 getTypeAuth() {
        return this.typeAuth;
    }

    public int hashCode() {
        int iHashCode = (Long.hashCode(this.expiresTime) + (this.token.hashCode() * 31)) * 31;
        t3 t3Var = this.typeAuth;
        return iHashCode + (t3Var == null ? 0 : t3Var.hashCode());
    }

    public String toString() {
        return "AppTokenEntity(token=" + this.token + ", expiresTime=" + this.expiresTime + ", typeAuth=" + this.typeAuth + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        zdlpuopuiu.btonecajqb(parcel, "out");
        parcel.writeString(this.token);
        parcel.writeLong(this.expiresTime);
        t3 t3Var = this.typeAuth;
        if (t3Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(t3Var.name());
        }
    }
}
