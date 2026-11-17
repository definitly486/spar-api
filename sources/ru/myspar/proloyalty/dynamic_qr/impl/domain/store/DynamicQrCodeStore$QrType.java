package ru.myspar.proloyalty.dynamic_qr.impl.domain.store;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.qr.domain.model.QrModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"ru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType", "Landroid/os/Parcelable;", "", "qrcode", "<init>", "(Ljava/lang/String;)V", "zdlpuopuiu", "Ljava/lang/String;", "zoijcleaow", "()Ljava/lang/String;", "Code", "Card", "Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType$Card;", "Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType$Code;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DynamicQrCodeStore$QrType implements Parcelable {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String qrcode;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H×\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType$Card;", "Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType;", "", "cardNumber", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "yggfygwlhe", "Ljava/lang/String;", "getCardNumber", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Card extends DynamicQrCodeStore$QrType {
        public static final Parcelable.Creator<Card> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String cardNumber;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Card(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i13) {
                return new Card[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String cardNumber) {
            super(cardNumber, null);
            zdlpuopuiu.btonecajqb(cardNumber, "cardNumber");
            this.cardNumber = cardNumber;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Card) && zdlpuopuiu.eablkybsjg(this.cardNumber, ((Card) other).cardNumber);
        }

        public int hashCode() {
            return this.cardNumber.hashCode();
        }

        public String toString() {
            return "Card(cardNumber=" + this.cardNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeString(this.cardNumber);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH×\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H×\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType$Code;", "Lru/myspar/proloyalty/dynamic_qr/impl/domain/store/DynamicQrCodeStore$QrType;", "Lru/myspar/proloyalty/qr/domain/model/QrModel;", "qrModel", "<init>", "(Lru/myspar/proloyalty/qr/domain/model/QrModel;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Lgg/wwaezpbzkn;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "yggfygwlhe", "Lru/myspar/proloyalty/qr/domain/model/QrModel;", "ppxfxbqfkf", "()Lru/myspar/proloyalty/qr/domain/model/QrModel;", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Code extends DynamicQrCodeStore$QrType {
        public static final Parcelable.Creator<Code> CREATOR = new iobyxmoadg();

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrModel qrModel;

        public static final class iobyxmoadg implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Code createFromParcel(Parcel parcel) {
                zdlpuopuiu.btonecajqb(parcel, "parcel");
                return new Code((QrModel) parcel.readParcelable(Code.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Code[] newArray(int i13) {
                return new Code[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Code(QrModel qrModel) {
            super(qrModel.getValue(), null);
            zdlpuopuiu.btonecajqb(qrModel, "qrModel");
            this.qrModel = qrModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Code) && zdlpuopuiu.eablkybsjg(this.qrModel, ((Code) other).qrModel);
        }

        public int hashCode() {
            return this.qrModel.hashCode();
        }

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
        public final QrModel getQrModel() {
            return this.qrModel;
        }

        public String toString() {
            return "Code(qrModel=" + this.qrModel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            zdlpuopuiu.btonecajqb(dest, "dest");
            dest.writeParcelable(this.qrModel, flags);
        }
    }

    public /* synthetic */ DynamicQrCodeStore$QrType(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getQrcode() {
        return this.qrcode;
    }

    private DynamicQrCodeStore$QrType(String str) {
        this.qrcode = str;
    }
}
