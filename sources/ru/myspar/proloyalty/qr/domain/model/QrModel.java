package ru.myspar.proloyalty.qr.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/myspar/proloyalty/qr/domain/model/QrModel;", "Landroid/os/Parcelable;", "<init>", "()V", "value", "", "getValue", "()Ljava/lang/String;", "Static", "Dynamic", "Lru/myspar/proloyalty/qr/domain/model/QrModel$Dynamic;", "Lru/myspar/proloyalty/qr/domain/model/QrModel$Static;", "qr_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class QrModel implements Parcelable {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/myspar/proloyalty/qr/domain/model/QrModel$Static;", "Lru/myspar/proloyalty/qr/domain/model/QrModel;", "", "value", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getValue", "qr_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Static extends QrModel {
        public static final Parcelable.Creator<Static> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Static createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Static(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Static[] newArray(int i13) {
                return new Static[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Static(String value) {
            super(null);
            zdlpuopuiu.btonecajqb(value, "value");
            this.value = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Static) && zdlpuopuiu.eablkybsjg(this.value, ((Static) other).value);
        }

        @Override // ru.myspar.proloyalty.qr.domain.model.QrModel
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Static(value=" + this.value + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.value);
        }
    }

    public /* synthetic */ QrModel(gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public abstract String getValue();

    private QrModel() {
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0011\u0010-\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/myspar/proloyalty/qr/domain/model/QrModel$Dynamic;", "Lru/myspar/proloyalty/qr/domain/model/QrModel;", "", "value", "id", "", "lifeTimeInSec", "Lxk1/iobyxmoadg;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILxk1/iobyxmoadg;)V", "qrcodeId", "(Ljava/lang/String;Ljava/lang/String;I)V", "Landroid/os/Parcel;", "dest", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "zoijcleaow", "(Ljava/lang/String;Ljava/lang/String;ILxk1/iobyxmoadg;)Lru/myspar/proloyalty/qr/domain/model/QrModel$Dynamic;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getValue", "yggfygwlhe", "getId", "jyumaefscl", "I", "eablkybsjg", "iwizpuwonk", "Lxk1/iobyxmoadg;", "gxszxtbevo", "()Lxk1/iobyxmoadg;", "lqeggnwhkg", "()Z", "isNew", "qr_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Dynamic extends QrModel {
        public static final Parcelable.Creator<Dynamic> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata and from toString */
        private final xk1.iobyxmoadg status;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final int lifeTimeInSec;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String value;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Dynamic createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Dynamic(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : xk1.iobyxmoadg.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Dynamic[] newArray(int i13) {
                return new Dynamic[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dynamic(String value, String id2, int i13, xk1.iobyxmoadg iobyxmoadgVar) {
            super(null);
            zdlpuopuiu.btonecajqb(value, "value");
            zdlpuopuiu.btonecajqb(id2, "id");
            this.value = value;
            this.id = id2;
            this.lifeTimeInSec = i13;
            this.status = iobyxmoadgVar;
        }

        public static /* synthetic */ Dynamic ppxfxbqfkf(Dynamic dynamic, String str, String str2, int i13, xk1.iobyxmoadg iobyxmoadgVar, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                str = dynamic.value;
            }
            if ((i14 & 2) != 0) {
                str2 = dynamic.id;
            }
            if ((i14 & 4) != 0) {
                i13 = dynamic.lifeTimeInSec;
            }
            if ((i14 & 8) != 0) {
                iobyxmoadgVar = dynamic.status;
            }
            return dynamic.zoijcleaow(str, str2, i13, iobyxmoadgVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: eablkybsjg, reason: from getter */
        public final int getLifeTimeInSec() {
            return this.lifeTimeInSec;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dynamic)) {
                return false;
            }
            Dynamic dynamic = (Dynamic) other;
            return zdlpuopuiu.eablkybsjg(this.value, dynamic.value) && zdlpuopuiu.eablkybsjg(this.id, dynamic.id) && this.lifeTimeInSec == dynamic.lifeTimeInSec && this.status == dynamic.status;
        }

        public final String getId() {
            return this.id;
        }

        @Override // ru.myspar.proloyalty.qr.domain.model.QrModel
        public String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: gxszxtbevo, reason: from getter */
        public final xk1.iobyxmoadg getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = ((((this.value.hashCode() * 31) + this.id.hashCode()) * 31) + Integer.hashCode(this.lifeTimeInSec)) * 31;
            xk1.iobyxmoadg iobyxmoadgVar = this.status;
            return iHashCode + (iobyxmoadgVar == null ? 0 : iobyxmoadgVar.hashCode());
        }

        public final boolean lqeggnwhkg() {
            return this.status == null;
        }

        public String toString() {
            return "Dynamic(value=" + this.value + ", id=" + this.id + ", lifeTimeInSec=" + this.lifeTimeInSec + ", status=" + this.status + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.value);
            dest.writeString(this.id);
            dest.writeInt(this.lifeTimeInSec);
            xk1.iobyxmoadg iobyxmoadgVar = this.status;
            if (iobyxmoadgVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iobyxmoadgVar.name());
            }
        }

        public final Dynamic zoijcleaow(String value, String id2, int lifeTimeInSec, xk1.iobyxmoadg status) {
            zdlpuopuiu.btonecajqb(value, "value");
            zdlpuopuiu.btonecajqb(id2, "id");
            return new Dynamic(value, id2, lifeTimeInSec, status);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Dynamic(String qrcodeId, String value, int i13) {
            this(value, qrcodeId, i13, null);
            zdlpuopuiu.btonecajqb(qrcodeId, "qrcodeId");
            zdlpuopuiu.btonecajqb(value, "value");
        }
    }
}
