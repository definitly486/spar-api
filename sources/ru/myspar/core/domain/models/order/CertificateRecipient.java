package ru.myspar.core.domain.models.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0015¨\u0006)"}, d2 = {"Lru/myspar/core/domain/models/order/CertificateRecipient;", "Landroid/os/Parcelable;", "", ExternalMetricsManagerImpl.NAME, "phone", Scopes.EMAIL, "message", "from", "sendingDatetime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getName", "yggfygwlhe", "getPhone", "jyumaefscl", "getEmail", "iwizpuwonk", "getMessage", "cqumvgiudr", "getFrom", "esjtqupxsv", "getSendingDatetime", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CertificateRecipient implements Parcelable {
    public static final Parcelable.Creator<CertificateRecipient> CREATOR = new iobyxmoadg();

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name and from kotlin metadata and from toString */
    private final String from;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sendingDatetime;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public static final class iobyxmoadg implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final CertificateRecipient createFromParcel(Parcel parcel) {
            zdlpuopuiu.btonecajqb(parcel, "parcel");
            return new CertificateRecipient(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
        public final CertificateRecipient[] newArray(int i13) {
            return new CertificateRecipient[i13];
        }
    }

    public CertificateRecipient(String name, String phone, String email, String message, String from, String sendingDatetime) {
        zdlpuopuiu.btonecajqb(name, "name");
        zdlpuopuiu.btonecajqb(phone, "phone");
        zdlpuopuiu.btonecajqb(email, "email");
        zdlpuopuiu.btonecajqb(message, "message");
        zdlpuopuiu.btonecajqb(from, "from");
        zdlpuopuiu.btonecajqb(sendingDatetime, "sendingDatetime");
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.message = message;
        this.from = from;
        this.sendingDatetime = sendingDatetime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CertificateRecipient)) {
            return false;
        }
        CertificateRecipient certificateRecipient = (CertificateRecipient) other;
        return zdlpuopuiu.eablkybsjg(this.name, certificateRecipient.name) && zdlpuopuiu.eablkybsjg(this.phone, certificateRecipient.phone) && zdlpuopuiu.eablkybsjg(this.email, certificateRecipient.email) && zdlpuopuiu.eablkybsjg(this.message, certificateRecipient.message) && zdlpuopuiu.eablkybsjg(this.from, certificateRecipient.from) && zdlpuopuiu.eablkybsjg(this.sendingDatetime, certificateRecipient.sendingDatetime);
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.message.hashCode()) * 31) + this.from.hashCode()) * 31) + this.sendingDatetime.hashCode();
    }

    public String toString() {
        return "CertificateRecipient(name=" + this.name + ", phone=" + this.phone + ", email=" + this.email + ", message=" + this.message + ", from=" + this.from + ", sendingDatetime=" + this.sendingDatetime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        zdlpuopuiu.btonecajqb(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.phone);
        dest.writeString(this.email);
        dest.writeString(this.message);
        dest.writeString(this.from);
        dest.writeString(this.sendingDatetime);
    }
}
